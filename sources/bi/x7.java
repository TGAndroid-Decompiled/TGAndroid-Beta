package bi;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class x7 implements Runnable {
    public final int f3962a = 0;
    public final boolean f3963b;
    public final long f3964c;
    public final long d;
    public final Object e;
    public final Object f3965f;
    public final Object h;

    public x7(x8 x8Var, long j10, boolean z10, TL_stories.PeerStories peerStories, long j11, TLObject tLObject) {
        this.e = x8Var;
        this.f3964c = j10;
        this.f3963b = z10;
        this.f3965f = peerStories;
        this.d = j11;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f3962a) {
            case 0:
                x8 x8Var = (x8) this.e;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f3965f;
                TLObject tLObject = (TLObject) this.h;
                x8Var.D.remove(Long.valueOf(this.f3964c));
                boolean z10 = this.f3963b;
                long j10 = this.d;
                if (!z10) {
                    peerStories = x8Var.y(j10);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i10 = 0; i10 < tL_stories_stories.stories.size(); i10++) {
                            for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                                if (peerStories.stories.get(i11).f19151id == tL_stories_stories.stories.get(i10).f19151id) {
                                    peerStories.stories.set(i11, tL_stories_stories.stories.get(i10));
                                    x8Var.W(j10, tL_stories_stories.stories.get(i10));
                                }
                            }
                        }
                        if (!z10) {
                            k9 k9Var = x8Var.f3973k;
                            k9Var.f3256b.getStorageQueue().postRunnable(new i9(k9Var, peerStories, 1));
                        }
                    }
                    NotificationCenter.getInstance(x8Var.f3966a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            default:
                ((FileLoader) this.e).lambda$checkUploadNewDataAvailable$3(this.f3963b, (String) this.f3965f, this.f3964c, this.d, (Float) this.h);
                return;
        }
    }

    public x7(FileLoader fileLoader, boolean z10, String str, long j10, long j11, Float f7) {
        this.e = fileLoader;
        this.f3963b = z10;
        this.f3965f = str;
        this.f3964c = j10;
        this.d = j11;
        this.h = f7;
    }
}
