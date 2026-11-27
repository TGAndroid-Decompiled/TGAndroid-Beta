package defpackage;

import android.graphics.Canvas;
import android.text.Layout;
public class jmb extends mmb {
    public final f7b p0;

    public jmb(f7b f7bVar, x53 x53Var) {
        this.p0 = f7bVar;
        this.g0 = x53Var;
    }

    public final void V(Canvas canvas) {
        Layout staticTextLayout = this.p0.getStaticTextLayout();
        int v0 = aob.v0(aob.De, this.g0);
        this.o.setColor(v0);
        this.p.setColor(v0);
        g(canvas, staticTextLayout, this.u, this.v, true, true, 0.0f);
    }

    @Override
    public final void h(int i, dj2 dj2Var, boolean z) {
        dj2Var.d = this.p0.getStaticTextLayout();
        dj2Var.b = 0.0f;
        dj2Var.c = 0.0f;
        dj2Var.a = 0;
    }

    @Override
    public final int j(int i, int i2, int i3, int i4, hmb hmbVar, boolean z) {
        imb imbVar = (imb) hmbVar;
        if (i2 < 0) {
            i2 = 1;
        }
        Layout staticTextLayout = imbVar.getStaticTextLayout();
        if (i2 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i2 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        dj2 dj2Var = this.a0;
        Layout layout = (Layout) dj2Var.d;
        if (layout != null) {
            int i5 = (int) (i - dj2Var.c);
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
                    return dj2Var.a + layout.getOffsetForHorizontal(i6, i5);
                } catch (Exception e) {
                    cc4.g(e, true);
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
