package di;

import org.telegram.tgnet.tl.TL_stories;
public final class j7 implements Runnable {
    public final int f9272a;
    public final l7 f9273b;
    public final TL_stories.PeerStories f9274c;

    public j7(l7 l7Var, TL_stories.PeerStories peerStories, int i7) {
        this.f9272a = i7;
        this.f9273b = l7Var;
        this.f9274c = peerStories;
    }

    @Override
    public final void run() {
        switch (this.f9272a) {
            case 0:
                l7 l7Var = this.f9273b;
                l7Var.getClass();
                int i7 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories = this.f9274c;
                    if (i7 < peerStories.stories.size()) {
                        l7Var.l(org.telegram.messenger.m5.o(peerStories.peer), peerStories.stories.get(i7));
                        i7++;
                    } else {
                        return;
                    }
                }
            default:
                l7 l7Var2 = this.f9273b;
                l7Var2.getClass();
                TL_stories.PeerStories peerStories2 = this.f9274c;
                l7Var2.g(org.telegram.messenger.m5.o(peerStories2.peer), peerStories2);
                return;
        }
    }
}
