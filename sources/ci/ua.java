package ci;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class ua implements Runnable {
    public final int f6094a = 0;
    public final boolean f6095b;
    public final boolean f6096c;
    public final long d;
    public final Object f6097e;
    public final Object f6098f;
    public final TLObject h;
    public final TLObject f6099n;
    public final Object f6100r;

    public ua(lc lcVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j3, boolean z11, TLRPC.TL_error tL_error, androidx.fragment.app.a0 a0Var) {
        this.f6097e = lcVar;
        this.f6098f = tLObject;
        this.h = tL_startLive;
        this.f6095b = z10;
        this.d = j3;
        this.f6096c = z11;
        this.f6099n = tL_error;
        this.f6100r = a0Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ci.ua.run():void");
    }

    public ua(yh.n5 n5Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, xh.m4 m4Var) {
        this.f6097e = n5Var;
        this.f6098f = zArr;
        this.h = starGift;
        this.f6095b = z10;
        this.f6096c = z11;
        this.d = j3;
        this.f6099n = tL_textWithEntities;
        this.f6100r = m4Var;
    }
}
