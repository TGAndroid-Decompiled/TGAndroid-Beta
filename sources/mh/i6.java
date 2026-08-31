package mh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f14257a = 0;
    public final boolean f14258b;
    public final long f14259c;
    public final boolean d;
    public final Object f14260e;
    public final Object f14261f;
    public final TLObject h;
    public final TLObject f14262n;
    public final Object f14263r;

    public i6(t7 t7Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z4, boolean z10, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, lh.s5 s5Var) {
        this.f14260e = t7Var;
        this.f14261f = zArr;
        this.h = starGift;
        this.f14258b = z4;
        this.d = z10;
        this.f14259c = j10;
        this.f14262n = tL_textWithEntities;
        this.f14263r = s5Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: mh.i6.run():void");
    }

    public i6(qh.ca caVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z4, long j10, boolean z10, TLRPC.TL_error tL_error, org.telegram.ui.web.s0 s0Var) {
        this.f14260e = caVar;
        this.f14261f = tLObject;
        this.h = tL_startLive;
        this.f14258b = z4;
        this.f14259c = j10;
        this.d = z10;
        this.f14262n = tL_error;
        this.f14263r = s0Var;
    }
}
