package ci;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class ta implements Runnable {
    public final int f6014a = 0;
    public final boolean f6015b;
    public final boolean f6016c;
    public final long d;
    public final Object f6017e;
    public final Object f6018f;
    public final TLObject h;
    public final TLObject f6019n;
    public final Object f6020r;

    public ta(kc kcVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j3, boolean z11, TLRPC.TL_error tL_error, androidx.fragment.app.a0 a0Var) {
        this.f6017e = kcVar;
        this.f6018f = tLObject;
        this.h = tL_startLive;
        this.f6015b = z10;
        this.d = j3;
        this.f6016c = z11;
        this.f6019n = tL_error;
        this.f6020r = a0Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ci.ta.run():void");
    }

    public ta(yh.t5 t5Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, xh.n4 n4Var) {
        this.f6017e = t5Var;
        this.f6018f = zArr;
        this.h = starGift;
        this.f6015b = z10;
        this.f6016c = z11;
        this.d = j3;
        this.f6019n = tL_textWithEntities;
        this.f6020r = n4Var;
    }
}
