package b7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.u51;
import org.telegram.ui.PhotoViewer;
public final class l implements c, g6.h {
    public int f3009a;

    public l() {
        this.f3009a = 3;
    }

    @Override
    public void b(g6.f fVar, boolean z9) {
        g6.c cVar = (g6.c) fVar;
    }

    @Override
    public void c(g6.f fVar, int i7) {
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
    public void i(g6.f fVar, String str) {
        MediaController B;
        ij ijVar;
        g6.c cVar = (g6.c) fVar;
        if (cVar != null) {
            q6.m.d("Must be called from the main thread.");
            h6.h hVar = cVar.f13549j;
            if (hVar == 0) {
                return;
            }
            AtomicInteger atomicInteger = d1.f.f7943b;
            if (atomicInteger != null) {
                atomicInteger.set(0);
            }
            hVar.p(new Object());
            q6.m.d("Must be called from the main thread.");
            if (!hVar.w()) {
                h6.h.t();
            } else {
                h6.h.x(new h6.i(hVar, 3));
            }
            int i7 = this.f3009a;
            long j3 = -1;
            if (i7 == 0) {
                u51 u51Var = PhotoViewer.p1().F2;
                if (u51Var != null) {
                    j3 = u51Var.S();
                }
            } else if (i7 == 1 && (ijVar = (B = MediaController.B()).f21295u0) != null) {
                j3 = B.D(ijVar);
            }
            if (j3 >= 0) {
                d1.f.v(j3);
            }
            d1.f.d(true);
        }
    }

    @Override
    public void j(g6.f fVar, int i7) {
        g6.c cVar = (g6.c) fVar;
        d1.f.d(false);
        d1.f.C();
    }

    @Override
    public int m(Context context, String str, boolean z9) {
        return 0;
    }

    @Override
    public void p(g6.f fVar, String str) {
        g6.c cVar = (g6.c) fVar;
    }

    @Override
    public int q(Context context, String str) {
        return this.f3009a;
    }

    @Override
    public void s(g6.f fVar) {
        g6.c cVar = (g6.c) fVar;
    }

    @Override
    public void t(g6.f fVar) {
        g6.c cVar = (g6.c) fVar;
        d1.f.d(false);
        d1.f.C();
    }

    public l(int i7) {
        this.f3009a = i7;
    }
}
