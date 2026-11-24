package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class vcb implements Runnable {
    public final long a;
    public final PowerManager.WakeLock b;
    public final FirebaseMessaging c;
    public final ThreadPoolExecutor d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new kn7("firebase-iid-executor"));

    public vcb(FirebaseMessaging firebaseMessaging, long j) {
        this.c = firebaseMessaging;
        this.a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.c.b.getSystemService("connectivity");
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
            if (this.c.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            } else {
                return true;
            }
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() == null) {
                    Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                    return false;
                }
                throw e;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override
    public final void run() {
        PowerManager.WakeLock wakeLock = this.b;
        c5a t = c5a.t();
        FirebaseMessaging firebaseMessaging = this.c;
        if (t.A(firebaseMessaging.b)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.k = true;
                }
                if (!firebaseMessaging.i.e()) {
                    firebaseMessaging.f(false);
                    if (!c5a.t().A(firebaseMessaging.b)) {
                        return;
                    }
                } else if (c5a.t().w(firebaseMessaging.b) && !a()) {
                    ucb ucbVar = new ucb();
                    ucbVar.c = this;
                    ucbVar.a();
                    if (!c5a.t().A(firebaseMessaging.b)) {
                        return;
                    }
                } else {
                    if (b()) {
                        firebaseMessaging.f(false);
                    } else {
                        firebaseMessaging.i(this.a);
                    }
                    if (!c5a.t().A(firebaseMessaging.b)) {
                        return;
                    }
                }
                wakeLock.release();
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                firebaseMessaging.f(false);
                if (c5a.t().A(firebaseMessaging.b)) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th) {
            if (c5a.t().A(firebaseMessaging.b)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
