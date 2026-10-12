package ai;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class ia {
    public int f1158a;
    public View f1159b;

    public ia() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j3, View view, da daVar) {
        int i10 = UserConfig.selectedAccount;
        this.f1158a = i10;
        this.f1159b = view;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getStoriesController().e0(j3, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = MessagesController.getInstance(this.f1158a).getInputPeer(j3);
        ConnectionsManager.getInstance(this.f1158a).sendRequest(tL_stories_getPeerStories, new ga(this, j3, view, daVar, messagesController));
    }
}
