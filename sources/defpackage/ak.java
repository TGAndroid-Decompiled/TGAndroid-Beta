package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
public final class ak {
    public static final Uri g = Uri.parse("content://androidx.car.app.connection");
    public final Context a;
    public final uv6 b;
    public final Executor c;
    public final zj d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;

    public ak(Context context, uv6 uv6Var) {
        this.a = context.getApplicationContext();
        this.b = uv6Var;
        Executor a = pd0.a();
        this.c = a;
        this.d = new zj(this, (byte) 0);
        this.e = new AtomicBoolean();
        this.f = new AtomicBoolean();
        a.execute(new yj(this, (byte) 1));
    }

    public final void a() {
        IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        int i = Build.VERSION.SDK_INT;
        zj zjVar = this.d;
        Context context = this.a;
        if (i >= 33) {
            context.registerReceiver(zjVar, intentFilter, 2);
        } else {
            rr.n(context, zjVar, intentFilter);
        }
        b();
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak.b():void");
    }
}
