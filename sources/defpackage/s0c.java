package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
public final class s0c implements Runnable {
    public static final Object f = new Object();
    public static Boolean h;
    public static Boolean n;
    public final Context a;
    public final uf7 b;
    public final PowerManager.WakeLock c;
    public final q0c d;
    public final long e;

    public s0c(q0c q0cVar, Context context, uf7 uf7Var, long j) {
        this.d = q0cVar;
        this.a = context;
        this.e = j;
        this.b = uf7Var;
        this.c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f) {
            Boolean bool = n;
            if (bool == null) {
                booleanValue = b(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            n = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        boolean z;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f) {
            Boolean bool = h;
            if (bool == null) {
                booleanValue = b(context, "android.permission.WAKE_LOCK", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            h = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    public final synchronized boolean d() {
        NetworkInfo networkInfo;
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null) {
            if (networkInfo.isConnected()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @Override
    public final void run() {
        q0c q0cVar = this.d;
        Context context = this.a;
        boolean c = c(context);
        PowerManager.WakeLock wakeLock = this.c;
        if (c) {
            wakeLock.acquire(180000L);
        }
        try {
            try {
                try {
                    q0cVar.c(true);
                    if (!this.b.e()) {
                        q0cVar.c(false);
                        if (!c(context)) {
                            return;
                        }
                    } else if (a(context) && !d()) {
                        new r0c(this, this).a();
                        if (!c(context)) {
                            return;
                        }
                    } else {
                        if (q0cVar.d()) {
                            q0cVar.c(false);
                        } else {
                            q0cVar.e(this.e);
                        }
                        if (c(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                } catch (IOException e) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    q0cVar.c(false);
                    if (c(context)) {
                        wakeLock.release();
                    }
                }
            } catch (Throwable th) {
                if (c(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (RuntimeException unused3) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
