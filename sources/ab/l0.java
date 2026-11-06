package ab;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
public final class l0 implements Runnable {
    public static final Object f965f = new Object();
    public static Boolean h;
    public static Boolean f966n;
    public final Context f967a;
    public final v f968b;
    public final PowerManager.WakeLock f969c;
    public final j0 d;
    public final long f970e;

    public l0(j0 j0Var, Context context, v vVar, long j3) {
        this.d = j0Var;
        this.f967a = context;
        this.f970e = j3;
        this.f968b = vVar;
        this.f969c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f965f) {
            try {
                Boolean bool = f966n;
                if (bool == null) {
                    booleanValue = b(context, "android.permission.ACCESS_NETWORK_STATE", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f966n = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue2;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        boolean z9;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z9;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f965f) {
            try {
                Boolean bool = h;
                if (bool == null) {
                    booleanValue = b(context, "android.permission.WAKE_LOCK", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                h = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue2;
    }

    public final synchronized boolean d() {
        NetworkInfo networkInfo;
        boolean z9;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f967a.getSystemService("connectivity");
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    z9 = true;
                }
            }
            z9 = false;
        } catch (Throwable th2) {
            throw th2;
        }
        return z9;
    }

    @Override
    public final void run() {
        j0 j0Var = this.d;
        Context context = this.f967a;
        boolean c10 = c(context);
        PowerManager.WakeLock wakeLock = this.f969c;
        if (c10) {
            wakeLock.acquire(f.f923a);
        }
        try {
            try {
                try {
                    j0Var.c(true);
                    if (!this.f968b.e()) {
                        j0Var.c(false);
                        if (c(context)) {
                            try {
                                wakeLock.release();
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            }
                        }
                    } else if (a(context) && !d()) {
                        new k0(this, this).a();
                        if (c(context)) {
                            try {
                                wakeLock.release();
                            } catch (RuntimeException unused2) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            }
                        }
                    } else {
                        if (j0Var.d()) {
                            j0Var.c(false);
                        } else {
                            j0Var.e(this.f970e);
                        }
                        if (c(context)) {
                            wakeLock.release();
                        }
                    }
                } catch (IOException e10) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                    j0Var.c(false);
                    if (c(context)) {
                        wakeLock.release();
                    }
                }
            } catch (RuntimeException unused3) {
                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
            }
        } catch (Throwable th2) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th2;
        }
    }
}
