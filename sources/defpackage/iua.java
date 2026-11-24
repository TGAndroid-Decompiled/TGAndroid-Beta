package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class iua implements Runnable {
    public final byte a = 0;
    public final boolean b;
    public final long c;
    public final boolean d;
    public final Object e;
    public final Object f;
    public final TLObject h;
    public final TLObject n;
    public final Object r;

    public iua(jva jvaVar, boolean[] zArr, TL_stars.StarGift starGift, boolean z, boolean z2, long j, TLRPC.TL_textWithEntities tL_textWithEntities, y2a y2aVar) {
        this.e = jvaVar;
        this.f = zArr;
        this.h = starGift;
        this.b = z;
        this.d = z2;
        this.c = j;
        this.n = tL_textWithEntities;
        this.r = y2aVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iua.run():void");
    }

    public iua(v9b v9bVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z, long j, boolean z2, TLRPC.TL_error tL_error, nsa nsaVar) {
        this.e = v9bVar;
        this.f = tLObject;
        this.h = tL_startLive;
        this.b = z;
        this.c = j;
        this.d = z2;
        this.n = tL_error;
        this.r = nsaVar;
    }
}
