package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
public final class bk {
    public static final Uri g = Uri.parse("content://androidx.car.app.connection");
    public final Context a;
    public final zx6 b;
    public final Executor c;
    public final ak d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;

    public bk(Context context, zx6 zx6Var) {
        this.a = context.getApplicationContext();
        this.b = zx6Var;
        Executor a = rd0.a();
        this.c = a;
        this.d = new ak(this, (byte) 0);
        this.e = new AtomicBoolean();
        this.f = new AtomicBoolean();
        a.execute(new zj(this, (byte) 1));
    }

    public final void a() {
        IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        int i = Build.VERSION.SDK_INT;
        ak akVar = this.d;
        Context context = this.a;
        if (i >= 33) {
            context.registerReceiver(akVar, intentFilter, 2);
        } else {
            sr.n(context, akVar, intentFilter);
        }
        b();
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk.b():void");
    }
}
