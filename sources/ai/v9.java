package ai;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
public final class v9 implements Runnable {
    public final int f1613a;
    public final y9 f1614b;
    public final TL_stories.PeerStories f1615c;

    public v9(y9 y9Var, TL_stories.PeerStories peerStories, int i10) {
        this.f1613a = i10;
        this.f1614b = y9Var;
        this.f1615c = peerStories;
    }

    @Override
    public final void run() {
        switch (this.f1613a) {
            case 0:
                y9 y9Var = this.f1614b;
                y9Var.getClass();
                TL_stories.PeerStories peerStories = this.f1615c;
                y9Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                return;
            default:
                y9 y9Var2 = this.f1614b;
                y9Var2.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.f1615c;
                    if (i10 < peerStories2.stories.size()) {
                        y9Var2.l(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i10));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
