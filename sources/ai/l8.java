package ai;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class l8 implements Runnable {
    public final int f1285a = 0;
    public final boolean f1286b;
    public final long f1287c;
    public final long d;
    public final Object f1288e;
    public final Object f1289f;
    public final Object h;

    public l8(l9 l9Var, long j3, boolean z10, TL_stories.PeerStories peerStories, long j10, TLObject tLObject) {
        this.f1288e = l9Var;
        this.f1287c = j3;
        this.f1286b = z10;
        this.f1289f = peerStories;
        this.d = j10;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f1285a) {
            case 0:
                l9 l9Var = (l9) this.f1288e;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f1289f;
                TLObject tLObject = (TLObject) this.h;
                l9Var.D.remove(Long.valueOf(this.f1287c));
                boolean z10 = this.f1286b;
                long j3 = this.d;
                if (!z10) {
                    peerStories = l9Var.y(j3);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i10 = 0; i10 < tL_stories_stories.stories.size(); i10++) {
                            for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                                if (peerStories.stories.get(i11).f20284id == tL_stories_stories.stories.get(i10).f20284id) {
                                    peerStories.stories.set(i11, tL_stories_stories.stories.get(i10));
                                    l9Var.W(j3, tL_stories_stories.stories.get(i10));
                                }
                            }
                        }
                        if (!z10) {
                            y9 y9Var = l9Var.f1298k;
                            y9Var.f1916b.getStorageQueue().postRunnable(new w9(y9Var, peerStories, 1));
                        }
                    }
                    NotificationCenter.getInstance(l9Var.f1290a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            default:
                ((FileLoader) this.f1288e).lambda$checkUploadNewDataAvailable$3(this.f1286b, (String) this.f1289f, this.f1287c, this.d, (Float) this.h);
                return;
        }
    }

    public l8(FileLoader fileLoader, boolean z10, String str, long j3, long j10, Float f7) {
        this.f1288e = fileLoader;
        this.f1286b = z10;
        this.f1289f = str;
        this.f1287c = j3;
        this.d = j10;
        this.h = f7;
    }
}
