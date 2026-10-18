package ci;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class c8 {
    public int f5293a;
    public View f5294b;

    public c8() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j10, View view, y7 y7Var) {
        int i10 = UserConfig.selectedAccount;
        this.f5293a = i10;
        this.f5294b = view;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getStoriesController().e0(j10, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = MessagesController.getInstance(this.f5293a).getInputPeer(j10);
        ConnectionsManager.getInstance(this.f5293a).sendRequest(tL_stories_getPeerStories, new b8(this, j10, view, y7Var, messagesController));
    }
}
