package jh;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;

public final class u5 implements d5.d {

    public final int f14029a;

    public final s6 f14030b;

    public u5(s6 s6Var, int i10) {
        this.f14029a = i10;
        this.f14030b = s6Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f14029a) {
            case 0:
                this.f14030b.f13959f = (LongSparseIntArray) obj;
                break;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                s6 s6Var = this.f14030b;
                s6Var.f13966n = false;
                if (tL_stories_allStories == null) {
                    s6Var.q();
                    s6Var.T();
                } else {
                    s6Var.Y(tL_stories_allStories, false, true, false);
                    s6Var.Q(false);
                    s6Var.Q(true);
                }
                break;
        }
    }
}
