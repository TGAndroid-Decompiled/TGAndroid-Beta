package fi;

import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class p9 implements Runnable {
    public final q9 f12183a;

    public p9(q9 q9Var) {
        this.f12183a = q9Var;
    }

    @Override
    public final void run() {
        q9 q9Var = this.f12183a;
        int i7 = q9Var.f12238a;
        ArrayList arrayList = q9Var.d;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                tL_stories_getPeerMaxIDs.f28296id.add(np.s1(i7).j1(((Long) arrayList2.get(i10)).longValue()));
            }
            ConnectionsManager.getInstance(i7).sendRequestTyped(tL_stories_getPeerMaxIDs, new d3.b(1), new bi.e4(6, this, arrayList2));
        }
    }
}
