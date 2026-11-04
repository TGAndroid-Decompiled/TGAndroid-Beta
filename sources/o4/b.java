package o4;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b {
    public static final Uri f20580g = Uri.parse("content://androidx.car.app.connection");
    public final Context f20581a;
    public final f0 f20582b;
    public final Executor f20583c;
    public final androidx.mediarouter.app.f d;
    public final AtomicBoolean f20584e;
    public final AtomicBoolean f20585f;

    public b(Context context, f0 f0Var) {
        this.f20581a = context.getApplicationContext();
        this.f20582b = f0Var;
        Executor e10 = g2.a.e();
        this.f20583c = e10;
        this.d = new androidx.mediarouter.app.f(this, 5);
        this.f20584e = new AtomicBoolean();
        this.f20585f = new AtomicBoolean();
        e10.execute(new a(this, 1));
    }

    public static void a(b bVar) {
        androidx.mediarouter.app.f fVar = bVar.d;
        Context context = bVar.f20581a;
        IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(fVar, intentFilter, 2);
        } else {
            context.registerReceiver(fVar, intentFilter);
        }
        bVar.b();
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: o4.b.b():void");
    }
}
