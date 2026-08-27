package jh;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

public final class k7 {

    public int f13591a;

    public k7() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j10, View view, h7 h7Var) {
        int i10 = UserConfig.selectedAccount;
        this.f13591a = i10;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getStoriesController().e0(j10, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = MessagesController.getInstance(this.f13591a).getInputPeer(j10);
        ConnectionsManager.getInstance(this.f13591a).sendRequest(tL_stories_getPeerStories, new gf.g0(this, j10, view, h7Var, messagesController));
    }
}
