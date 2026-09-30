package ai;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class l8 implements Runnable {
    public final int f1190a = 0;
    public final boolean f1191b;
    public final long f1192c;
    public final long d;
    public final Object e;
    public final Object f1193f;
    public final Object h;

    public l8(l9 l9Var, long j3, boolean z10, TL_stories.PeerStories peerStories, long j10, TLObject tLObject) {
        this.e = l9Var;
        this.f1192c = j3;
        this.f1191b = z10;
        this.f1193f = peerStories;
        this.d = j10;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f1190a) {
            case 0:
                l9 l9Var = (l9) this.e;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f1193f;
                TLObject tLObject = (TLObject) this.h;
                l9Var.D.remove(Long.valueOf(this.f1192c));
                boolean z10 = this.f1191b;
                long j3 = this.d;
                if (!z10) {
                    peerStories = l9Var.y(j3);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i10 = 0; i10 < tL_stories_stories.stories.size(); i10++) {
                            for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                                if (peerStories.stories.get(i11).f18587id == tL_stories_stories.stories.get(i10).f18587id) {
                                    peerStories.stories.set(i11, tL_stories_stories.stories.get(i10));
                                    l9Var.W(j3, tL_stories_stories.stories.get(i10));
                                }
                            }
                        }
                        if (!z10) {
                            y9 y9Var = l9Var.f1201k;
                            y9Var.f1769b.getStorageQueue().postRunnable(new w9(y9Var, peerStories, 1));
                        }
                    }
                    NotificationCenter.getInstance(l9Var.f1194a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            default:
                ((FileLoader) this.e).lambda$checkUploadNewDataAvailable$3(this.f1191b, (String) this.f1193f, this.f1192c, this.d, (Float) this.h);
                return;
        }
    }

    public l8(FileLoader fileLoader, boolean z10, String str, long j3, long j10, Float f7) {
        this.e = fileLoader;
        this.f1191b = z10;
        this.f1193f = str;
        this.f1192c = j3;
        this.d = j10;
        this.h = f7;
    }
}
