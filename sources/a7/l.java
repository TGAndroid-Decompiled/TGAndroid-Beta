package a7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.m51;
import org.telegram.ui.PhotoViewer;
public final class l implements c, f6.h {
    public int f156a;

    public l() {
        this.f156a = 3;
    }

    @Override
    public void a(f6.f fVar, int i3) {
        f6.c cVar = (f6.c) fVar;
        d1.f.d(false);
        d1.f.C();
    }

    @Override
    public void d(f6.f fVar, int i3) {
        f6.c cVar = (f6.c) fVar;
    }

    @Override
    public int e(Context context, String str, boolean z10) {
        return 0;
    }

    @Override
    public void f(f6.f fVar, String str) {
        MediaController B;
        zi ziVar;
        f6.c cVar = (f6.c) fVar;
        if (cVar != null) {
            p6.m.d("Must be called from the main thread.");
            g6.h hVar = cVar.f11473j;
            if (hVar == 0) {
                return;
            }
            AtomicInteger atomicInteger = d1.f.f8000b;
            if (atomicInteger != null) {
                atomicInteger.set(0);
            }
            hVar.p(new Object());
            p6.m.d("Must be called from the main thread.");
            if (!hVar.w()) {
                g6.h.t();
            } else {
                g6.h.x(new g6.i(hVar, 3));
            }
            int i3 = this.f156a;
            long j10 = -1;
            if (i3 == 0) {
                m51 m51Var = PhotoViewer.v1().G2;
                if (m51Var != null) {
                    j10 = m51Var.S();
                }
            } else if (i3 == 1 && (ziVar = (B = MediaController.B()).f21348v0) != null) {
                j10 = B.D(ziVar);
            }
            if (j10 >= 0) {
                d1.f.v(j10);
            }
            d1.f.d(true);
        }
    }

    @Override
    public void g(f6.f fVar) {
        f6.c cVar = (f6.c) fVar;
    }

    @Override
    public void h(f6.f fVar) {
        f6.c cVar = (f6.c) fVar;
        d1.f.d(false);
        d1.f.C();
    }

    @Override
    public void j(f6.f fVar, String str) {
        f6.c cVar = (f6.c) fVar;
    }

    @Override
    public int k(Context context, String str) {
        return this.f156a;
    }

    @Override
    public void l(f6.f fVar, boolean z10) {
        f6.c cVar = (f6.c) fVar;
    }

    @Override
    public void m(f6.f fVar, int i3) {
        f6.c cVar = (f6.c) fVar;
    }

    @Override
    public void n(f6.f fVar, int i3) {
        f6.c cVar = (f6.c) fVar;
    }

    public l(int i3) {
        this.f156a = i3;
    }
}
