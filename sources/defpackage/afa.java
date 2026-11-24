package defpackage;

import android.graphics.Point;
import org.telegram.ui.ActionBar.d;
public final class afa implements i59 {
    public final pea a;
    public final nha b;

    public afa(nha nhaVar, pea peaVar) {
        this.b = nhaVar;
        this.a = peaVar;
    }

    @Override
    public final boolean mo14d(float r17, float r18, int r19, android.view.View r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afa.mo14d(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void i() {
        d dVar = this.b.y1;
        if (dVar != null) {
            Point point = gm.q;
            if (point.x > point.y) {
                dVar.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void k(float f) {
        d dVar = this.b.y1;
        if (dVar != null) {
            Point point = gm.q;
            if (point.x > point.y) {
                dVar.movePreviewFragment(f);
            }
        }
    }
}
