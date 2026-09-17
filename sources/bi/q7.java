package bi;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
public final class q7 implements e2.h {
    public final int f3612a;
    public final u8 f3613b;

    public q7(u8 u8Var, int i10) {
        this.f3612a = i10;
        this.f3613b = u8Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f3612a) {
            case 0:
                this.f3613b.f3809f = (LongSparseIntArray) obj;
                return;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                u8 u8Var = this.f3613b;
                u8Var.f3816n = false;
                if (tL_stories_allStories != null) {
                    u8Var.Y(tL_stories_allStories, false, true, false);
                    u8Var.Q(false);
                    u8Var.Q(true);
                    return;
                }
                u8Var.q();
                u8Var.T();
                return;
        }
    }
}
