package fi;

import org.telegram.tgnet.tl.TL_stories;
public final class a7 implements Runnable {
    public final int f11739a;
    public final c7 f11740b;
    public final TL_stories.PeerStories f11741c;

    public a7(c7 c7Var, TL_stories.PeerStories peerStories, int i7) {
        this.f11739a = i7;
        this.f11740b = c7Var;
        this.f11741c = peerStories;
    }

    @Override
    public final void run() {
        switch (this.f11739a) {
            case 0:
                c7 c7Var = this.f11740b;
                c7Var.getClass();
                int i7 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories = this.f11741c;
                    if (i7 < peerStories.stories.size()) {
                        c7Var.l(org.telegram.messenger.n5.o(peerStories.peer), peerStories.stories.get(i7));
                        i7++;
                    } else {
                        return;
                    }
                }
            default:
                c7 c7Var2 = this.f11740b;
                c7Var2.getClass();
                TL_stories.PeerStories peerStories2 = this.f11741c;
                c7Var2.g(org.telegram.messenger.n5.o(peerStories2.peer), peerStories2);
                return;
        }
    }
}
