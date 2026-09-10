package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class f3 implements Runnable {
    public final int f15134a = 0;
    public final long f15135b;
    public final boolean f15136c;
    public final long d;
    public final Object e;
    public final Object f15137f;
    public final Object h;

    public f3(FileLoader fileLoader, boolean z10, String str, long j3, long j10, Float f7) {
        this.e = fileLoader;
        this.f15136c = z10;
        this.f15137f = str;
        this.f15135b = j3;
        this.d = j10;
        this.h = f7;
    }

    @Override
    public final void run() {
        switch (this.f15134a) {
            case 0:
                ((FileLoader) this.e).lambda$checkUploadNewDataAvailable$3(this.f15136c, (String) this.f15137f, this.f15135b, this.d, (Float) this.h);
                return;
            default:
                zh.i5 i5Var = (zh.i5) this.e;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f15137f;
                TLObject tLObject = (TLObject) this.h;
                i5Var.D.remove(Long.valueOf(this.f15135b));
                boolean z10 = this.f15136c;
                long j3 = this.d;
                if (!z10) {
                    peerStories = i5Var.y(j3);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i10 = 0; i10 < tL_stories_stories.stories.size(); i10++) {
                            for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                                if (peerStories.stories.get(i11).f17435id == tL_stories_stories.stories.get(i10).f17435id) {
                                    peerStories.stories.set(i11, tL_stories_stories.stories.get(i10));
                                    i5Var.W(j3, tL_stories_stories.stories.get(i10));
                                }
                            }
                        }
                        if (!z10) {
                            zh.v5 v5Var = i5Var.f48506k;
                            v5Var.f48990b.getStorageQueue().postRunnable(new zh.t5(v5Var, peerStories, 1));
                        }
                    }
                    NotificationCenter.getInstance(i5Var.f48499a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
        }
    }

    public f3(zh.i5 i5Var, long j3, boolean z10, TL_stories.PeerStories peerStories, long j10, TLObject tLObject) {
        this.e = i5Var;
        this.f15135b = j3;
        this.f15136c = z10;
        this.f15137f = peerStories;
        this.d = j10;
        this.h = tLObject;
    }
}
