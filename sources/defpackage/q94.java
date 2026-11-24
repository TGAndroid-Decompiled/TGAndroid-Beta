package defpackage;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class q94 implements Runnable {
    public final byte a = 0;
    public final long b;
    public final boolean c;
    public final long d;
    public final Object e;
    public final Object f;
    public final Object h;

    public q94(ba4 ba4Var, boolean z, String str, long j, long j2, Float f) {
        this.e = ba4Var;
        this.c = z;
        this.f = str;
        this.b = j;
        this.d = j2;
        this.h = f;
    }

    @Override
    public final void run() {
        qb4 qb4Var;
        switch (this.a) {
            case 0:
                ba4 ba4Var = (ba4) this.e;
                boolean z = this.c;
                String str = (String) this.f;
                long j = this.b;
                long j2 = this.d;
                Float f = (Float) this.h;
                if (z) {
                    qb4Var = (qb4) ba4Var.n.get(str);
                } else {
                    qb4Var = (qb4) ba4Var.h.get(str);
                }
                qb4 qb4Var2 = qb4Var;
                if (qb4Var2 != null) {
                    Utilities.d.c(new n30(qb4Var2, f, j2, j, (byte) 3));
                    return;
                } else if (j2 != 0) {
                    ba4Var.y.put(str, Long.valueOf(j2));
                    return;
                } else {
                    return;
                }
            default:
                g2b g2bVar = (g2b) this.e;
                long j3 = this.b;
                boolean z2 = this.c;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f;
                long j4 = this.d;
                TLObject tLObject = (TLObject) this.h;
                g2bVar.D.remove(Long.valueOf(j3));
                if (!z2) {
                    peerStories = g2bVar.x(j4);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i = 0; i < tL_stories_stories.stories.size(); i++) {
                            for (int i2 = 0; i2 < peerStories.stories.size(); i2++) {
                                if (peerStories.stories.get(i2).id == tL_stories_stories.stories.get(i).id) {
                                    peerStories.stories.set(i2, tL_stories_stories.stories.get(i));
                                    g2bVar.Y(j4, tL_stories_stories.stories.get(i));
                                }
                            }
                        }
                        if (!z2) {
                            s2b s2bVar = g2bVar.k;
                            s2bVar.b.a.c(new r2b(s2bVar, peerStories, (byte) 0));
                        }
                    }
                    kk7.f(g2bVar.a).k(327, new Object[0]);
                    return;
                }
                return;
        }
    }

    public q94(g2b g2bVar, long j, boolean z, TL_stories.PeerStories peerStories, long j2, TLObject tLObject) {
        this.e = g2bVar;
        this.b = j;
        this.c = z;
        this.f = peerStories;
        this.d = j2;
        this.h = tLObject;
    }
}
