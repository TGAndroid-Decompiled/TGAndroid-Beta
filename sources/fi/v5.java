package fi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class v5 implements RequestDelegate {
    public final int f12640a = 0;
    public final boolean f12641b;
    public final boolean f12642c;
    public final Object d;
    public final Object f12643e;

    public v5(p6 p6Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z11) {
        this.d = p6Var;
        this.f12641b = z10;
        this.f12643e = tL_stories_getAllStories;
        this.f12642c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12640a) {
            case 0:
                org.telegram.messenger.g0.g3(new p5((p6) this.d, this.f12641b, (TL_stories.TL_stories_getAllStories) this.f12643e, tLObject, this.f12642c));
                return;
            default:
                org.telegram.messenger.g0.g3(new org.telegram.ui.ActionBar.p((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f12641b, this.f12642c, (Runnable) this.f12643e));
                return;
        }
    }

    public v5(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f12641b = z10;
        this.f12642c = z11;
        this.f12643e = runnable;
    }
}
