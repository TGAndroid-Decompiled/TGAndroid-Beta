package defpackage;

import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
public final class n3b implements qac {
    public final byte a;
    public final h4b b;

    public n3b(h4b h4bVar, byte b) {
        this.a = b;
        this.b = h4bVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        h4b h4bVar = this.b;
        switch (b) {
            case 0:
                h4bVar.f = (LongSparseIntArray) obj;
                return;
            case 1:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                h4bVar.n = false;
                if (tL_stories_allStories != null) {
                    h4bVar.a0(tL_stories_allStories, false, true, false);
                    h4bVar.S(false);
                    h4bVar.S(true);
                    return;
                }
                h4bVar.p();
                h4bVar.V();
                return;
            default:
                z3b z3bVar = (z3b) obj;
                HashMap hashMap = h4bVar.H;
                byte b2 = z3bVar.e;
                int i = z3bVar.f;
                long j = z3bVar.d;
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
                HashMap hashMap3 = h4bVar.G[b2];
                if (hashMap3 != null) {
                    hashMap3.remove(Long.valueOf(j));
                    return;
                }
                return;
        }
    }
}
