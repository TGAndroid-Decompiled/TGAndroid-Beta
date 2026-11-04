package ei;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class e6 implements Runnable {
    public final int f10223a = 0;
    public final boolean f10224b;
    public final long f10225c;
    public final long d;
    public final Object f10226e;
    public final Object f10227f;
    public final Object h;

    public e6(z6 z6Var, long j10, boolean z10, TL_stories.PeerStories peerStories, long j11, TLObject tLObject) {
        this.f10226e = z6Var;
        this.f10225c = j10;
        this.f10224b = z10;
        this.f10227f = peerStories;
        this.d = j11;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        org.telegram.messenger.y8 y8Var;
        switch (this.f10223a) {
            case 0:
                z6 z6Var = (z6) this.f10226e;
                long j10 = this.f10225c;
                boolean z10 = this.f10224b;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f10227f;
                long j11 = this.d;
                TLObject tLObject = (TLObject) this.h;
                z6Var.D.remove(Long.valueOf(j10));
                if (!z10) {
                    peerStories = z6Var.y(j11);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i3 = 0; i3 < tL_stories_stories.stories.size(); i3++) {
                            for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
                                if (peerStories.stories.get(i10).f27240id == tL_stories_stories.stories.get(i3).f27240id) {
                                    peerStories.stories.set(i10, tL_stories_stories.stories.get(i3));
                                    z6Var.Z(j11, tL_stories_stories.stories.get(i3));
                                }
                            }
                        }
                        if (!z10) {
                            m7 m7Var = z6Var.f11282k;
                            m7Var.f10644b.f24934a.c(new k7(m7Var, peerStories, 0));
                        }
                    }
                    hs.f(z6Var.f11274a).k(324, new Object[0]);
                    return;
                }
                return;
            default:
                org.telegram.messenger.w7 w7Var = (org.telegram.messenger.w7) this.f10226e;
                boolean z11 = this.f10224b;
                String str = (String) this.f10227f;
                long j12 = this.f10225c;
                long j13 = this.d;
                Float f10 = (Float) this.h;
                if (z11) {
                    y8Var = (org.telegram.messenger.y8) w7Var.f26171n.get(str);
                } else {
                    y8Var = (org.telegram.messenger.y8) w7Var.h.get(str);
                }
                org.telegram.messenger.y8 y8Var2 = y8Var;
                if (y8Var2 != null) {
                    Utilities.d.c(new org.telegram.messenger.t8(y8Var2, f10, j13, j12));
                    return;
                } else if (j13 != 0) {
                    w7Var.f26176y.put(str, Long.valueOf(j13));
                    return;
                } else {
                    return;
                }
        }
    }

    public e6(org.telegram.messenger.w7 w7Var, boolean z10, String str, long j10, long j11, Float f10) {
        this.f10226e = w7Var;
        this.f10224b = z10;
        this.f10227f = str;
        this.f10225c = j10;
        this.d = j11;
        this.h = f10;
    }
}
