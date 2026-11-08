package bi;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class v8 implements Runnable {
    public final int f4899a = 0;
    public final boolean f4900b;
    public final long f4901c;
    public final boolean d;
    public final Object f4902e;
    public final Object f4903f;
    public final TLObject h;
    public final TLObject f4904n;
    public final Object f4905r;

    public v8(ea eaVar, boolean[] zArr, TL_stars.StarGift starGift, boolean z9, boolean z10, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, zh.o3 o3Var) {
        this.f4902e = eaVar;
        this.f4903f = zArr;
        this.h = starGift;
        this.f4900b = z9;
        this.d = z10;
        this.f4901c = j3;
        this.f4904n = tL_textWithEntities;
        this.f4905r = o3Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.v8.run():void");
    }

    public v8(fi.va vaVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z9, long j3, boolean z10, TLRPC.TL_error tL_error, di.s7 s7Var) {
        this.f4902e = vaVar;
        this.f4903f = tLObject;
        this.h = tL_startLive;
        this.f4900b = z9;
        this.f4901c = j3;
        this.d = z10;
        this.f4904n = tL_error;
        this.f4905r = s7Var;
    }
}
