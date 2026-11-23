package fi;

import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class m9 implements Runnable {
    public final n9 f12273a;

    public m9(n9 n9Var) {
        this.f12273a = n9Var;
    }

    @Override
    public final void run() {
        n9 n9Var = this.f12273a;
        int i7 = n9Var.f12306a;
        ArrayList arrayList = n9Var.d;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                tL_stories_getPeerMaxIDs.f28643id.add(np.u1(i7).l1(((Long) arrayList2.get(i10)).longValue()));
            }
            ConnectionsManager.getInstance(i7).sendRequestTyped(tL_stories_getPeerMaxIDs, new d3.b(1), new bi.r6(8, this, arrayList2));
        }
    }
}
