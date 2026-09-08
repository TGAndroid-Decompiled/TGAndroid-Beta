package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.td;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class w7 implements RequestDelegate {
    public final int f3985a = 0;
    public final boolean f3986b;
    public final boolean f3987c;
    public final Object d;
    public final Object f3988e;

    public w7(u8 u8Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z11) {
        this.d = u8Var;
        this.f3986b = z10;
        this.f3988e = tL_stories_getAllStories;
        this.f3987c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3985a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i7((u8) this.d, this.f3986b, (TL_stories.TL_stories_getAllStories) this.f3988e, tLObject, this.f3987c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new td((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f3986b, this.f3987c, (Runnable) this.f3988e, 3));
                return;
        }
    }

    public w7(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f3986b = z10;
        this.f3987c = z11;
        this.f3988e = runnable;
    }
}
