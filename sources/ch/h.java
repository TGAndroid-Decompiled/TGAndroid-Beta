package ch;

import android.graphics.RectF;
import android.view.View;
import r0.j0;
public final class h implements Runnable {
    public final int f2604a;
    public final i f2605b;

    public h(i iVar, int i10) {
        this.f2604a = i10;
        this.f2605b = iVar;
    }

    @Override
    public final void run() {
        int i10 = this.f2604a;
        i iVar = this.f2605b;
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
