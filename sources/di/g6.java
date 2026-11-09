package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class g6 implements RequestDelegate {
    public final int f9032a = 0;
    public final boolean f9033b;
    public final boolean f9034c;
    public final Object d;
    public final Object f9035e;

    public g6(z6 z6Var, boolean z9, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z10) {
        this.d = z6Var;
        this.f9033b = z9;
        this.f9035e = tL_stories_getAllStories;
        this.f9034c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9032a) {
            case 0:
                org.telegram.messenger.g0.h3(new a6((z6) this.d, this.f9033b, (TL_stories.TL_stories_getAllStories) this.f9035e, tLObject, this.f9034c));
                return;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.q((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f9033b, this.f9034c, (Runnable) this.f9035e));
                return;
        }
    }

    public g6(TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, boolean z10, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f9033b = z9;
        this.f9034c = z10;
        this.f9035e = runnable;
    }
}
