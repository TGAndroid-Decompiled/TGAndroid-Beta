package defpackage;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class x4b {
    public int a;
    public View b;

    public x4b() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j, View view, v4b v4bVar) {
        int i = z8c.t0;
        this.a = i;
        this.b = view;
        oc7 r1 = oc7.r1(i);
        r1.N1().g0(j, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = oc7.r1(this.a).i1(j);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_stories_getPeerStories, new js2(this, j, view, v4bVar, r1, (byte) 3));
    }
}
