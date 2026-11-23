package ab;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
public final class k {
    public static final Object f957c = new Object();
    public static p0 d;
    public final Object f958a;
    public final Object f959b;

    public k(ExecutorService executorService) {
        this.f959b = new a0.l(0);
        this.f958a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z10) {
        p0 p0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f957c) {
            try {
                if (d == null) {
                    d = new p0(context);
                }
                p0Var = d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            if (c0.v().A(context)) {
                m0.c(context, p0Var, intent);
            } else {
                p0Var.b(intent);
            }
            return Tasks.forResult(-1);
        }
        return p0Var.b(intent).continueWith(new d3.b(3), new a3.l(8));
    }

    public Task b(Intent intent) {
        boolean z10;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z11 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.f958a;
        d3.b bVar = (d3.b) this.f959b;
        if (x6.b.d() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z11 = true;
        }
        if (z10 && !z11) {
            return a(context, intent, z11);
        }
        return Tasks.call(bVar, new i(0, context, intent)).continueWithTask(bVar, new j(context, intent, z11, 0));
    }

    public k(Context context) {
        this.f958a = context;
        this.f959b = new d3.b(3);
    }

    public k(e0.q qVar, String str) {
        this.f958a = qVar;
        this.f959b = str;
    }
}
