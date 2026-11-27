package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Wallet.c;
public final class qc9 extends FrameLayout implements fn7, hla {
    public final int a;
    public final LinearLayout b;
    public final in c;
    public final in d;
    public final wm2[] e;
    public final wm2[] f;
    public SpannableString h;
    public pcc n;
    public long r;
    public long s;
    public long w;
    public boolean x;

    public qc9(int i, vnb vnbVar, Context context) {
        super(context);
        this.e = new wm2[1];
        this.f = new wm2[1];
        this.r = -1L;
        this.a = i;
        int L = hl.L(6.0f);
        setPadding(L, L, L, L);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(21);
        linearLayout.setPadding(hl.L(13.0f), 0, hl.L(14.0f), 0);
        addView(linearLayout, tre.c(-1.0f, -2));
        in a = a(context, vnbVar);
        this.c = a;
        linearLayout.addView(a, tre.r(-2, 18, 5));
        in a2 = a(context, vnbVar);
        this.d = a2;
        linearLayout.addView(a2, tre.r(-2, 18, 5));
        c(false);
    }

    public static in a(Context context, vnb vnbVar) {
        in inVar = new in(context, false, true, false);
        inVar.n = true;
        inVar.setTypeface(hl.o());
        inVar.setTextSize(hl.L(14.0f));
        inVar.setGravity(5);
        yob.U(inVar, aob.G6, vnbVar);
        return inVar;
    }

    public final void b(fu5 fu5Var, pcc pccVar, Runnable runnable) {
        long j = this.s + this.w;
        jn0 jn0Var = new jn0(pccVar, (byte) 12);
        z09 z09Var = new z09(this, pccVar, (byte) 14);
        if (this.r > 0 && j > 0) {
            String M0 = ob6.M0(2131750248, null);
            String E = ob6.E(this.r, ' ');
            int i = aob.F8;
            int i2 = aob.E8;
            fu5Var.a(2131232734, null, M0, E, i, i2, jn0Var);
            fu5Var.a(2131231833, null, ob6.M0(2131750249, null), oj.j(j, pj.b).o(2).d(), i, i2, z09Var);
            runnable.run();
        } else if (j > 0) {
            z09Var.run();
        } else {
            jn0Var.run();
        }
    }

    public final void c(boolean z) {
        jxa jxaVar;
        oj ojVar;
        boolean z2;
        boolean z3;
        int i = this.a;
        jxa v = jxa.v(i, false);
        jxa v2 = jxa.v(i, true);
        long j = v.m().amount;
        oj p = v2.p();
        long j2 = 0;
        if (z15.c(i)) {
            jxaVar = v2;
            ojVar = oj.j(Math.max(0L, c.C(i).z()) + p.b, pj.b);
        } else {
            jxaVar = v2;
            ojVar = p;
        }
        boolean z4 = v.e;
        in inVar = this.d;
        in inVar2 = this.c;
        if (z4 && jxaVar.e) {
            this.s = Math.max(0L, p.b);
            if (z15.c(i)) {
                j2 = Math.max(0L, c.C(i).z());
            }
            this.w = j2;
            inVar2.c(nza.b1(false, "⭐️".concat(ob6.E(j, ' ')), 0.7f, this.e), z, true);
            if (ojVar.l()) {
                inVar.setVisibility(8);
            } else {
                inVar.setVisibility(0);
                String concat = "⭐️".concat(ojVar.o(2).d());
                wm2[] wm2VarArr = this.f;
                inVar.c(nza.b1(true, concat, 0.7f, wm2VarArr), z, true);
                wm2 wm2Var = wm2VarArr[0];
                if (wm2Var != null) {
                    wm2Var.a(aob.Zl);
                }
            }
            this.r = j;
            return;
        }
        if (this.h == null) {
            SpannableString spannableString = new SpannableString("x");
            this.h = spannableString;
            z2 = false;
            z3 = true;
            spannableString.setSpan(new ya6(hl.L(48.0f), inVar2), 0, 1, 33);
        } else {
            z2 = false;
            z3 = true;
        }
        inVar2.c(this.h, z2, z3);
        inVar.setVisibility(8);
        this.r = -1L;
        this.w = 0L;
        this.s = 0L;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != jn7.A3 && i != jn7.d4) {
            return;
        }
        c(true);
    }

    public View getContent() {
        return this.b;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c(false);
        int i = this.a;
        jn7.f(i).a(this, jn7.A3);
        jn7.f(i).a(this, jn7.d4);
        if (z15.c(i) && c.C(i).x() == null) {
            c.C(i).J();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        jn7.f(i).n(this, jn7.A3);
        jn7.f(i).n(this, jn7.d4);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        pcc pccVar = this.n;
        if (pccVar != null && i != i3) {
            pccVar.a(Integer.valueOf(i));
        }
    }

    public void setOnWidthChanged(pcc pccVar) {
        this.n = pccVar;
    }

    public void setSearchCloseMorph(float f) {
        boolean z;
        this.b.setAlpha(1.0f - Utilities.l(2.0f * f));
        int i = 0;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (this.x != z && getBackground() != null) {
            this.x = z;
            Drawable background = getBackground();
            if (!z) {
                i = 255;
            }
            background.setAlpha(i);
            invalidate();
        }
    }
}
