package bi;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
public final class e9 implements Runnable {
    public final int f2918a;
    public final h9 f2919b;
    public final TL_stories.PeerStories f2920c;

    public e9(h9 h9Var, TL_stories.PeerStories peerStories, int i10) {
        this.f2918a = i10;
        this.f2919b = h9Var;
        this.f2920c = peerStories;
    }

    @Override
    public final void run() {
        switch (this.f2918a) {
            case 0:
                h9 h9Var = this.f2919b;
                h9Var.getClass();
                TL_stories.PeerStories peerStories = this.f2920c;
                h9Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                return;
            default:
                h9 h9Var2 = this.f2919b;
                h9Var2.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.f2920c;
                    if (i10 < peerStories2.stories.size()) {
                        h9Var2.l(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i10));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
