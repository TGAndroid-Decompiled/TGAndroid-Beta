package defpackage;

import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
public final class l1b implements p8c {
    public final byte a;
    public final g2b b;

    public l1b(g2b g2bVar, byte b) {
        this.a = b;
        this.b = g2bVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        g2b g2bVar = this.b;
        switch (b) {
            case 0:
                g2bVar.f = (LongSparseIntArray) obj;
                return;
            case 1:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                g2bVar.n = false;
                if (tL_stories_allStories != null) {
                    g2bVar.a0(tL_stories_allStories, false, true, false);
                    g2bVar.S(false);
                    g2bVar.S(true);
                    return;
                }
                g2bVar.p();
                g2bVar.V();
                return;
            default:
                y1b y1bVar = (y1b) obj;
                HashMap hashMap = g2bVar.H;
                byte b2 = y1bVar.e;
                int i = y1bVar.f;
                long j = y1bVar.d;
                if (b2 == 0 && i > 0) {
                    HashMap hashMap2 = (HashMap) hashMap.get(Long.valueOf(j));
                    if (hashMap2 != null) {
                        hashMap2.remove(Integer.valueOf(i));
                        if (hashMap2.isEmpty()) {
                            hashMap.remove(Long.valueOf(j));
                            return;
                        }
                        return;
                    }
                    return;
                }
                HashMap hashMap3 = g2bVar.G[b2];
                if (hashMap3 != null) {
                    hashMap3.remove(Long.valueOf(j));
                    return;
                }
                return;
        }
    }
}
