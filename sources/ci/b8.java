package ci;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class b8 {
    public int f5191a;
    public View f5192b;

    public b8() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j10, View view, x7 x7Var) {
        int i10 = UserConfig.selectedAccount;
        this.f5191a = i10;
        this.f5192b = view;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getStoriesController().e0(j10, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = MessagesController.getInstance(this.f5191a).getInputPeer(j10);
        ConnectionsManager.getInstance(this.f5191a).sendRequest(tL_stories_getPeerStories, new a8(this, j10, view, x7Var, messagesController));
    }
}
