package ih;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
public final class y5 implements d5.d {
    public final int f12345a;
    public final v6 f12346b;

    public y5(v6 v6Var, int i9) {
        this.f12345a = i9;
        this.f12346b = v6Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f12345a) {
            case 0:
                this.f12346b.f12240f = (LongSparseIntArray) obj;
                return;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                v6 v6Var = this.f12346b;
                v6Var.f12247n = false;
                if (tL_stories_allStories != null) {
                    v6Var.Y(tL_stories_allStories, false, true, false);
                    v6Var.Q(false);
                    v6Var.Q(true);
                    return;
                }
                v6Var.q();
                v6Var.T();
                return;
        }
    }
}
