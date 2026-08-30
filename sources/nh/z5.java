package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wd;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class z5 implements RequestDelegate {
    public final int f16120a = 0;
    public final boolean f16121b;
    public final boolean f16122c;
    public final Object d;
    public final Object e;

    public z5(t6 t6Var, boolean z4, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z10) {
        this.d = t6Var;
        this.f16121b = z4;
        this.e = tL_stories_getAllStories;
        this.f16122c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16120a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cg.x0((t6) this.d, this.f16121b, (TL_stories.TL_stories_getAllStories) this.e, tLObject, this.f16122c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wd((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f16121b, this.f16122c, (Runnable) this.e, 3));
                return;
        }
    }

    public z5(TwoStepVerificationActivity twoStepVerificationActivity, boolean z4, boolean z10, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f16121b = z4;
        this.f16122c = z10;
        this.e = runnable;
    }
}
