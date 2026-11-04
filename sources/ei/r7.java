package ei;

import android.view.View;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class r7 {
    public int f10893a;
    public View f10894b;

    public r7() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j10, View view, o7 o7Var) {
        int i3 = h10.f22829t0;
        this.f10893a = i3;
        this.f10894b = view;
        hp s12 = hp.s1(i3);
        s12.P1().h0(j10, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = hp.s1(this.f10893a).j1(j10);
        ConnectionsManager.getInstance(this.f10893a).sendRequest(tL_stories_getPeerStories, new cg.f0(this, j10, view, o7Var, s12));
    }
}
