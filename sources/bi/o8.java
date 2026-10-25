package bi;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class o8 implements Runnable {
    public final int f5198a = 0;
    public final boolean f5199b;
    public final long f5200c;
    public final boolean d;
    public final Object e;
    public final Object f5201f;
    public final TLObject h;
    public final TLObject f5202n;
    public final Object f5203r;

    public o8(ca caVar, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, zh.m4 m4Var) {
        this.e = caVar;
        this.f5201f = zArr;
        this.h = starGift;
        this.f5199b = z10;
        this.d = z11;
        this.f5200c = j10;
        this.f5202n = tL_textWithEntities;
        this.f5203r = m4Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.o8.run():void");
    }

    public o8(fi.sb sbVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j10, boolean z11, TLRPC.TL_error tL_error, di.s8 s8Var) {
        this.e = sbVar;
        this.f5201f = tLObject;
        this.h = tL_startLive;
        this.f5199b = z10;
        this.f5200c = j10;
        this.d = z11;
        this.f5202n = tL_error;
        this.f5203r = s8Var;
    }
}
