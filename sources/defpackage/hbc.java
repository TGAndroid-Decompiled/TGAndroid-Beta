package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class hbc implements Runnable {
    public final ibc a;

    public hbc(ibc ibcVar) {
        this.a = ibcVar;
    }

    @Override
    public final void run() {
        ibc ibcVar = this.a;
        int i = ibcVar.a;
        ArrayList arrayList = ibcVar.d;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                tL_stories_getPeerMaxIDs.id.add(uc7.s1(i).j1(((Long) arrayList2.get(i2)).longValue()));
            }
            ConnectionsManager.getInstance(i).sendRequestTyped(tL_stories_getPeerMaxIDs, new ic((byte) 0), new ia7(this, arrayList2, (byte) 17));
        }
    }
}
