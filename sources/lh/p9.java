package lh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class p9 implements Runnable {
    public final q9 f16098a;

    public p9(q9 q9Var) {
        this.f16098a = q9Var;
    }

    @Override
    public final void run() {
        q9 q9Var = this.f16098a;
        int i10 = q9Var.f16139a;
        ArrayList arrayList = q9Var.d;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                tL_stories_getPeerMaxIDs.f22635id.add(MessagesController.getInstance(i10).getInputPeer(((Long) arrayList2.get(i11)).longValue()));
            }
            ConnectionsManager.getInstance(i10).sendRequestTyped(tL_stories_getPeerMaxIDs, new Object(), new bh.v(8, this, arrayList2));
        }
    }
}
