package defpackage;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class w2b {
    public int a;
    public View b;

    public w2b() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j, View view, u2b u2bVar) {
        int i = y6c.t0;
        this.a = i;
        this.b = view;
        na7 q1 = na7.q1(i);
        q1.M1().g0(j, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = na7.q1(this.a).h1(j);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_stories_getPeerStories, new yq2(this, j, view, u2bVar, q1, (byte) 3));
    }
}
