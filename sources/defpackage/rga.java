package defpackage;

import android.graphics.Point;
import org.telegram.ui.ActionBar.e;
public final class rga implements u69 {
    public final gga a;
    public final eja b;

    public rga(eja ejaVar, gga ggaVar) {
        this.b = ejaVar;
        this.a = ggaVar;
    }

    @Override
    public final boolean mo8d(float r17, float r18, int r19, android.view.View r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rga.mo8d(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void f() {
        e eVar = this.b.y1;
        if (eVar != null) {
            Point point = hl.q;
            if (point.x > point.y) {
                eVar.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void h(float f) {
        e eVar = this.b.y1;
        if (eVar != null) {
            Point point = hl.q;
            if (point.x > point.y) {
                eVar.movePreviewFragment(f);
            }
        }
    }
}
