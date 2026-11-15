package di;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.z70;
public final class b extends LinearLayout implements is {
    public final int f8227a;
    public final org.telegram.ui.ActionBar.e6 f8228b;
    public final TextView f8229c;
    public final z70 d;
    public cg.b f8230e;
    public final eq[] f8231f;

    public b(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, i7, cg.b.f4987a, e6Var);
    }

    public final void a() {
        cg.b bVar = this.f8230e;
        int i7 = this.f8227a;
        cg.a s5 = v8.x(i7, bVar).s();
        cg.b bVar2 = this.f8230e;
        cg.b bVar3 = cg.b.f4987a;
        TextView textView = this.f8229c;
        org.telegram.ui.ActionBar.e6 e6Var = this.f8228b;
        z70 z70Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(mb.a1(false, hd.a0(null, null, 2131750116, hd.E(s5.a(), ',')), 0.6f, null));
            int i10 = org.telegram.ui.ActionBar.j6.xj;
            org.telegram.ui.ActionBar.q6.U(z70Var, i10, e6Var);
            org.telegram.ui.ActionBar.q6.G(z70Var, i10, e6Var);
            z70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(hd.M0(2131750115, null), new ch.w(this, 5)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        } else if (bVar2 == cg.b.f4988b) {
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750114, s5.b()));
            eq[] eqVarArr = this.f8231f;
            textView.setText(mb.a1(true, X2, 0.6f, eqVarArr));
            eqVarArr[0].a(org.telegram.ui.ActionBar.j6.xj);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            org.telegram.messenger.r1.i().getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", 2, (long) (s5.c() * ((org.telegram.messenger.i0) np.s1(i7).f25448y7.f25855l.f13134b).f24257a * 100.0d), false));
            int i11 = org.telegram.ui.ActionBar.j6.yj;
            int i12 = org.telegram.ui.ActionBar.j6.wj;
            org.telegram.ui.ActionBar.q6.m(z70Var, i11, i12, 3, 0.33f, e6Var);
            org.telegram.ui.ActionBar.q6.n(z70Var, 2, i11, i12, 3, 0.33f, e6Var);
            z70Var.setText(sb2);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f25610y3) {
            a();
        }
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
        a();
        int i7 = this.f8227a;
        ns.f(i7).c(this, ns.f25610y3);
        ns.f(i7).c(this, ns.C3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f8227a;
        ns.f(i7).n(this, ns.f25610y3);
        ns.f(i7).n(this, ns.C3);
    }

    public b(Context context, int i7, cg.b bVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f8231f = new eq[1];
        this.f8227a = i7;
        this.f8228b = e6Var;
        this.f8230e = bVar;
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(9.0f));
        int L = org.telegram.messenger.g0.L(24.0f);
        int i10 = org.telegram.ui.ActionBar.j6.wj;
        Drawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(this, d02, M, null, e6Var);
        TextView textView = new TextView(context);
        this.f8229c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.yj, e6Var);
        textView.setGravity(17);
        addView(textView, c8.ja.q(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        z70 z70Var = new z70(context, e6Var);
        this.d = z70Var;
        z70Var.setTextSize(1, 12.0f);
        z70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(hd.M0(2131750115, null), new a(0, context, e6Var)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        z70Var.setGravity(17);
        addView(z70Var, c8.ja.q(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
