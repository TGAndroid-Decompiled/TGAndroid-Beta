package ag;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.s81;
import org.telegram.ui.PhotoViewer;
public final class j implements e6.h, z6.c {
    public int f1303a;

    public j() {
        this.f1303a = 3;
    }

    @Override
    public int U(Context context, String str) {
        return this.f1303a;
    }

    @Override
    public void a(e6.f fVar, String str) {
        e6.c cVar = (e6.c) fVar;
        if (cVar != null) {
            o6.l.e("Must be called from the main thread.");
            f6.h hVar = cVar.f9808j;
            if (hVar == 0) {
                return;
            }
            AtomicInteger atomicInteger = c5.d.f6140b;
            if (atomicInteger != null) {
                atomicInteger.set(0);
            }
            hVar.p(new Object());
            o6.l.e("Must be called from the main thread.");
            if (!hVar.w()) {
                f6.h.t();
            } else {
                f6.h.x(new f6.j(hVar, 3));
            }
            int i10 = this.f1303a;
            long j10 = -1;
            if (i10 == 0) {
                s81 s81Var = PhotoViewer.u1().F2;
                if (s81Var != null) {
                    j10 = s81Var.n();
                }
            } else if (i10 == 1) {
                j10 = MediaController.getInstance().getCurrentPosition();
            }
            if (j10 >= 0) {
                c5.d.v(j10);
            }
            c5.d.d(true);
        }
    }

    @Override
    public void b(e6.f fVar, int i10) {
        e6.c cVar = (e6.c) fVar;
    }

    @Override
    public void d(e6.f fVar, int i10) {
        e6.c cVar = (e6.c) fVar;
    }

    @Override
    public void e(e6.f fVar, int i10) {
        e6.c cVar = (e6.c) fVar;
    }

    @Override
    public void g(e6.f fVar, String str) {
        e6.c cVar = (e6.c) fVar;
    }

    @Override
    public void l(e6.f fVar) {
        e6.c cVar = (e6.c) fVar;
    }

    @Override
    public void r(e6.f fVar) {
        e6.c cVar = (e6.c) fVar;
        c5.d.d(false);
        c5.d.C();
    }

    @Override
    public int t(Context context, String str, boolean z10) {
        return 0;
    }

    @Override
    public void v(e6.f fVar, boolean z10) {
        e6.c cVar = (e6.c) fVar;
    }

    @Override
    public void x(e6.f fVar, int i10) {
        e6.c cVar = (e6.c) fVar;
        c5.d.d(false);
        c5.d.C();
    }

    public j(int i10) {
        this.f1303a = i10;
    }
}
