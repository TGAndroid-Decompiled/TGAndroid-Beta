package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Wallet.c;
public final class ie0 extends LinearLayout implements fn7 {
    public final int a;
    public final vnb b;
    public final TextView c;
    public final p66 d;
    public pj e;
    public final wm2[] f;
    public boolean h;
    public boolean n;

    public ie0(Context context, int i, pj pjVar, vnb vnbVar) {
        super(context);
        this.f = new wm2[1];
        this.a = i;
        this.b = vnbVar;
        this.e = pjVar;
        setOrientation(1);
        setPadding(hl.L(18.0f), hl.L(9.0f), hl.L(18.0f), hl.L(9.0f));
        int L = hl.L(24.0f);
        int i2 = aob.wj;
        Drawable b0 = aob.b0(L, aob.v0(i2, vnbVar));
        uob M = yob.M(i2);
        setBackground(b0);
        yob.j(this, b0, M, null, vnbVar);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        yob.X(textView, aob.yj, vnbVar);
        textView.setGravity(17);
        addView(textView, tre.q(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        p66 p66Var = new p66(context, vnbVar);
        this.d = p66Var;
        p66Var.setTextSize(1, 12.0f);
        p66Var.setText(hl.E2(hl.N2(ob6.M0(2131750074, null), -1, 0, new he0(context, vnbVar, (byte) 0), null), true, hl.L(2.6666667f), hl.L(1.0f)));
        p66Var.setGravity(17);
        addView(p66Var, tre.q(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        b();
    }

    public final void a() {
        this.h = true;
        this.e = pj.b;
        setPadding(hl.L(14.0f), hl.L(7.0f), hl.L(12.0f), hl.L(7.0f));
        int L = hl.L(18.0f);
        int i = aob.h5;
        vnb vnbVar = this.b;
        ShapeDrawable b0 = aob.b0(L, aob.v0(i, vnbVar));
        uob M = yob.M(i);
        setBackground(b0);
        yob.j(this, b0, M, null, vnbVar);
        setElevation(hl.L(2.0f));
        int i2 = aob.G6;
        TextView textView = this.c;
        yob.X(textView, i2, vnbVar);
        textView.setTextSize(1, 14.0f);
        this.d.setVisibility(8);
        int i3 = this.a;
        if (c.C(i3).z() == 0) {
            c.C(i3).J();
        }
        b();
    }

    public final void b() {
        oj j;
        String b;
        pj pjVar = pj.b;
        if (!this.h && (!this.n || this.e != pjVar)) {
            j = jxa.u(this.a, this.e).p();
        } else {
            j = oj.j(c.C(this.a).z(), pjVar);
        }
        if (this.h) {
            this.c.setText(hl.E2(nza.b1(true, ob6.a0(null, null, 2131749571, "⭐️ ".concat(j.o(2).d())), 0.85f, this.f), true, hl.L(2.0f), hl.L(0.5f)));
            return;
        }
        pj pjVar2 = this.e;
        if (pjVar2 == pj.a) {
            this.c.setText(nza.b1(false, ob6.a0(null, null, 2131750075, ob6.E(j.a(), ',')), 0.6f, null));
            p66 p66Var = this.d;
            int i = aob.xj;
            yob.X(p66Var, i, this.b);
            yob.G(this.d, i, this.b);
            this.d.setText(hl.E2(hl.N2(ob6.M0(2131750074, null), -1, 0, new pz(this, (byte) 7), null), true, hl.L(2.6666667f), hl.L(1.0f)));
        } else if (pjVar2 == pjVar) {
            TextView textView = this.c;
            if (this.n) {
                b = j.o(2).d();
            } else {
                b = j.b();
            }
            textView.setText(nza.b1(true, hl.S2(ob6.a0(null, null, 2131750073, b)), 0.6f, this.f));
            this.f[0].a(aob.xj);
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            di0.h();
            sb.append(di0.f("USD", 2, (long) (j.c() * uc7.s1(this.a).k4.k.i * 100.0d), false));
            p66 p66Var2 = this.d;
            int i2 = aob.yj;
            int i3 = aob.wj;
            xob xobVar = yob.a;
            yob.m(p66Var2, i2, i3, 3, 0.33f, this.b);
            yob.n(this.d, 2, i2, i3, 3, 0.33f, this.b);
            this.d.setText(sb);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != jn7.A3) {
            if (i == jn7.d4) {
                if (!this.h && !this.n) {
                    return;
                }
            } else {
                return;
            }
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
        jn7.f(i).b(this, jn7.A3);
        jn7.f(i).b(this, jn7.E3);
        jn7.f(i).b(this, jn7.d4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        jn7.f(i).n(this, jn7.A3);
        jn7.f(i).n(this, jn7.E3);
        jn7.f(i).n(this, jn7.d4);
    }

    public ie0(int i, vnb vnbVar, Context context) {
        this(context, i, pj.a, vnbVar);
    }
}
