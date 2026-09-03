package nh;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class y5 implements Runnable {
    public final int f16054a = 0;
    public final boolean f16055b;
    public final long f16056c;
    public final long d;
    public final Object e;
    public final Object f16057f;
    public final Object h;

    public y5(t6 t6Var, long j10, boolean z4, TL_stories.PeerStories peerStories, long j11, TLObject tLObject) {
        this.e = t6Var;
        this.f16056c = j10;
        this.f16055b = z4;
        this.f16057f = peerStories;
        this.d = j11;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16054a) {
            case 0:
                t6 t6Var = (t6) this.e;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f16057f;
                TLObject tLObject = (TLObject) this.h;
                t6Var.D.remove(Long.valueOf(this.f16056c));
                boolean z4 = this.f16055b;
                long j10 = this.d;
                if (!z4) {
                    peerStories = t6Var.y(j10);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i10 = 0; i10 < tL_stories_stories.stories.size(); i10++) {
                            for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                                if (peerStories.stories.get(i11).f19394id == tL_stories_stories.stories.get(i10).f19394id) {
                                    peerStories.stories.set(i11, tL_stories_stories.stories.get(i10));
                                    t6Var.W(j10, tL_stories_stories.stories.get(i10));
                                }
                            }
                        }
                        if (!z4) {
                            g7 g7Var = t6Var.f15904k;
                            g7Var.f15346b.getStorageQueue().postRunnable(new d7(g7Var, peerStories, 1));
                        }
                    }
                    NotificationCenter.getInstance(t6Var.f15897a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            default:
                ((FileLoader) this.e).lambda$checkUploadNewDataAvailable$3(this.f16055b, (String) this.f16057f, this.f16056c, this.d, (Float) this.h);
                return;
        }
    }

    public y5(FileLoader fileLoader, boolean z4, String str, long j10, long j11, Float f10) {
        this.e = fileLoader;
        this.f16055b = z4;
        this.f16057f = str;
        this.f16056c = j10;
        this.d = j11;
        this.h = f10;
    }
}
