package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.gd;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class o6 implements RequestDelegate {
    public final int f5637a = 0;
    public final boolean f5638b;
    public final boolean f5639c;
    public final Object d;
    public final Object e;

    public o6(h7 h7Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z11) {
        this.d = h7Var;
        this.f5638b = z10;
        this.e = tL_stories_getAllStories;
        this.f5639c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5637a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i6((h7) this.d, this.f5638b, (TL_stories.TL_stories_getAllStories) this.e, tLObject, this.f5639c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gd((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f5638b, this.f5639c, (Runnable) this.e, 3));
                return;
        }
    }

    public o6(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f5638b = z10;
        this.f5639c = z11;
        this.e = runnable;
    }
}
