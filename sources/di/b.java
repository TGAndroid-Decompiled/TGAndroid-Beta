package di;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nq;
public final class b extends LinearLayout implements fs {
    public final int f8529a;
    public final org.telegram.ui.ActionBar.h6 f8530b;
    public final TextView f8531c;
    public final m80 d;
    public cg.b f8532e;
    public final nq[] f8533f;
    public boolean h;

    public b(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this(context, i7, cg.b.f5302a, h6Var);
    }

    public final void a() {
        this.h = true;
        this.f8532e = cg.b.f5303b;
        setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f));
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.m6.f29451h5;
        org.telegram.ui.ActionBar.h6 h6Var = this.f8530b;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(this, d02, M, null, h6Var);
        setElevation(org.telegram.messenger.g0.L(2.0f));
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        TextView textView = this.f8531c;
        org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
        textView.setTextSize(1, 14.0f);
        this.d.setVisibility(8);
        int i11 = this.f8529a;
        if (org.telegram.ui.Wallet.u0.D(i11).A() == 0) {
            org.telegram.ui.Wallet.u0.D(i11).K();
        }
        b();
    }

    public final void b() {
        cg.a s5;
        boolean z10 = this.h;
        cg.b bVar = cg.b.f5303b;
        int i7 = this.f8529a;
        if (z10) {
            s5 = cg.a.j(org.telegram.ui.Wallet.u0.D(i7).A(), bVar);
        } else {
            s5 = y8.x(i7, this.f8532e).s();
        }
        boolean z11 = this.h;
        nq[] nqVarArr = this.f8533f;
        TextView textView = this.f8531c;
        if (z11) {
            textView.setText(org.telegram.messenger.g0.I2(pb.b1(true, gd.a0(null, null, 2131749609, p5.c.k("⭐️ ", s5.o(2).d())), 0.85f, nqVarArr), true, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(0.5f)));
            return;
        }
        cg.b bVar2 = this.f8532e;
        cg.b bVar3 = cg.b.f5302a;
        org.telegram.ui.ActionBar.h6 h6Var = this.f8530b;
        m80 m80Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(pb.b1(false, gd.a0(null, null, 2131750099, gd.E(s5.a(), ',')), 0.6f, null));
            int i10 = org.telegram.ui.ActionBar.m6.xj;
            org.telegram.ui.ActionBar.t6.U(m80Var, i10, h6Var);
            org.telegram.ui.ActionBar.t6.G(m80Var, i10, h6Var);
            m80Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.N0(2131750098, null), new ca.r(this, 9)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        } else if (bVar2 == bVar) {
            textView.setText(pb.b1(true, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750097, s5.b())), 0.6f, nqVarArr));
            nqVarArr[0].a(org.telegram.ui.ActionBar.m6.xj);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            org.telegram.messenger.r1.i().getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", 2, (long) (s5.c() * ((org.telegram.messenger.i0) mp.u1(i7).A7.f26179l.f15705b).f24560a * 100.0d), false));
            int i11 = org.telegram.ui.ActionBar.m6.yj;
            int i12 = org.telegram.ui.ActionBar.m6.wj;
            org.telegram.ui.ActionBar.t6.m(m80Var, i11, i12, 3, 0.33f, h6Var);
            org.telegram.ui.ActionBar.t6.n(m80Var, 2, i11, i12, 3, 0.33f, h6Var);
            m80Var.setText(sb2);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != ks.A3 && (i7 != ks.f25130d4 || !this.h)) {
            return;
        }
        b();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        int i7 = this.f8529a;
        ks.f(i7).c(this, ks.A3);
        ks.f(i7).c(this, ks.E3);
        ks.f(i7).c(this, ks.f25130d4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f8529a;
        ks.f(i7).n(this, ks.A3);
        ks.f(i7).n(this, ks.E3);
        ks.f(i7).n(this, ks.f25130d4);
    }

    public b(Context context, int i7, cg.b bVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f8533f = new nq[1];
        this.f8529a = i7;
        this.f8530b = h6Var;
        this.f8532e = bVar;
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(9.0f));
        int L = org.telegram.messenger.g0.L(24.0f);
        int i10 = org.telegram.ui.ActionBar.m6.wj;
        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(this, d02, M, null, h6Var);
        TextView textView = new TextView(context);
        this.f8531c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.yj, h6Var);
        textView.setGravity(17);
        addView(textView, c8.ma.q(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        m80 m80Var = new m80(context, h6Var);
        this.d = m80Var;
        m80Var.setTextSize(1, 12.0f);
        m80Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.N0(2131750098, null), new a(0, context, h6Var)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        m80Var.setGravity(17);
        addView(m80Var, c8.ma.q(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        b();
    }
}
