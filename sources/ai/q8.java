package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.dd;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class q8 implements RequestDelegate {
    public final int f1621a = 0;
    public final boolean f1622b;
    public final boolean f1623c;
    public final Object d;
    public final Object f1624e;

    public q8(m9 m9Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z11) {
        this.d = m9Var;
        this.f1622b = z10;
        this.f1624e = tL_stories_getAllStories;
        this.f1623c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1621a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c8((m9) this.d, this.f1622b, (TL_stories.TL_stories_getAllStories) this.f1624e, tLObject, this.f1623c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new dd((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f1622b, this.f1623c, (Runnable) this.f1624e, 3));
                return;
        }
    }

    public q8(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f1622b = z10;
        this.f1623c = z11;
        this.f1624e = runnable;
    }
}
