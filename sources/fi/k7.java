package fi;

import android.view.View;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class k7 {
    public int f11961a;
    public View f11962b;

    public k7() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j3, View view, h7 h7Var) {
        int i7 = m10.f24940t0;
        this.f11961a = i7;
        this.f11962b = view;
        np s12 = np.s1(i7);
        s12.P1().h0(j3, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = np.s1(this.f11961a).j1(j3);
        ConnectionsManager.getInstance(this.f11961a).sendRequest(tL_stories_getPeerStories, new bg.g0(this, j3, view, h7Var, s12));
    }
}
