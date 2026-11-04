package ei;

import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class y9 implements Runnable {
    public final z9 f11252a;

    public y9(z9 z9Var) {
        this.f11252a = z9Var;
    }

    @Override
    public final void run() {
        z9 z9Var = this.f11252a;
        int i3 = z9Var.f11303a;
        ArrayList arrayList = z9Var.d;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                tL_stories_getPeerMaxIDs.f27246id.add(hp.s1(i3).j1(((Long) arrayList2.get(i10)).longValue()));
            }
            ConnectionsManager.getInstance(i3).sendRequestTyped(tL_stories_getPeerMaxIDs, new c3.b(1), new ai.q4(6, this, arrayList2));
        }
    }
}
