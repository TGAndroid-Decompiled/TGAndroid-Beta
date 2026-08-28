package af;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
public final class f implements Runnable {
    public final int f158a;
    public final Object f159b;
    public final Object f160c;
    public final Object d;
    public final Object f161e;

    public f(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f158a = i9;
        this.f161e = obj;
        this.f159b = obj2;
        this.f160c = obj3;
        this.d = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: af.f.a():void");
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: af.f.b():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: af.f.run():void");
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i9) {
        this.f158a = i9;
        this.f159b = obj;
        this.f160c = obj2;
        this.d = obj3;
        this.f161e = obj4;
    }

    public f(Handler handler, ze.b bVar, long j10) {
        this.f158a = 0;
        this.f161e = new AtomicBoolean(false);
        this.f159b = handler;
        this.f160c = bVar;
        a1.e eVar = new a1.e(2, this, bVar);
        this.d = eVar;
        if (j10 > 0) {
            handler.postDelayed(eVar, j10);
        }
    }
}
