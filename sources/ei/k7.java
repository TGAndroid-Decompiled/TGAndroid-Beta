package ei;

import org.telegram.tgnet.tl.TL_stories;
public final class k7 implements Runnable {
    public final int f10582a;
    public final m7 f10583b;
    public final TL_stories.PeerStories f10584c;

    public k7(m7 m7Var, TL_stories.PeerStories peerStories, int i3) {
        this.f10582a = i3;
        this.f10583b = m7Var;
        this.f10584c = peerStories;
    }

    @Override
    public final void run() {
        switch (this.f10582a) {
            case 0:
                m7 m7Var = this.f10583b;
                m7Var.getClass();
                int i3 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories = this.f10584c;
                    if (i3 < peerStories.stories.size()) {
                        m7Var.l(org.telegram.messenger.m5.o(peerStories.peer), peerStories.stories.get(i3));
                        i3++;
                    } else {
                        return;
                    }
                }
            default:
                m7 m7Var2 = this.f10583b;
                m7Var2.getClass();
                TL_stories.PeerStories peerStories2 = this.f10584c;
                m7Var2.g(org.telegram.messenger.m5.o(peerStories2.peer), peerStories2);
                return;
        }
    }
}
