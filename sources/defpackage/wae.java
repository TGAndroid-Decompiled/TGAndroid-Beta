package defpackage;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public final class wae {
    public static final he6 i = new he6("ClientCastAnalytics", null);
    public static final boolean j = true;
    public final baa a;
    public final pid b;
    public final ibd c;
    public Long e;
    public g5c g;
    public byte h = 1;
    public final String d = UUID.randomUUID().toString();
    public final ExecutorService f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public wae(Context context, qa4 qa4Var, baa baaVar, pid pidVar, ibd ibdVar) {
        this.a = baaVar;
        this.b = pidVar;
        this.c = ibdVar;
    }

    public final void a(final p8f p8fVar, final int i2) {
        this.f.execute(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.n3e.run():void");
            }
        });
    }
}
