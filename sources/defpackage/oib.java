package defpackage;

import android.graphics.Canvas;
import android.text.Layout;
public class oib extends rib {
    public final j3b p0;

    public oib(j3b j3bVar, f53 f53Var) {
        this.p0 = j3bVar;
        this.g0 = f53Var;
    }

    public final void V(Canvas canvas) {
        Layout staticTextLayout = this.p0.getStaticTextLayout();
        int v0 = bkb.v0(bkb.Ce, this.g0);
        this.o.setColor(v0);
        this.p.setColor(v0);
        g(canvas, staticTextLayout, this.u, this.v, true, true, 0.0f);
    }

    @Override
    public final void h(int i, hi2 hi2Var, boolean z) {
        hi2Var.d = this.p0.getStaticTextLayout();
        hi2Var.b = 0.0f;
        hi2Var.c = 0.0f;
        hi2Var.a = 0;
    }

    @Override
    public final int j(int i, int i2, int i3, int i4, mib mibVar, boolean z) {
        nib nibVar = (nib) mibVar;
        if (i2 < 0) {
            i2 = 1;
        }
        Layout staticTextLayout = nibVar.getStaticTextLayout();
        if (i2 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i2 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        hi2 hi2Var = this.a0;
        Layout layout = (Layout) hi2Var.d;
        if (layout != null) {
            int i5 = (int) (i - hi2Var.c);
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
                    return hi2Var.a + layout.getOffsetForHorizontal(i6, i5);
                } catch (Exception e) {
                    fa4.g(e, true);
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
