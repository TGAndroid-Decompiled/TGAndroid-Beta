package kh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import org.telegram.messenger.R;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.or0;
import org.telegram.ui.ProfileActivity;
public final class r2 extends l81 {
    public final org.telegram.ui.ActionBar.p2 Q;
    public final or0 R;

    public r2(or0 or0Var, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context, null);
        this.R = or0Var;
        this.Q = p2Var;
    }

    @Override
    public final void h() {
        or0 or0Var = this.R;
        k81 k81Var = or0Var.f10943n;
        if (or0Var.b() && k81Var != null) {
            if (or0Var.G == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.y3.h(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                mq mqVar = new mq(R.drawable.poll_add_plus, 0);
                mqVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(mqVar, 0, 1, 33);
                or0Var.G = spannableStringBuilder;
            }
            k81Var.a(-1, or0Var.G);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.R.g();
    }

    @Override
    public final void w(boolean z4) {
        or0 or0Var = this.R;
        or0Var.l();
        org.telegram.ui.ActionBar.p2 p2Var = this.Q;
        if (p2Var instanceof ProfileActivity) {
            ((ProfileActivity) p2Var).R();
        }
        or0Var.o();
    }

    @Override
    public final void z(int i10) {
        this.R.l();
        org.telegram.ui.ActionBar.p2 p2Var = this.Q;
        if (p2Var instanceof ProfileActivity) {
            ((ProfileActivity) p2Var).R();
        }
    }
}
