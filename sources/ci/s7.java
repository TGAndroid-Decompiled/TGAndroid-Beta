package ci;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
public final class s7 implements Runnable {
    public final int f5931a;
    public final v7 f5932b;
    public final TL_stories.PeerStories f5933c;

    public s7(v7 v7Var, TL_stories.PeerStories peerStories, int i10) {
        this.f5931a = i10;
        this.f5932b = v7Var;
        this.f5933c = peerStories;
    }

    @Override
    public final void run() {
        switch (this.f5931a) {
            case 0:
                v7 v7Var = this.f5932b;
                v7Var.getClass();
                TL_stories.PeerStories peerStories = this.f5933c;
                v7Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                return;
            default:
                v7 v7Var2 = this.f5932b;
                v7Var2.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.f5933c;
                    if (i10 < peerStories2.stories.size()) {
                        v7Var2.l(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i10));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
