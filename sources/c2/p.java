package c2;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
public final class p implements Runnable {
    public final int f2006a;
    public final Object f2007b;
    public final Object f2008c;
    public final Object d;
    public final Object e;

    public p(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f2006a = i10;
        this.d = obj;
        this.f2007b = obj2;
        this.f2008c = obj3;
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
        this.f2006a = i10;
        this.f2007b = obj;
        this.f2008c = obj2;
        this.e = obj3;
        this.d = obj4;
    }

    public p(Handler handler, df.b bVar, long j10) {
        this.f2006a = 3;
        this.d = new AtomicBoolean(false);
        this.f2007b = handler;
        this.f2008c = bVar;
        a1.e eVar = new a1.e(24, this, bVar);
        this.e = eVar;
        if (j10 > 0) {
            handler.postDelayed(eVar, j10);
        }
    }
}
