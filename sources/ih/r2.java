package ih;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.y71;
import org.telegram.ui.Components.z71;
import org.telegram.ui.ProfileActivity;
public final class r2 extends z71 {
    public final org.telegram.ui.ActionBar.o2 P;
    public final gr0 Q;

    public r2(gr0 gr0Var, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null);
        this.Q = gr0Var;
        this.P = o2Var;
    }

    @Override
    public final void h() {
        gr0 gr0Var = this.Q;
        y71 y71Var = gr0Var.f9506n;
        if (gr0Var.b() && y71Var != null) {
            if (gr0Var.F == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.x3.i(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                iq iqVar = new iq(R.drawable.poll_add_plus, 0);
                iqVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(iqVar, 0, 1, 33);
                gr0Var.F = spannableStringBuilder;
            }
            y71Var.a(-1, gr0Var.F);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.Q.g();
    }

    @Override
    public final void w(boolean z10) {
        gr0 gr0Var = this.Q;
        gr0Var.l();
        org.telegram.ui.ActionBar.o2 o2Var = this.P;
        if (o2Var instanceof ProfileActivity) {
            ((ProfileActivity) o2Var).R();
        }
        gr0Var.o();
    }

    @Override
    public final void z(int i10) {
        this.Q.l();
        org.telegram.ui.ActionBar.o2 o2Var = this.P;
        if (o2Var instanceof ProfileActivity) {
            ((ProfileActivity) o2Var).R();
        }
    }
}
