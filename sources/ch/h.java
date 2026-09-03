package ch;

import android.graphics.RectF;
import android.view.View;
import r0.j0;
public final class h implements Runnable {
    public final int f2587a;
    public final i f2588b;

    public h(i iVar, int i10) {
        this.f2587a = i10;
        this.f2588b = iVar;
    }

    @Override
    public final void run() {
        int i10 = this.f2587a;
        i iVar = this.f2588b;
        switch (i10) {
            case 0:
                if (iVar.v != 0) {
                    iVar.h(false);
                    return;
                }
                return;
            default:
                int i11 = iVar.D - 1;
                iVar.D = i11;
                if (i11 == 0) {
                    View view = iVar.B;
                    RectF rectF = e.e;
                    iVar.j(e.L(j0.f(view), view, view.getRootView()), false);
                    return;
                }
                return;
        }
    }
}
