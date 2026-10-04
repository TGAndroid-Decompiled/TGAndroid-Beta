package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.sd;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class p8 implements RequestDelegate {
    public final int f1512a = 0;
    public final boolean f1513b;
    public final boolean f1514c;
    public final Object d;
    public final Object f1515e;

    public p8(l9 l9Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z11) {
        this.d = l9Var;
        this.f1513b = z10;
        this.f1515e = tL_stories_getAllStories;
        this.f1514c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1512a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b8((l9) this.d, this.f1513b, (TL_stories.TL_stories_getAllStories) this.f1515e, tLObject, this.f1514c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new sd((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f1513b, this.f1514c, (Runnable) this.f1515e, 3));
                return;
        }
    }

    public p8(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f1513b = z10;
        this.f1514c = z11;
        this.f1515e = runnable;
    }
}
