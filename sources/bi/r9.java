package bi;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class r9 {
    public int f3617a;
    public View f3618b;

    public r9() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j10, View view, m9 m9Var) {
        int i10 = UserConfig.selectedAccount;
        this.f3617a = i10;
        this.f3618b = view;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getStoriesController().e0(j10, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = MessagesController.getInstance(this.f3617a).getInputPeer(j10);
        ConnectionsManager.getInstance(this.f3617a).sendRequest(tL_stories_getPeerStories, new p9(this, j10, view, m9Var, messagesController));
    }
}
