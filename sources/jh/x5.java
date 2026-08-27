package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.sd;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;

public final class x5 implements RequestDelegate {

    public final int f14129a = 0;

    public final boolean f14130b;

    public final boolean f14131c;
    public final Object d;

    public final Object f14132e;

    public x5(s6 s6Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z11) {
        this.d = s6Var;
        this.f14130b = z10;
        this.f14132e = tL_stories_getAllStories;
        this.f14131c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14129a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q5((s6) this.d, this.f14130b, (TL_stories.TL_stories_getAllStories) this.f14132e, tLObject, this.f14131c));
                break;
            default:
                AndroidUtilities.runOnUIThread(new sd((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f14130b, this.f14131c, (Runnable) this.f14132e, 3));
                break;
        }
    }

    public x5(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f14130b = z10;
        this.f14131c = z11;
        this.f14132e = runnable;
    }
}
