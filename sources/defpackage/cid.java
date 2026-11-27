package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
public abstract class cid {
    public static final Object a = new Object();
    public static poc b;

    public static void a(Context context) {
        if (b == null) {
            poc pocVar = new poc(context);
            b = pocVar;
            synchronized (pocVar.a) {
                pocVar.g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (a) {
            if (b != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                b.c();
            }
        }
    }

    public static void c(Context context, e3d e3dVar, Intent intent) {
        synchronized (a) {
            a(context);
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            if (!booleanExtra) {
                b.a();
            }
            e3dVar.b(intent).addOnCompleteListener(new ftb(intent, (byte) 14));
        }
    }

    public static ComponentName d(Context context, Intent intent) {
        synchronized (a) {
            a(context);
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!booleanExtra) {
                b.a();
            }
            return startService;
        }
    }
}
