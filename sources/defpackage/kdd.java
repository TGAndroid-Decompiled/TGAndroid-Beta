package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
public abstract class kdd {
    public static final Object a = new Object();
    public static ckc b;

    public static void a(Context context) {
        if (b == null) {
            ckc ckcVar = new ckc(context);
            b = ckcVar;
            synchronized (ckcVar.a) {
                ckcVar.g = true;
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

    public static void c(Context context, oyc oycVar, Intent intent) {
        synchronized (a) {
            a(context);
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            if (!booleanExtra) {
                b.a();
            }
            oycVar.b(intent).addOnCompleteListener(new dkc(intent, (byte) 0));
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
