package ci;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class w7 implements Runnable {
    public final int f6261a = 0;
    public final boolean f6262b;
    public final long f6263c;
    public final boolean d;
    public final Object f6264e;
    public final Object f6265f;
    public final TLObject h;
    public final TLObject f6266n;
    public final Object f6267r;

    public w7(e9 e9Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, ai.n6 n6Var) {
        this.f6264e = e9Var;
        this.f6265f = zArr;
        this.h = starGift;
        this.f6262b = z10;
        this.d = z11;
        this.f6263c = j10;
        this.f6266n = tL_textWithEntities;
        this.f6267r = n6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ci.w7.run():void");
    }

    public w7(gi.va vaVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j10, boolean z11, TLRPC.TL_error tL_error, gi.f6 f6Var) {
        this.f6264e = vaVar;
        this.f6265f = tLObject;
        this.h = tL_startLive;
        this.f6262b = z10;
        this.f6263c = j10;
        this.d = z11;
        this.f6266n = tL_error;
        this.f6267r = f6Var;
    }
}
