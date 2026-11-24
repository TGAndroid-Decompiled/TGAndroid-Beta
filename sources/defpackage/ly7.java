package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public final class ly7 extends be0 implements sp3 {
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
    public ye7 S;
    public int T;
    public nmb U;
    public int V;

    @Override
    public final void B(boolean z) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly7.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(gl.L(100.0f), gl.L(100.0f));
    }

    public void setPattern(TLRPC.TL_wallPaper tL_wallPaper) {
        ly7 ly7Var;
        this.J = tL_wallPaper;
        if (tL_wallPaper != null) {
            ly7Var = this;
            ly7Var.g(1, 0L, gl5.c(ba4.w(tL_wallPaper.document.thumbs, gl.L(100.0f), false, null, false), tL_wallPaper.document), null, tL_wallPaper, "100_100", null, "png");
        } else {
            ly7Var = this;
            ly7Var.setImageDrawable(null);
        }
        ly7Var.v(false);
    }

    public final void u(Object obj, boolean z, boolean z2) {
        File J;
        String str;
        int i = this.K;
        RadialProgress2 radialProgress2 = this.I;
        if (!(obj instanceof TLRPC.TL_wallPaper)) {
            if (obj instanceof nm6) {
                nm6 nm6Var = (nm6) obj;
                TLRPC.Photo photo = nm6Var.K;
                if (photo != null) {
                    TLRPC.PhotoSize w = ba4.w(photo.sizes, this.V, true, null, false);
                    ba4.G(i);
                    J = ba4.J(w, null, true, true);
                    str = ba4.r(null, w);
                } else {
                    J = fl5.w(nm6Var.C);
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
            String r = ba4.r(null, tL_wallPaper.document);
            if (TextUtils.isEmpty(r)) {
                return;
            }
            ba4.G(i);
            J = ba4.J(tL_wallPaper.document, null, true, true);
            str = r;
        }
        if (J.exists()) {
            up3.q(i).v(this);
            radialProgress2.o(z2, 1.0f);
            radialProgress2.setIcon(6, z, z2);
            return;
        }
        up3.q(i).a(str, null, this);
        ba4.G(i).S(str);
        Float s = fl5.z().s(str);
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
