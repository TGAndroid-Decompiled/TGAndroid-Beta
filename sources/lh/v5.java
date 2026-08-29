package lh;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
public final class v5 implements f5.d {
    public final int f16313a;
    public final s6 f16314b;

    public v5(s6 s6Var, int i10) {
        this.f16313a = i10;
        this.f16314b = s6Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f16313a) {
            case 0:
                this.f16314b.f16222f = (LongSparseIntArray) obj;
                return;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                s6 s6Var = this.f16314b;
                s6Var.f16229n = false;
                if (tL_stories_allStories != null) {
                    s6Var.Y(tL_stories_allStories, false, true, false);
                    s6Var.Q(false);
                    s6Var.Q(true);
                    return;
                }
                s6Var.q();
                s6Var.T();
                return;
        }
    }
}
