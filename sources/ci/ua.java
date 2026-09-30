package ci;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class ua implements Runnable {
    public final int f5642a = 0;
    public final boolean f5643b;
    public final boolean f5644c;
    public final long d;
    public final Object e;
    public final Object f5645f;
    public final TLObject h;
    public final TLObject f5646n;
    public final Object f5647r;

    public ua(lc lcVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j3, boolean z11, TLRPC.TL_error tL_error, androidx.fragment.app.a0 a0Var) {
        this.e = lcVar;
        this.f5645f = tLObject;
        this.h = tL_startLive;
        this.f5643b = z10;
        this.d = j3;
        this.f5644c = z11;
        this.f5646n = tL_error;
        this.f5647r = a0Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ci.ua.run():void");
    }

    public ua(yh.s5 s5Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, xh.n4 n4Var) {
        this.e = s5Var;
        this.f5645f = zArr;
        this.h = starGift;
        this.f5643b = z10;
        this.f5644c = z11;
        this.d = j3;
        this.f5646n = tL_textWithEntities;
        this.f5647r = n4Var;
    }
}
