package ei;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class g6 implements RequestDelegate {
    public final int f10334a = 0;
    public final boolean f10335b;
    public final boolean f10336c;
    public final Object d;
    public final Object f10337e;

    public g6(z6 z6Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z11) {
        this.d = z6Var;
        this.f10335b = z10;
        this.f10337e = tL_stories_getAllStories;
        this.f10336c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10334a) {
            case 0:
                org.telegram.messenger.g0.h3(new a6((z6) this.d, this.f10335b, (TL_stories.TL_stories_getAllStories) this.f10337e, tLObject, this.f10336c));
                return;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f10335b, this.f10336c, (Runnable) this.f10337e));
                return;
        }
    }

    public g6(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f10335b = z10;
        this.f10336c = z11;
        this.f10337e = runnable;
    }
}
