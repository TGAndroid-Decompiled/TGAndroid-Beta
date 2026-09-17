package ai;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
public final class h8 implements e2.h {
    public final int f953a;
    public final l9 f954b;

    public h8(l9 l9Var, int i10) {
        this.f953a = i10;
        this.f954b = l9Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f953a) {
            case 0:
                this.f954b.f1196f = (LongSparseIntArray) obj;
                return;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                l9 l9Var = this.f954b;
                l9Var.f1203n = false;
                if (tL_stories_allStories != null) {
                    l9Var.Y(tL_stories_allStories, false, true, false);
                    l9Var.Q(false);
                    l9Var.Q(true);
                    return;
                }
                l9Var.q();
                l9Var.T();
                return;
        }
    }
}
