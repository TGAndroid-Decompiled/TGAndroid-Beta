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
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lq;
public final class b extends LinearLayout implements fs {
    public final int f8508a;
    public final org.telegram.ui.ActionBar.i6 f8509b;
    public final TextView f8510c;
    public final k80 d;
    public cg.b f8511e;
    public final lq[] f8512f;
    public boolean h;

    public b(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this(context, i7, cg.b.f5273a, i6Var);
    }

    public final void a() {
        this.h = true;
        this.f8511e = cg.b.f5274b;
        setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f));
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29467h5;
        org.telegram.ui.ActionBar.i6 i6Var = this.f8509b;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(this, d02, M, null, i6Var);
        setElevation(org.telegram.messenger.g0.L(2.0f));
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        TextView textView = this.f8510c;
        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
        textView.setTextSize(1, 14.0f);
        this.d.setVisibility(8);
        int i11 = this.f8508a;
        if (org.telegram.ui.Wallet.u0.D(i11).A() == 0) {
            org.telegram.ui.Wallet.u0.D(i11).K();
        }
        b();
    }

    public final void b() {
        cg.a s5;
        boolean z10 = this.h;
        cg.b bVar = cg.b.f5274b;
        int i7 = this.f8508a;
        if (z10) {
            s5 = cg.a.j(org.telegram.ui.Wallet.u0.D(i7).A(), bVar);
        } else {
            s5 = x8.x(i7, this.f8511e).s();
        }
        boolean z11 = this.h;
        lq[] lqVarArr = this.f8512f;
        TextView textView = this.f8510c;
        if (z11) {
            textView.setText(org.telegram.messenger.g0.I2(pb.b1(true, gd.a0(null, null, 2131749610, p5.c.k("⭐️ ", s5.o(2).d())), 0.85f, lqVarArr), true, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(0.5f)));
            return;
        }
        cg.b bVar2 = this.f8511e;
        cg.b bVar3 = cg.b.f5273a;
        org.telegram.ui.ActionBar.i6 i6Var = this.f8509b;
        k80 k80Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(pb.b1(false, gd.a0(null, null, 2131750100, gd.E(s5.a(), ',')), 0.6f, null));
            int i10 = org.telegram.ui.ActionBar.n6.xj;
            org.telegram.ui.ActionBar.u6.U(k80Var, i10, i6Var);
            org.telegram.ui.ActionBar.u6.G(k80Var, i10, i6Var);
            k80Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.M0(2131750099, null), new ca.r(this, 9)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        } else if (bVar2 == bVar) {
            textView.setText(pb.b1(true, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750098, s5.b())), 0.6f, lqVarArr));
            lqVarArr[0].a(org.telegram.ui.ActionBar.n6.xj);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            org.telegram.messenger.r1.i().getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", 2, (long) (s5.c() * ((org.telegram.messenger.i0) mp.u1(i7).A7.f26151l.f15642b).f24532a * 100.0d), false));
            int i11 = org.telegram.ui.ActionBar.n6.yj;
            int i12 = org.telegram.ui.ActionBar.n6.wj;
            org.telegram.ui.ActionBar.u6.m(k80Var, i11, i12, 3, 0.33f, i6Var);
            org.telegram.ui.ActionBar.u6.n(k80Var, 2, i11, i12, 3, 0.33f, i6Var);
            k80Var.setText(sb2);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != ks.A3 && (i7 != ks.f25102d4 || !this.h)) {
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
        int i7 = this.f8508a;
        ks.f(i7).c(this, ks.A3);
        ks.f(i7).c(this, ks.E3);
        ks.f(i7).c(this, ks.f25102d4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f8508a;
        ks.f(i7).n(this, ks.A3);
        ks.f(i7).n(this, ks.E3);
        ks.f(i7).n(this, ks.f25102d4);
    }

    public b(Context context, int i7, cg.b bVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f8512f = new lq[1];
        this.f8508a = i7;
        this.f8509b = i6Var;
        this.f8511e = bVar;
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(9.0f));
        int L = org.telegram.messenger.g0.L(24.0f);
        int i10 = org.telegram.ui.ActionBar.n6.wj;
        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(this, d02, M, null, i6Var);
        TextView textView = new TextView(context);
        this.f8510c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.yj, i6Var);
        textView.setGravity(17);
        addView(textView, c8.ma.q(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        k80 k80Var = new k80(context, i6Var);
        this.d = k80Var;
        k80Var.setTextSize(1, 12.0f);
        k80Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.M0(2131750099, null), new a(0, context, i6Var)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        k80Var.setGravity(17);
        addView(k80Var, c8.ma.q(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        b();
    }
}
