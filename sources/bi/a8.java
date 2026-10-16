package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.gd;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class a8 implements RequestDelegate {
    public final int f2831a = 0;
    public final boolean f2832b;
    public final boolean f2833c;
    public final Object d;
    public final Object e;

    public a8(x8 x8Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z11) {
        this.d = x8Var;
        this.f2832b = z10;
        this.e = tL_stories_getAllStories;
        this.f2833c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2831a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n7((x8) this.d, this.f2832b, (TL_stories.TL_stories_getAllStories) this.e, tLObject, this.f2833c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gd((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f2832b, this.f2833c, (Runnable) this.e, 3));
                return;
        }
    }

    public a8(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f2832b = z10;
        this.f2833c = z11;
        this.e = runnable;
    }
}
