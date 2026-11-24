package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class exa extends mz0 implements jm7 {
    public final FrameLayout S1;
    public l7c T1;
    public boolean U1;

    public exa(Context context, ylb ylbVar) {
        super(context, null, false, false, ylbVar);
        r59 r59Var = this.n1;
        int i = this.u0;
        r59Var.setPadding(i, 0, i, 0);
        this.n1.setOnItemClickListener(new s19(this, (byte) 15));
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        this.n1.setItemAnimator(sc3Var);
        int i2 = cmb.c6;
        t0(i2);
        L(i2);
        this.o1.setTitle(jb6.M0(2131744840, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        l66 l66Var = new l66(context, ylbVar);
        frameLayout.setPadding(0, gm.L(11.0f), 0, gm.L(11.0f));
        l66Var.setTextSize(1, 12.0f);
        anb.X(l66Var, cmb.A6, ylbVar);
        anb.G(l66Var, cmb.Wc, ylbVar);
        l66Var.setText(gm.N2(jb6.M0(2131744656, null), -1, 0, new nsa(this, (byte) 5), null));
        l66Var.setGravity(17);
        l66Var.setMaxWidth(hg5.a(l66Var.getText(), l66Var.getPaint()));
        frameLayout.addView(l66Var, qoe.e(-2, -1, 17));
        anb.h(cmb.g5, ylbVar, frameLayout);
        this.b.addView(new uj4(getContext()), qoe.c(-1.0f, -1));
        l7c l7cVar = this.T1;
        if (l7cVar != null) {
            l7cVar.O(false);
        }
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(this.n1, getContext(), this.a, 0, true, new vh8(this, (byte) 27), this.J0);
        this.T1 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override
    public final void H() {
        super.H();
        nm7.f(this.a).n(this, nm7.x3);
        nm7.f(this.a).n(this, nm7.A3);
    }

    @Override
    public final CharSequence J0() {
        return jb6.M0(2131744840, null);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l7c l7cVar;
        if ((i == nm7.x3 || i == nm7.A3) && (l7cVar = this.T1) != null) {
            l7cVar.O(true);
        }
    }

    @Override
    public final void show() {
        ms1 ms1Var;
        long j = jva.v(this.a, false).m().amount;
        d Q = LaunchActivity.Q();
        if (Q instanceof yv1) {
            yv1 yv1Var = (yv1) Q;
            if (yv1Var.Y7() && (ms1Var = yv1Var.a0) != null) {
                ms1Var.R();
            }
        }
        super.show();
        nm7.f(this.a).b(this, nm7.x3);
        nm7.f(this.a).b(this, nm7.A3);
    }
}
