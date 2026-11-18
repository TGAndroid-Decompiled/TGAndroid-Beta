package bi;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
public final class a4 implements Runnable {
    public final int f3401a;
    public final SpannableStringBuilder f3402b;

    public a4(SpannableStringBuilder spannableStringBuilder, int i7) {
        this.f3401a = i7;
        this.f3402b = spannableStringBuilder;
    }

    @Override
    public final void run() {
        int i7 = this.f3401a;
        SpannableStringBuilder spannableStringBuilder = this.f3402b;
        switch (i7) {
            case 0:
                gc I = e4.h().I(2131623990, gd.M0(2131749566, null), spannableStringBuilder);
                I.f35471t = true;
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
