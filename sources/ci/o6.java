package ci;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class o6 implements Runnable {
    public final int f5699a = 0;
    public final boolean f5700b;
    public final long f5701c;
    public final long d;
    public final Object e;
    public final Object f5702f;
    public final Object h;

    public o6(i7 i7Var, long j10, boolean z10, TL_stories.PeerStories peerStories, long j11, TLObject tLObject) {
        this.e = i7Var;
        this.f5701c = j10;
        this.f5700b = z10;
        this.f5702f = peerStories;
        this.d = j11;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f5699a) {
            case 0:
                i7 i7Var = (i7) this.e;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f5702f;
                TLObject tLObject = (TLObject) this.h;
                i7Var.D.remove(Long.valueOf(this.f5701c));
                boolean z10 = this.f5700b;
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
                            w7 w7Var = i7Var.f5501k;
                            w7Var.f6129b.getStorageQueue().postRunnable(new t7(w7Var, peerStories, 1));
                        }
                    }
                    NotificationCenter.getInstance(i7Var.f5494a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            default:
                ((FileLoader) this.e).lambda$checkUploadNewDataAvailable$3(this.f5700b, (String) this.f5702f, this.f5701c, this.d, (Float) this.h);
                return;
        }
    }

    public o6(FileLoader fileLoader, boolean z10, String str, long j10, long j11, Float f7) {
        this.e = fileLoader;
        this.f5700b = z10;
        this.f5702f = str;
        this.f5701c = j10;
        this.d = j11;
        this.h = f7;
    }
}
