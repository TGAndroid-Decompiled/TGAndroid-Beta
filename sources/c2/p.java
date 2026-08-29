package c2;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
public final class p implements Runnable {
    public final int f2876a;
    public final Object f2877b;
    public final Object f2878c;
    public final Object d;
    public final Object f2879e;

    public p(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f2876a = i10;
        this.d = obj;
        this.f2877b = obj2;
        this.f2878c = obj3;
        this.f2879e = obj4;
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

    public p(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f2876a = i10;
        this.f2877b = obj;
        this.f2878c = obj2;
        this.f2879e = obj3;
        this.d = obj4;
    }

    public p(Handler handler, cf.b bVar, long j10) {
        this.f2876a = 3;
        this.d = new AtomicBoolean(false);
        this.f2877b = handler;
        this.f2878c = bVar;
        a1.e eVar = new a1.e(24, this, bVar);
        this.f2879e = eVar;
        if (j10 > 0) {
            handler.postDelayed(eVar, j10);
        }
    }
}
