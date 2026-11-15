package fi;

import org.telegram.tgnet.tl.TL_stories;
public final class d7 implements Runnable {
    public final int f11636a;
    public final f7 f11637b;
    public final TL_stories.PeerStories f11638c;

    public d7(f7 f7Var, TL_stories.PeerStories peerStories, int i7) {
        this.f11636a = i7;
        this.f11637b = f7Var;
        this.f11638c = peerStories;
    }

    @Override
    public final void run() {
        switch (this.f11636a) {
            case 0:
                f7 f7Var = this.f11637b;
                f7Var.getClass();
                int i7 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories = this.f11638c;
                    if (i7 < peerStories.stories.size()) {
                        f7Var.l(org.telegram.messenger.m5.o(peerStories.peer), peerStories.stories.get(i7));
                        i7++;
                    } else {
                        return;
                    }
                }
            default:
                f7 f7Var2 = this.f11637b;
                f7Var2.getClass();
                TL_stories.PeerStories peerStories2 = this.f11638c;
                f7Var2.g(org.telegram.messenger.m5.o(peerStories2.peer), peerStories2);
                return;
        }
    }
}
