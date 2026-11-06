package ab;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
public final class k {
    public static final Object f959c = new Object();
    public static p0 d;
    public final Object f960a;
    public final Object f961b;

    public k(ExecutorService executorService) {
        this.f961b = new a0.l(0);
        this.f960a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z9) {
        p0 p0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f959c) {
            try {
                if (d == null) {
                    d = new p0(context);
                }
                p0Var = d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z9) {
            if (b0.k().m(context)) {
                m0.c(context, p0Var, intent);
            } else {
                p0Var.b(intent);
            }
            return Tasks.forResult(-1);
        }
        return p0Var.b(intent).continueWith(new d3.b(3), new a3.l(8));
    }

    public Task b(Intent intent) {
        boolean z9;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z10 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.f960a;
        d3.b bVar = (d3.b) this.f961b;
        if (x6.b.d() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z10 = true;
        }
        if (z9 && !z10) {
            return a(context, intent, z10);
        }
        return Tasks.call(bVar, new i(0, context, intent)).continueWithTask(bVar, new j(context, intent, z10, 0));
    }

    public k(Context context) {
        this.f960a = context;
        this.f961b = new d3.b(3);
    }

    public k(e0.q qVar, String str) {
        this.f960a = qVar;
        this.f961b = str;
    }
}
