package ci;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class ua implements Runnable {
    public final int f6095a = 0;
    public final boolean f6096b;
    public final boolean f6097c;
    public final long d;
    public final Object f6098e;
    public final Object f6099f;
    public final TLObject h;
    public final TLObject f6100n;
    public final Object f6101r;

    public ua(lc lcVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j3, boolean z11, TLRPC.TL_error tL_error, androidx.fragment.app.a0 a0Var) {
        this.f6098e = lcVar;
        this.f6099f = tLObject;
        this.h = tL_startLive;
        this.f6096b = z10;
        this.d = j3;
        this.f6097c = z11;
        this.f6100n = tL_error;
        this.f6101r = a0Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ci.ua.run():void");
    }

    public ua(yh.n5 n5Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, xh.n4 n4Var) {
        this.f6098e = n5Var;
        this.f6099f = zArr;
        this.h = starGift;
        this.f6096b = z10;
        this.f6097c = z11;
        this.d = j3;
        this.f6100n = tL_textWithEntities;
        this.f6101r = n4Var;
    }
}
