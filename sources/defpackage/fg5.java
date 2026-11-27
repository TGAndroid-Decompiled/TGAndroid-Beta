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
public final class fg5 extends FrameLayout implements snb {
    public final mm E;
    public boolean F;
    public final mm G;
    public long H;
    public int I;
    public al8 J;
    public Drawable K;
    public final de0 a;
    public final xb b;
    public final rb0 c;
    public int d;
    public TLRPC.User e;
    public long f;
    public final int h;
    public float n;
    public boolean r;
    public final ey2 s;
    public final og2 w;
    public final boolean x;
    public boolean y;

    public fg5(vnb vnbVar, Context context, boolean z) {
        super(context);
        this.c = new rb0((vnb) null);
        this.h = yac.t0;
        k43 k43Var = k43.h;
        this.E = new mm(this, 0L, 350L, k43Var);
        this.G = new mm(this, 0L, 350L, k43Var);
        this.I = aob.d6;
        this.x = z;
        de0 de0Var = new de0(context);
        this.a = de0Var;
        de0Var.setRoundRadius(hl.L(27.0f));
        addView(de0Var, tre.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        xb xbVar = new xb(context, (byte) 21);
        this.b = xbVar;
        jn7.i(xbVar);
        yob.X(xbVar, aob.G6, vnbVar);
        xbVar.setTextSize(1, 12.0f);
        xbVar.setMaxLines(1);
        xbVar.setGravity(49);
        xbVar.setLines(1);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(xbVar, tre.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        ey2 ey2Var = new ey2(context, vnbVar);
        this.s = ey2Var;
        addView(ey2Var, tre.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i = aob.W8;
        int i2 = aob.U8;
        dy2 dy2Var = ey2Var.a;
        dy2Var.v = i;
        dy2Var.w = i2;
        ey2Var.setGravity(5);
        if (z) {
            og2 og2Var = new og2(21, vnbVar, context);
            this.w = og2Var;
            og2Var.b(aob.B5, aob.h5, aob.C5);
            og2Var.setDrawUnchecked(false);
            og2Var.setDrawBackgroundAsArc(4);
            og2Var.setProgressDelegate(new e05(this, (byte) 10));
            addView(og2Var, tre.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            og2Var.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j, boolean z, CharSequence charSequence) {
        if (this.f != j) {
            this.r = false;
            invalidate();
        }
        this.f = j;
        boolean D = wf3.D(j);
        de0 de0Var = this.a;
        int i = this.h;
        rb0 rb0Var = this.c;
        xb xbVar = this.b;
        if (D) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
            this.e = X1;
            if (charSequence != null) {
                xbVar.setText(charSequence);
            } else if (X1 != null) {
                xbVar.setText(lbc.k(X1, true));
            } else {
                xbVar.setText("");
            }
            rb0Var.q(this.e);
            de0Var.f(this.e, rb0Var);
        } else {
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
            if (charSequence != null) {
                xbVar.setText(charSequence);
            } else if (M0 != null) {
                xbVar.setText(M0.title);
            } else {
                xbVar.setText("");
            }
            rb0Var.p(M0);
            this.e = null;
            de0Var.f(M0, rb0Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i) {
        int i2;
        int i3 = uc7.s5;
        int i4 = i & 4;
        int i5 = this.h;
        if (i4 != 0 && this.e != null) {
            this.e = uc7.s1(i5).X1(Long.valueOf(this.e.id));
            this.a.invalidate();
            invalidate();
        }
        if (i == 0 || (i & 256) != 0 || (i & 2048) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) uc7.s1(i5).R.f(this.f);
            ey2 ey2Var = this.s;
            if (dialog != null && (i2 = dialog.unread_count) != 0) {
                if (this.d != i2) {
                    this.d = i2;
                    ey2Var.a.c(i2, this.r);
                    return;
                }
                return;
            }
            this.d = 0;
            ey2Var.a.c(0, this.r);
        }
    }

    public final void c(boolean z) {
        TL_account.RequirementToContact requirementToContact;
        boolean z2;
        if (this.y && this.e != null) {
            requirementToContact = uc7.s1(this.h).P2(this.e.id);
        } else {
            requirementToContact = null;
        }
        boolean z3 = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.F == z3 && this.H == wf3.j(requirementToContact)) {
            return;
        }
        this.F = z3;
        this.H = wf3.j(requirementToContact);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fg5.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getDialogId() {
        return this.f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.x) {
            de0 de0Var = this.a;
            int measuredWidth = (de0Var.getMeasuredWidth() / 2) + de0Var.getLeft();
            int measuredHeight = (de0Var.getMeasuredHeight() / 2) + de0Var.getTop();
            aob.n0.setColor(aob.w0(null, aob.B5, false));
            aob.n0.setAlpha((int) (this.w.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, hl.L(28.0f), aob.n0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(86.0f), 1073741824));
        this.s.a.D = hl.L(13.0f);
    }

    @Override
    public final void updateColors() {
        try {
            ey2 ey2Var = this.s;
            if (ey2Var != null) {
                ey2Var.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
