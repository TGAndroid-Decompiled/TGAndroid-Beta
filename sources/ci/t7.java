package ci;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
public final class t7 implements Runnable {
    public final int f6022a;
    public final w7 f6023b;
    public final TL_stories.PeerStories f6024c;

    public t7(w7 w7Var, TL_stories.PeerStories peerStories, int i10) {
        this.f6022a = i10;
        this.f6023b = w7Var;
        this.f6024c = peerStories;
    }

    @Override
    public final void run() {
        switch (this.f6022a) {
            case 0:
                w7 w7Var = this.f6023b;
                w7Var.getClass();
                TL_stories.PeerStories peerStories = this.f6024c;
                w7Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                return;
            default:
                w7 w7Var2 = this.f6023b;
                w7Var2.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.f6024c;
                    if (i10 < peerStories2.stories.size()) {
                        w7Var2.l(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i10));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
