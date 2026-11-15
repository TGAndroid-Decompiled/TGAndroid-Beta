package ab;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class f0 implements Runnable {
    public final long f923a;
    public final PowerManager.WakeLock f924b;
    public final FirebaseMessaging f925c;
    public final ThreadPoolExecutor d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new f5.s("firebase-iid-executor"));

    public f0(FirebaseMessaging firebaseMessaging, long j3) {
        this.f925c = firebaseMessaging;
        this.f923a = j3;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f7280b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f924b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f925c.f7280b.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        try {
            if (this.f925c.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            } else {
                return true;
            }
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e10.getMessage() == null) {
                    Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                    return false;
                }
                throw e10;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override
    public final void run() {
        PowerManager.WakeLock wakeLock = this.f924b;
        c0 q10 = c0.q();
        FirebaseMessaging firebaseMessaging = this.f925c;
        if (q10.w(firebaseMessaging.f7280b)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f7287k = true;
                }
                if (!firebaseMessaging.f7285i.e()) {
                    firebaseMessaging.f(false);
                    if (c0.q().w(firebaseMessaging.f7280b)) {
                        wakeLock.release();
                    }
                } else if (c0.q().v(firebaseMessaging.f7280b) && !a()) {
                    e0 e0Var = new e0();
                    e0Var.f921c = this;
                    e0Var.a();
                    if (c0.q().w(firebaseMessaging.f7280b)) {
                        wakeLock.release();
                    }
                } else {
                    if (b()) {
                        firebaseMessaging.f(false);
                    } else {
                        firebaseMessaging.i(this.f923a);
                    }
                    if (c0.q().w(firebaseMessaging.f7280b)) {
                        wakeLock.release();
                    }
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                firebaseMessaging.f(false);
                if (c0.q().w(firebaseMessaging.f7280b)) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th2) {
            if (c0.q().w(firebaseMessaging.f7280b)) {
                wakeLock.release();
            }
            throw th2;
        }
    }
}
