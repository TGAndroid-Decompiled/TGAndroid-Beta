package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
public abstract class mfd {
    public static final Object a = new Object();
    public static cmc b;

    public static void a(Context context) {
        if (b == null) {
            cmc cmcVar = new cmc(context);
            b = cmcVar;
            synchronized (cmcVar.a) {
                cmcVar.g = true;
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

    public static void c(Context context, p0d p0dVar, Intent intent) {
        synchronized (a) {
            a(context);
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            if (!booleanExtra) {
                b.a();
            }
            p0dVar.b(intent).addOnCompleteListener(new lcc(intent, (byte) 4));
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
