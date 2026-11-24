package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
public final class wa2 implements Runnable {
    public final byte a;
    public final gb2 b;

    public wa2(gb2 gb2Var, byte b) {
        this.a = b;
        this.b = gb2Var;
    }

    @Override
    public final void run() {
        boolean z2;
        switch (this.a) {
            case 0:
                bb2 bb2Var = this.b.eb;
                if (bb2Var != null) {
                    bb2Var.t();
                    return;
                }
                return;
            default:
                gb2 gb2Var = this.b;
                wa2 wa2Var = gb2Var.Ib;
                k27 k27Var = gb2Var.Q5;
                if (k27Var != null && (z2 = gb2Var.z2(k27Var)) != gb2Var.h3) {
                    gb2Var.h3 = z2;
                    if (!z2) {
                        gl.d3(wa2Var, 1000L);
                        gb2Var.rb = true;
                        int L = gb2Var.b7 - gl.L(91.0f);
                        gb2Var.e3 = new StaticLayout(TextUtils.ellipsize(k96.M0(2131753963, null), bkb.G2, L, TextUtils.TruncateAt.END), bkb.G2, L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } else {
                        k27 k27Var2 = gb2Var.Q5;
                        gb2Var.Q5 = null;
                        gb2Var.z3(k27Var2, gb2Var.L, gb2Var.G, gb2Var.F, gb2Var.H, false);
                    }
                }
                if (gb2Var.h3) {
                    gb2Var.invalidate();
                    gb2Var.rb = false;
                    return;
                }
                RectF rectF = gb2Var.c4;
                gb2Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                if (gb2Var.rb) {
                    gl.d3(wa2Var, 1000L);
                    return;
                }
                return;
        }
    }
}
