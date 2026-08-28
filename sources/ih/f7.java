package ih;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
public final class f7 implements Runnable {
    public final int f11449a;
    public final i7 f11450b;
    public final TL_stories.PeerStories f11451c;

    public f7(i7 i7Var, TL_stories.PeerStories peerStories, int i9) {
        this.f11449a = i9;
        this.f11450b = i7Var;
        this.f11451c = peerStories;
    }

    @Override
    public final void run() {
        switch (this.f11449a) {
            case 0:
                i7 i7Var = this.f11450b;
                i7Var.getClass();
                TL_stories.PeerStories peerStories = this.f11451c;
                i7Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                return;
            default:
                i7 i7Var2 = this.f11450b;
                i7Var2.getClass();
                int i9 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.f11451c;
                    if (i9 < peerStories2.stories.size()) {
                        i7Var2.l(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i9));
                        i9++;
                    } else {
                        return;
                    }
                }
        }
    }
}
