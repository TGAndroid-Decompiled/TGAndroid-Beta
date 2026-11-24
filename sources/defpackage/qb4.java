package defpackage;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class qb4 implements Runnable {
    public final byte a = 0;
    public final long b;
    public final boolean c;
    public final long d;
    public final Object e;
    public final Object f;
    public final Object h;

    public qb4(bc4 bc4Var, boolean z, String str, long j, long j2, Float f) {
        this.e = bc4Var;
        this.c = z;
        this.f = str;
        this.b = j;
        this.d = j2;
        this.h = f;
    }

    @Override
    public final void run() {
        qd4 qd4Var;
        switch (this.a) {
            case 0:
                bc4 bc4Var = (bc4) this.e;
                boolean z = this.c;
                String str = (String) this.f;
                long j = this.b;
                long j2 = this.d;
                Float f = (Float) this.h;
                if (z) {
                    qd4Var = (qd4) bc4Var.n.get(str);
                } else {
                    qd4Var = (qd4) bc4Var.h.get(str);
                }
                qd4 qd4Var2 = qd4Var;
                if (qd4Var2 != null) {
                    Utilities.d.c(new n40(qd4Var2, f, j2, j, (byte) 3));
                    return;
                } else if (j2 != 0) {
                    bc4Var.y.put(str, Long.valueOf(j2));
                    return;
                } else {
                    return;
                }
            default:
                h4b h4bVar = (h4b) this.e;
                long j3 = this.b;
                boolean z2 = this.c;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f;
                long j4 = this.d;
                TLObject tLObject = (TLObject) this.h;
                h4bVar.D.remove(Long.valueOf(j3));
                if (!z2) {
                    peerStories = h4bVar.x(j4);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i = 0; i < tL_stories_stories.stories.size(); i++) {
                            for (int i2 = 0; i2 < peerStories.stories.size(); i2++) {
                                if (peerStories.stories.get(i2).id == tL_stories_stories.stories.get(i).id) {
                                    peerStories.stories.set(i2, tL_stories_stories.stories.get(i));
                                    h4bVar.Y(j4, tL_stories_stories.stories.get(i));
                                }
                            }
                        }
                        if (!z2) {
                            t4b t4bVar = h4bVar.k;
                            t4bVar.b.a.c(new s4b(t4bVar, peerStories, (byte) 0));
                        }
                    }
                    nm7.f(h4bVar.a).k(329, new Object[0]);
                    return;
                }
                return;
        }
    }

    public qb4(h4b h4bVar, long j, boolean z, TL_stories.PeerStories peerStories, long j2, TLObject tLObject) {
        this.e = h4bVar;
        this.b = j;
        this.c = z;
        this.f = peerStories;
        this.d = j2;
        this.h = tLObject;
    }
}
