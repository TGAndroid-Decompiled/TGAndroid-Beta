package bi;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
public final class i9 implements Runnable {
    public final int f3187a;
    public final k9 f3188b;
    public final TL_stories.PeerStories f3189c;

    public i9(k9 k9Var, TL_stories.PeerStories peerStories, int i10) {
        this.f3187a = i10;
        this.f3188b = k9Var;
        this.f3189c = peerStories;
    }

    @Override
    public final void run() {
        switch (this.f3187a) {
            case 0:
                k9 k9Var = this.f3188b;
                k9Var.getClass();
                TL_stories.PeerStories peerStories = this.f3189c;
                k9Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                return;
            default:
                k9 k9Var2 = this.f3188b;
                k9Var2.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.f3189c;
                    if (i10 < peerStories2.stories.size()) {
                        k9Var2.l(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i10));
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
