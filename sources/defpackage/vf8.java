package defpackage;

import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public final class vf8 extends nf8 {
    public final k47 b;
    public final RadialProgress2 c;

    public vf8(k47 k47Var) {
        this.b = k47Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.c = radialProgress2;
        TLRPC.Document F0 = k47Var.F0();
        if (k47.W2(F0)) {
            TLRPC.PhotoSize w = bc4.w(F0.thumbs, gm.L(22.0f), true, null, false);
            radialProgress2.j(bc4.w(F0.thumbs, gm.L(44.0f), true, w, true), w, F0, k47Var);
        } else {
            String t0 = k47.t0(F0, true);
            if (!TextUtils.isEmpty(t0)) {
                radialProgress2.h(t0);
            } else {
                radialProgress2.i(null, null, null);
            }
        }
        radialProgress2.g(cmb.Ye, cmb.Ze, cmb.kd, cmb.ld);
    }

    @Override
    public final void a(View view) {
        super.a(view);
        RadialProgress2 radialProgress2 = this.c;
        radialProgress2.m(view);
        radialProgress2.e();
        radialProgress2.setIcon(0, false, false);
    }

    @Override
    public final void b() {
        super.b();
        this.c.f();
    }

    @Override
    public final void c(Canvas canvas, int i, int i2) {
        RadialProgress2 radialProgress2 = this.c;
        radialProgress2.setCircleRadius(i / 2);
        radialProgress2.p(0, 0, i, i2);
        radialProgress2.draw(canvas);
    }
}
