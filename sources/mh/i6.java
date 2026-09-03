package mh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f14259a = 0;
    public final boolean f14260b;
    public final long f14261c;
    public final boolean d;
    public final Object f14262e;
    public final Object f14263f;
    public final TLObject h;
    public final TLObject f14264n;
    public final Object f14265r;

    public i6(t7 t7Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z4, boolean z10, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, lh.s5 s5Var) {
        this.f14262e = t7Var;
        this.f14263f = zArr;
        this.h = starGift;
        this.f14260b = z4;
        this.d = z10;
        this.f14261c = j10;
        this.f14264n = tL_textWithEntities;
        this.f14265r = s5Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: mh.i6.run():void");
    }

    public i6(qh.ba baVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z4, long j10, boolean z10, TLRPC.TL_error tL_error, org.telegram.ui.web.s0 s0Var) {
        this.f14262e = baVar;
        this.f14263f = tLObject;
        this.h = tL_startLive;
        this.f14260b = z4;
        this.f14261c = j10;
        this.d = z10;
        this.f14264n = tL_error;
        this.f14265r = s0Var;
    }
}
