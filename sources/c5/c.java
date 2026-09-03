package c5;

import android.content.Context;
import b6.m;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.j71;
import org.telegram.ui.PhotoViewer;
public final class c implements m6.c, r5.h {
    public int f2264a;

    public c() {
        this.f2264a = 3;
    }

    @Override
    public int G(Context context, String str) {
        return this.f2264a;
    }

    @Override
    public void e(r5.f fVar, int i10) {
        r5.c cVar = (r5.c) fVar;
    }

    @Override
    public void f(r5.f fVar, String str) {
        r5.c cVar = (r5.c) fVar;
        if (cVar != null) {
            m.e("Must be called from the main thread.");
            s5.h hVar = cVar.f46739j;
            if (hVar == 0) {
                return;
            }
            AtomicInteger atomicInteger = d1.f.f4159b;
            if (atomicInteger != null) {
                atomicInteger.set(0);
            }
            hVar.p(new Object());
            m.e("Must be called from the main thread.");
            if (!hVar.w()) {
                s5.h.t();
            } else {
                s5.h.x(new s5.i(hVar, 3));
            }
            int i10 = this.f2264a;
            long j10 = -1;
            if (i10 == 0) {
                j71 j71Var = PhotoViewer.t1().C2;
                if (j71Var != null) {
                    j10 = j71Var.n();
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
    public void g(r5.f fVar, boolean z4) {
        r5.c cVar = (r5.c) fVar;
    }

    @Override
    public void h(r5.f fVar, int i10) {
        r5.c cVar = (r5.c) fVar;
    }

    @Override
    public void i(r5.f fVar, int i10) {
        r5.c cVar = (r5.c) fVar;
    }

    @Override
    public void j(r5.f fVar) {
        r5.c cVar = (r5.c) fVar;
    }

    @Override
    public void k(r5.f fVar, String str) {
        r5.c cVar = (r5.c) fVar;
    }

    @Override
    public void m(r5.f fVar) {
        r5.c cVar = (r5.c) fVar;
        d1.f.d(false);
        d1.f.C();
    }

    @Override
    public void o(r5.f fVar, int i10) {
        r5.c cVar = (r5.c) fVar;
        d1.f.d(false);
        d1.f.C();
    }

    @Override
    public int u(Context context, String str, boolean z4) {
        return 0;
    }

    public c(int i10) {
        this.f2264a = i10;
    }
}
