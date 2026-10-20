package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.dd;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class p6 implements RequestDelegate {
    public final int f5731a = 0;
    public final boolean f5732b;
    public final boolean f5733c;
    public final Object d;
    public final Object e;

    public p6(i7 i7Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z11) {
        this.d = i7Var;
        this.f5732b = z10;
        this.e = tL_stories_getAllStories;
        this.f5733c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5731a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j6((i7) this.d, this.f5732b, (TL_stories.TL_stories_getAllStories) this.e, tLObject, this.f5733c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new dd((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f5732b, this.f5733c, (Runnable) this.e, 3));
                return;
        }
    }

    public p6(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f5732b = z10;
        this.f5733c = z11;
        this.e = runnable;
    }
}
