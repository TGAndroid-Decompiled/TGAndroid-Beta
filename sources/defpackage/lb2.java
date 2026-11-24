package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.tgnet.TLRPC;
public final class lb2 {
    public final gb2 a;
    public gc0 b;
    public tgb c;
    public int d;
    public Drawable e;

    public lb2(gb2 gb2Var) {
        this.a = gb2Var;
    }

    public final void a(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        String str;
        int i;
        int L;
        int i2;
        StaticLayout staticLayout;
        float f;
        int i3;
        int i4;
        int i5;
        gb2 gb2Var = this.a;
        boolean I4 = gb2Var.Q5.I4();
        k27 k27Var = gb2Var.Q5;
        if (k27Var.k.action instanceof TLRPC.TL_messageActionConferenceCall) {
            if (k27Var.O3()) {
                drawable = bkb.N4;
            } else {
                drawable = bkb.O4;
            }
            if (this.e == null) {
                Resources resources = gb2Var.getContext().getResources();
                if (gb2Var.Q5.I4()) {
                    i5 = 2131231186;
                } else {
                    i5 = 2131231093;
                }
                this.e = resources.getDrawable(i5).mutate();
            }
            if (gb2Var.Q5.O3()) {
                i4 = bkb.Lb;
            } else {
                i4 = bkb.td;
            }
            int v0 = bkb.v0(i4, gb2Var.cc);
            if (this.d != v0) {
                Drawable drawable3 = this.e;
                this.d = v0;
                drawable3.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
            drawable2 = this.e;
        } else if (k27Var.O3()) {
            drawable = bkb.N4;
            if (gb2Var.Q5.I4()) {
                gb2Var.A2();
                drawable2 = gb2Var.b2("drawableMsgOutCallVideo");
            } else {
                if (gb2Var.A2()) {
                    str = "drawableMsgOutCallAudioSelected";
                } else {
                    str = "drawableMsgOutCallAudio";
                }
                drawable2 = gb2Var.b2(str);
            }
        } else {
            TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = gb2Var.Q5.k.action.reason;
            if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy)) {
                drawable = bkb.P4;
            } else {
                drawable = bkb.O4;
            }
            if (gb2Var.A2()) {
                drawable2 = bkb.G4[I4 ? 1 : 0];
            } else {
                drawable2 = bkb.F4[I4 ? 1 : 0];
            }
        }
        Drawable drawable4 = drawable;
        Drawable drawable5 = drawable2;
        if (gb2Var.Q5.O3()) {
            bkb.N2.setColor(bkb.v0(bkb.Vc, gb2Var.cc));
            TextPaint textPaint = bkb.R2;
            if (gb2Var.A2()) {
                i3 = bkb.dc;
            } else {
                i3 = bkb.ic;
            }
            textPaint.setColor(bkb.v0(i3, gb2Var.cc));
        } else {
            bkb.N2.setColor(bkb.v0(bkb.Uc, gb2Var.cc));
            TextPaint textPaint2 = bkb.R2;
            if (gb2Var.A2()) {
                i = bkb.ee;
            } else {
                i = bkb.de;
            }
            textPaint2.setColor(bkb.v0(i, gb2Var.cc));
        }
        gb2Var.S9 = true;
        if (gb2Var.Q5.O3()) {
            L = gl.L(16.0f) + (gb2Var.d7 - gb2Var.b7);
        } else if (gb2Var.b3()) {
            L = gl.L(74.0f);
        } else {
            L = gl.L(25.0f);
        }
        gb2Var.S3 = L;
        if (k96.a0) {
            L = de9.w(12.0f, drawable5.getIntrinsicWidth(), L);
        }
        int i6 = L;
        if (gb2Var.o2 != null) {
            canvas.save();
            canvas.translate(i6, gl.L(12.0f) + gb2Var.gb);
            gb2Var.o2.draw(canvas);
            canvas.restore();
        }
        float f2 = -19.0f;
        if (gb2Var.e3 != null) {
            canvas.save();
            if (k96.a0) {
                f = -19.0f;
            } else {
                f = 19.0f;
            }
            canvas.translate(gl.L(f) + i6, gl.L(37.0f) + gb2Var.gb);
            gb2Var.e3.draw(canvas);
            canvas.restore();
        }
        if (this.c != null && this.b != null) {
            canvas.save();
            if (!k96.a0) {
                f2 = 19.0f;
            }
            canvas.translate(gl.L(6.0f) + gl.L(f2) + i6 + gb2Var.f3, gl.L(36.0f) + gb2Var.gb);
            this.b.g(canvas);
            canvas.translate(this.b.A + gl.L(5.0f), gl.L(8.0f));
            this.c.c(0.0f, 0.0f, 1.0f, bkb.R2.getColor(), canvas);
            canvas.restore();
        }
        int i7 = 0;
        if (k96.a0 && (staticLayout = gb2Var.e3) != null) {
            i2 = staticLayout.getWidth() - drawable4.getIntrinsicWidth();
        } else {
            i2 = 0;
        }
        hf0.t((i6 + i2) - gl.L(1.0f), gl.L(37.0f) + gb2Var.gb, drawable4);
        drawable4.draw(canvas);
        Drawable drawable6 = gb2Var.J2[0];
        if (drawable6 != null && gb2Var.L2[0] == 4) {
            drawable6.draw(canvas);
        }
        boolean z = gb2Var.G;
        boolean z2 = gb2Var.F;
        if (!z) {
            if (!z2) {
                gb2Var.T3 = gl.L(18.5f);
            } else {
                gb2Var.T3 = gl.L(17.0f);
            }
        } else if (z2) {
            gb2Var.T3 = gl.L(18.0f);
        } else {
            gb2Var.T3 = gl.L(19.0f);
        }
        int i8 = gb2Var.S3;
        if (!k96.a0) {
            i7 = gb2Var.b7 - gl.L(70.0f);
        }
        hf0.t(gl.L(!I4 ? 1 : 0) + i8 + i7, gb2Var.T3, drawable5);
        drawable5.draw(canvas);
    }

    public final void b(defpackage.k27 r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lb2.b(k27, boolean):void");
    }
}
