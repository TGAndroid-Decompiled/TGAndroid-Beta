package fi;

import android.view.View;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class h7 {
    public int f12068a;
    public View f12069b;

    public h7() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j3, View view, e7 e7Var) {
        int i7 = i10.f24637t0;
        this.f12068a = i7;
        this.f12069b = view;
        mp u12 = mp.u1(i7);
        u12.R1().h0(j3, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = mp.u1(this.f12068a).l1(j3);
        ConnectionsManager.getInstance(this.f12068a).sendRequest(tL_stories_getPeerStories, new bg.h0(this, j3, view, e7Var, u12));
    }
}
