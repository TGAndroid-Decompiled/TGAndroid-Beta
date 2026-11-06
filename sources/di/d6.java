package di;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class d6 implements Runnable {
    public final int f8921a = 0;
    public final boolean f8922b;
    public final long f8923c;
    public final long d;
    public final Object f8924e;
    public final Object f8925f;
    public final Object h;

    public d6(y6 y6Var, long j3, boolean z9, TL_stories.PeerStories peerStories, long j10, TLObject tLObject) {
        this.f8924e = y6Var;
        this.f8923c = j3;
        this.f8922b = z9;
        this.f8925f = peerStories;
        this.d = j10;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        org.telegram.messenger.y8 y8Var;
        switch (this.f8921a) {
            case 0:
                y6 y6Var = (y6) this.f8924e;
                long j3 = this.f8923c;
                boolean z9 = this.f8922b;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f8925f;
                long j10 = this.d;
                TLObject tLObject = (TLObject) this.h;
                y6Var.D.remove(Long.valueOf(j3));
                if (!z9) {
                    peerStories = y6Var.y(j10);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i7 = 0; i7 < tL_stories_stories.stories.size(); i7++) {
                            for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
                                if (peerStories.stories.get(i10).f27192id == tL_stories_stories.stories.get(i7).f27192id) {
                                    peerStories.stories.set(i10, tL_stories_stories.stories.get(i7));
                                    y6Var.Z(j10, tL_stories_stories.stories.get(i7));
                                }
                            }
                        }
                        if (!z9) {
                            l7 l7Var = y6Var.f9971k;
                            l7Var.f9338b.f26696a.c(new j7(l7Var, peerStories, 0));
                        }
                    }
                    qs.f(y6Var.f9963a).k(324, new Object[0]);
                    return;
                }
                return;
            default:
                org.telegram.messenger.w7 w7Var = (org.telegram.messenger.w7) this.f8924e;
                boolean z10 = this.f8922b;
                String str = (String) this.f8925f;
                long j11 = this.f8923c;
                long j12 = this.d;
                Float f10 = (Float) this.h;
                if (z10) {
                    y8Var = (org.telegram.messenger.y8) w7Var.f26265n.get(str);
                } else {
                    y8Var = (org.telegram.messenger.y8) w7Var.h.get(str);
                }
                org.telegram.messenger.y8 y8Var2 = y8Var;
                if (y8Var2 != null) {
                    Utilities.d.c(new org.telegram.messenger.t8(y8Var2, f10, j12, j11));
                    return;
                } else if (j12 != 0) {
                    w7Var.f26270y.put(str, Long.valueOf(j12));
                    return;
                } else {
                    return;
                }
        }
    }

    public d6(org.telegram.messenger.w7 w7Var, boolean z9, String str, long j3, long j10, Float f10) {
        this.f8924e = w7Var;
        this.f8922b = z9;
        this.f8925f = str;
        this.f8923c = j3;
        this.d = j10;
        this.h = f10;
    }
}
