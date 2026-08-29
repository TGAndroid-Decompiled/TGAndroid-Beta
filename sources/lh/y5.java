package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.vd;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class y5 implements RequestDelegate {
    public final int f16418a = 0;
    public final boolean f16419b;
    public final boolean f16420c;
    public final Object d;
    public final Object f16421e;

    public y5(s6 s6Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z11) {
        this.d = s6Var;
        this.f16419b = z10;
        this.f16421e = tL_stories_getAllStories;
        this.f16420c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16418a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ag.z0((s6) this.d, this.f16419b, (TL_stories.TL_stories_getAllStories) this.f16421e, tLObject, this.f16420c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new vd((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f16419b, this.f16420c, (Runnable) this.f16421e, 3));
                return;
        }
    }

    public y5(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f16419b = z10;
        this.f16420c = z11;
        this.f16421e = runnable;
    }
}
