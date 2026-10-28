package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.kd;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class o6 implements RequestDelegate {
    public final int f8879a = 0;
    public final boolean f8880b;
    public final boolean f8881c;
    public final Object d;
    public final Object e;

    public o6(h7 h7Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z11) {
        this.d = h7Var;
        this.f8880b = z10;
        this.e = tL_stories_getAllStories;
        this.f8881c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8879a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i6((h7) this.d, this.f8880b, (TL_stories.TL_stories_getAllStories) this.e, tLObject, this.f8881c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new kd((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f8880b, this.f8881c, (Runnable) this.e, 3));
                return;
        }
    }

    public o6(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f8880b = z10;
        this.f8881c = z11;
        this.e = runnable;
    }
}
