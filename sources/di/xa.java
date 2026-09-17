package di;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class xa implements Runnable {
    public final int f8440a = 0;
    public final boolean f8441b;
    public final boolean f8442c;
    public final long d;
    public final Object f8443e;
    public final Object f8444f;
    public final TLObject h;
    public final TLObject f8445n;
    public final Object f8446r;

    public xa(pc pcVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j3, boolean z11, TLRPC.TL_error tL_error, bi.oa oaVar) {
        this.f8443e = pcVar;
        this.f8444f = tLObject;
        this.h = tL_startLive;
        this.f8441b = z10;
        this.d = j3;
        this.f8442c = z11;
        this.f8445n = tL_error;
        this.f8446r = oaVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.xa.run():void");
    }

    public xa(zh.s5 s5Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, yh.l4 l4Var) {
        this.f8443e = s5Var;
        this.f8444f = zArr;
        this.h = starGift;
        this.f8441b = z10;
        this.f8442c = z11;
        this.d = j3;
        this.f8445n = tL_textWithEntities;
        this.f8446r = l4Var;
    }
}
