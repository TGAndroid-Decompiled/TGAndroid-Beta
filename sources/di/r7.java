package di;

import android.view.View;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class r7 {
    public int f9716a;
    public View f9717b;

    public r7() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j3, View view, o7 o7Var) {
        int i7 = p10.f24474s0;
        this.f9716a = i7;
        this.f9717b = view;
        qp s12 = qp.s1(i7);
        s12.P1().h0(j3, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = qp.s1(this.f9716a).j1(j3);
        ConnectionsManager.getInstance(this.f9716a).sendRequest(tL_stories_getPeerStories, new bg.g0(this, j3, view, o7Var, s12));
    }
}
