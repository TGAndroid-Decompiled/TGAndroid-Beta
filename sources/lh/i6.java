package lh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f12594a = 0;
    public final boolean f12595b;
    public final long f12596c;
    public final boolean d;
    public final Object e;
    public final Object f12597f;
    public final TLObject h;
    public final TLObject f12598n;
    public final Object f12599r;

    public i6(t7 t7Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z4, boolean z10, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, kh.r5 r5Var) {
        this.e = t7Var;
        this.f12597f = zArr;
        this.h = starGift;
        this.f12595b = z4;
        this.d = z10;
        this.f12596c = j10;
        this.f12598n = tL_textWithEntities;
        this.f12599r = r5Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: lh.i6.run():void");
    }

    public i6(ph.da daVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z4, long j10, boolean z10, TLRPC.TL_error tL_error, org.telegram.ui.web.q0 q0Var) {
        this.e = daVar;
        this.f12597f = tLObject;
        this.h = tL_startLive;
        this.f12595b = z4;
        this.f12596c = j10;
        this.d = z10;
        this.f12598n = tL_error;
        this.f12599r = q0Var;
    }
}
