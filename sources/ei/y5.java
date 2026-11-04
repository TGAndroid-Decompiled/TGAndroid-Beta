package ei;

import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_stories;
public final class y5 implements u10 {
    public final int f11232a;
    public final z6 f11233b;

    public y5(z6 z6Var, int i3) {
        this.f11232a = i3;
        this.f11233b = z6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f11232a) {
            case 0:
                r6 r6Var = (r6) obj;
                z6 z6Var = this.f11233b;
                HashMap hashMap = z6Var.H;
                int i3 = r6Var.f10873e;
                int i10 = r6Var.f10874f;
                long j10 = r6Var.d;
                if (i3 == 0 && i10 > 0) {
                    HashMap hashMap2 = (HashMap) hashMap.get(Long.valueOf(j10));
                    if (hashMap2 != null) {
                        hashMap2.remove(Integer.valueOf(i10));
                        if (hashMap2.isEmpty()) {
                            hashMap.remove(Long.valueOf(j10));
                            return;
                        }
                        return;
                    }
                    return;
                }
                HashMap hashMap3 = z6Var.G[i3];
                if (hashMap3 != null) {
                    hashMap3.remove(Long.valueOf(j10));
                    return;
                }
                return;
            case 1:
                this.f11233b.f11278f = (LongSparseIntArray) obj;
                return;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                z6 z6Var2 = this.f11233b;
                z6Var2.f11285n = false;
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
