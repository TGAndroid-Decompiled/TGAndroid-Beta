package oh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wd;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class z5 implements RequestDelegate {
    public final int f17993a = 0;
    public final boolean f17994b;
    public final boolean f17995c;
    public final Object d;
    public final Object f17996e;

    public z5(t6 t6Var, boolean z4, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z10) {
        this.d = t6Var;
        this.f17994b = z4;
        this.f17996e = tL_stories_getAllStories;
        this.f17995c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17993a) {
            case 0:
                AndroidUtilities.runOnUIThread(new dg.w0((t6) this.d, this.f17994b, (TL_stories.TL_stories_getAllStories) this.f17996e, tLObject, this.f17995c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wd((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f17994b, this.f17995c, (Runnable) this.f17996e, 3));
                return;
        }
    }

    public z5(TwoStepVerificationActivity twoStepVerificationActivity, boolean z4, boolean z10, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f17994b = z4;
        this.f17995c = z10;
        this.f17996e = runnable;
    }
}
