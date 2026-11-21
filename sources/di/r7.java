package di;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class r7 implements Runnable {
    public final int f9689a = 0;
    public final boolean f9690b;
    public final long f9691c;
    public final boolean d;
    public final Object f9692e;
    public final Object f9693f;
    public final TLObject h;
    public final TLObject f9694n;
    public final Object f9695r;

    public r7(y8 y8Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, bi.p8 p8Var) {
        this.f9692e = y8Var;
        this.f9693f = zArr;
        this.h = starGift;
        this.f9690b = z10;
        this.d = z11;
        this.f9691c = j3;
        this.f9694n = tL_textWithEntities;
        this.f9695r = p8Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.r7.run():void");
    }

    public r7(hi.sa saVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j3, boolean z11, TLRPC.TL_error tL_error, hi.l lVar) {
        this.f9692e = saVar;
        this.f9693f = tLObject;
        this.h = tL_startLive;
        this.f9690b = z10;
        this.f9691c = j3;
        this.d = z11;
        this.f9694n = tL_error;
        this.f9695r = lVar;
    }
}
