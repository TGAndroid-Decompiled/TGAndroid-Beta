package di;

import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class x9 implements Runnable {
    public final y9 f9939a;

    public x9(y9 y9Var) {
        this.f9939a = y9Var;
    }

    @Override
    public final void run() {
        y9 y9Var = this.f9939a;
        int i7 = y9Var.f9977a;
        ArrayList arrayList = y9Var.d;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                tL_stories_getPeerMaxIDs.f27201id.add(qp.s1(i7).j1(((Long) arrayList2.get(i10)).longValue()));
            }
            ConnectionsManager.getInstance(i7).sendRequestTyped(tL_stories_getPeerMaxIDs, new d3.b(1), new bi.p5(5, this, arrayList2));
        }
    }
}
