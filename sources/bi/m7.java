package bi;

import android.content.Context;
import android.text.SpannableString;
import android.widget.LinearLayout;
import c8.ma;
import di.pb;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.r80;
public final class m7 extends LinearLayout implements fs {
    public final int f3885a;
    public final org.telegram.ui.Components.o6 f3886b;
    public final org.telegram.ui.Components.o6 f3887c;
    public final nq[] d;
    public final nq[] f3888e;
    public SpannableString f3889f;
    public x10 h;
    public long f3890n;

    public m7(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.d = new nq[1];
        this.f3888e = new nq[1];
        this.f3890n = -1L;
        this.f3885a = i7;
        setOrientation(1);
        setGravity(21);
        int L = org.telegram.messenger.g0.L(6.0f);
        setPadding(org.telegram.messenger.g0.L(13.0f) + L, L, org.telegram.messenger.g0.L(14.0f) + L, L);
        org.telegram.ui.Components.o6 a10 = a(context, h6Var);
        this.f3886b = a10;
        addView(a10, ma.r(-2, 18, 5));
        org.telegram.ui.Components.o6 a11 = a(context, h6Var);
        this.f3887c = a11;
        addView(a11, ma.r(-2, 18, 5));
        b(false);
    }

    public static org.telegram.ui.Components.o6 a(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, false);
        o6Var.f38125n = true;
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        o6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        o6Var.setGravity(5);
        org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        return o6Var;
    }

    public final void b(boolean z10) {
        int i7 = this.f3885a;
        di.y8 y10 = di.y8.y(i7, false);
        di.y8 y11 = di.y8.y(i7, true);
        long j3 = y10.p().amount;
        cg.a s5 = y11.s();
        if (ii.n.c(i7)) {
            s5 = cg.a.j(Math.max(0L, org.telegram.ui.Wallet.u0.D(i7).A()) + s5.f5301b, cg.b.f5303b);
        }
        boolean z11 = y10.f10085e;
        org.telegram.ui.Components.o6 o6Var = this.f3886b;
        org.telegram.ui.Components.o6 o6Var2 = this.f3887c;
        if (z11 && y11.f10085e) {
            o6Var.c(pb.b1(false, i5.c.l(j3, ' ', new StringBuilder("⭐️")), 0.7f, this.d), z10, true);
            if (s5.l()) {
                o6Var2.setVisibility(8);
            } else {
                o6Var2.setVisibility(0);
                nq[] nqVarArr = this.f3888e;
                o6Var2.c(pb.b1(true, "⭐️" + s5.o(2).d(), 0.7f, nqVarArr), z10, true);
                nq nqVar = nqVarArr[0];
                if (nqVar != null) {
                    nqVar.a(org.telegram.ui.ActionBar.m6.Zl);
                }
            }
            this.f3890n = j3;
            return;
        }
        if (this.f3889f == null) {
            SpannableString spannableString = new SpannableString("x");
            this.f3889f = spannableString;
            spannableString.setSpan(new r80(org.telegram.messenger.g0.L(48.0f), o6Var), 0, 1, 33);
        }
        o6Var.c(this.f3889f, false, true);
        o6Var2.setVisibility(8);
        this.f3890n = -1L;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != ks.A3 && i7 != ks.f25130d4) {
            return;
        }
        b(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b(false);
        int i7 = this.f3885a;
        ks.f(i7).b(this, ks.A3);
        ks.f(i7).b(this, ks.f25130d4);
        if (ii.n.c(i7) && org.telegram.ui.Wallet.u0.D(i7).y() == null) {
            org.telegram.ui.Wallet.u0.D(i7).K();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f3885a;
        ks.f(i7).n(this, ks.A3);
        ks.f(i7).n(this, ks.f25130d4);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        x10 x10Var = this.h;
        if (x10Var != null && i7 != i11) {
            x10Var.a(Integer.valueOf(i7));
        }
    }

    public void setOnWidthChanged(x10 x10Var) {
        this.h = x10Var;
    }
}
