package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Wallet.c;
public final class gf0 extends LinearLayout implements jm7 {
    public final int a;
    public final ylb b;
    public final TextView c;
    public final l66 d;
    public ok e;
    public final pn2[] f;
    public boolean h;

    public gf0(Context context, int i, ok okVar, ylb ylbVar) {
        super(context);
        this.f = new pn2[1];
        this.a = i;
        this.b = ylbVar;
        this.e = okVar;
        setOrientation(1);
        setPadding(gm.L(18.0f), gm.L(9.0f), gm.L(18.0f), gm.L(9.0f));
        int L = gm.L(24.0f);
        int i2 = cmb.vj;
        Drawable b0 = cmb.b0(L, cmb.v0(i2, ylbVar));
        wmb M = anb.M(i2);
        setBackground(b0);
        anb.j(this, b0, M, null, ylbVar);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        anb.X(textView, cmb.xj, ylbVar);
        textView.setGravity(17);
        addView(textView, qoe.q(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        l66 l66Var = new l66(context, ylbVar);
        this.d = l66Var;
        l66Var.setTextSize(1, 12.0f);
        l66Var.setText(gm.E2(gm.N2(jb6.M0(2131750048, null), -1, 0, new ff0(context, ylbVar, (byte) 0), null), true, gm.L(2.6666667f), gm.L(1.0f)));
        l66Var.setGravity(17);
        addView(l66Var, qoe.q(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        b();
    }

    public final void a() {
        this.h = true;
        this.e = ok.b;
        setPadding(gm.L(14.0f), gm.L(7.0f), gm.L(12.0f), gm.L(7.0f));
        int L = gm.L(18.0f);
        int i = cmb.g5;
        ylb ylbVar = this.b;
        ShapeDrawable b0 = cmb.b0(L, cmb.v0(i, ylbVar));
        wmb M = anb.M(i);
        setBackground(b0);
        anb.j(this, b0, M, null, ylbVar);
        setElevation(gm.L(2.0f));
        int i2 = cmb.F6;
        TextView textView = this.c;
        anb.X(textView, i2, ylbVar);
        textView.setTextSize(1, 14.0f);
        this.d.setVisibility(8);
        int i3 = this.a;
        if (c.C(i3).z() == 0) {
            c.C(i3).J();
        }
        b();
    }

    public final void b() {
        nk p;
        ok okVar = ok.b;
        boolean z = this.h;
        int i = this.a;
        if (z) {
            p = nk.j(c.C(i).z(), okVar);
        } else {
            p = jva.u(i, this.e).p();
        }
        if (this.h) {
            this.c.setText(gm.E2(nxa.b1(true, jb6.a0(null, null, 2131749559, "⭐️ ".concat(p.o(2).d())), 0.85f, this.f), true, gm.L(2.0f), gm.L(0.5f)));
            return;
        }
        ok okVar2 = this.e;
        if (okVar2 == ok.a) {
            this.c.setText(nxa.b1(false, jb6.a0(null, null, 2131750049, jb6.E(p.a(), ',')), 0.6f, null));
            l66 l66Var = this.d;
            int i2 = cmb.wj;
            anb.X(l66Var, i2, this.b);
            anb.G(this.d, i2, this.b);
            this.d.setText(gm.E2(gm.N2(jb6.M0(2131750048, null), -1, 0, new f00(this, (byte) 9), null), true, gm.L(2.6666667f), gm.L(1.0f)));
        } else if (okVar2 == okVar) {
            this.c.setText(nxa.b1(true, gm.S2(jb6.a0(null, null, 2131750047, p.b())), 0.6f, this.f));
            this.f[0].a(cmb.wj);
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            cj0.h();
            sb.append(cj0.f("USD", 2, (long) (p.c() * oc7.r1(this.a).l4.k.i * 100.0d), false));
            l66 l66Var2 = this.d;
            int i3 = cmb.xj;
            int i4 = cmb.vj;
            zmb zmbVar = anb.a;
            anb.m(l66Var2, i3, i4, 3, 0.33f, this.b);
            anb.n(this.d, 2, i3, i4, 3, 0.33f, this.b);
            this.d.setText(sb);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != nm7.A3 && (i != nm7.e4 || !this.h)) {
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
        nm7.f(i).b(this, nm7.A3);
        nm7.f(i).b(this, nm7.E3);
        nm7.f(i).b(this, nm7.e4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        nm7.f(i).n(this, nm7.A3);
        nm7.f(i).n(this, nm7.E3);
        nm7.f(i).n(this, nm7.e4);
    }

    public gf0(int i, ylb ylbVar, Context context) {
        this(context, i, ok.a, ylbVar);
    }
}
