package m4;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b {
    public static final Uri f16479g = Uri.parse("content://androidx.car.app.connection");
    public final Context f16480a;
    public final g0 f16481b;
    public final Executor f16482c;
    public final androidx.mediarouter.app.f d;
    public final AtomicBoolean e;
    public final AtomicBoolean f16483f;

    public b(Context context, g0 g0Var) {
        this.f16480a = context.getApplicationContext();
        this.f16481b = g0Var;
        Executor e = e2.a.e();
        this.f16482c = e;
        this.d = new androidx.mediarouter.app.f(this, 6);
        this.e = new AtomicBoolean();
        this.f16483f = new AtomicBoolean();
        e.execute(new a(this, 1));
    }

    public static void a(b bVar) {
        androidx.mediarouter.app.f fVar = bVar.d;
        Context context = bVar.f16480a;
        IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(fVar, intentFilter, 2);
        } else {
            context.registerReceiver(fVar, intentFilter);
        }
        bVar.b();
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: m4.b.b():void");
    }
}
