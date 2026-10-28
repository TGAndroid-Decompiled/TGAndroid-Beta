package di;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
public final class h6 implements Utilities.Callback {
    public final int f8627a;
    public final h7 f8628b;

    public h6(h7 h7Var, int i10) {
        this.f8627a = i10;
        this.f8628b = h7Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8627a) {
            case 0:
                z6 z6Var = (z6) obj;
                h7 h7Var = this.f8628b;
                HashMap hashMap = h7Var.H;
                int i10 = z6Var.e;
                int i11 = z6Var.f9490f;
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
                this.f8628b.f8632f = (LongSparseIntArray) obj;
                return;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                h7 h7Var2 = this.f8628b;
                h7Var2.f8639n = false;
                if (tL_stories_allStories != null) {
                    h7Var2.b0(tL_stories_allStories, false, true, false);
                    h7Var2.T(false);
                    h7Var2.T(true);
                    return;
                }
                h7Var2.q();
                h7Var2.W();
                return;
        }
    }
}
