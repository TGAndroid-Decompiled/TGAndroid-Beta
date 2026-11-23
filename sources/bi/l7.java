package bi;

import android.content.Context;
import android.text.SpannableString;
import android.widget.LinearLayout;
import c8.ma;
import di.pb;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.r80;
public final class l7 extends LinearLayout implements gs {
    public final int f3853a;
    public final org.telegram.ui.Components.o6 f3854b;
    public final org.telegram.ui.Components.o6 f3855c;
    public final nq[] d;
    public final nq[] f3856e;
    public SpannableString f3857f;
    public y10 h;
    public long f3858n;

    public l7(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.d = new nq[1];
        this.f3856e = new nq[1];
        this.f3858n = -1L;
        this.f3853a = i7;
        setOrientation(1);
        setGravity(21);
        int L = org.telegram.messenger.g0.L(6.0f);
        setPadding(org.telegram.messenger.g0.L(13.0f) + L, L, org.telegram.messenger.g0.L(14.0f) + L, L);
        org.telegram.ui.Components.o6 a10 = a(context, h6Var);
        this.f3854b = a10;
        addView(a10, ma.r(-2, 18, 5));
        org.telegram.ui.Components.o6 a11 = a(context, h6Var);
        this.f3855c = a11;
        addView(a11, ma.r(-2, 18, 5));
        b(false);
    }

    public static org.telegram.ui.Components.o6 a(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, false);
        o6Var.f38118n = true;
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        o6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        o6Var.setGravity(5);
        org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        return o6Var;
    }

    public final void b(boolean z10) {
        int i7 = this.f3853a;
        di.y8 y10 = di.y8.y(i7, false);
        di.y8 y11 = di.y8.y(i7, true);
        long j3 = y10.p().amount;
        cg.a s5 = y11.s();
        if (ii.n.c(i7)) {
            s5 = cg.a.j(Math.max(0L, org.telegram.ui.Wallet.u0.D(i7).A()) + s5.f5304b, cg.b.f5306b);
        }
        boolean z11 = y10.f10088e;
        org.telegram.ui.Components.o6 o6Var = this.f3854b;
        org.telegram.ui.Components.o6 o6Var2 = this.f3855c;
        if (z11 && y11.f10088e) {
            o6Var.c(pb.b1(false, i5.c.l(j3, ' ', new StringBuilder("⭐️")), 0.7f, this.d), z10, true);
            if (s5.l()) {
                o6Var2.setVisibility(8);
            } else {
                o6Var2.setVisibility(0);
                nq[] nqVarArr = this.f3856e;
                o6Var2.c(pb.b1(true, "⭐️" + s5.o(2).d(), 0.7f, nqVarArr), z10, true);
                nq nqVar = nqVarArr[0];
                if (nqVar != null) {
                    nqVar.a(org.telegram.ui.ActionBar.m6.Zl);
                }
            }
            this.f3858n = j3;
            return;
        }
        if (this.f3857f == null) {
            SpannableString spannableString = new SpannableString("x");
            this.f3857f = spannableString;
            spannableString.setSpan(new r80(org.telegram.messenger.g0.L(48.0f), o6Var), 0, 1, 33);
        }
        o6Var.c(this.f3857f, false, true);
        o6Var2.setVisibility(8);
        this.f3858n = -1L;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != ls.A3 && i7 != ls.f25296d4) {
            return;
        }
        b(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b(false);
        int i7 = this.f3853a;
        ls.f(i7).b(this, ls.A3);
        ls.f(i7).b(this, ls.f25296d4);
        if (ii.n.c(i7) && org.telegram.ui.Wallet.u0.D(i7).y() == null) {
            org.telegram.ui.Wallet.u0.D(i7).K();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f3853a;
        ls.f(i7).n(this, ls.A3);
        ls.f(i7).n(this, ls.f25296d4);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        y10 y10Var = this.h;
        if (y10Var != null && i7 != i11) {
            y10Var.a(Integer.valueOf(i7));
        }
    }

    public void setOnWidthChanged(y10 y10Var) {
        this.h = y10Var;
    }
}
