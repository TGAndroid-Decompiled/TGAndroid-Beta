package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.tgnet.TLRPC;
public final class wc2 {
    public final rc2 a;
    public gd0 b;
    public uib c;
    public int d;
    public Drawable e;

    public wc2(rc2 rc2Var) {
        this.a = rc2Var;
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
        rc2 rc2Var = this.a;
        boolean I4 = rc2Var.Q5.I4();
        k47 k47Var = rc2Var.Q5;
        if (k47Var.k.action instanceof TLRPC.TL_messageActionConferenceCall) {
            if (k47Var.O3()) {
                drawable = cmb.N4;
            } else {
                drawable = cmb.O4;
            }
            if (this.e == null) {
                Resources resources = rc2Var.getContext().getResources();
                if (rc2Var.Q5.I4()) {
                    i5 = 2131231187;
                } else {
                    i5 = 2131231094;
                }
                this.e = resources.getDrawable(i5).mutate();
            }
            if (rc2Var.Q5.O3()) {
                i4 = cmb.Lb;
            } else {
                i4 = cmb.td;
            }
            int v0 = cmb.v0(i4, rc2Var.cc);
            if (this.d != v0) {
                Drawable drawable3 = this.e;
                this.d = v0;
                drawable3.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
            drawable2 = this.e;
        } else if (k47Var.O3()) {
            drawable = cmb.N4;
            if (rc2Var.Q5.I4()) {
                rc2Var.A2();
                drawable2 = rc2Var.b2("drawableMsgOutCallVideo");
            } else {
                if (rc2Var.A2()) {
                    str = "drawableMsgOutCallAudioSelected";
                } else {
                    str = "drawableMsgOutCallAudio";
                }
                drawable2 = rc2Var.b2(str);
            }
        } else {
            TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = rc2Var.Q5.k.action.reason;
            if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy)) {
                drawable = cmb.P4;
            } else {
                drawable = cmb.O4;
            }
            if (rc2Var.A2()) {
                drawable2 = cmb.G4[I4 ? 1 : 0];
            } else {
                drawable2 = cmb.F4[I4 ? 1 : 0];
            }
        }
        Drawable drawable4 = drawable;
        Drawable drawable5 = drawable2;
        if (rc2Var.Q5.O3()) {
            cmb.N2.setColor(cmb.v0(cmb.Vc, rc2Var.cc));
            TextPaint textPaint = cmb.R2;
            if (rc2Var.A2()) {
                i3 = cmb.dc;
            } else {
                i3 = cmb.ic;
            }
            textPaint.setColor(cmb.v0(i3, rc2Var.cc));
        } else {
            cmb.N2.setColor(cmb.v0(cmb.Uc, rc2Var.cc));
            TextPaint textPaint2 = cmb.R2;
            if (rc2Var.A2()) {
                i = cmb.ee;
            } else {
                i = cmb.de;
            }
            textPaint2.setColor(cmb.v0(i, rc2Var.cc));
        }
        rc2Var.S9 = true;
        if (rc2Var.Q5.O3()) {
            L = gm.L(16.0f) + (rc2Var.d7 - rc2Var.b7);
        } else if (rc2Var.b3()) {
            L = gm.L(74.0f);
        } else {
            L = gm.L(25.0f);
        }
        rc2Var.S3 = L;
        if (jb6.a0) {
            L = hg9.v(12.0f, drawable5.getIntrinsicWidth(), L);
        }
        int i6 = L;
        if (rc2Var.o2 != null) {
            canvas.save();
            canvas.translate(i6, gm.L(12.0f) + rc2Var.gb);
            rc2Var.o2.draw(canvas);
            canvas.restore();
        }
        float f2 = -19.0f;
        if (rc2Var.e3 != null) {
            canvas.save();
            if (jb6.a0) {
                f = -19.0f;
            } else {
                f = 19.0f;
            }
            canvas.translate(gm.L(f) + i6, gm.L(37.0f) + rc2Var.gb);
            rc2Var.e3.draw(canvas);
            canvas.restore();
        }
        if (this.c != null && this.b != null) {
            canvas.save();
            if (!jb6.a0) {
                f2 = 19.0f;
            }
            canvas.translate(gm.L(6.0f) + gm.L(f2) + i6 + rc2Var.f3, gm.L(36.0f) + rc2Var.gb);
            this.b.g(canvas);
            canvas.translate(this.b.A + gm.L(5.0f), gm.L(8.0f));
            this.c.c(0.0f, 0.0f, 1.0f, cmb.R2.getColor(), canvas);
            canvas.restore();
        }
        int i7 = 0;
        if (jb6.a0 && (staticLayout = rc2Var.e3) != null) {
            i2 = staticLayout.getWidth() - drawable4.getIntrinsicWidth();
        } else {
            i2 = 0;
        }
        hg0.s((i6 + i2) - gm.L(1.0f), gm.L(37.0f) + rc2Var.gb, drawable4);
        drawable4.draw(canvas);
        Drawable drawable6 = rc2Var.J2[0];
        if (drawable6 != null && rc2Var.L2[0] == 4) {
            drawable6.draw(canvas);
        }
        boolean z = rc2Var.G;
        boolean z2 = rc2Var.F;
        if (!z) {
            if (!z2) {
                rc2Var.T3 = gm.L(18.5f);
            } else {
                rc2Var.T3 = gm.L(17.0f);
            }
        } else if (z2) {
            rc2Var.T3 = gm.L(18.0f);
        } else {
            rc2Var.T3 = gm.L(19.0f);
        }
        int i8 = rc2Var.S3;
        if (!jb6.a0) {
            i7 = rc2Var.b7 - gm.L(70.0f);
        }
        hg0.s(gm.L(!I4 ? 1 : 0) + i8 + i7, rc2Var.T3, drawable5);
        drawable5.draw(canvas);
    }

    public final void b(defpackage.k47 r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc2.b(k47, boolean):void");
    }
}
