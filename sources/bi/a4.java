package bi;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
public final class a4 implements Runnable {
    public final int f3400a;
    public final SpannableStringBuilder f3401b;

    public a4(SpannableStringBuilder spannableStringBuilder, int i7) {
        this.f3400a = i7;
        this.f3401b = spannableStringBuilder;
    }

    @Override
    public final void run() {
        int i7 = this.f3400a;
        SpannableStringBuilder spannableStringBuilder = this.f3401b;
        switch (i7) {
            case 0:
                gc I = f4.g().I(2131623990, gd.M0(2131749566, null), spannableStringBuilder);
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
