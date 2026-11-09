package di;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class e6 implements Runnable {
    public final int f8949a = 0;
    public final boolean f8950b;
    public final long f8951c;
    public final long d;
    public final Object f8952e;
    public final Object f8953f;
    public final Object h;

    public e6(z6 z6Var, long j3, boolean z9, TL_stories.PeerStories peerStories, long j10, TLObject tLObject) {
        this.f8952e = z6Var;
        this.f8951c = j3;
        this.f8950b = z9;
        this.f8953f = peerStories;
        this.d = j10;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        org.telegram.messenger.y8 y8Var;
        switch (this.f8949a) {
            case 0:
                z6 z6Var = (z6) this.f8952e;
                long j3 = this.f8951c;
                boolean z9 = this.f8950b;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f8953f;
                long j10 = this.d;
                TLObject tLObject = (TLObject) this.h;
                z6Var.D.remove(Long.valueOf(j3));
                if (!z9) {
                    peerStories = z6Var.y(j10);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i7 = 0; i7 < tL_stories_stories.stories.size(); i7++) {
                            for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
                                if (peerStories.stories.get(i10).f27195id == tL_stories_stories.stories.get(i7).f27195id) {
                                    peerStories.stories.set(i10, tL_stories_stories.stories.get(i7));
                                    z6Var.Z(j10, tL_stories_stories.stories.get(i7));
                                }
                            }
                        }
                        if (!z9) {
                            m7 m7Var = z6Var.f10000k;
                            m7Var.f9363b.f26719a.c(new k7(m7Var, peerStories, 0));
                        }
                    }
                    qs.f(z6Var.f9992a).k(324, new Object[0]);
                    return;
                }
                return;
            default:
                org.telegram.messenger.w7 w7Var = (org.telegram.messenger.w7) this.f8952e;
                boolean z10 = this.f8950b;
                String str = (String) this.f8953f;
                long j11 = this.f8951c;
                long j12 = this.d;
                Float f10 = (Float) this.h;
                if (z10) {
                    y8Var = (org.telegram.messenger.y8) w7Var.f26268n.get(str);
                } else {
                    y8Var = (org.telegram.messenger.y8) w7Var.h.get(str);
                }
                org.telegram.messenger.y8 y8Var2 = y8Var;
                if (y8Var2 != null) {
                    Utilities.d.c(new org.telegram.messenger.t8(y8Var2, f10, j12, j11));
                    return;
                } else if (j12 != 0) {
                    w7Var.f26273y.put(str, Long.valueOf(j12));
                    return;
                } else {
                    return;
                }
        }
    }

    public e6(org.telegram.messenger.w7 w7Var, boolean z9, String str, long j3, long j10, Float f10) {
        this.f8952e = w7Var;
        this.f8950b = z9;
        this.f8953f = str;
        this.f8951c = j3;
        this.d = j10;
        this.h = f10;
    }
}
