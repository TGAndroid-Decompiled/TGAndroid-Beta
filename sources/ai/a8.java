package ai;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;
public final class a8 implements Utilities.Callback {
    public final int f646a;
    public final m9 f647b;

    public a8(m9 m9Var, int i10) {
        this.f646a = i10;
        this.f647b = m9Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f646a) {
            case 0:
                e9 e9Var = (e9) obj;
                m9 m9Var = this.f647b;
                HashMap hashMap = m9Var.H;
                int i10 = e9Var.f896e;
                int i11 = e9Var.f897f;
                long j3 = e9Var.d;
                if (i10 == 0 && i11 > 0) {
                    HashMap hashMap2 = (HashMap) hashMap.get(Long.valueOf(j3));
                    if (hashMap2 != null) {
                        hashMap2.remove(Integer.valueOf(i11));
                        if (hashMap2.isEmpty()) {
                            hashMap.remove(Long.valueOf(j3));
                            return;
                        }
                        return;
                    }
                    return;
                }
                HashMap hashMap3 = m9Var.G[i10];
                if (hashMap3 != null) {
                    hashMap3.remove(Long.valueOf(j3));
                    return;
                }
                return;
            case 1:
                this.f647b.f1410f = (LongSparseIntArray) obj;
                return;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                m9 m9Var2 = this.f647b;
                m9Var2.f1417n = false;
                if (tL_stories_allStories != null) {
                    m9Var2.Y(tL_stories_allStories, false, true, false);
                    m9Var2.Q(false);
                    m9Var2.Q(true);
                    return;
                }
                m9Var2.q();
                m9Var2.T();
                return;
        }
    }
}
