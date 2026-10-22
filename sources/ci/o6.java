package ci;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class o6 implements Runnable {
    public final int f5696a = 0;
    public final boolean f5697b;
    public final long f5698c;
    public final long d;
    public final Object e;
    public final Object f5699f;
    public final Object h;

    public o6(i7 i7Var, long j10, boolean z10, TL_stories.PeerStories peerStories, long j11, TLObject tLObject) {
        this.e = i7Var;
        this.f5698c = j10;
        this.f5697b = z10;
        this.f5699f = peerStories;
        this.d = j11;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f5696a) {
            case 0:
                i7 i7Var = (i7) this.e;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f5699f;
                TLObject tLObject = (TLObject) this.h;
                i7Var.D.remove(Long.valueOf(this.f5698c));
                boolean z10 = this.f5697b;
                long j10 = this.d;
                if (!z10) {
                    peerStories = i7Var.y(j10);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i10 = 0; i10 < tL_stories_stories.stories.size(); i10++) {
                            for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                                if (peerStories.stories.get(i11).f20513id == tL_stories_stories.stories.get(i10).f20513id) {
                                    peerStories.stories.set(i11, tL_stories_stories.stories.get(i10));
                                    i7Var.W(j10, tL_stories_stories.stories.get(i10));
                                }
                            }
                        }
                        if (!z10) {
                            w7 w7Var = i7Var.f5498k;
                            w7Var.f6126b.getStorageQueue().postRunnable(new t7(w7Var, peerStories, 1));
                        }
                    }
                    NotificationCenter.getInstance(i7Var.f5491a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            default:
                ((FileLoader) this.e).lambda$checkUploadNewDataAvailable$3(this.f5697b, (String) this.f5699f, this.f5698c, this.d, (Float) this.h);
                return;
        }
    }

    public o6(FileLoader fileLoader, boolean z10, String str, long j10, long j11, Float f7) {
        this.e = fileLoader;
        this.f5697b = z10;
        this.f5699f = str;
        this.f5698c = j10;
        this.d = j11;
        this.h = f7;
    }
}
