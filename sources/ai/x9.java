package ai;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
public final class x9 implements Runnable {
    public final int f1914a;
    public final z9 f1915b;
    public final TL_stories.PeerStories f1916c;

    public x9(z9 z9Var, TL_stories.PeerStories peerStories, int i10) {
        this.f1914a = i10;
        this.f1915b = z9Var;
        this.f1916c = peerStories;
    }

    @Override
    public final void run() {
        switch (this.f1914a) {
            case 0:
                z9 z9Var = this.f1915b;
                z9Var.getClass();
                TL_stories.PeerStories peerStories = this.f1916c;
                z9Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                return;
            default:
                z9 z9Var2 = this.f1915b;
                z9Var2.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.f1916c;
                    if (i10 < peerStories2.stories.size()) {
                        z9Var2.l(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i10));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
