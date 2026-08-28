package ih;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class a6 implements Runnable {
    public final int f11218a = 0;
    public final boolean f11219b;
    public final long f11220c;
    public final long d;
    public final Object f11221e;
    public final Object f11222f;
    public final Object h;

    public a6(v6 v6Var, long j10, boolean z10, TL_stories.PeerStories peerStories, long j11, TLObject tLObject) {
        this.f11221e = v6Var;
        this.f11220c = j10;
        this.f11219b = z10;
        this.f11222f = peerStories;
        this.d = j11;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f11218a) {
            case 0:
                v6 v6Var = (v6) this.f11221e;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f11222f;
                TLObject tLObject = (TLObject) this.h;
                v6Var.D.remove(Long.valueOf(this.f11220c));
                boolean z10 = this.f11219b;
                long j10 = this.d;
                if (!z10) {
                    peerStories = v6Var.y(j10);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i9 = 0; i9 < tL_stories_stories.stories.size(); i9++) {
                            for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
                                if (peerStories.stories.get(i10).f22617id == tL_stories_stories.stories.get(i9).f22617id) {
                                    peerStories.stories.set(i10, tL_stories_stories.stories.get(i9));
                                    v6Var.W(j10, tL_stories_stories.stories.get(i9));
                                }
                            }
                        }
                        if (!z10) {
                            i7 i7Var = v6Var.f12244k;
                            i7Var.f11620b.getStorageQueue().postRunnable(new f7(i7Var, peerStories, 1));
                        }
                    }
                    NotificationCenter.getInstance(v6Var.f12236a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            default:
                ((FileLoader) this.f11221e).lambda$checkUploadNewDataAvailable$3(this.f11219b, (String) this.f11222f, this.f11220c, this.d, (Float) this.h);
                return;
        }
    }

    public a6(FileLoader fileLoader, boolean z10, String str, long j10, long j11, Float f10) {
        this.f11221e = fileLoader;
        this.f11219b = z10;
        this.f11222f = str;
        this.f11220c = j10;
        this.d = j11;
        this.h = f10;
    }
}
