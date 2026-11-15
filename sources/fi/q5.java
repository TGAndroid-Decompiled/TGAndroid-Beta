package fi;

import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_stories;
public final class q5 implements z10 {
    public final int f12228a;
    public final s6 f12229b;

    public q5(s6 s6Var, int i7) {
        this.f12228a = i7;
        this.f12229b = s6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f12228a) {
            case 0:
                k6 k6Var = (k6) obj;
                s6 s6Var = this.f12229b;
                HashMap hashMap = s6Var.H;
                int i7 = k6Var.f11941e;
                int i10 = k6Var.f11942f;
                long j3 = k6Var.d;
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
                HashMap hashMap3 = s6Var.G[i7];
                if (hashMap3 != null) {
                    hashMap3.remove(Long.valueOf(j3));
                    return;
                }
                return;
            case 1:
                this.f12229b.f12323f = (LongSparseIntArray) obj;
                return;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                s6 s6Var2 = this.f12229b;
                s6Var2.f12330n = false;
                if (tL_stories_allStories != null) {
                    s6Var2.b0(tL_stories_allStories, false, true, false);
                    s6Var2.T(false);
                    s6Var2.T(true);
                    return;
                }
                s6Var2.q();
                s6Var2.W();
                return;
        }
    }
}
