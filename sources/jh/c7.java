package jh;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;

public final class c7 implements Runnable {

    public final int f13164a;

    public final f7 f13165b;

    public final TL_stories.PeerStories f13166c;

    public c7(f7 f7Var, TL_stories.PeerStories peerStories, int i10) {
        this.f13164a = i10;
        this.f13165b = f7Var;
        this.f13166c = peerStories;
    }

    @Override
    public final void run() {
        switch (this.f13164a) {
            case 0:
                f7 f7Var = this.f13165b;
                f7Var.getClass();
                TL_stories.PeerStories peerStories = this.f13166c;
                f7Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                break;
            default:
                f7 f7Var2 = this.f13165b;
                f7Var2.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.f13166c;
                    if (i10 < peerStories2.stories.size()) {
                        f7Var2.l(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i10));
                        i10++;
                    }
                    break;
                }
                break;
        }
    }
}
