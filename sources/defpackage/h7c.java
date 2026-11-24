package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class h7c implements Runnable {
    public final i7c a;

    public h7c(i7c i7cVar) {
        this.a = i7cVar;
    }

    @Override
    public final void run() {
        i7c i7cVar = this.a;
        int i = i7cVar.a;
        ArrayList arrayList = i7cVar.d;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                tL_stories_getPeerMaxIDs.id.add(na7.q1(i).h1(((Long) arrayList2.get(i2)).longValue()));
            }
            ConnectionsManager.getInstance(i).sendRequestTyped(tL_stories_getPeerMaxIDs, new hc((byte) 0), new w77(this, arrayList2, (byte) 17));
        }
    }
}
