package ai;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class m8 implements Runnable {
    public final int f1401a = 0;
    public final boolean f1402b;
    public final long f1403c;
    public final long d;
    public final Object f1404e;
    public final Object f1405f;
    public final Object h;

    public m8(m9 m9Var, long j3, boolean z10, TL_stories.PeerStories peerStories, long j10, TLObject tLObject) {
        this.f1404e = m9Var;
        this.f1403c = j3;
        this.f1402b = z10;
        this.f1405f = peerStories;
        this.d = j10;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f1401a) {
            case 0:
                m9 m9Var = (m9) this.f1404e;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f1405f;
                TLObject tLObject = (TLObject) this.h;
                m9Var.D.remove(Long.valueOf(this.f1403c));
                boolean z10 = this.f1402b;
                long j3 = this.d;
                if (!z10) {
                    peerStories = m9Var.y(j3);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i10 = 0; i10 < tL_stories_stories.stories.size(); i10++) {
                            for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                                if (peerStories.stories.get(i11).f20275id == tL_stories_stories.stories.get(i10).f20275id) {
                                    peerStories.stories.set(i11, tL_stories_stories.stories.get(i10));
                                    m9Var.W(j3, tL_stories_stories.stories.get(i10));
                                }
                            }
                        }
                        if (!z10) {
                            z9 z9Var = m9Var.f1414k;
                            z9Var.f2022b.getStorageQueue().postRunnable(new x9(z9Var, peerStories, 1));
                        }
                    }
                    NotificationCenter.getInstance(m9Var.f1406a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            default:
                ((FileLoader) this.f1404e).lambda$checkUploadNewDataAvailable$3(this.f1402b, (String) this.f1405f, this.f1403c, this.d, (Float) this.h);
                return;
        }
    }

    public m8(FileLoader fileLoader, boolean z10, String str, long j3, long j10, Float f7) {
        this.f1404e = fileLoader;
        this.f1402b = z10;
        this.f1405f = str;
        this.f1403c = j3;
        this.d = j10;
        this.h = f7;
    }
}
