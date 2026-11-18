package fi;

import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class m9 implements Runnable {
    public final n9 f12278a;

    public m9(n9 n9Var) {
        this.f12278a = n9Var;
    }

    @Override
    public final void run() {
        n9 n9Var = this.f12278a;
        int i7 = n9Var.f12311a;
        ArrayList arrayList = n9Var.d;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                tL_stories_getPeerMaxIDs.f28648id.add(mp.u1(i7).l1(((Long) arrayList2.get(i10)).longValue()));
            }
            ConnectionsManager.getInstance(i7).sendRequestTyped(tL_stories_getPeerMaxIDs, new d3.b(1), new bi.l6(8, this, arrayList2));
        }
    }
}
