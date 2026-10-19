package ai;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class s8 implements Runnable {
    public final int f2156a = 0;
    public final boolean f2157b;
    public final long f2158c;
    public final boolean d;
    public final Object e;
    public final Object f2159f;
    public final TLObject h;
    public final TLObject f2160n;
    public final Object f2161r;

    public s8(ga gaVar, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, yh.l4 l4Var) {
        this.e = gaVar;
        this.f2159f = zArr;
        this.h = starGift;
        this.f2157b = z10;
        this.d = z11;
        this.f2158c = j10;
        this.f2160n = tL_textWithEntities;
        this.f2161r = l4Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.s8.run():void");
    }

    public s8(ei.vb vbVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j10, boolean z11, TLRPC.TL_error tL_error, com.google.firebase.messaging.s sVar) {
        this.e = vbVar;
        this.f2159f = tLObject;
        this.h = tL_startLive;
        this.f2157b = z10;
        this.f2158c = j10;
        this.d = z11;
        this.f2160n = tL_error;
        this.f2161r = sVar;
    }
}
