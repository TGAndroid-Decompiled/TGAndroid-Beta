package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ee5 extends FrameLayout implements tjb {
    public final lm E;
    public boolean F;
    public final lm G;
    public long H;
    public int I;
    public mh8 J;
    public Drawable K;
    public final be0 a;
    public final wb b;
    public final pb0 c;
    public int d;
    public TLRPC.User e;
    public long f;
    public final int h;
    public float n;
    public boolean r;
    public final kx2 s;
    public final wf2 w;
    public final boolean x;
    public boolean y;

    public ee5(wjb wjbVar, Context context, boolean z) {
        super(context);
        this.c = new pb0((wjb) null);
        this.h = y6c.t0;
        s33 s33Var = s33.h;
        this.E = new lm(this, 0L, 350L, s33Var);
        this.G = new lm(this, 0L, 350L, s33Var);
        this.I = bkb.c6;
        this.x = z;
        be0 be0Var = new be0(context);
        this.a = be0Var;
        be0Var.setRoundRadius(gl.L(27.0f));
        addView(be0Var, nme.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        wb wbVar = new wb(context, (byte) 21);
        this.b = wbVar;
        kk7.i(wbVar);
        zkb.X(wbVar, bkb.F6, wjbVar);
        wbVar.setTextSize(1, 12.0f);
        wbVar.setMaxLines(1);
        wbVar.setGravity(49);
        wbVar.setLines(1);
        wbVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(wbVar, nme.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        kx2 kx2Var = new kx2(context, wjbVar);
        this.s = kx2Var;
        addView(kx2Var, nme.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i = bkb.V8;
        int i2 = bkb.T8;
        jx2 jx2Var = kx2Var.a;
        jx2Var.v = i;
        jx2Var.w = i2;
        kx2Var.setGravity(5);
        if (z) {
            wf2 wf2Var = new wf2(21, wjbVar, context);
            this.w = wf2Var;
            wf2Var.b(bkb.A5, bkb.g5, bkb.B5);
            wf2Var.setDrawUnchecked(false);
            wf2Var.setDrawBackgroundAsArc(4);
            wf2Var.setProgressDelegate(new ry4(this, (byte) 8));
            addView(wf2Var, nme.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            wf2Var.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j, boolean z, CharSequence charSequence) {
        if (this.f != j) {
            this.r = false;
            invalidate();
        }
        this.f = j;
        boolean D = cf3.D(j);
        be0 be0Var = this.a;
        int i = this.h;
        pb0 pb0Var = this.c;
        wb wbVar = this.b;
        if (D) {
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j));
            this.e = V1;
            if (charSequence != null) {
                wbVar.setText(charSequence);
            } else if (V1 != null) {
                wbVar.setText(l7c.k(V1, true));
            } else {
                wbVar.setText("");
            }
            pb0Var.q(this.e);
            be0Var.f(this.e, pb0Var);
        } else {
            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
            if (charSequence != null) {
                wbVar.setText(charSequence);
            } else if (K0 != null) {
                wbVar.setText(K0.title);
            } else {
                wbVar.setText("");
            }
            pb0Var.p(K0);
            this.e = null;
            be0Var.f(K0, pb0Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i) {
        int i2;
        int i3 = na7.q5;
        int i4 = i & 4;
        int i5 = this.h;
        if (i4 != 0 && this.e != null) {
            this.e = na7.q1(i5).V1(Long.valueOf(this.e.id));
            this.a.invalidate();
            invalidate();
        }
        if (i == 0 || (i & 256) != 0 || (i & 2048) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) na7.q1(i5).R.f(this.f);
            kx2 kx2Var = this.s;
            if (dialog != null && (i2 = dialog.unread_count) != 0) {
                if (this.d != i2) {
                    this.d = i2;
                    kx2Var.a.c(i2, this.r);
                    return;
                }
                return;
            }
            this.d = 0;
            kx2Var.a.c(0, this.r);
        }
    }

    public final void c(boolean z) {
        TL_account.RequirementToContact requirementToContact;
        boolean z2;
        if (this.y && this.e != null) {
            requirementToContact = na7.q1(this.h).I2(this.e.id);
        } else {
            requirementToContact = null;
        }
        boolean z3 = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.F == z3 && this.H == cf3.j(requirementToContact)) {
            return;
        }
        this.F = z3;
        this.H = cf3.j(requirementToContact);
        if (!z) {
            this.E.f(this.F, true);
            if (this.H > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.G.f(z2, true);
        }
        invalidate();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r20, android.view.View r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee5.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getDialogId() {
        return this.f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.x) {
            be0 be0Var = this.a;
            int measuredWidth = (be0Var.getMeasuredWidth() / 2) + be0Var.getLeft();
            int measuredHeight = (be0Var.getMeasuredHeight() / 2) + be0Var.getTop();
            bkb.n0.setColor(bkb.w0(null, bkb.A5, false));
            bkb.n0.setAlpha((int) (this.w.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, gl.L(28.0f), bkb.n0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(86.0f), 1073741824));
        this.s.a.D = gl.L(13.0f);
    }

    @Override
    public final void updateColors() {
        try {
            kx2 kx2Var = this.s;
            if (kx2Var != null) {
                kx2Var.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
