package ae;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.kj;
import org.telegram.ui.Components.v61;
import org.telegram.ui.PhotoViewer;
public final class j implements d6.h, y6.c {
    public int f425a;

    public j() {
        this.f425a = 3;
    }

    @Override
    public void A(d6.f fVar) {
        d6.c cVar = (d6.c) fVar;
        b5.d.d(false);
        b5.d.C();
    }

    @Override
    public void F(d6.f fVar, String str) {
        MediaController B;
        kj kjVar;
        d6.c cVar = (d6.c) fVar;
        if (cVar != null) {
            n6.l.d("Must be called from the main thread.");
            e6.h hVar = cVar.f5768j;
            if (hVar == 0) {
                return;
            }
            AtomicInteger atomicInteger = b5.d.f2489b;
            if (atomicInteger != null) {
                atomicInteger.set(0);
            }
            hVar.p(new Object());
            n6.l.d("Must be called from the main thread.");
            if (!hVar.w()) {
                e6.h.t();
            } else {
                e6.h.x(new e6.i(hVar, 3));
            }
            int i10 = this.f425a;
            long j10 = -1;
            if (i10 == 0) {
                v61 v61Var = PhotoViewer.v1().F2;
                if (v61Var != null) {
                    j10 = v61Var.S();
                }
            } else if (i10 == 1 && (kjVar = (B = MediaController.B()).f14483u0) != null) {
                j10 = B.D(kjVar);
            }
            if (j10 >= 0) {
                b5.d.v(j10);
            }
            b5.d.d(true);
        }
    }

    @Override
    public void G(d6.f fVar, int i10) {
        d6.c cVar = (d6.c) fVar;
    }

    @Override
    public void j(d6.f fVar, String str) {
        d6.c cVar = (d6.c) fVar;
    }

    @Override
    public void k(d6.f fVar, int i10) {
        d6.c cVar = (d6.c) fVar;
    }

    @Override
    public void o(d6.f fVar, boolean z10) {
        d6.c cVar = (d6.c) fVar;
    }

    @Override
    public int p0(Context context, String str, boolean z10) {
        return 0;
    }

    @Override
    public void q(d6.f fVar, int i10) {
        d6.c cVar = (d6.c) fVar;
        b5.d.d(false);
        b5.d.C();
    }

    @Override
    public void t(d6.f fVar) {
        d6.c cVar = (d6.c) fVar;
    }

    @Override
    public void u(d6.f fVar, int i10) {
        d6.c cVar = (d6.c) fVar;
    }

    @Override
    public int x1(Context context, String str) {
        return this.f425a;
    }

    public j(int i10) {
        this.f425a = i10;
    }
}
