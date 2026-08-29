package a5;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.x61;
import org.telegram.ui.PhotoViewer;
import z5.l;
public final class c implements k6.c, p5.h {
    public int f161a;

    public c() {
        this.f161a = 3;
    }

    @Override
    public void a(p5.f fVar, String str) {
        p5.c cVar = (p5.c) fVar;
    }

    @Override
    public void b(p5.f fVar) {
        p5.c cVar = (p5.c) fVar;
    }

    @Override
    public void c(p5.f fVar, int i10) {
        p5.c cVar = (p5.c) fVar;
    }

    @Override
    public void d(p5.f fVar) {
        p5.c cVar = (p5.c) fVar;
        d1.f.d(false);
        d1.f.C();
    }

    @Override
    public void e(p5.f fVar, int i10) {
        p5.c cVar = (p5.c) fVar;
    }

    @Override
    public void f(p5.f fVar, String str) {
        p5.c cVar = (p5.c) fVar;
        if (cVar != null) {
            l.e("Must be called from the main thread.");
            q5.h hVar = cVar.f45629j;
            if (hVar == 0) {
                return;
            }
            AtomicInteger atomicInteger = d1.f.f5263b;
            if (atomicInteger != null) {
                atomicInteger.set(0);
            }
            hVar.p(new Object());
            l.e("Must be called from the main thread.");
            if (!hVar.w()) {
                q5.h.t();
            } else {
                q5.h.x(new q5.i(hVar, 3));
            }
            int i10 = this.f161a;
            long j10 = -1;
            if (i10 == 0) {
                x61 x61Var = PhotoViewer.t1().B2;
                if (x61Var != null) {
                    j10 = x61Var.o();
                }
            } else if (i10 == 1) {
                j10 = MediaController.getInstance().getCurrentPosition();
            }
            if (j10 >= 0) {
                d1.f.v(j10);
            }
            d1.f.d(true);
        }
    }

    @Override
    public void g(p5.f fVar, int i10) {
        p5.c cVar = (p5.c) fVar;
        d1.f.d(false);
        d1.f.C();
    }

    @Override
    public void h(p5.f fVar, boolean z10) {
        p5.c cVar = (p5.c) fVar;
    }

    @Override
    public int i(Context context, String str, boolean z10) {
        return 0;
    }

    @Override
    public void j(p5.f fVar, int i10) {
        p5.c cVar = (p5.c) fVar;
    }

    @Override
    public int l(Context context, String str) {
        return this.f161a;
    }

    public c(int i10) {
        this.f161a = i10;
    }
}
