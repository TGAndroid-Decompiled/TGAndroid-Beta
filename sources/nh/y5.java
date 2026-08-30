package nh;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class y5 implements Runnable {
    public final int f16074a = 0;
    public final boolean f16075b;
    public final long f16076c;
    public final long d;
    public final Object e;
    public final Object f16077f;
    public final Object h;

    public y5(t6 t6Var, long j10, boolean z4, TL_stories.PeerStories peerStories, long j11, TLObject tLObject) {
        this.e = t6Var;
        this.f16076c = j10;
        this.f16075b = z4;
        this.f16077f = peerStories;
        this.d = j11;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16074a) {
            case 0:
                t6 t6Var = (t6) this.e;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f16077f;
                TLObject tLObject = (TLObject) this.h;
                t6Var.D.remove(Long.valueOf(this.f16076c));
                boolean z4 = this.f16075b;
                long j10 = this.d;
                if (!z4) {
                    peerStories = t6Var.y(j10);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i10 = 0; i10 < tL_stories_stories.stories.size(); i10++) {
                            for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                                if (peerStories.stories.get(i11).f19419id == tL_stories_stories.stories.get(i10).f19419id) {
                                    peerStories.stories.set(i11, tL_stories_stories.stories.get(i10));
                                    t6Var.W(j10, tL_stories_stories.stories.get(i10));
                                }
                            }
                        }
                        if (!z4) {
                            g7 g7Var = t6Var.f15924k;
                            g7Var.f15366b.getStorageQueue().postRunnable(new d7(g7Var, peerStories, 1));
                        }
                    }
                    NotificationCenter.getInstance(t6Var.f15917a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            default:
                ((FileLoader) this.e).lambda$checkUploadNewDataAvailable$3(this.f16075b, (String) this.f16077f, this.f16076c, this.d, (Float) this.h);
                return;
        }
    }

    public y5(FileLoader fileLoader, boolean z4, String str, long j10, long j11, Float f10) {
        this.e = fileLoader;
        this.f16075b = z4;
        this.f16077f = str;
        this.f16076c = j10;
        this.d = j11;
        this.h = f10;
    }
}
