package fi;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class u5 implements Runnable {
    public final int f12619a = 0;
    public final boolean f12620b;
    public final long f12621c;
    public final long d;
    public final Object f12622e;
    public final Object f12623f;
    public final Object h;

    public u5(p6 p6Var, long j3, boolean z10, TL_stories.PeerStories peerStories, long j10, TLObject tLObject) {
        this.f12622e = p6Var;
        this.f12621c = j3;
        this.f12620b = z10;
        this.f12623f = peerStories;
        this.d = j10;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        org.telegram.messenger.x8 x8Var;
        switch (this.f12619a) {
            case 0:
                p6 p6Var = (p6) this.f12622e;
                long j3 = this.f12621c;
                boolean z10 = this.f12620b;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f12623f;
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
                                if (peerStories.stories.get(i10).f28731id == tL_stories_stories.stories.get(i7).f28731id) {
                                    peerStories.stories.set(i10, tL_stories_stories.stories.get(i7));
                                    p6Var.Z(j10, tL_stories_stories.stories.get(i7));
                                }
                            }
                        }
                        if (!z10) {
                            c7 c7Var = p6Var.f12395k;
                            c7Var.f11820b.f27149a.c(new a7(c7Var, peerStories, 0));
                        }
                    }
                    ks.f(p6Var.f12387a).k(327, new Object[0]);
                    return;
                }
                return;
            default:
                org.telegram.messenger.w7 w7Var = (org.telegram.messenger.w7) this.f12622e;
                boolean z11 = this.f12620b;
                String str = (String) this.f12623f;
                long j11 = this.f12621c;
                long j12 = this.d;
                Float f10 = (Float) this.h;
                if (z11) {
                    x8Var = (org.telegram.messenger.x8) w7Var.f27747n.get(str);
                } else {
                    x8Var = (org.telegram.messenger.x8) w7Var.h.get(str);
                }
                org.telegram.messenger.x8 x8Var2 = x8Var;
                if (x8Var2 != null) {
                    Utilities.d.c(new org.telegram.messenger.s8(x8Var2, f10, j12, j11));
                    return;
                } else if (j12 != 0) {
                    w7Var.f27752y.put(str, Long.valueOf(j12));
                    return;
                } else {
                    return;
                }
        }
    }

    public u5(org.telegram.messenger.w7 w7Var, boolean z10, String str, long j3, long j10, Float f10) {
        this.f12622e = w7Var;
        this.f12620b = z10;
        this.f12623f = str;
        this.f12621c = j3;
        this.d = j10;
        this.h = f10;
    }
}
