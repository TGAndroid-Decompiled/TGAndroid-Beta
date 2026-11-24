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
public final class cg5 extends FrameLayout implements vlb {
    public final ln E;
    public boolean F;
    public final ln G;
    public long H;
    public int I;
    public nj8 J;
    public Drawable K;
    public final bf0 a;
    public final wb b;
    public final pc0 c;
    public int d;
    public TLRPC.User e;
    public long f;
    public final int h;
    public float n;
    public boolean r;
    public final uy2 s;
    public final jh2 w;
    public final boolean x;
    public boolean y;

    public cg5(ylb ylbVar, Context context, boolean z) {
        super(context);
        this.c = new pc0((ylb) null);
        this.h = z8c.t0;
        d53 d53Var = d53.h;
        this.E = new ln(this, 0L, 350L, d53Var);
        this.G = new ln(this, 0L, 350L, d53Var);
        this.I = cmb.c6;
        this.x = z;
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        bf0Var.setRoundRadius(gm.L(27.0f));
        addView(bf0Var, qoe.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        wb wbVar = new wb(context, (byte) 21);
        this.b = wbVar;
        nm7.i(wbVar);
        anb.X(wbVar, cmb.F6, ylbVar);
        wbVar.setTextSize(1, 12.0f);
        wbVar.setMaxLines(1);
        wbVar.setGravity(49);
        wbVar.setLines(1);
        wbVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(wbVar, qoe.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        uy2 uy2Var = new uy2(context, ylbVar);
        this.s = uy2Var;
        addView(uy2Var, qoe.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i = cmb.V8;
        int i2 = cmb.T8;
        ty2 ty2Var = uy2Var.a;
        ty2Var.v = i;
        ty2Var.w = i2;
        uy2Var.setGravity(5);
        if (z) {
            jh2 jh2Var = new jh2(21, ylbVar, context);
            this.w = jh2Var;
            jh2Var.b(cmb.A5, cmb.g5, cmb.B5);
            jh2Var.setDrawUnchecked(false);
            jh2Var.setDrawBackgroundAsArc(4);
            jh2Var.setProgressDelegate(new wx4(this, (byte) 11));
            addView(jh2Var, qoe.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            jh2Var.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j, boolean z, CharSequence charSequence) {
        if (this.f != j) {
            this.r = false;
            invalidate();
        }
        this.f = j;
        boolean D = pg3.D(j);
        bf0 bf0Var = this.a;
        int i = this.h;
        pc0 pc0Var = this.c;
        wb wbVar = this.b;
        if (D) {
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
            this.e = W1;
            if (charSequence != null) {
                wbVar.setText(charSequence);
            } else if (W1 != null) {
                wbVar.setText(m9c.k(W1, true));
            } else {
                wbVar.setText("");
            }
            pc0Var.q(this.e);
            bf0Var.f(this.e, pc0Var);
        } else {
            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
            if (charSequence != null) {
                wbVar.setText(charSequence);
            } else if (L0 != null) {
                wbVar.setText(L0.title);
            } else {
                wbVar.setText("");
            }
            pc0Var.p(L0);
            this.e = null;
            bf0Var.f(L0, pc0Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i) {
        int i2;
        int i3 = oc7.s5;
        int i4 = i & 4;
        int i5 = this.h;
        if (i4 != 0 && this.e != null) {
            this.e = oc7.r1(i5).W1(Long.valueOf(this.e.id));
            this.a.invalidate();
            invalidate();
        }
        if (i == 0 || (i & 256) != 0 || (i & 2048) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) oc7.r1(i5).R.f(this.f);
            uy2 uy2Var = this.s;
            if (dialog != null && (i2 = dialog.unread_count) != 0) {
                if (this.d != i2) {
                    this.d = i2;
                    uy2Var.a.c(i2, this.r);
                    return;
                }
                return;
            }
            this.d = 0;
            uy2Var.a.c(0, this.r);
        }
    }

    public final void c(boolean z) {
        TL_account.RequirementToContact requirementToContact;
        boolean z2;
        if (this.y && this.e != null) {
            requirementToContact = oc7.r1(this.h).L2(this.e.id);
        } else {
            requirementToContact = null;
        }
        boolean z3 = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.F == z3 && this.H == pg3.j(requirementToContact)) {
            return;
        }
        this.F = z3;
        this.H = pg3.j(requirementToContact);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg5.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getDialogId() {
        return this.f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.x) {
            bf0 bf0Var = this.a;
            int measuredWidth = (bf0Var.getMeasuredWidth() / 2) + bf0Var.getLeft();
            int measuredHeight = (bf0Var.getMeasuredHeight() / 2) + bf0Var.getTop();
            cmb.n0.setColor(cmb.w0(null, cmb.A5, false));
            cmb.n0.setAlpha((int) (this.w.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, gm.L(28.0f), cmb.n0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(86.0f), 1073741824));
        this.s.a.D = gm.L(13.0f);
    }

    @Override
    public final void updateColors() {
        try {
            uy2 uy2Var = this.s;
            if (uy2Var != null) {
                uy2Var.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
