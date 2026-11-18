package di;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class r7 implements Runnable {
    public final int f9657a = 0;
    public final boolean f9658b;
    public final long f9659c;
    public final boolean d;
    public final Object f9660e;
    public final Object f9661f;
    public final TLObject h;
    public final TLObject f9662n;
    public final Object f9663r;

    public r7(x8 x8Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, bi.l8 l8Var) {
        this.f9660e = x8Var;
        this.f9661f = zArr;
        this.h = starGift;
        this.f9658b = z10;
        this.d = z11;
        this.f9659c = j3;
        this.f9662n = tL_textWithEntities;
        this.f9663r = l8Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.r7.run():void");
    }

    public r7(hi.ta taVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j3, boolean z11, TLRPC.TL_error tL_error, hi.k kVar) {
        this.f9660e = taVar;
        this.f9661f = tLObject;
        this.h = tL_startLive;
        this.f9658b = z10;
        this.f9659c = j3;
        this.d = z11;
        this.f9662n = tL_error;
        this.f9663r = kVar;
    }
}
