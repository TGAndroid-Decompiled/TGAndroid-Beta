package fi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class w5 implements RequestDelegate {
    public final int f12738a = 0;
    public final boolean f12739b;
    public final boolean f12740c;
    public final Object d;
    public final Object f12741e;

    public w5(p6 p6Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z11) {
        this.d = p6Var;
        this.f12739b = z10;
        this.f12741e = tL_stories_getAllStories;
        this.f12740c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12738a) {
            case 0:
                org.telegram.messenger.g0.g3(new q5((p6) this.d, this.f12739b, (TL_stories.TL_stories_getAllStories) this.f12741e, tLObject, this.f12740c));
                return;
            default:
                org.telegram.messenger.g0.g3(new org.telegram.ui.ActionBar.p((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f12739b, this.f12740c, (Runnable) this.f12741e));
                return;
        }
    }

    public w5(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f12739b = z10;
        this.f12740c = z11;
        this.f12741e = runnable;
    }
}
