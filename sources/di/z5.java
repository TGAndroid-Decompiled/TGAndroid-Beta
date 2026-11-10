package di;

import java.util.HashMap;
import org.telegram.messenger.c20;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
public final class z5 implements c20 {
    public final int f9995a;
    public final z6 f9996b;

    public z5(z6 z6Var, int i7) {
        this.f9995a = i7;
        this.f9996b = z6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f9995a) {
            case 0:
                r6 r6Var = (r6) obj;
                z6 z6Var = this.f9996b;
                HashMap hashMap = z6Var.H;
                int i7 = r6Var.f9696e;
                int i10 = r6Var.f9697f;
                long j3 = r6Var.d;
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
                HashMap hashMap3 = z6Var.G[i7];
                if (hashMap3 != null) {
                    hashMap3.remove(Long.valueOf(j3));
                    return;
                }
                return;
            case 1:
                this.f9996b.f10001f = (LongSparseIntArray) obj;
                return;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                z6 z6Var2 = this.f9996b;
                z6Var2.f10008n = false;
                if (tL_stories_allStories != null) {
                    z6Var2.b0(tL_stories_allStories, false, true, false);
                    z6Var2.T(false);
                    z6Var2.T(true);
                    return;
                }
                z6Var2.q();
                z6Var2.W();
                return;
        }
    }
}
