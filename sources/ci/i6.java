package ci;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Utilities.Callback {
    public final int f5491a;
    public final i7 f5492b;

    public i6(i7 i7Var, int i10) {
        this.f5491a = i10;
        this.f5492b = i7Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f5491a) {
            case 0:
                a7 a7Var = (a7) obj;
                i7 i7Var = this.f5492b;
                HashMap hashMap = i7Var.H;
                int i10 = a7Var.e;
                int i11 = a7Var.f5149f;
                long j10 = a7Var.d;
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
                HashMap hashMap3 = i7Var.G[i10];
                if (hashMap3 != null) {
                    hashMap3.remove(Long.valueOf(j10));
                    return;
                }
                return;
            case 1:
                this.f5492b.f5496f = (LongSparseIntArray) obj;
                return;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                i7 i7Var2 = this.f5492b;
                i7Var2.f5503n = false;
                if (tL_stories_allStories != null) {
                    i7Var2.Y(tL_stories_allStories, false, true, false);
                    i7Var2.Q(false);
                    i7Var2.Q(true);
                    return;
                }
                i7Var2.q();
                i7Var2.T();
                return;
        }
    }
}
