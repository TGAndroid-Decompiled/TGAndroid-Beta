package di;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class r7 implements Runnable {
    public final int f9692a = 0;
    public final boolean f9693b;
    public final long f9694c;
    public final boolean d;
    public final Object f9695e;
    public final Object f9696f;
    public final TLObject h;
    public final TLObject f9697n;
    public final Object f9698r;

    public r7(y8 y8Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, bi.o8 o8Var) {
        this.f9695e = y8Var;
        this.f9696f = zArr;
        this.h = starGift;
        this.f9693b = z10;
        this.d = z11;
        this.f9694c = j3;
        this.f9697n = tL_textWithEntities;
        this.f9698r = o8Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.r7.run():void");
    }

    public r7(hi.sa saVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j3, boolean z11, TLRPC.TL_error tL_error, hi.l lVar) {
        this.f9695e = saVar;
        this.f9696f = tLObject;
        this.h = tL_startLive;
        this.f9693b = z10;
        this.f9694c = j3;
        this.d = z11;
        this.f9697n = tL_error;
        this.f9698r = lVar;
    }
}
