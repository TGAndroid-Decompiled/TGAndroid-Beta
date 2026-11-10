package bi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;
public final class c extends LinearLayout implements ls {
    public final int f3547a;
    public final org.telegram.ui.ActionBar.h6 f3548b;
    public final TextView f3549c;
    public final w70 d;
    public cg.b f3550e;
    public final wp[] f3551f;

    public c(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this(context, i7, cg.b.f6165a, h6Var);
    }

    public final void a() {
        cg.b bVar = this.f3550e;
        int i7 = this.f3547a;
        cg.a s5 = ea.x(i7, bVar).s();
        cg.b bVar2 = this.f3550e;
        cg.b bVar3 = cg.b.f6165a;
        TextView textView = this.f3549c;
        org.telegram.ui.ActionBar.h6 h6Var = this.f3548b;
        w70 w70Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(dd.a1(false, org.telegram.messenger.id.a0(null, null, 2131750116, org.telegram.messenger.id.E(s5.a(), ',')), 0.6f, null));
            int i10 = org.telegram.ui.ActionBar.m6.uj;
            org.telegram.ui.ActionBar.t6.U(w70Var, i10, h6Var);
            org.telegram.ui.ActionBar.t6.G(w70Var, i10, h6Var);
            w70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750115, null), new a3.f(this, 14)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        } else if (bVar2 == cg.b.f6166b) {
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750114, s5.b()));
            wp[] wpVarArr = this.f3551f;
            textView.setText(dd.a1(true, X2, 0.6f, wpVarArr));
            wpVarArr[0].a(org.telegram.ui.ActionBar.m6.uj);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            org.telegram.messenger.r1.i().getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", 2, (long) (s5.c() * ((org.telegram.messenger.i0) qp.s1(i7).f24946x7.f24453l.f14325b).f23005a * 100.0d), false));
            int i11 = org.telegram.ui.ActionBar.m6.vj;
            int i12 = org.telegram.ui.ActionBar.m6.tj;
            org.telegram.ui.ActionBar.t6.m(w70Var, i11, i12, 3, 0.33f, h6Var);
            org.telegram.ui.ActionBar.t6.n(w70Var, 2, i11, i12, 3, 0.33f, h6Var);
            w70Var.setText(sb2);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25118y3) {
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
        int i7 = this.f3547a;
        qs.f(i7).c(this, qs.f25118y3);
        qs.f(i7).c(this, qs.C3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f3547a;
        qs.f(i7).n(this, qs.f25118y3);
        qs.f(i7).n(this, qs.C3);
    }

    public c(Context context, int i7, cg.b bVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f3551f = new wp[1];
        this.f3547a = i7;
        this.f3548b = h6Var;
        this.f3550e = bVar;
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(9.0f));
        int L = org.telegram.messenger.g0.L(24.0f);
        int i10 = org.telegram.ui.ActionBar.m6.tj;
        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(this, d02, M, null, h6Var);
        TextView textView = new TextView(context);
        this.f3549c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.vj, h6Var);
        textView.setGravity(17);
        addView(textView, c8.ha.q(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        w70 w70Var = new w70(context, h6Var);
        this.d = w70Var;
        w70Var.setTextSize(1, 12.0f);
        w70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750115, null), new b(0, context, h6Var)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        w70Var.setGravity(17);
        addView(w70Var, c8.ha.q(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
