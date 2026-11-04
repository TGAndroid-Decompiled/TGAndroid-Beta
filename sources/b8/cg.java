package b8;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
public final class cg implements Runnable {
    public final int f2522a;
    public final Object f2523b;
    public final Object f2524c;
    public final Object d;
    public final Object f2525e;

    public cg(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f2522a = i3;
        this.f2523b = obj;
        this.f2524c = obj2;
        this.d = obj3;
        this.f2525e = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: b8.cg.a():void");
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: b8.cg.b():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: b8.cg.run():void");
    }

    public cg(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i3) {
        this.f2522a = i3;
        this.f2525e = obj;
        this.f2523b = obj2;
        this.f2524c = obj3;
        this.d = obj4;
    }

    public cg(Handler handler, wf.b bVar, long j10) {
        this.f2522a = 7;
        this.f2525e = new AtomicBoolean(false);
        this.f2523b = handler;
        this.f2524c = bVar;
        u9.a aVar = new u9.a(22, this, bVar);
        this.d = aVar;
        if (j10 > 0) {
            handler.postDelayed(aVar, j10);
        }
    }
}
