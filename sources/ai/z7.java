package ai;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
public final class z7 implements Utilities.Callback {
    public final int f1782a;
    public final l9 f1783b;

    public z7(l9 l9Var, int i10) {
        this.f1782a = i10;
        this.f1783b = l9Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1782a) {
            case 0:
                d9 d9Var = (d9) obj;
                l9 l9Var = this.f1783b;
                HashMap hashMap = l9Var.H;
                int i10 = d9Var.e;
                int i11 = d9Var.f723f;
                long j3 = d9Var.d;
                if (i10 == 0 && i11 > 0) {
                    HashMap hashMap2 = (HashMap) hashMap.get(Long.valueOf(j3));
                    if (hashMap2 != null) {
                        hashMap2.remove(Integer.valueOf(i11));
                        if (hashMap2.isEmpty()) {
                            hashMap.remove(Long.valueOf(j3));
                            return;
                        }
                        return;
                    }
                    return;
                }
                HashMap hashMap3 = l9Var.G[i10];
                if (hashMap3 != null) {
                    hashMap3.remove(Long.valueOf(j3));
                    return;
                }
                return;
            case 1:
                this.f1783b.f1195f = (LongSparseIntArray) obj;
                return;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                l9 l9Var2 = this.f1783b;
                l9Var2.f1202n = false;
                if (tL_stories_allStories != null) {
                    l9Var2.Y(tL_stories_allStories, false, true, false);
                    l9Var2.Q(false);
                    l9Var2.Q(true);
                    return;
                }
                l9Var2.q();
                l9Var2.T();
                return;
        }
    }
}
