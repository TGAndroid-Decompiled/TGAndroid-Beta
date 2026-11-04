package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class su extends ru {
    public k4.j f25425d0;
    public org.telegram.ui.Components.gc f25426e0;
    public boolean f25427f0;
    public boolean f25428g0;
    public boolean f25429h0;
    public boolean f25430i0;
    public float f25431j0;
    public int f25432k0;
    public final Drawable f25433l0;
    public int m0;

    public su(cv cvVar, Rect rect, int i3, TL_iv.pageBlockBlockquote pageblockblockquote, SpannableStringBuilder spannableStringBuilder) {
        super(cvVar, rect, i3, spannableStringBuilder);
        this.f25433l0 = k2.p1.g(t0.f25457b, 2131230871);
        boolean z10 = pageblockblockquote.collapsed;
        this.f25429h0 = z10;
        this.f25430i0 = z10;
    }

    @Override
    public final int I() {
        if (this.f25429h0) {
            Rect rect = this.f26435b;
            return (int) Math.min((this.X.f21888b.getPaint().getTextSize() * 1.4f * 3.0f) + rect.top + this.f25232a0 + rect.bottom, super.I());
        }
        return super.I();
    }

    @Override
    public final void W(Canvas canvas) {
        float f10;
        boolean z10;
        org.telegram.ui.Components.gc gcVar = this.f25426e0;
        if (gcVar != null) {
            f10 = gcVar.a(0.01f);
        } else {
            f10 = 1.0f;
        }
        int i3 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        int i10 = this.f26436c;
        if (i3 != 0) {
            canvas.save();
            canvas.scale(f10, f10, i10 / 2.0f, I() / 2.0f);
        }
        if (this.f25431j0 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = (this.f25432k0 - this.f26435b.bottom) - this.f25233b0;
        canvas.save();
        canvas.clipRect(0, 0, i10, i11);
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, i10, i11, null);
        }
        super.W(canvas);
        if (z10) {
            if (this.f25425d0 == null) {
                this.f25425d0 = new k4.j(24);
            }
            RectF rectF = g0.P;
            rectF.set(0.0f, i11 - g0.L(24.0f), i10, i11 + 1);
            this.f25425d0.w(canvas, rectF, 3, this.f25431j0);
            canvas.restore();
        }
        canvas.restore();
        cv cvVar = this.f26434a;
        int i12 = cvVar.f22086y.i();
        int i13 = this.m0;
        Drawable drawable = this.f25433l0;
        if (i12 != i13) {
            int i14 = cvVar.f22086y.i();
            this.m0 = i14;
            drawable.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN));
        }
        cg.r.e(this.f25433l0, cvVar.C - g0.L(24.0f), g0.L(8.0f) + ((i11 - g0.L(16.0f)) - g0.L(2.0f)), g0.L(16.0f), g0.L(16.0f), 17);
        canvas.save();
        canvas.rotate(g0.W1(this.f25431j0, 180, 0), drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
        if (i3 != 0) {
            canvas.restore();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f25428g0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f25428g0 = false;
            }
            return super.Y(motionEvent);
        }
        cv cvVar = this.f26434a;
        if (actionMasked == 0) {
            boolean Y = super.Y(motionEvent);
            this.f25428g0 = Y;
            if (!Y) {
                this.f25427f0 = true;
                if (this.f25426e0 == null && (view = cvVar.Q) != null) {
                    this.f25426e0 = new org.telegram.ui.Components.gc(view);
                }
                org.telegram.ui.Components.gc gcVar = this.f25426e0;
                if (gcVar != null) {
                    gcVar.c(true);
                    return true;
                }
            }
        } else if (actionMasked == 1) {
            if (!this.f25427f0) {
                return false;
            }
            this.f25427f0 = false;
            org.telegram.ui.Components.gc gcVar2 = this.f25426e0;
            if (gcVar2 != null) {
                gcVar2.c(false);
            }
            View view2 = cvVar.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            cvVar.X();
            this.f25429h0 = !this.f25429h0;
            cvVar.f22083u = true;
            cvVar.Q();
            View view3 = cvVar.Q;
            if (view3 != null) {
                view3.invalidate();
            }
            org.telegram.ui.Cells.q1 q1Var = cvVar.E;
            org.telegram.ui.Cells.l1 l1Var = cvVar.F;
            if (q1Var != null && l1Var != null) {
                l1Var.r1(q1Var, true, true);
            }
        } else {
            if (actionMasked == 3) {
                this.f25427f0 = false;
                org.telegram.ui.Components.gc gcVar3 = this.f25426e0;
                if (gcVar3 != null) {
                    gcVar3.c(false);
                }
            }
            return this.f25427f0;
        }
        return true;
    }

    @Override
    public final void d0() {
        super.d0();
        this.f25430i0 = this.f25429h0;
    }

    @Override
    public final float z() {
        org.telegram.ui.Components.gc gcVar = this.f25426e0;
        if (gcVar != null) {
            return gcVar.a(0.01f);
        }
        return 1.0f;
    }
}
