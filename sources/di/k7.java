package di;

import org.telegram.tgnet.tl.TL_stories;
public final class k7 implements Runnable {
    public final int f9298a;
    public final m7 f9299b;
    public final TL_stories.PeerStories f9300c;

    public k7(m7 m7Var, TL_stories.PeerStories peerStories, int i7) {
        this.f9298a = i7;
        this.f9299b = m7Var;
        this.f9300c = peerStories;
    }

    @Override
    public final void run() {
        switch (this.f9298a) {
            case 0:
                m7 m7Var = this.f9299b;
                m7Var.getClass();
                int i7 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories = this.f9300c;
                    if (i7 < peerStories.stories.size()) {
                        m7Var.l(org.telegram.messenger.m5.o(peerStories.peer), peerStories.stories.get(i7));
                        i7++;
                    } else {
                        return;
                    }
                }
            default:
                m7 m7Var2 = this.f9299b;
                m7Var2.getClass();
                TL_stories.PeerStories peerStories2 = this.f9300c;
                m7Var2.g(org.telegram.messenger.m5.o(peerStories2.peer), peerStories2);
                return;
        }
    }
}
