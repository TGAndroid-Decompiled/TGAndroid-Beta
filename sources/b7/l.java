package b7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.f61;
import org.telegram.ui.PhotoViewer;
public final class l implements c, g6.h {
    public int f2961a;

    public l() {
        this.f2961a = 3;
    }

    @Override
    public int C(Context context, String str) {
        return this.f2961a;
    }

    @Override
    public void a(g6.f fVar, boolean z10) {
        g6.c cVar = (g6.c) fVar;
    }

    @Override
    public void b(g6.f fVar, int i7) {
        g6.c cVar = (g6.c) fVar;
    }

    @Override
    public void e(g6.f fVar, int i7) {
        g6.c cVar = (g6.c) fVar;
    }

    @Override
    public void f(g6.f fVar, int i7) {
        g6.c cVar = (g6.c) fVar;
    }

    @Override
    public void h(g6.f fVar, String str) {
        MediaController B;
        fj fjVar;
        g6.c cVar = (g6.c) fVar;
        if (cVar != null) {
            q6.m.e("Must be called from the main thread.");
            h6.h hVar = cVar.f13214j;
            if (hVar == 0) {
                return;
            }
            AtomicInteger atomicInteger = d1.f.f7615b;
            if (atomicInteger != null) {
                atomicInteger.set(0);
            }
            hVar.p(new Object());
            q6.m.e("Must be called from the main thread.");
            if (!hVar.w()) {
                h6.h.t();
            } else {
                h6.h.x(new h6.i(hVar, 3));
            }
            int i7 = this.f2961a;
            long j3 = -1;
            if (i7 == 0) {
                f61 f61Var = PhotoViewer.p1().G2;
                if (f61Var != null) {
                    j3 = f61Var.S();
                }
            } else if (i7 == 1 && (fjVar = (B = MediaController.B()).f22740v0) != null) {
                j3 = B.D(fjVar);
            }
            if (j3 >= 0) {
                d1.f.v(j3);
            }
            d1.f.d(true);
        }
    }

    @Override
    public void k(g6.f fVar, int i7) {
        g6.c cVar = (g6.c) fVar;
        d1.f.d(false);
        d1.f.C();
    }

    @Override
    public void l(g6.f fVar, String str) {
        g6.c cVar = (g6.c) fVar;
    }

    @Override
    public void m(g6.f fVar) {
        g6.c cVar = (g6.c) fVar;
    }

    @Override
    public void n(g6.f fVar) {
        g6.c cVar = (g6.c) fVar;
        d1.f.d(false);
        d1.f.C();
    }

    @Override
    public int o(Context context, String str, boolean z10) {
        return 0;
    }

    public l(int i7) {
        this.f2961a = i7;
    }
}
