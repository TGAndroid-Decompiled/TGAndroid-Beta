package a8;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
public final class fg implements Runnable {
    public final int f463a;
    public final Object f464b;
    public final Object f465c;
    public final Object d;
    public final Object e;

    public fg(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f463a = i10;
        this.f464b = obj;
        this.f465c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: a8.fg.a():void");
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: a8.fg.b():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: a8.fg.run():void");
    }

    public fg(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f463a = i10;
        this.e = obj;
        this.f464b = obj2;
        this.f465c = obj3;
        this.d = obj4;
    }

    public fg(Handler handler, uf.b bVar, long j10) {
        this.f463a = 6;
        this.e = new AtomicBoolean(false);
        this.f464b = handler;
        this.f465c = bVar;
        s9.g gVar = new s9.g(19, this, bVar);
        this.d = gVar;
        if (j10 > 0) {
            handler.postDelayed(gVar, j10);
        }
    }
}
