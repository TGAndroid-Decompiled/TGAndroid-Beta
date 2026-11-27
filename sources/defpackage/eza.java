package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class eza extends ny0 implements fn7 {
    public final FrameLayout S1;
    public l9c T1;
    public boolean U1;

    public eza(Context context, vnb vnbVar) {
        super(context, null, false, false, vnbVar);
        d79 d79Var = this.n1;
        int i = this.u0;
        d79Var.setPadding(i, 0, i, 0);
        this.n1.setOnItemClickListener(new t39(this, (byte) 14));
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43.h);
        zb3Var.n(350L);
        this.n1.setItemAnimator(zb3Var);
        int i2 = aob.d6;
        t0(i2);
        L(i2);
        this.o1.setTitle(ob6.M0(2131744808, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        p66 p66Var = new p66(context, vnbVar);
        frameLayout.setPadding(0, hl.L(11.0f), 0, hl.L(11.0f));
        p66Var.setTextSize(1, 12.0f);
        yob.X(p66Var, aob.B6, vnbVar);
        yob.G(p66Var, aob.Xc, vnbVar);
        p66Var.setText(hl.N2(ob6.M0(2131744624, null), -1, 0, new uoa(this, (byte) 14), null));
        p66Var.setGravity(17);
        p66Var.setMaxWidth(kg5.a(p66Var.getText(), p66Var.getPaint()));
        frameLayout.addView(p66Var, tre.e(-2, -1, 17));
        yob.h(aob.h5, vnbVar, frameLayout);
        this.b.addView(new tj4(getContext()), tre.c(-1.0f, -1));
        l9c l9cVar = this.T1;
        if (l9cVar != null) {
            l9cVar.O(false);
        }
    }

    @Override
    public final void H() {
        super.H();
        jn7.f(this.a).n(this, jn7.x3);
        jn7.f(this.a).n(this, jn7.A3);
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(this.n1, getContext(), this.a, 0, true, new hj8(this, (byte) 27), this.J0);
        this.T1 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        return ob6.M0(2131744808, null);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l9c l9cVar;
        if ((i == jn7.x3 || i == jn7.A3) && (l9cVar = this.T1) != null) {
            l9cVar.O(true);
        }
    }

    @Override
    public final void show() {
        nr1 nr1Var;
        long j = jxa.v(this.a, false).m().amount;
        e Q = LaunchActivity.Q();
        if (Q instanceof zu1) {
            zu1 zu1Var = (zu1) Q;
            if (zu1Var.Y7() && (nr1Var = zu1Var.a0) != null) {
                nr1Var.U();
            }
        }
        super.show();
        jn7.f(this.a).b(this, jn7.x3);
        jn7.f(this.a).b(this, jn7.A3);
    }
}
