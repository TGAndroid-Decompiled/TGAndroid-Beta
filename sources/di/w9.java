package di;

import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class w9 implements Runnable {
    public final x9 f9914a;

    public w9(x9 x9Var) {
        this.f9914a = x9Var;
    }

    @Override
    public final void run() {
        x9 x9Var = this.f9914a;
        int i7 = x9Var.f9946a;
        ArrayList arrayList = x9Var.d;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                tL_stories_getPeerMaxIDs.f27197id.add(qp.s1(i7).j1(((Long) arrayList2.get(i10)).longValue()));
            }
            ConnectionsManager.getInstance(i7).sendRequestTyped(tL_stories_getPeerMaxIDs, new d3.b(1), new bi.p5(5, this, arrayList2));
        }
    }
}
