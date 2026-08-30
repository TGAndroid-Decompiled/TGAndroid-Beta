package c2;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
public final class p implements Runnable {
    public final int f1978a;
    public final Object f1979b;
    public final Object f1980c;
    public final Object d;
    public final Object e;

    public p(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1978a = i10;
        this.d = obj;
        this.f1979b = obj2;
        this.f1980c = obj3;
        this.e = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: c2.p.a():void");
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: c2.p.b():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: c2.p.run():void");
    }

    public p(Object obj, Object obj2, Object obj3, Object obj4, boolean z4, int i10) {
        this.f1978a = i10;
        this.f1979b = obj;
        this.f1980c = obj2;
        this.e = obj3;
        this.d = obj4;
    }

    public p(Handler handler, ef.b bVar, long j10) {
        this.f1978a = 3;
        this.d = new AtomicBoolean(false);
        this.f1979b = handler;
        this.f1980c = bVar;
        a1.e eVar = new a1.e(28, this, bVar);
        this.e = eVar;
        if (j10 > 0) {
            handler.postDelayed(eVar, j10);
        }
    }
}
