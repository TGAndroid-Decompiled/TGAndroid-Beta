package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.td;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class o8 implements RequestDelegate {
    public final int f1353a = 0;
    public final boolean f1354b;
    public final boolean f1355c;
    public final Object d;
    public final Object e;

    public o8(l9 l9Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z11) {
        this.d = l9Var;
        this.f1354b = z10;
        this.e = tL_stories_getAllStories;
        this.f1355c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1353a) {
            case 0:
                AndroidUtilities.runOnUIThread(new z7((l9) this.d, this.f1354b, (TL_stories.TL_stories_getAllStories) this.e, tLObject, this.f1355c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new td((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f1354b, this.f1355c, (Runnable) this.e, 3));
                return;
        }
    }

    public o8(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f1354b = z10;
        this.f1355c = z11;
        this.e = runnable;
    }
}
