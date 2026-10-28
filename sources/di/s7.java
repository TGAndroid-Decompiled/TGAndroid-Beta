package di;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
public final class s7 implements Runnable {
    public final int f9171a;
    public final u7 f9172b;
    public final TL_stories.PeerStories f9173c;

    public s7(u7 u7Var, TL_stories.PeerStories peerStories, int i10) {
        this.f9171a = i10;
        this.f9172b = u7Var;
        this.f9173c = peerStories;
    }

    @Override
    public final void run() {
        switch (this.f9171a) {
            case 0:
                u7 u7Var = this.f9172b;
                u7Var.getClass();
                TL_stories.PeerStories peerStories = this.f9173c;
                u7Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                return;
            default:
                u7 u7Var2 = this.f9172b;
                u7Var2.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.f9173c;
                    if (i10 < peerStories2.stories.size()) {
                        u7Var2.l(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i10));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
