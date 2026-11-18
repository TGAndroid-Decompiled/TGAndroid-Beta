package fi;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class t5 implements Runnable {
    public final int f12582a = 0;
    public final boolean f12583b;
    public final long f12584c;
    public final long d;
    public final Object f12585e;
    public final Object f12586f;
    public final Object h;

    public t5(p6 p6Var, long j3, boolean z10, TL_stories.PeerStories peerStories, long j10, TLObject tLObject) {
        this.f12585e = p6Var;
        this.f12584c = j3;
        this.f12583b = z10;
        this.f12586f = peerStories;
        this.d = j10;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        org.telegram.messenger.y8 y8Var;
        switch (this.f12582a) {
            case 0:
                p6 p6Var = (p6) this.f12585e;
                long j3 = this.f12584c;
                boolean z10 = this.f12583b;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f12586f;
                long j10 = this.d;
                TLObject tLObject = (TLObject) this.h;
                p6Var.D.remove(Long.valueOf(j3));
                if (!z10) {
                    peerStories = p6Var.y(j10);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i7 = 0; i7 < tL_stories_stories.stories.size(); i7++) {
                            for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
                                if (peerStories.stories.get(i10).f28644id == tL_stories_stories.stories.get(i7).f28644id) {
                                    peerStories.stories.set(i10, tL_stories_stories.stories.get(i7));
                                    p6Var.Z(j10, tL_stories_stories.stories.get(i7));
                                }
                            }
                        }
                        if (!z10) {
                            c7 c7Var = p6Var.f12393k;
                            c7Var.f11818b.f27054a.c(new a7(c7Var, peerStories, 0));
                        }
                    }
                    ks.f(p6Var.f12385a).k(326, new Object[0]);
                    return;
                }
                return;
            default:
                org.telegram.messenger.w7 w7Var = (org.telegram.messenger.w7) this.f12585e;
                boolean z11 = this.f12583b;
                String str = (String) this.f12586f;
                long j11 = this.f12584c;
                long j12 = this.d;
                Float f10 = (Float) this.h;
                if (z11) {
                    y8Var = (org.telegram.messenger.y8) w7Var.f27654n.get(str);
                } else {
                    y8Var = (org.telegram.messenger.y8) w7Var.h.get(str);
                }
                org.telegram.messenger.y8 y8Var2 = y8Var;
                if (y8Var2 != null) {
                    Utilities.d.c(new org.telegram.messenger.t8(y8Var2, f10, j12, j11));
                    return;
                } else if (j12 != 0) {
                    w7Var.f27659y.put(str, Long.valueOf(j12));
                    return;
                } else {
                    return;
                }
        }
    }

    public t5(org.telegram.messenger.w7 w7Var, boolean z10, String str, long j3, long j10, Float f10) {
        this.f12585e = w7Var;
        this.f12583b = z10;
        this.f12586f = str;
        this.f12584c = j3;
        this.d = j10;
        this.h = f10;
    }
}
