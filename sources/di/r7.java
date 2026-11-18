package di;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class r7 implements Runnable {
    public final int f9660a = 0;
    public final boolean f9661b;
    public final long f9662c;
    public final boolean d;
    public final Object f9663e;
    public final Object f9664f;
    public final TLObject h;
    public final TLObject f9665n;
    public final Object f9666r;

    public r7(x8 x8Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, bi.m8 m8Var) {
        this.f9663e = x8Var;
        this.f9664f = zArr;
        this.h = starGift;
        this.f9661b = z10;
        this.d = z11;
        this.f9662c = j3;
        this.f9665n = tL_textWithEntities;
        this.f9666r = m8Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.r7.run():void");
    }

    public r7(hi.ta taVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j3, boolean z11, TLRPC.TL_error tL_error, hi.k kVar) {
        this.f9663e = taVar;
        this.f9664f = tLObject;
        this.h = tL_startLive;
        this.f9661b = z10;
        this.f9662c = j3;
        this.d = z11;
        this.f9665n = tL_error;
        this.f9666r = kVar;
    }
}
