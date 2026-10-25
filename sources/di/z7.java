package di;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class z7 {
    public int f9510a;
    public View f9511b;

    public z7() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j10, View view, w7 w7Var) {
        int i10 = UserConfig.selectedAccount;
        this.f9510a = i10;
        this.f9511b = view;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getStoriesController().e0(j10, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = MessagesController.getInstance(this.f9510a).getInputPeer(j10);
        ConnectionsManager.getInstance(this.f9510a).sendRequest(tL_stories_getPeerStories, new ag.l0(this, j10, view, w7Var, messagesController));
    }
}
