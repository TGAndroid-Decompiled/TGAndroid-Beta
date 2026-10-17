package ai;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class r8 implements Runnable {
    public final int f2110a = 0;
    public final boolean f2111b;
    public final long f2112c;
    public final boolean d;
    public final Object e;
    public final Object f2113f;
    public final TLObject h;
    public final TLObject f2114n;
    public final Object f2115r;

    public r8(fa faVar, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, yh.m4 m4Var) {
        this.e = faVar;
        this.f2113f = zArr;
        this.h = starGift;
        this.f2111b = z10;
        this.d = z11;
        this.f2112c = j10;
        this.f2114n = tL_textWithEntities;
        this.f2115r = m4Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.r8.run():void");
    }

    public r8(ei.vb vbVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j10, boolean z11, TLRPC.TL_error tL_error, com.google.firebase.messaging.s sVar) {
        this.e = vbVar;
        this.f2113f = tLObject;
        this.h = tL_startLive;
        this.f2111b = z10;
        this.f2112c = j10;
        this.d = z11;
        this.f2114n = tL_error;
        this.f2115r = sVar;
    }
}
