package jh;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;

public final class w5 implements Runnable {

    public final int f14090a = 0;

    public final boolean f14091b;

    public final long f14092c;
    public final long d;

    public final Object f14093e;

    public final Object f14094f;
    public final Object h;

    public w5(s6 s6Var, long j10, boolean z10, TL_stories.PeerStories peerStories, long j11, TLObject tLObject) {
        this.f14093e = s6Var;
        this.f14092c = j10;
        this.f14091b = z10;
        this.f14094f = peerStories;
        this.d = j11;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f14090a) {
            case 0:
                s6 s6Var = (s6) this.f14093e;
                TL_stories.PeerStories peerStoriesY = (TL_stories.PeerStories) this.f14094f;
                TLObject tLObject = (TLObject) this.h;
                s6Var.D.remove(Long.valueOf(this.f14092c));
                boolean z10 = this.f14091b;
                long j10 = this.d;
                if (!z10) {
                    peerStoriesY = s6Var.y(j10);
                }
                if (peerStoriesY != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i10 = 0; i10 < tL_stories_stories.stories.size(); i10++) {
                            for (int i11 = 0; i11 < peerStoriesY.stories.size(); i11++) {
                                if (peerStoriesY.stories.get(i11).f22617id == tL_stories_stories.stories.get(i10).f22617id) {
                                    peerStoriesY.stories.set(i11, tL_stories_stories.stories.get(i10));
                                    s6Var.W(j10, tL_stories_stories.stories.get(i10));
                                }
                            }
                        }
                        if (!z10) {
                            f7 f7Var = s6Var.f13963k;
                            f7Var.f13332b.getStorageQueue().postRunnable(new c7(f7Var, peerStoriesY, 1));
                        }
                    }
                    NotificationCenter.getInstance(s6Var.f13955a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    break;
                }
                break;
            default:
                ((FileLoader) this.f14093e).lambda$checkUploadNewDataAvailable$3(this.f14091b, (String) this.f14094f, this.f14092c, this.d, (Float) this.h);
                break;
        }
    }

    public w5(FileLoader fileLoader, boolean z10, String str, long j10, long j11, Float f10) {
        this.f14093e = fileLoader;
        this.f14091b = z10;
        this.f14094f = str;
        this.f14092c = j10;
        this.d = j11;
        this.h = f10;
    }
}
