package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class ava extends fy0 implements gk7 {
    public final FrameLayout S1;
    public l5c T1;
    public boolean U1;

    public ava(Context context, wjb wjbVar) {
        super(context, null, false, false, wjbVar);
        o39 o39Var = this.n1;
        int i = this.u0;
        o39Var.setPadding(i, 0, i, 0);
        this.n1.setOnItemClickListener(new f09(this, (byte) 14));
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33.h);
        gb3Var.n(350L);
        this.n1.setItemAnimator(gb3Var);
        int i2 = bkb.c6;
        t0(i2);
        M(i2);
        this.o1.setTitle(k96.M0(2131744914, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        l46 l46Var = new l46(context, wjbVar);
        frameLayout.setPadding(0, gl.L(11.0f), 0, gl.L(11.0f));
        l46Var.setTextSize(1, 12.0f);
        zkb.X(l46Var, bkb.A6, wjbVar);
        zkb.G(l46Var, bkb.Wc, wjbVar);
        l46Var.setText(gl.O2(k96.M0(2131744730, null), -1, 0, new z6a(this, (byte) 27), null));
        l46Var.setGravity(17);
        l46Var.setMaxWidth(je5.a(l46Var.getText(), l46Var.getPaint()));
        frameLayout.addView(l46Var, nme.e(-2, -1, 17));
        zkb.h(bkb.g5, wjbVar, frameLayout);
        this.b.addView(new qh4(getContext()), nme.c(-1.0f, -1));
        l5c l5cVar = this.T1;
        if (l5cVar != null) {
            l5cVar.O(false);
        }
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(this.n1, getContext(), this.a, 0, true, new tf8(this, (byte) 27), this.J0);
        this.T1 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override
    public final void I() {
        super.I();
        kk7.f(this.a).n(this, kk7.w3);
        kk7.f(this.a).n(this, kk7.z3);
    }

    @Override
    public final CharSequence J0() {
        return k96.M0(2131744914, null);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l5c l5cVar;
        if ((i == kk7.w3 || i == kk7.z3) && (l5cVar = this.T1) != null) {
            l5cVar.O(true);
        }
    }

    @Override
    public final void show() {
        ar1 ar1Var;
        long j = gta.v(this.a, false).m().amount;
        d Q = LaunchActivity.Q();
        if (Q instanceof mu1) {
            mu1 mu1Var = (mu1) Q;
            if (mu1Var.O7() && (ar1Var = mu1Var.a0) != null) {
                ar1Var.S();
            }
        }
        super.show();
        kk7.f(this.a).b(this, kk7.w3);
        kk7.f(this.a).b(this, kk7.z3);
    }
}
