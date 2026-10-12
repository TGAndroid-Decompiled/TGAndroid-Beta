package bi;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class zb implements Runnable {
    public final ac f4075a;

    public zb(ac acVar) {
        this.f4075a = acVar;
    }

    @Override
    public final void run() {
        ac acVar = this.f4075a;
        int i10 = acVar.f2841a;
        ArrayList arrayList = acVar.d;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                tL_stories_getPeerMaxIDs.f19457id.add(MessagesController.getInstance(i10).getInputPeer(((Long) arrayList2.get(i11)).longValue()));
            }
            ConnectionsManager.getInstance(i10).sendRequestTyped(tL_stories_getPeerMaxIDs, new Object(), new f0(1, this, arrayList2));
        }
    }
}
