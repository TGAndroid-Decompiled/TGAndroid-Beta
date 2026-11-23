package b7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gj;
import org.telegram.ui.Components.i61;
import org.telegram.ui.PhotoViewer;
public final class l implements c, g6.h {
    public int f2980a;

    public l() {
        this.f2980a = 3;
    }

    @Override
    public int C(Context context, String str) {
        return this.f2980a;
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
        gj gjVar;
        g6.c cVar = (g6.c) fVar;
        if (cVar != null) {
            q6.m.e("Must be called from the main thread.");
            h6.h hVar = cVar.f13246j;
            if (hVar == 0) {
                return;
            }
            AtomicInteger atomicInteger = d1.f.f7647b;
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
            int i7 = this.f2980a;
            long j3 = -1;
            if (i7 == 0) {
                i61 i61Var = PhotoViewer.p1().G2;
                if (i61Var != null) {
                    j3 = i61Var.S();
                }
            } else if (i7 == 1 && (gjVar = (B = MediaController.B()).f22771v0) != null) {
                j3 = B.D(gjVar);
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
        this.f2980a = i7;
    }
}
