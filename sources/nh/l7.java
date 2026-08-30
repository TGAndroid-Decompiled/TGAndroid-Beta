package nh;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class l7 {
    public int f15597a;

    public l7() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j10, View view, i7 i7Var) {
        int i10 = UserConfig.selectedAccount;
        this.f15597a = i10;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getStoriesController().e0(j10, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = MessagesController.getInstance(this.f15597a).getInputPeer(j10);
        ConnectionsManager.getInstance(this.f15597a).sendRequest(tL_stories_getPeerStories, new lf.f0(this, j10, view, i7Var, messagesController));
    }
}
