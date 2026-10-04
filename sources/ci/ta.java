package ci;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class ta implements Runnable {
    public final int f6015a = 0;
    public final boolean f6016b;
    public final boolean f6017c;
    public final long d;
    public final Object f6018e;
    public final Object f6019f;
    public final TLObject h;
    public final TLObject f6020n;
    public final Object f6021r;

    public ta(kc kcVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j3, boolean z11, TLRPC.TL_error tL_error, androidx.fragment.app.a0 a0Var) {
        this.f6018e = kcVar;
        this.f6019f = tLObject;
        this.h = tL_startLive;
        this.f6016b = z10;
        this.d = j3;
        this.f6017c = z11;
        this.f6020n = tL_error;
        this.f6021r = a0Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ci.ta.run():void");
    }

    public ta(yh.t5 t5Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, xh.n4 n4Var) {
        this.f6018e = t5Var;
        this.f6019f = zArr;
        this.h = starGift;
        this.f6016b = z10;
        this.f6017c = z11;
        this.d = j3;
        this.f6020n = tL_textWithEntities;
        this.f6021r = n4Var;
    }
}
