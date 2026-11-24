package defpackage;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public final class i8e {
    public static final ce6 i = new ce6("ClientCastAnalytics", null);
    public static final boolean j = true;
    public final l8a a;
    public final zfd b;
    public final r8d c;
    public Long e;
    public h3c g;
    public byte h = 1;
    public final String d = UUID.randomUUID().toString();
    public final ExecutorService f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public i8e(Context context, ua4 ua4Var, l8a l8aVar, zfd zfdVar, r8d r8dVar) {
        this.a = l8aVar;
        this.b = zfdVar;
        this.c = r8dVar;
    }

    public final void a(final a6f a6fVar, final int i2) {
        this.f.execute(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.a1e.run():void");
            }
        });
    }
}
