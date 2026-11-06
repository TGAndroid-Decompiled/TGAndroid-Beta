package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class f6 implements RequestDelegate {
    public final int f8999a = 0;
    public final boolean f9000b;
    public final boolean f9001c;
    public final Object d;
    public final Object f9002e;

    public f6(y6 y6Var, boolean z9, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z10) {
        this.d = y6Var;
        this.f9000b = z9;
        this.f9002e = tL_stories_getAllStories;
        this.f9001c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8999a) {
            case 0:
                org.telegram.messenger.g0.h3(new z5((y6) this.d, this.f9000b, (TL_stories.TL_stories_getAllStories) this.f9002e, tLObject, this.f9001c));
                return;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.q((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f9000b, this.f9001c, (Runnable) this.f9002e));
                return;
        }
    }

    public f6(TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, boolean z10, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f9000b = z9;
        this.f9001c = z10;
        this.f9002e = runnable;
    }
}
