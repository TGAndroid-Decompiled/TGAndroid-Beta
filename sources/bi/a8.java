package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.gd;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class a8 implements RequestDelegate {
    public final int f2827a = 0;
    public final boolean f2828b;
    public final boolean f2829c;
    public final Object d;
    public final Object e;

    public a8(x8 x8Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z11) {
        this.d = x8Var;
        this.f2828b = z10;
        this.e = tL_stories_getAllStories;
        this.f2829c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2827a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n7((x8) this.d, this.f2828b, (TL_stories.TL_stories_getAllStories) this.e, tLObject, this.f2829c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gd((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f2828b, this.f2829c, (Runnable) this.e, 3));
                return;
        }
    }

    public a8(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f2828b = z10;
        this.f2829c = z11;
        this.e = runnable;
    }
}
