package defpackage;

import org.telegram.tgnet.tl.TL_stories;
public final class s4b implements Runnable {
    public final byte a;
    public final t4b b;
    public final TL_stories.PeerStories c;

    public s4b(t4b t4bVar, TL_stories.PeerStories peerStories, byte b) {
        this.a = b;
        this.b = t4bVar;
        this.c = peerStories;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TL_stories.PeerStories peerStories = this.c;
        t4b t4bVar = this.b;
        switch (b) {
            case 0:
                for (int i = 0; i < peerStories.stories.size(); i++) {
                    t4bVar.l(pg3.n(peerStories.peer), peerStories.stories.get(i));
                }
                return;
            default:
                t4bVar.g(pg3.n(peerStories.peer), peerStories);
                return;
        }
    }
}
