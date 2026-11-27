package defpackage;

import android.animation.AnimatorSet;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.utils.twidget.z;
public final class pr0 implements Runnable {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public pr0(FirebaseMessaging firebaseMessaging, long j) {
        this.a = (byte) 1;
        this.e = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new kq7("firebase-iid-executor"));
        this.d = firebaseMessaging;
        this.b = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.d).b.getSystemService("connectivity");
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
            if (((FirebaseMessaging) this.d).a() == null) {
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
        String str;
        switch (this.a) {
            case 0:
                rr0 rr0Var = (rr0) this.e;
                if (rr0Var.y == ((AnimatorSet) this.c)) {
                    sr0 sr0Var = rr0Var.d;
                    q0d q0dVar = sr0Var.w;
                    if (q0dVar != null && !q0dVar.e()) {
                        z zVar = sr0Var.w.e;
                        if (zVar == null) {
                            str = null;
                        } else {
                            str = zVar.U;
                        }
                        if (str == null && System.currentTimeMillis() - this.b < 250) {
                            hl.d3(this, 16L);
                            return;
                        }
                    }
                    ((es6) this.d).run();
                    return;
                }
                return;
            default:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.c;
                u8a v = u8a.v();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.d;
                if (v.x(firebaseMessaging.b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.k = true;
                        }
                        if (!firebaseMessaging.i.e()) {
                            firebaseMessaging.f(false);
                            if (!u8a.v().x(firebaseMessaging.b)) {
                                return;
                            }
                        } else if (u8a.v().w(firebaseMessaging.b) && !a()) {
                            qgb qgbVar = new qgb();
                            qgbVar.c = this;
                            qgbVar.a();
                            if (!u8a.v().x(firebaseMessaging.b)) {
                                return;
                            }
                        } else {
                            if (b()) {
                                firebaseMessaging.f(false);
                            } else {
                                firebaseMessaging.i(this.b);
                            }
                            if (!u8a.v().x(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                        firebaseMessaging.f(false);
                        if (!u8a.v().x(firebaseMessaging.b)) {
                            return;
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (u8a.v().x(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
        }
    }

    public pr0(rr0 rr0Var, AnimatorSet animatorSet, long j, es6 es6Var) {
        this.a = (byte) 0;
        this.e = rr0Var;
        this.c = animatorSet;
        this.b = j;
        this.d = es6Var;
    }
}
