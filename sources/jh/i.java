package jh;

import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.b8;
import org.telegram.messenger.i0;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.RadialProgress2;
public final class i extends ih.f {
    public final kj f10418b;
    public final RadialProgress2 f10419c;

    public i(kj kjVar) {
        this.f10418b = kjVar;
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.f10419c = radialProgress2;
        TLRPC.Document F0 = kjVar.F0();
        if (kj.W2(F0)) {
            TLRPC.PhotoSize w9 = b8.w(F0.thumbs, i0.L(22.0f), true, null, false);
            radialProgress2.j(b8.w(F0.thumbs, i0.L(44.0f), true, w9, true), w9, F0, kjVar);
        } else {
            String t02 = kj.t0(F0, true);
            if (!TextUtils.isEmpty(t02)) {
                radialProgress2.h(t02);
            } else {
                radialProgress2.i(null, null, null);
            }
        }
        radialProgress2.g(t6.We, t6.Xe, t6.f21027id, t6.f21046jd);
    }

    @Override
    public final void a(View view) {
        super.a(view);
        RadialProgress2 radialProgress2 = this.f10419c;
        radialProgress2.n(view);
        radialProgress2.e();
        radialProgress2.setIcon(0, false, false);
    }

    @Override
    public final void b() {
        super.b();
        this.f10419c.f();
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        RadialProgress2 radialProgress2 = this.f10419c;
        radialProgress2.setCircleRadius(i10 / 2);
        radialProgress2.r(0, 0, i10, i11);
        radialProgress2.draw(canvas);
    }
}
