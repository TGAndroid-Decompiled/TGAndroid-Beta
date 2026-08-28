package ih;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class t9 implements Runnable {
    public final u9 f12173a;

    public t9(u9 u9Var) {
        this.f12173a = u9Var;
    }

    @Override
    public final void run() {
        u9 u9Var = this.f12173a;
        int i9 = u9Var.f12213a;
        ArrayList arrayList = u9Var.d;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                tL_stories_getPeerMaxIDs.f22623id.add(MessagesController.getInstance(i9).getInputPeer(((Long) arrayList2.get(i10)).longValue()));
            }
            ConnectionsManager.getInstance(i9).sendRequestTyped(tL_stories_getPeerMaxIDs, new Object(), new bg.y0(7, this, arrayList2));
        }
    }
}
