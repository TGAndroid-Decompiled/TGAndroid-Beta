package fi;

import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stories;
public final class o5 implements x10 {
    public final int f12329a;
    public final p6 f12330b;

    public o5(p6 p6Var, int i7) {
        this.f12329a = i7;
        this.f12330b = p6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f12329a) {
            case 0:
                h6 h6Var = (h6) obj;
                p6 p6Var = this.f12330b;
                HashMap hashMap = p6Var.H;
                int i7 = h6Var.f12045e;
                int i10 = h6Var.f12046f;
                long j3 = h6Var.d;
                if (i7 == 0 && i10 > 0) {
                    HashMap hashMap2 = (HashMap) hashMap.get(Long.valueOf(j3));
                    if (hashMap2 != null) {
                        hashMap2.remove(Integer.valueOf(i10));
                        if (hashMap2.isEmpty()) {
                            hashMap.remove(Long.valueOf(j3));
                            return;
                        }
                        return;
                    }
                    return;
                }
                HashMap hashMap3 = p6Var.G[i7];
                if (hashMap3 != null) {
                    hashMap3.remove(Long.valueOf(j3));
                    return;
                }
                return;
            case 1:
                this.f12330b.f12389f = (LongSparseIntArray) obj;
                return;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                p6 p6Var2 = this.f12330b;
                p6Var2.f12396n = false;
                if (tL_stories_allStories != null) {
                    p6Var2.b0(tL_stories_allStories, false, true, false);
                    p6Var2.T(false);
                    p6Var2.T(true);
                    return;
                }
                p6Var2.q();
                p6Var2.W();
                return;
        }
    }
}
