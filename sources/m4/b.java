package m4;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b {
    public static final Uri f18000g = Uri.parse("content://androidx.car.app.connection");
    public final Context f18001a;
    public final g0 f18002b;
    public final Executor f18003c;
    public final androidx.mediarouter.app.g d;
    public final AtomicBoolean e;
    public final AtomicBoolean f18004f;

    public b(Context context, g0 g0Var) {
        this.f18001a = context.getApplicationContext();
        this.f18002b = g0Var;
        Executor e = e2.a.e();
        this.f18003c = e;
        this.d = new androidx.mediarouter.app.g(this, 6);
        this.e = new AtomicBoolean();
        this.f18004f = new AtomicBoolean();
        e.execute(new a(this, 1));
    }

    public static void a(b bVar) {
        androidx.mediarouter.app.g gVar = bVar.d;
        Context context = bVar.f18001a;
        IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(gVar, intentFilter, 2);
        } else {
            context.registerReceiver(gVar, intentFilter);
        }
        bVar.b();
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: m4.b.b():void");
    }
}
