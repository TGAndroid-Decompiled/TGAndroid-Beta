package ai;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
public final class v9 implements Runnable {
    public final int f1611a;
    public final y9 f1612b;
    public final TL_stories.PeerStories f1613c;

    public v9(y9 y9Var, TL_stories.PeerStories peerStories, int i10) {
        this.f1611a = i10;
        this.f1612b = y9Var;
        this.f1613c = peerStories;
    }

    @Override
    public final void run() {
        switch (this.f1611a) {
            case 0:
                y9 y9Var = this.f1612b;
                y9Var.getClass();
                TL_stories.PeerStories peerStories = this.f1613c;
                y9Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                return;
            default:
                y9 y9Var2 = this.f1612b;
                y9Var2.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.f1613c;
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
