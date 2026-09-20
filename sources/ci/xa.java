package ci;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class xa implements Runnable {
    public final int f5780a = 0;
    public final boolean f5781b;
    public final boolean f5782c;
    public final long d;
    public final Object e;
    public final Object f5783f;
    public final TLObject h;
    public final TLObject f5784n;
    public final Object f5785r;

    public xa(oc ocVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j3, boolean z11, TLRPC.TL_error tL_error, androidx.fragment.app.a0 a0Var) {
        this.e = ocVar;
        this.f5783f = tLObject;
        this.h = tL_startLive;
        this.f5781b = z10;
        this.d = j3;
        this.f5782c = z11;
        this.f5784n = tL_error;
        this.f5785r = a0Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ci.xa.run():void");
    }

    public xa(yh.u5 u5Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, xh.n4 n4Var) {
        this.e = u5Var;
        this.f5783f = zArr;
        this.h = starGift;
        this.f5781b = z10;
        this.f5782c = z11;
        this.d = j3;
        this.f5784n = tL_textWithEntities;
        this.f5785r = n4Var;
    }
}
