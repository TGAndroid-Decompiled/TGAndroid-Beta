package ih;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class o7 {
    public int f11904a;

    public o7() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j10, View view, l7 l7Var) {
        int i9 = UserConfig.selectedAccount;
        this.f11904a = i9;
        MessagesController messagesController = MessagesController.getInstance(i9);
        messagesController.getStoriesController().e0(j10, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = MessagesController.getInstance(this.f11904a).getInputPeer(j10);
        ConnectionsManager.getInstance(this.f11904a).sendRequest(tL_stories_getPeerStories, new ff.g0(this, j10, view, l7Var, messagesController));
    }
}
