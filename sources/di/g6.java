package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class g6 implements RequestDelegate {
    public final int f9037a = 0;
    public final boolean f9038b;
    public final boolean f9039c;
    public final Object d;
    public final Object f9040e;

    public g6(z6 z6Var, boolean z9, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z10) {
        this.d = z6Var;
        this.f9038b = z9;
        this.f9040e = tL_stories_getAllStories;
        this.f9039c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9037a) {
            case 0:
                org.telegram.messenger.g0.h3(new a6((z6) this.d, this.f9038b, (TL_stories.TL_stories_getAllStories) this.f9040e, tLObject, this.f9039c));
                return;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.q((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f9038b, this.f9039c, (Runnable) this.f9040e));
                return;
        }
    }

    public g6(TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, boolean z10, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f9038b = z9;
        this.f9039c = z10;
        this.f9040e = runnable;
    }
}
