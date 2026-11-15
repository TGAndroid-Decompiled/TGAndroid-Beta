package fi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class y5 implements RequestDelegate {
    public final int f12547a = 0;
    public final boolean f12548b;
    public final boolean f12549c;
    public final Object d;
    public final Object f12550e;

    public y5(s6 s6Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z11) {
        this.d = s6Var;
        this.f12548b = z10;
        this.f12550e = tL_stories_getAllStories;
        this.f12549c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12547a) {
            case 0:
                org.telegram.messenger.g0.h3(new r5((s6) this.d, this.f12548b, (TL_stories.TL_stories_getAllStories) this.f12550e, tLObject, this.f12549c));
                return;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f12548b, this.f12549c, (Runnable) this.f12550e));
                return;
        }
    }

    public y5(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f12548b = z10;
        this.f12549c = z11;
        this.f12550e = runnable;
    }
}
