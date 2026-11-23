package bi;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
public final class g4 implements Runnable {
    public final int f3605a;
    public final SpannableStringBuilder f3606b;

    public g4(SpannableStringBuilder spannableStringBuilder, int i7) {
        this.f3605a = i7;
        this.f3606b = spannableStringBuilder;
    }

    @Override
    public final void run() {
        int i7 = this.f3605a;
        SpannableStringBuilder spannableStringBuilder = this.f3606b;
        switch (i7) {
            case 0:
                gc I = l4.h().I(2131623990, hd.N0(2131749565, null), spannableStringBuilder);
                I.f35499t = true;
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
