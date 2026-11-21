package bi;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
public final class e4 implements Runnable {
    public final int f3578a;
    public final SpannableStringBuilder f3579b;

    public e4(SpannableStringBuilder spannableStringBuilder, int i7) {
        this.f3578a = i7;
        this.f3579b = spannableStringBuilder;
    }

    @Override
    public final void run() {
        int i7 = this.f3578a;
        SpannableStringBuilder spannableStringBuilder = this.f3579b;
        switch (i7) {
            case 0:
                gc I = i4.h().I(2131623990, gd.N0(2131749565, null), spannableStringBuilder);
                I.f35518t = true;
                I.j();
                return;
            default:
                lc Y = lc.Y();
                if (Y != null) {
                    Y.Q(2131624029, 30, spannableStringBuilder).j();
                    return;
                }
                return;
        }
    }
}
