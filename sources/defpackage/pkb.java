package defpackage;

import android.graphics.Canvas;
import android.text.Layout;
public class pkb extends skb {
    public final k5b p0;

    public pkb(k5b k5bVar, r63 r63Var) {
        this.p0 = k5bVar;
        this.g0 = r63Var;
    }

    public final void V(Canvas canvas) {
        Layout staticTextLayout = this.p0.getStaticTextLayout();
        int v0 = cmb.v0(cmb.Ce, this.g0);
        this.o.setColor(v0);
        this.p.setColor(v0);
        g(canvas, staticTextLayout, this.u, this.v, true, true, 0.0f);
    }

    @Override
    public final void h(int i, vj2 vj2Var, boolean z) {
        vj2Var.d = this.p0.getStaticTextLayout();
        vj2Var.b = 0.0f;
        vj2Var.c = 0.0f;
        vj2Var.a = 0;
    }

    @Override
    public final int j(int i, int i2, int i3, int i4, nkb nkbVar, boolean z) {
        okb okbVar = (okb) nkbVar;
        if (i2 < 0) {
            i2 = 1;
        }
        Layout staticTextLayout = okbVar.getStaticTextLayout();
        if (i2 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i2 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        vj2 vj2Var = this.a0;
        Layout layout = (Layout) vj2Var.d;
        if (layout != null) {
            int i5 = (int) (i - vj2Var.c);
            int i6 = 0;
            while (true) {
                if (i6 < layout.getLineCount()) {
                    if (i2 > layout.getLineTop(i6) + i4 && i2 < layout.getLineBottom(i6) + i4) {
                        break;
                    }
                    i6++;
                } else {
                    i6 = -1;
                    break;
                }
            }
            if (i6 >= 0) {
                try {
                    return vj2Var.a + layout.getOffsetForHorizontal(i6, i5);
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        }
        return -1;
    }

    @Override
    public final int l() {
        Layout staticTextLayout = this.p0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }
}
