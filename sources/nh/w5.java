package nh;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
public final class w5 implements h5.d {
    public final int f16010a;
    public final t6 f16011b;

    public w5(t6 t6Var, int i10) {
        this.f16010a = i10;
        this.f16011b = t6Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f16010a) {
            case 0:
                this.f16011b.f15900f = (LongSparseIntArray) obj;
                return;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                t6 t6Var = this.f16011b;
                t6Var.f15907n = false;
                if (tL_stories_allStories != null) {
                    t6Var.Y(tL_stories_allStories, false, true, false);
                    t6Var.Q(false);
                    t6Var.Q(true);
                    return;
                }
                t6Var.q();
                t6Var.T();
                return;
        }
    }
}
