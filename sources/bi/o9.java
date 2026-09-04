package bi;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class o9 {
    public int f3488a;

    public o9() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j3, View view, j9 j9Var) {
        int i10 = UserConfig.selectedAccount;
        this.f3488a = i10;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getStoriesController().e0(j3, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = MessagesController.getInstance(this.f3488a).getInputPeer(j3);
        ConnectionsManager.getInstance(this.f3488a).sendRequest(tL_stories_getPeerStories, new m9(this, j3, view, j9Var, messagesController));
    }
}
