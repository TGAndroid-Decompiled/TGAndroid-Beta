package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class l5b implements RequestDelegate {
    public final byte a = 0;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final Object e;

    public l5b(c6b c6bVar, boolean z, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z2) {
        this.d = c6bVar;
        this.b = z;
        this.e = tL_stories_getAllStories;
        this.c = z2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                hl.c3(new my6((c6b) obj2, this.b, (TL_stories.TL_stories_getAllStories) obj, tLObject, this.c));
                return;
            default:
                hl.c3(new ma7((TwoStepVerificationActivity) obj2, tL_error, tLObject, this.b, this.c, (Runnable) obj, (byte) 3));
                return;
        }
    }

    public l5b(TwoStepVerificationActivity twoStepVerificationActivity, boolean z, boolean z2, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.b = z;
        this.c = z2;
        this.e = runnable;
    }
}
