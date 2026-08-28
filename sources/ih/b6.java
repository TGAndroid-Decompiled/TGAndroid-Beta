package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.od;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class b6 implements RequestDelegate {
    public final int f11269a = 0;
    public final boolean f11270b;
    public final boolean f11271c;
    public final Object d;
    public final Object f11272e;

    public b6(v6 v6Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z11) {
        this.d = v6Var;
        this.f11270b = z10;
        this.f11272e = tL_stories_getAllStories;
        this.f11271c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f11269a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u5((v6) this.d, this.f11270b, (TL_stories.TL_stories_getAllStories) this.f11272e, tLObject, this.f11271c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new od((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f11270b, this.f11271c, (Runnable) this.f11272e, 3));
                return;
        }
    }

    public b6(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f11270b = z10;
        this.f11271c = z11;
        this.f11272e = runnable;
    }
}
