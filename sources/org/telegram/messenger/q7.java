package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class q7 implements Runnable {
    public final int f17750a = 0;
    public final long f17751b;
    public final boolean f17752c;
    public final long d;
    public final Object e;
    public final Object f17753f;
    public final Object h;

    public q7(b8 b8Var, boolean z10, String str, long j10, long j11, Float f7) {
        this.e = b8Var;
        this.f17752c = z10;
        this.f17753f = str;
        this.f17751b = j10;
        this.d = j11;
        this.h = f7;
    }

    @Override
    public final void run() {
        d9 d9Var;
        switch (this.f17750a) {
            case 0:
                b8 b8Var = (b8) this.e;
                boolean z10 = this.f17752c;
                String str = (String) this.f17753f;
                long j10 = this.f17751b;
                long j11 = this.d;
                Float f7 = (Float) this.h;
                if (z10) {
                    d9Var = (d9) b8Var.f14943n.get(str);
                } else {
                    d9Var = (d9) b8Var.h.get(str);
                }
                d9 d9Var2 = d9Var;
                if (d9Var2 != null) {
                    Utilities.d.c(new y8(d9Var2, f7, j11, j10));
                    return;
                } else if (j11 != 0) {
                    b8Var.f14948y.put(str, Long.valueOf(j11));
                    return;
                } else {
                    return;
                }
            default:
                th.e5 e5Var = (th.e5) this.e;
                long j12 = this.f17751b;
                boolean z11 = this.f17752c;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f17753f;
                long j13 = this.d;
                TLObject tLObject = (TLObject) this.h;
                e5Var.D.remove(Long.valueOf(j12));
                if (!z11) {
                    peerStories = e5Var.y(j13);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i10 = 0; i10 < tL_stories_stories.stories.size(); i10++) {
                            for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                                if (peerStories.stories.get(i11).f20032id == tL_stories_stories.stories.get(i10).f20032id) {
                                    peerStories.stories.set(i11, tL_stories_stories.stories.get(i10));
                                    e5Var.Z(j13, tL_stories_stories.stories.get(i10));
                                }
                            }
                        }
                        if (!z11) {
                            th.r5 r5Var = e5Var.f48925k;
                            r5Var.f49426b.f16331a.c(new th.q5(r5Var, peerStories, 0));
                        }
                    }
                    at.f(e5Var.f48918a).k(324, new Object[0]);
                    return;
                }
                return;
        }
    }

    public q7(th.e5 e5Var, long j10, boolean z10, TL_stories.PeerStories peerStories, long j11, TLObject tLObject) {
        this.e = e5Var;
        this.f17751b = j10;
        this.f17752c = z10;
        this.f17753f = peerStories;
        this.d = j11;
        this.h = tLObject;
    }
}
