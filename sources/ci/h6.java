package ci;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
public final class h6 implements Utilities.Callback {
    public final int f5397a;
    public final h7 f5398b;

    public h6(h7 h7Var, int i10) {
        this.f5397a = i10;
        this.f5398b = h7Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f5397a) {
            case 0:
                z6 z6Var = (z6) obj;
                h7 h7Var = this.f5398b;
                HashMap hashMap = h7Var.H;
                int i10 = z6Var.e;
                int i11 = z6Var.f6191f;
                long j10 = z6Var.d;
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
                HashMap hashMap3 = h7Var.G[i10];
                if (hashMap3 != null) {
                    hashMap3.remove(Long.valueOf(j10));
                    return;
                }
                return;
            case 1:
                this.f5398b.f5402f = (LongSparseIntArray) obj;
                return;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                h7 h7Var2 = this.f5398b;
                h7Var2.f5409n = false;
                if (tL_stories_allStories != null) {
                    h7Var2.Y(tL_stories_allStories, false, true, false);
                    h7Var2.Q(false);
                    h7Var2.Q(true);
                    return;
                }
                h7Var2.q();
                h7Var2.T();
                return;
        }
    }
}
