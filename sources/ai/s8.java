package ai;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class s8 implements Runnable {
    public final int f2159a = 0;
    public final boolean f2160b;
    public final long f2161c;
    public final boolean d;
    public final Object e;
    public final Object f2162f;
    public final TLObject h;
    public final TLObject f2163n;
    public final Object f2164r;

    public s8(ha haVar, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, yh.l4 l4Var) {
        this.e = haVar;
        this.f2162f = zArr;
        this.h = starGift;
        this.f2160b = z10;
        this.d = z11;
        this.f2161c = j10;
        this.f2163n = tL_textWithEntities;
        this.f2164r = l4Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.s8.run():void");
    }

    public s8(ei.vb vbVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j10, boolean z11, TLRPC.TL_error tL_error, com.google.firebase.messaging.s sVar) {
        this.e = vbVar;
        this.f2162f = tLObject;
        this.h = tL_startLive;
        this.f2160b = z10;
        this.f2161c = j10;
        this.d = z11;
        this.f2163n = tL_error;
        this.f2164r = sVar;
    }
}
