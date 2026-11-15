package di;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class o7 implements Runnable {
    public final int f9174a = 0;
    public final boolean f9175b;
    public final long f9176c;
    public final boolean d;
    public final Object f9177e;
    public final Object f9178f;
    public final TLObject h;
    public final TLObject f9179n;
    public final Object f9180r;

    public o7(v8 v8Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, bi.f6 f6Var) {
        this.f9177e = v8Var;
        this.f9178f = zArr;
        this.h = starGift;
        this.f9175b = z10;
        this.d = z11;
        this.f9176c = j3;
        this.f9179n = tL_textWithEntities;
        this.f9180r = f6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.o7.run():void");
    }

    public o7(hi.sa saVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j3, boolean z11, TLRPC.TL_error tL_error, hi.e1 e1Var) {
        this.f9177e = saVar;
        this.f9178f = tLObject;
        this.h = tL_startLive;
        this.f9175b = z10;
        this.f9176c = j3;
        this.d = z11;
        this.f9179n = tL_error;
        this.f9180r = e1Var;
    }
}
