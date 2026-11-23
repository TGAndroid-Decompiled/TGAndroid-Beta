package fi;

import android.view.View;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class h7 {
    public int f12057a;
    public View f12058b;

    public h7() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j3, View view, e7 e7Var) {
        int i7 = k10.f24932t0;
        this.f12057a = i7;
        this.f12058b = view;
        np u12 = np.u1(i7);
        u12.R1().h0(j3, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = np.u1(this.f12057a).l1(j3);
        ConnectionsManager.getInstance(this.f12057a).sendRequest(tL_stories_getPeerStories, new bg.h0(this, j3, view, e7Var, u12));
    }
}
