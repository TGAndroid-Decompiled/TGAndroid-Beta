package bi;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
public final class l7 implements Utilities.Callback {
    public final int f3282a;
    public final x8 f3283b;

    public l7(x8 x8Var, int i10) {
        this.f3282a = i10;
        this.f3283b = x8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f3282a) {
            case 0:
                o8 o8Var = (o8) obj;
                x8 x8Var = this.f3283b;
                HashMap hashMap = x8Var.H;
                int i10 = o8Var.e;
                int i11 = o8Var.f3431f;
                long j10 = o8Var.d;
                if (i10 == 0 && i11 > 0) {
                    HashMap hashMap2 = (HashMap) hashMap.get(Long.valueOf(j10));
                    if (hashMap2 != null) {
                        hashMap2.remove(Integer.valueOf(i11));
                        if (hashMap2.isEmpty()) {
                            hashMap.remove(Long.valueOf(j10));
                            return;
                        }
                        return;
                    }
                    return;
                }
                HashMap hashMap3 = x8Var.G[i10];
                if (hashMap3 != null) {
                    hashMap3.remove(Long.valueOf(j10));
                    return;
                }
                return;
            case 1:
                this.f3283b.f3969f = (LongSparseIntArray) obj;
                return;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                x8 x8Var2 = this.f3283b;
                x8Var2.f3976n = false;
                if (tL_stories_allStories != null) {
                    x8Var2.Y(tL_stories_allStories, false, true, false);
                    x8Var2.Q(false);
                    x8Var2.Q(true);
                    return;
                }
                x8Var2.q();
                x8Var2.T();
                return;
        }
    }
}
