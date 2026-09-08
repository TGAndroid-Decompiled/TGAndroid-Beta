package bi;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class t7 implements Runnable {
    public final int f3760a = 0;
    public final boolean f3761b;
    public final long f3762c;
    public final long d;
    public final Object f3763e;
    public final Object f3764f;
    public final Object h;

    public t7(u8 u8Var, long j3, boolean z10, TL_stories.PeerStories peerStories, long j10, TLObject tLObject) {
        this.f3763e = u8Var;
        this.f3762c = j3;
        this.f3761b = z10;
        this.f3764f = peerStories;
        this.d = j10;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f3760a) {
            case 0:
                u8 u8Var = (u8) this.f3763e;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f3764f;
                TLObject tLObject = (TLObject) this.h;
                u8Var.D.remove(Long.valueOf(this.f3762c));
                boolean z10 = this.f3761b;
                long j3 = this.d;
                if (!z10) {
                    peerStories = u8Var.y(j3);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i10 = 0; i10 < tL_stories_stories.stories.size(); i10++) {
                            for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                                if (peerStories.stories.get(i11).f20134id == tL_stories_stories.stories.get(i10).f20134id) {
                                    peerStories.stories.set(i11, tL_stories_stories.stories.get(i10));
                                    u8Var.W(j3, tL_stories_stories.stories.get(i10));
                                }
                            }
                        }
                        if (!z10) {
                            h9 h9Var = u8Var.f3840k;
                            h9Var.f3101b.getStorageQueue().postRunnable(new e9(h9Var, peerStories, 1));
                        }
                    }
                    NotificationCenter.getInstance(u8Var.f3832a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            default:
                ((FileLoader) this.f3763e).lambda$checkUploadNewDataAvailable$3(this.f3761b, (String) this.f3764f, this.f3762c, this.d, (Float) this.h);
                return;
        }
    }

    public t7(FileLoader fileLoader, boolean z10, String str, long j3, long j10, Float f7) {
        this.f3763e = fileLoader;
        this.f3761b = z10;
        this.f3764f = str;
        this.f3762c = j3;
        this.d = j10;
        this.h = f7;
    }
}
