package defpackage;

import org.telegram.tgnet.tl.TL_stories;
public final class n6b implements Runnable {
    public final byte a;
    public final o6b b;
    public final TL_stories.PeerStories c;

    public n6b(o6b o6bVar, TL_stories.PeerStories peerStories, byte b) {
        this.a = b;
        this.b = o6bVar;
        this.c = peerStories;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TL_stories.PeerStories peerStories = this.c;
        o6b o6bVar = this.b;
        switch (b) {
            case 0:
                for (int i = 0; i < peerStories.stories.size(); i++) {
                    o6bVar.l(wf3.n(peerStories.peer), peerStories.stories.get(i));
                }
                return;
            default:
                o6bVar.g(wf3.n(peerStories.peer), peerStories);
                return;
        }
    }
}
