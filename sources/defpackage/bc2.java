package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.tgnet.TLRPC;
public final class bc2 {
    public final wb2 a;
    public ic0 b;
    public pkb c;
    public int d;
    public Drawable e;

    public bc2(wb2 wb2Var) {
        this.a = wb2Var;
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
        wb2 wb2Var = this.a;
        boolean I4 = wb2Var.Q5.I4();
        r47 r47Var = wb2Var.Q5;
        if (r47Var.k.action instanceof TLRPC.TL_messageActionConferenceCall) {
            if (r47Var.O3()) {
                drawable = aob.O4;
            } else {
                drawable = aob.P4;
            }
            if (this.e == null) {
                Resources resources = wb2Var.getContext().getResources();
                if (wb2Var.Q5.I4()) {
                    i5 = 2131231186;
                } else {
                    i5 = 2131231093;
                }
                this.e = resources.getDrawable(i5).mutate();
            }
            if (wb2Var.Q5.O3()) {
                i4 = aob.Mb;
            } else {
                i4 = aob.ud;
            }
            int v0 = aob.v0(i4, wb2Var.cc);
            if (this.d != v0) {
                Drawable drawable3 = this.e;
                this.d = v0;
                drawable3.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
            drawable2 = this.e;
        } else if (r47Var.O3()) {
            drawable = aob.O4;
            if (wb2Var.Q5.I4()) {
                wb2Var.A2();
                drawable2 = wb2Var.b2("drawableMsgOutCallVideo");
            } else {
                if (wb2Var.A2()) {
                    str = "drawableMsgOutCallAudioSelected";
                } else {
                    str = "drawableMsgOutCallAudio";
                }
                drawable2 = wb2Var.b2(str);
            }
        } else {
            TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = wb2Var.Q5.k.action.reason;
            if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy)) {
                drawable = aob.Q4;
            } else {
                drawable = aob.P4;
            }
            if (wb2Var.A2()) {
                drawable2 = aob.H4[I4 ? 1 : 0];
            } else {
                drawable2 = aob.G4[I4 ? 1 : 0];
            }
        }
        Drawable drawable4 = drawable;
        Drawable drawable5 = drawable2;
        if (wb2Var.Q5.O3()) {
            aob.O2.setColor(aob.v0(aob.Wc, wb2Var.cc));
            TextPaint textPaint = aob.S2;
            if (wb2Var.A2()) {
                i3 = aob.ec;
            } else {
                i3 = aob.jc;
            }
            textPaint.setColor(aob.v0(i3, wb2Var.cc));
        } else {
            aob.O2.setColor(aob.v0(aob.Vc, wb2Var.cc));
            TextPaint textPaint2 = aob.S2;
            if (wb2Var.A2()) {
                i = aob.fe;
            } else {
                i = aob.ee;
            }
            textPaint2.setColor(aob.v0(i, wb2Var.cc));
        }
        wb2Var.S9 = true;
        if (wb2Var.Q5.O3()) {
            L = hl.L(16.0f) + (wb2Var.d7 - wb2Var.b7);
        } else if (wb2Var.b3()) {
            L = hl.L(74.0f);
        } else {
            L = hl.L(25.0f);
        }
        wb2Var.S3 = L;
        if (ob6.a0) {
            L = uh9.w(12.0f, drawable5.getIntrinsicWidth(), L);
        }
        int i6 = L;
        if (wb2Var.o2 != null) {
            canvas.save();
            canvas.translate(i6, hl.L(12.0f) + wb2Var.gb);
            wb2Var.o2.draw(canvas);
            canvas.restore();
        }
        float f2 = -19.0f;
        if (wb2Var.e3 != null) {
            canvas.save();
            if (ob6.a0) {
                f = -19.0f;
            } else {
                f = 19.0f;
            }
            canvas.translate(hl.L(f) + i6, hl.L(37.0f) + wb2Var.gb);
            wb2Var.e3.draw(canvas);
            canvas.restore();
        }
        if (this.c != null && this.b != null) {
            canvas.save();
            if (!ob6.a0) {
                f2 = 19.0f;
            }
            canvas.translate(hl.L(6.0f) + hl.L(f2) + i6 + wb2Var.f3, hl.L(36.0f) + wb2Var.gb);
            this.b.g(canvas);
            canvas.translate(this.b.A + hl.L(5.0f), hl.L(8.0f));
            this.c.c(0.0f, 0.0f, 1.0f, aob.S2.getColor(), canvas);
            canvas.restore();
        }
        int i7 = 0;
        if (ob6.a0 && (staticLayout = wb2Var.e3) != null) {
            i2 = staticLayout.getWidth() - drawable4.getIntrinsicWidth();
        } else {
            i2 = 0;
        }
        jf0.u((i6 + i2) - hl.L(1.0f), hl.L(37.0f) + wb2Var.gb, drawable4);
        drawable4.draw(canvas);
        Drawable drawable6 = wb2Var.J2[0];
        if (drawable6 != null && wb2Var.L2[0] == 4) {
            drawable6.draw(canvas);
        }
        boolean z = wb2Var.G;
        boolean z2 = wb2Var.F;
        if (!z) {
            if (!z2) {
                wb2Var.T3 = hl.L(18.5f);
            } else {
                wb2Var.T3 = hl.L(17.0f);
            }
        } else if (z2) {
            wb2Var.T3 = hl.L(18.0f);
        } else {
            wb2Var.T3 = hl.L(19.0f);
        }
        int i8 = wb2Var.S3;
        if (!ob6.a0) {
            i7 = wb2Var.b7 - hl.L(70.0f);
        }
        jf0.u(hl.L(!I4 ? 1 : 0) + i8 + i7, wb2Var.T3, drawable5);
        drawable5.draw(canvas);
    }

    public final void b(defpackage.r47 r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc2.b(r47, boolean):void");
    }
}
