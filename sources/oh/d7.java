package oh;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
public final class d7 implements Runnable {
    public final int f16989a;
    public final g7 f16990b;
    public final TL_stories.PeerStories f16991c;

    public d7(g7 g7Var, TL_stories.PeerStories peerStories, int i10) {
        this.f16989a = i10;
        this.f16990b = g7Var;
        this.f16991c = peerStories;
    }

    @Override
    public final void run() {
        switch (this.f16989a) {
            case 0:
                g7 g7Var = this.f16990b;
                g7Var.getClass();
                TL_stories.PeerStories peerStories = this.f16991c;
                g7Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                return;
            default:
                g7 g7Var2 = this.f16990b;
                g7Var2.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.f16991c;
                    if (i10 < peerStories2.stories.size()) {
                        g7Var2.l(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i10));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
