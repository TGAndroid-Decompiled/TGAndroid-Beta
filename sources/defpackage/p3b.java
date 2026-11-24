package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;
public final class p3b implements RequestDelegate {
    public final byte a = 0;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final Object e;

    public p3b(h4b h4bVar, boolean z, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z2) {
        this.d = h4bVar;
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
                gm.c3(new hy6((h4b) obj2, this.b, (TL_stories.TL_stories_getAllStories) obj, tLObject, this.c));
                return;
            default:
                gm.c3(new ea7((TwoStepVerificationActivity) obj2, tL_error, tLObject, this.b, this.c, (Runnable) obj, (byte) 3));
                return;
        }
    }

    public p3b(TwoStepVerificationActivity twoStepVerificationActivity, boolean z, boolean z2, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.b = z;
        this.c = z2;
        this.e = runnable;
    }
}
