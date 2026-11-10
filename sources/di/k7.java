package di;

import org.telegram.tgnet.tl.TL_stories;
public final class k7 implements Runnable {
    public final int f9303a;
    public final m7 f9304b;
    public final TL_stories.PeerStories f9305c;

    public k7(m7 m7Var, TL_stories.PeerStories peerStories, int i7) {
        this.f9303a = i7;
        this.f9304b = m7Var;
        this.f9305c = peerStories;
    }

    @Override
    public final void run() {
        switch (this.f9303a) {
            case 0:
                m7 m7Var = this.f9304b;
                m7Var.getClass();
                int i7 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories = this.f9305c;
                    if (i7 < peerStories.stories.size()) {
                        m7Var.l(org.telegram.messenger.m5.o(peerStories.peer), peerStories.stories.get(i7));
                        i7++;
                    } else {
                        return;
                    }
                }
            default:
                m7 m7Var2 = this.f9304b;
                m7Var2.getClass();
                TL_stories.PeerStories peerStories2 = this.f9305c;
                m7Var2.g(org.telegram.messenger.m5.o(peerStories2.peer), peerStories2);
                return;
        }
    }
}
