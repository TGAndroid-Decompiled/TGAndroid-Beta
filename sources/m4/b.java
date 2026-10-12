package m4;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b {
    public static final Uri f15384g = Uri.parse("content://androidx.car.app.connection");
    public final Context f15385a;
    public final g0 f15386b;
    public final Executor f15387c;
    public final androidx.mediarouter.app.f d;
    public final AtomicBoolean e;
    public final AtomicBoolean f15388f;

    public b(Context context, g0 g0Var) {
        this.f15385a = context.getApplicationContext();
        this.f15386b = g0Var;
        Executor e = e2.a.e();
        this.f15387c = e;
        this.d = new androidx.mediarouter.app.f(this, 6);
        this.e = new AtomicBoolean();
        this.f15388f = new AtomicBoolean();
        e.execute(new a(this, 1));
    }

    public static void a(b bVar) {
        androidx.mediarouter.app.f fVar = bVar.d;
        Context context = bVar.f15385a;
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
