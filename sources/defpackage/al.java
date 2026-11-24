package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
public final class al {
    public static final Uri g = Uri.parse("content://androidx.car.app.connection");
    public final Context a;
    public final ux6 b;
    public final Executor c;
    public final zk d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;

    public al(Context context, ux6 ux6Var) {
        this.a = context.getApplicationContext();
        this.b = ux6Var;
        Executor a = pe0.a();
        this.c = a;
        this.d = new zk(this, (byte) 0);
        this.e = new AtomicBoolean();
        this.f = new AtomicBoolean();
        a.execute(new yk(this, (byte) 1));
    }

    public final void a() {
        IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        int i = Build.VERSION.SDK_INT;
        zk zkVar = this.d;
        Context context = this.a;
        if (i >= 33) {
            context.registerReceiver(zkVar, intentFilter, 2);
        } else {
            rs.n(context, zkVar, intentFilter);
        }
        b();
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al.b():void");
    }
}
