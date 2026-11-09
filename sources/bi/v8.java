package bi;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class v8 implements Runnable {
    public final int f4897a = 0;
    public final boolean f4898b;
    public final long f4899c;
    public final boolean d;
    public final Object f4900e;
    public final Object f4901f;
    public final TLObject h;
    public final TLObject f4902n;
    public final Object f4903r;

    public v8(ea eaVar, boolean[] zArr, TL_stars.StarGift starGift, boolean z9, boolean z10, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, zh.p3 p3Var) {
        this.f4900e = eaVar;
        this.f4901f = zArr;
        this.h = starGift;
        this.f4898b = z9;
        this.d = z10;
        this.f4899c = j3;
        this.f4902n = tL_textWithEntities;
        this.f4903r = p3Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.v8.run():void");
    }

    public v8(fi.va vaVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z9, long j3, boolean z10, TLRPC.TL_error tL_error, di.f8 f8Var) {
        this.f4900e = vaVar;
        this.f4901f = tLObject;
        this.h = tL_startLive;
        this.f4898b = z9;
        this.f4899c = j3;
        this.d = z10;
        this.f4902n = tL_error;
        this.f4903r = f8Var;
    }
}
