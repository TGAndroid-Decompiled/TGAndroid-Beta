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
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kq;
public final class b extends LinearLayout implements fs {
    public final int f8494a;
    public final org.telegram.ui.ActionBar.i6 f8495b;
    public final TextView f8496c;
    public final j80 d;
    public cg.b f8497e;
    public final kq[] f8498f;
    public boolean h;

    public b(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this(context, i7, cg.b.f5268a, i6Var);
    }

    public final void a() {
        this.h = true;
        this.f8497e = cg.b.f5269b;
        setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(7.0f));
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29524h5;
        org.telegram.ui.ActionBar.i6 i6Var = this.f8495b;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(this, d02, M, null, i6Var);
        setElevation(org.telegram.messenger.g0.L(2.0f));
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        TextView textView = this.f8496c;
        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
        textView.setTextSize(1, 14.0f);
        this.d.setVisibility(8);
        int i11 = this.f8494a;
        if (org.telegram.ui.Wallet.v0.D(i11).A() == 0) {
            org.telegram.ui.Wallet.v0.D(i11).K();
        }
        b();
    }

    public final void b() {
        cg.a s5;
        boolean z10 = this.h;
        cg.b bVar = cg.b.f5269b;
        int i7 = this.f8494a;
        if (z10) {
            s5 = cg.a.j(org.telegram.ui.Wallet.v0.D(i7).A(), bVar);
        } else {
            s5 = y8.x(i7, this.f8497e).s();
        }
        boolean z11 = this.h;
        kq[] kqVarArr = this.f8498f;
        TextView textView = this.f8496c;
        if (z11) {
            textView.setText(org.telegram.messenger.g0.I2(pb.b1(true, gd.a0(null, null, 2131749609, p5.c.k("⭐️ ", s5.o(2).d())), 0.85f, kqVarArr), true, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(0.5f)));
            return;
        }
        cg.b bVar2 = this.f8497e;
        cg.b bVar3 = cg.b.f5268a;
        org.telegram.ui.ActionBar.i6 i6Var = this.f8495b;
        j80 j80Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(pb.b1(false, gd.a0(null, null, 2131750099, gd.E(s5.a(), ',')), 0.6f, null));
            int i10 = org.telegram.ui.ActionBar.n6.xj;
            org.telegram.ui.ActionBar.u6.U(j80Var, i10, i6Var);
            org.telegram.ui.ActionBar.u6.G(j80Var, i10, i6Var);
            j80Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.N0(2131750098, null), new ca.r(this, 8)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        } else if (bVar2 == bVar) {
            textView.setText(pb.b1(true, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750097, s5.b())), 0.6f, kqVarArr));
            kqVarArr[0].a(org.telegram.ui.ActionBar.n6.xj);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            org.telegram.messenger.r1.i().getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", 2, (long) (s5.c() * ((org.telegram.messenger.i0) mp.u1(i7).A7.f26246l.f13936b).f24630a * 100.0d), false));
            int i11 = org.telegram.ui.ActionBar.n6.yj;
            int i12 = org.telegram.ui.ActionBar.n6.wj;
            org.telegram.ui.ActionBar.u6.m(j80Var, i11, i12, 3, 0.33f, i6Var);
            org.telegram.ui.ActionBar.u6.n(j80Var, 2, i11, i12, 3, 0.33f, i6Var);
            j80Var.setText(sb2);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != ks.A3 && (i7 != ks.f25201d4 || !this.h)) {
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
        int i7 = this.f8494a;
        ks.f(i7).c(this, ks.A3);
        ks.f(i7).c(this, ks.E3);
        ks.f(i7).c(this, ks.f25201d4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f8494a;
        ks.f(i7).n(this, ks.A3);
        ks.f(i7).n(this, ks.E3);
        ks.f(i7).n(this, ks.f25201d4);
    }

    public b(Context context, int i7, cg.b bVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f8498f = new kq[1];
        this.f8494a = i7;
        this.f8495b = i6Var;
        this.f8497e = bVar;
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(9.0f));
        int L = org.telegram.messenger.g0.L(24.0f);
        int i10 = org.telegram.ui.ActionBar.n6.wj;
        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(this, d02, M, null, i6Var);
        TextView textView = new TextView(context);
        this.f8496c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.yj, i6Var);
        textView.setGravity(17);
        addView(textView, c8.na.q(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        j80 j80Var = new j80(context, i6Var);
        this.d = j80Var;
        j80Var.setTextSize(1, 12.0f);
        j80Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.N0(2131750098, null), new a(0, context, i6Var)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        j80Var.setGravity(17);
        addView(j80Var, c8.na.q(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        b();
    }
}
