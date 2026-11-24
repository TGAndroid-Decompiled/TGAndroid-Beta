package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Wallet.c;
public final class ge0 extends LinearLayout implements gk7 {
    public final int a;
    public final wjb b;
    public final TextView c;
    public final l46 d;
    public oj e;
    public final cm2[] f;
    public boolean h;

    public ge0(Context context, int i, oj ojVar, wjb wjbVar) {
        super(context);
        this.f = new cm2[1];
        this.a = i;
        this.b = wjbVar;
        this.e = ojVar;
        setOrientation(1);
        setPadding(gl.L(18.0f), gl.L(9.0f), gl.L(18.0f), gl.L(9.0f));
        int L = gl.L(24.0f);
        int i2 = bkb.vj;
        Drawable b0 = bkb.b0(L, bkb.v0(i2, wjbVar));
        vkb M = zkb.M(i2);
        setBackground(b0);
        zkb.j(this, b0, M, null, wjbVar);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        zkb.X(textView, bkb.xj, wjbVar);
        textView.setGravity(17);
        addView(textView, nme.q(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        l46 l46Var = new l46(context, wjbVar);
        this.d = l46Var;
        l46Var.setTextSize(1, 12.0f);
        l46Var.setText(gl.E2(gl.N2(k96.M0(2131750099, null), -1, 0, new fe0(context, wjbVar, (byte) 0), null), true, gl.L(2.6666667f), gl.L(1.0f)));
        l46Var.setGravity(17);
        addView(l46Var, nme.q(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        b();
    }

    public final void a() {
        this.h = true;
        this.e = oj.b;
        setPadding(gl.L(14.0f), gl.L(7.0f), gl.L(12.0f), gl.L(7.0f));
        int L = gl.L(18.0f);
        int i = bkb.g5;
        wjb wjbVar = this.b;
        ShapeDrawable b0 = bkb.b0(L, bkb.v0(i, wjbVar));
        vkb M = zkb.M(i);
        setBackground(b0);
        zkb.j(this, b0, M, null, wjbVar);
        setElevation(gl.L(2.0f));
        int i2 = bkb.F6;
        TextView textView = this.c;
        zkb.X(textView, i2, wjbVar);
        textView.setTextSize(1, 14.0f);
        this.d.setVisibility(8);
        int i3 = this.a;
        if (c.C(i3).z() == 0) {
            c.C(i3).J();
        }
        b();
    }

    public final void b() {
        nj p;
        oj ojVar = oj.b;
        boolean z = this.h;
        int i = this.a;
        if (z) {
            p = nj.j(c.C(i).z(), ojVar);
        } else {
            p = gta.u(i, this.e).p();
        }
        if (this.h) {
            this.c.setText(gl.E2(jva.a1(true, k96.a0(null, null, 2131749610, "⭐️ ".concat(p.o(2).d())), 0.85f, this.f), true, gl.L(2.0f), gl.L(0.5f)));
            return;
        }
        oj ojVar2 = this.e;
        if (ojVar2 == oj.a) {
            this.c.setText(jva.a1(false, k96.a0(null, null, 2131750100, k96.E(p.a(), ',')), 0.6f, null));
            l46 l46Var = this.d;
            int i2 = bkb.wj;
            zkb.X(l46Var, i2, this.b);
            zkb.G(this.d, i2, this.b);
            this.d.setText(gl.E2(gl.N2(k96.M0(2131750099, null), -1, 0, new oz(this, (byte) 7), null), true, gl.L(2.6666667f), gl.L(1.0f)));
        } else if (ojVar2 == ojVar) {
            this.c.setText(jva.a1(true, gl.S2(k96.a0(null, null, 2131750098, p.b())), 0.6f, this.f));
            this.f[0].a(bkb.wj);
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            ci0.h();
            sb.append(ci0.f("USD", 2, (long) (p.c() * na7.q1(this.a).k4.k.i * 100.0d), false));
            l46 l46Var2 = this.d;
            int i3 = bkb.xj;
            int i4 = bkb.vj;
            ykb ykbVar = zkb.a;
            zkb.m(l46Var2, i3, i4, 3, 0.33f, this.b);
            zkb.n(this.d, 2, i3, i4, 3, 0.33f, this.b);
            this.d.setText(sb);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != kk7.z3 && (i != kk7.c4 || !this.h)) {
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
        int i = this.a;
        kk7.f(i).b(this, kk7.z3);
        kk7.f(i).b(this, kk7.D3);
        kk7.f(i).b(this, kk7.c4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        kk7.f(i).n(this, kk7.z3);
        kk7.f(i).n(this, kk7.D3);
        kk7.f(i).n(this, kk7.c4);
    }

    public ge0(int i, wjb wjbVar, Context context) {
        this(context, i, oj.a, wjbVar);
    }
}
