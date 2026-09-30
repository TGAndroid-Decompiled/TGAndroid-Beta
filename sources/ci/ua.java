package ci;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class ua implements Runnable {
    public final int f5633a = 0;
    public final boolean f5634b;
    public final boolean f5635c;
    public final long d;
    public final Object e;
    public final Object f5636f;
    public final TLObject h;
    public final TLObject f5637n;
    public final Object f5638r;

    public ua(lc lcVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j3, boolean z11, TLRPC.TL_error tL_error, androidx.fragment.app.a0 a0Var) {
        this.e = lcVar;
        this.f5636f = tLObject;
        this.h = tL_startLive;
        this.f5634b = z10;
        this.d = j3;
        this.f5635c = z11;
        this.f5637n = tL_error;
        this.f5638r = a0Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ci.ua.run():void");
    }

    public ua(yh.t5 t5Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, xh.n4 n4Var) {
        this.e = t5Var;
        this.f5636f = zArr;
        this.h = starGift;
        this.f5634b = z10;
        this.f5635c = z11;
        this.d = j3;
        this.f5637n = tL_textWithEntities;
        this.f5638r = n4Var;
    }
}
