package bi;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
public final class e4 implements Runnable {
    public final int f3596a;
    public final SpannableStringBuilder f3597b;

    public e4(SpannableStringBuilder spannableStringBuilder, int i7) {
        this.f3596a = i7;
        this.f3597b = spannableStringBuilder;
    }

    @Override
    public final void run() {
        int i7 = this.f3596a;
        SpannableStringBuilder spannableStringBuilder = this.f3597b;
        switch (i7) {
            case 0:
                gc I = i4.h().I(2131623990, hd.N0(2131749565, null), spannableStringBuilder);
                I.f35537t = true;
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
