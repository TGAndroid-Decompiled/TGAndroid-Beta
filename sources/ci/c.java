package ci;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.wp;
public final class c extends LinearLayout implements cs {
    public final int f4897a;
    public final org.telegram.ui.ActionBar.e6 f4898b;
    public final TextView f4899c;
    public final s70 d;
    public dg.b f4900e;
    public final wp[] f4901f;

    public c(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, i3, dg.b.f8925a, e6Var);
    }

    public final void a() {
        dg.b bVar = this.f4900e;
        int i3 = this.f4897a;
        dg.a s6 = e9.x(i3, bVar).s();
        dg.b bVar2 = this.f4900e;
        dg.b bVar3 = dg.b.f8925a;
        TextView textView = this.f4899c;
        org.telegram.ui.ActionBar.e6 e6Var = this.f4898b;
        s70 s70Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(wb.a1(false, bd.a0(null, null, 2131750124, bd.E(s6.a(), ',')), 0.6f, null));
            int i10 = org.telegram.ui.ActionBar.k6.uj;
            org.telegram.ui.ActionBar.r6.V(s70Var, i10, e6Var);
            org.telegram.ui.ActionBar.r6.H(s70Var, i10, e6Var);
            s70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(bd.M0(2131750123, null), new ai.s(this, 24)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        } else if (bVar2 == dg.b.f8926b) {
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131750122, s6.b()));
            wp[] wpVarArr = this.f4901f;
            textView.setText(wb.a1(true, X2, 0.6f, wpVarArr));
            wpVarArr[0].a(org.telegram.ui.ActionBar.k6.uj);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            org.telegram.messenger.r1.i().getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", 2, (long) (s6.c() * ((org.telegram.messenger.i0) hp.s1(i3).f23167x7.f24665l.f14429b).f23413a * 100.0d), false));
            int i11 = org.telegram.ui.ActionBar.k6.vj;
            int i12 = org.telegram.ui.ActionBar.k6.tj;
            org.telegram.ui.ActionBar.r6.n(s70Var, i11, i12, 3, 0.33f, e6Var);
            org.telegram.ui.ActionBar.r6.o(s70Var, 2, i11, i12, 3, 0.33f, e6Var);
            s70Var.setText(sb2);
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23343y3) {
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
        int i3 = this.f4897a;
        hs.f(i3).c(this, hs.f23343y3);
        hs.f(i3).c(this, hs.C3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = this.f4897a;
        hs.f(i3).n(this, hs.f23343y3);
        hs.f(i3).n(this, hs.C3);
    }

    public c(Context context, int i3, dg.b bVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f4901f = new wp[1];
        this.f4897a = i3;
        this.f4898b = e6Var;
        this.f4900e = bVar;
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(9.0f));
        int L = org.telegram.messenger.g0.L(24.0f);
        int i10 = org.telegram.ui.ActionBar.k6.tj;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(this, d02, N, null, e6Var);
        TextView textView = new TextView(context);
        this.f4899c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.vj, e6Var);
        textView.setGravity(17);
        addView(textView, mf.q(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        s70 s70Var = new s70(context, e6Var);
        this.d = s70Var;
        s70Var.setTextSize(1, 12.0f);
        s70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(bd.M0(2131750123, null), new b(0, context, e6Var)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        s70Var.setGravity(17);
        addView(s70Var, mf.q(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
