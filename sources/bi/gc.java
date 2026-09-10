package bi;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class gc implements Runnable {
    public final int f2759a = 0;
    public final boolean f2760b;
    public final boolean f2761c;
    public final long d;
    public final Object e;
    public final Object f2762f;
    public final TLObject h;
    public final TLObject f2763n;
    public final Object f2764r;

    public gc(ce ceVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j3, boolean z11, TLRPC.TL_error tL_error, a3.d dVar) {
        this.e = ceVar;
        this.f2762f = tLObject;
        this.h = tL_startLive;
        this.f2760b = z10;
        this.d = j3;
        this.f2761c = z11;
        this.f2763n = tL_error;
        this.f2764r = dVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.gc.run():void");
    }

    public gc(xh.v5 v5Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, wh.m4 m4Var) {
        this.e = v5Var;
        this.f2762f = zArr;
        this.h = starGift;
        this.f2760b = z10;
        this.f2761c = z11;
        this.d = j3;
        this.f2763n = tL_textWithEntities;
        this.f2764r = m4Var;
    }
}
