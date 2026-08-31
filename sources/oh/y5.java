package oh;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class y5 implements Runnable {
    public final int f17951a = 0;
    public final boolean f17952b;
    public final long f17953c;
    public final long d;
    public final Object f17954e;
    public final Object f17955f;
    public final Object h;

    public y5(t6 t6Var, long j10, boolean z4, TL_stories.PeerStories peerStories, long j11, TLObject tLObject) {
        this.f17954e = t6Var;
        this.f17953c = j10;
        this.f17952b = z4;
        this.f17955f = peerStories;
        this.d = j11;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17951a) {
            case 0:
                t6 t6Var = (t6) this.f17954e;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f17955f;
                TLObject tLObject = (TLObject) this.h;
                t6Var.D.remove(Long.valueOf(this.f17953c));
                boolean z4 = this.f17952b;
                long j10 = this.d;
                if (!z4) {
                    peerStories = t6Var.y(j10);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i10 = 0; i10 < tL_stories_stories.stories.size(); i10++) {
                            for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                                if (peerStories.stories.get(i11).f21080id == tL_stories_stories.stories.get(i10).f21080id) {
                                    peerStories.stories.set(i11, tL_stories_stories.stories.get(i10));
                                    t6Var.W(j10, tL_stories_stories.stories.get(i10));
                                }
                            }
                        }
                        if (!z4) {
                            g7 g7Var = t6Var.f17778k;
                            g7Var.f17164b.getStorageQueue().postRunnable(new d7(g7Var, peerStories, 1));
                        }
                    }
                    NotificationCenter.getInstance(t6Var.f17770a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            default:
                ((FileLoader) this.f17954e).lambda$checkUploadNewDataAvailable$3(this.f17952b, (String) this.f17955f, this.f17953c, this.d, (Float) this.h);
                return;
        }
    }

    public y5(FileLoader fileLoader, boolean z4, String str, long j10, long j11, Float f10) {
        this.f17954e = fileLoader;
        this.f17952b = z4;
        this.f17955f = str;
        this.f17953c = j10;
        this.d = j11;
        this.h = f10;
    }
}
