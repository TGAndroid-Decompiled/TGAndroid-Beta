package jh;

import nh.gb;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f12252a = 0;
    public final boolean f12253b;
    public final long f12254c;
    public final boolean d;
    public final Object f12255e;
    public final Object f12256f;
    public final TLObject h;
    public final TLObject f12257n;
    public final Object f12258r;

    public i6(s7 s7Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, ih.s5 s5Var) {
        this.f12255e = s7Var;
        this.f12256f = zArr;
        this.h = starGift;
        this.f12253b = z10;
        this.d = z11;
        this.f12254c = j10;
        this.f12257n = tL_textWithEntities;
        this.f12258r = s5Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: jh.i6.run():void");
    }

    public i6(gb gbVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j10, boolean z11, TLRPC.TL_error tL_error, nh.m6 m6Var) {
        this.f12255e = gbVar;
        this.f12256f = tLObject;
        this.h = tL_startLive;
        this.f12253b = z10;
        this.f12254c = j10;
        this.d = z11;
        this.f12257n = tL_error;
        this.f12258r = m6Var;
    }
}
