package lh;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class x5 implements Runnable {
    public final int f16393a = 0;
    public final boolean f16394b;
    public final long f16395c;
    public final long d;
    public final Object f16396e;
    public final Object f16397f;
    public final Object h;

    public x5(s6 s6Var, long j10, boolean z10, TL_stories.PeerStories peerStories, long j11, TLObject tLObject) {
        this.f16396e = s6Var;
        this.f16395c = j10;
        this.f16394b = z10;
        this.f16397f = peerStories;
        this.d = j11;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16393a) {
            case 0:
                s6 s6Var = (s6) this.f16396e;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f16397f;
                TLObject tLObject = (TLObject) this.h;
                s6Var.D.remove(Long.valueOf(this.f16395c));
                boolean z10 = this.f16394b;
                long j10 = this.d;
                if (!z10) {
                    peerStories = s6Var.y(j10);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i10 = 0; i10 < tL_stories_stories.stories.size(); i10++) {
                            for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                                if (peerStories.stories.get(i11).f22629id == tL_stories_stories.stories.get(i10).f22629id) {
                                    peerStories.stories.set(i11, tL_stories_stories.stories.get(i10));
                                    s6Var.W(j10, tL_stories_stories.stories.get(i10));
                                }
                            }
                        }
                        if (!z10) {
                            f7 f7Var = s6Var.f16226k;
                            f7Var.f15600b.getStorageQueue().postRunnable(new c7(f7Var, peerStories, 1));
                        }
                    }
                    NotificationCenter.getInstance(s6Var.f16218a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            default:
                ((FileLoader) this.f16396e).lambda$checkUploadNewDataAvailable$3(this.f16394b, (String) this.f16397f, this.f16395c, this.d, (Float) this.h);
                return;
        }
    }

    public x5(FileLoader fileLoader, boolean z10, String str, long j10, long j11, Float f9) {
        this.f16396e = fileLoader;
        this.f16394b = z10;
        this.f16397f = str;
        this.f16395c = j10;
        this.d = j11;
        this.h = f9;
    }
}
