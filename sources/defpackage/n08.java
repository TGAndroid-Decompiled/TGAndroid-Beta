package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public final class n08 extends bf0 implements cr3 {
    public RectF H;
    public RadialProgress2 I;
    public TLRPC.TL_wallPaper J;
    public int K;
    public LinearGradient L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public Paint R;
    public ah7 S;
    public int T;
    public oob U;
    public int V;

    @Override
    public final void A(boolean z) {
        TLRPC.TL_wallPaper tL_wallPaper = this.U.a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.id == tL_wallPaper.id)) {
            if (z) {
                this.I.setIcon(4, false, true);
            } else {
                u(tL_wallPaper2, true, z);
            }
        }
    }

    @Override
    public final void N(String str) {
        this.I.o(true, 1.0f);
        TLRPC.TL_wallPaper tL_wallPaper = this.U.a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.id == tL_wallPaper.id)) {
            u(tL_wallPaper2, false, true);
        }
    }

    @Override
    public int getObserverTag() {
        return this.T;
    }

    @Override
    public final void i(long j, long j2) {
        RadialProgress2 radialProgress2 = this.I;
        radialProgress2.o(true, Math.min(1.0f, ((float) j) / ((float) j2)));
        TLRPC.TL_wallPaper tL_wallPaper = this.U.a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if (((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.id == tL_wallPaper.id)) && radialProgress2.i.q != 10) {
            u(tL_wallPaper2, false, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n08.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(gm.L(100.0f), gm.L(100.0f));
    }

    public void setPattern(TLRPC.TL_wallPaper tL_wallPaper) {
        n08 n08Var;
        this.J = tL_wallPaper;
        if (tL_wallPaper != null) {
            n08Var = this;
            n08Var.g(1, 0L, gn5.c(bc4.w(tL_wallPaper.document.thumbs, gm.L(100.0f), false, null, false), tL_wallPaper.document), null, tL_wallPaper, "100_100", null, "png");
        } else {
            n08Var = this;
            n08Var.setImageDrawable(null);
        }
        n08Var.v(false);
    }

    public final void u(Object obj, boolean z, boolean z2) {
        File J;
        String str;
        int i = this.K;
        RadialProgress2 radialProgress2 = this.I;
        if (!(obj instanceof TLRPC.TL_wallPaper)) {
            if (obj instanceof no6) {
                no6 no6Var = (no6) obj;
                TLRPC.Photo photo = no6Var.K;
                if (photo != null) {
                    TLRPC.PhotoSize w = bc4.w(photo.sizes, this.V, true, null, false);
                    bc4.G(i);
                    J = bc4.J(w, null, true, true);
                    str = bc4.r(null, w);
                } else {
                    J = fn5.w(no6Var.C);
                    str = J.getName();
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            } else {
                radialProgress2.setIcon(6, z, z2);
                return;
            }
        } else {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            String r = bc4.r(null, tL_wallPaper.document);
            if (TextUtils.isEmpty(r)) {
                return;
            }
            bc4.G(i);
            J = bc4.J(tL_wallPaper.document, null, true, true);
            str = r;
        }
        if (J.exists()) {
            er3.q(i).v(this);
            radialProgress2.o(z2, 1.0f);
            radialProgress2.setIcon(6, z, z2);
            return;
        }
        er3.q(i).a(str, null, this);
        bc4.G(i).S(str);
        Float s = fn5.z().s(str);
        if (s != null) {
            radialProgress2.o(z2, s.floatValue());
        } else {
            radialProgress2.o(z2, 0.0f);
        }
        radialProgress2.setIcon(10, z, z2);
    }

    public final void v(boolean z) {
        TLRPC.TL_wallPaper tL_wallPaper = this.U.a.d.Y0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.J;
        if ((tL_wallPaper2 == null && tL_wallPaper == null) || (tL_wallPaper != null && tL_wallPaper2 != null && tL_wallPaper2.id == tL_wallPaper.id)) {
            u(tL_wallPaper, false, z);
        } else {
            this.I.setIcon(4, false, z);
        }
        super.invalidate();
    }

    @Override
    public final void l(long j, long j2) {
    }
}
