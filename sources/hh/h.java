package hh;

import android.graphics.RectF;
import android.view.View;
import java.util.WeakHashMap;
import r0.a0;
import r0.h0;
public final class h implements Runnable {
    public final int f7693a;
    public final i f7694b;

    public h(i iVar, int i10) {
        this.f7693a = i10;
        this.f7694b = iVar;
    }

    @Override
    public final void run() {
        int i10 = this.f7693a;
        i iVar = this.f7694b;
        switch (i10) {
            case 0:
                if (iVar.f7702w != 0) {
                    iVar.i(false);
                    return;
                }
                return;
            default:
                int i11 = iVar.G - 1;
                iVar.G = i11;
                if (i11 == 0) {
                    View view = iVar.E;
                    RectF rectF = e.e;
                    WeakHashMap weakHashMap = h0.f46123a;
                    iVar.k(e.e1(a0.a(view), view, view.getRootView()), false);
                    return;
                }
                return;
        }
    }
}
