package di;

import java.util.HashMap;
import org.telegram.messenger.c20;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
public final class y5 implements c20 {
    public final int f9961a;
    public final y6 f9962b;

    public y5(y6 y6Var, int i7) {
        this.f9961a = i7;
        this.f9962b = y6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f9961a) {
            case 0:
                q6 q6Var = (q6) obj;
                y6 y6Var = this.f9962b;
                HashMap hashMap = y6Var.H;
                int i7 = q6Var.f9640e;
                int i10 = q6Var.f9641f;
                long j3 = q6Var.d;
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
                HashMap hashMap3 = y6Var.G[i7];
                if (hashMap3 != null) {
                    hashMap3.remove(Long.valueOf(j3));
                    return;
                }
                return;
            case 1:
                this.f9962b.f9967f = (LongSparseIntArray) obj;
                return;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                y6 y6Var2 = this.f9962b;
                y6Var2.f9974n = false;
                if (tL_stories_allStories != null) {
                    y6Var2.b0(tL_stories_allStories, false, true, false);
                    y6Var2.T(false);
                    y6Var2.T(true);
                    return;
                }
                y6Var2.q();
                y6Var2.W();
                return;
        }
    }
}
