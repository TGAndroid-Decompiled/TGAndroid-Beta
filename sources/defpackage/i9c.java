package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class i9c implements Runnable {
    public final j9c a;

    public i9c(j9c j9cVar) {
        this.a = j9cVar;
    }

    @Override
    public final void run() {
        j9c j9cVar = this.a;
        int i = j9cVar.a;
        ArrayList arrayList = j9cVar.d;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                tL_stories_getPeerMaxIDs.id.add(oc7.r1(i).i1(((Long) arrayList2.get(i2)).longValue()));
            }
            ConnectionsManager.getInstance(i).sendRequestTyped(tL_stories_getPeerMaxIDs, new kc((byte) 0), new s87(this, arrayList2, (byte) 19));
        }
    }
}
