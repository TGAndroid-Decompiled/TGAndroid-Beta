package defpackage;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public final class h6e {
    public static final dc6 i = new dc6("ClientCastAnalytics", null);
    public static final boolean j = true;
    public final j6a a;
    public final ydd b;
    public final p6d c;
    public Long e;
    public h1c g;
    public byte h = 1;
    public final String d = UUID.randomUUID().toString();
    public final ExecutorService f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public h6e(Context context, u84 u84Var, j6a j6aVar, ydd yddVar, p6d p6dVar) {
        this.a = j6aVar;
        this.b = yddVar;
        this.c = p6dVar;
    }

    public final void a(final y3f y3fVar, final int i2) {
        this.f.execute(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.xyd.run():void");
            }
        });
    }
}
