package di;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class m6 implements Runnable {
    public final int f8783a = 0;
    public final boolean f8784b;
    public final long f8785c;
    public final long d;
    public final Object e;
    public final Object f8786f;
    public final Object h;

    public m6(h7 h7Var, long j10, boolean z10, TL_stories.PeerStories peerStories, long j11, TLObject tLObject) {
        this.e = h7Var;
        this.f8785c = j10;
        this.f8784b = z10;
        this.f8786f = peerStories;
        this.d = j11;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f8783a) {
            case 0:
                h7 h7Var = (h7) this.e;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f8786f;
                TLObject tLObject = (TLObject) this.h;
                h7Var.D.remove(Long.valueOf(this.f8785c));
                boolean z10 = this.f8784b;
                long j10 = this.d;
                if (!z10) {
                    peerStories = h7Var.y(j10);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i10 = 0; i10 < tL_stories_stories.stories.size(); i10++) {
                            for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                                if (peerStories.stories.get(i11).f22264id == tL_stories_stories.stories.get(i10).f22264id) {
                                    peerStories.stories.set(i11, tL_stories_stories.stories.get(i10));
                                    h7Var.W(j10, tL_stories_stories.stories.get(i10));
                                }
                            }
                        }
                        if (!z10) {
                            u7 u7Var = h7Var.f8637k;
                            u7Var.f9235b.getStorageQueue().postRunnable(new s7(u7Var, peerStories, 1));
                        }
                    }
                    NotificationCenter.getInstance(h7Var.f8630a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            default:
                ((FileLoader) this.e).lambda$checkUploadNewDataAvailable$3(this.f8784b, (String) this.f8786f, this.f8785c, this.d, (Float) this.h);
                return;
        }
    }

    public m6(FileLoader fileLoader, boolean z10, String str, long j10, long j11, Float f7) {
        this.e = fileLoader;
        this.f8784b = z10;
        this.f8786f = str;
        this.f8785c = j10;
        this.d = j11;
        this.h = f7;
    }
}
