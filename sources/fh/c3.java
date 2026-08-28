package fh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import org.telegram.messenger.R;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.ProfileActivity;
public final class c3 extends n71 {
    public final org.telegram.ui.ActionBar.o2 P;
    public final vq0 Q;

    public c3(vq0 vq0Var, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null);
        this.Q = vq0Var;
        this.P = o2Var;
    }

    @Override
    public final void h() {
        vq0 vq0Var = this.Q;
        m71 m71Var = vq0Var.f6550n;
        if (vq0Var.b() && m71Var != null) {
            if (vq0Var.F == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.l0.h(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                eq eqVar = new eq(R.drawable.poll_add_plus, 0);
                eqVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
                vq0Var.F = spannableStringBuilder;
            }
            m71Var.a(-1, vq0Var.F);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.Q.g();
    }

    @Override
    public final void w(boolean z10) {
        vq0 vq0Var = this.Q;
        vq0Var.l();
        org.telegram.ui.ActionBar.o2 o2Var = this.P;
        if (o2Var instanceof ProfileActivity) {
            ((ProfileActivity) o2Var).Q();
        }
        vq0Var.o();
    }

    @Override
    public final void z(int i9) {
        this.Q.l();
        org.telegram.ui.ActionBar.o2 o2Var = this.P;
        if (o2Var instanceof ProfileActivity) {
            ((ProfileActivity) o2Var).Q();
        }
    }
}
