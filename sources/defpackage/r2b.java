package defpackage;

import org.telegram.tgnet.tl.TL_stories;
public final class r2b implements Runnable {
    public final byte a;
    public final s2b b;
    public final TL_stories.PeerStories c;

    public r2b(s2b s2bVar, TL_stories.PeerStories peerStories, byte b) {
        this.a = b;
        this.b = s2bVar;
        this.c = peerStories;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TL_stories.PeerStories peerStories = this.c;
        s2b s2bVar = this.b;
        switch (b) {
            case 0:
                for (int i = 0; i < peerStories.stories.size(); i++) {
                    s2bVar.l(cf3.n(peerStories.peer), peerStories.stories.get(i));
                }
                return;
            default:
                s2bVar.g(cf3.n(peerStories.peer), peerStories);
                return;
        }
    }
}
