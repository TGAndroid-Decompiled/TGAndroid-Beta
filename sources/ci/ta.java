package ci;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class ta implements Runnable {
    public final int f5589a = 0;
    public final boolean f5590b;
    public final boolean f5591c;
    public final long d;
    public final Object e;
    public final Object f5592f;
    public final TLObject h;
    public final TLObject f5593n;
    public final Object f5594r;

    public ta(kc kcVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j3, boolean z11, TLRPC.TL_error tL_error, androidx.fragment.app.a0 a0Var) {
        this.e = kcVar;
        this.f5592f = tLObject;
        this.h = tL_startLive;
        this.f5590b = z10;
        this.d = j3;
        this.f5591c = z11;
        this.f5593n = tL_error;
        this.f5594r = a0Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ci.ta.run():void");
    }

    public ta(yh.s5 s5Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, xh.o4 o4Var) {
        this.e = s5Var;
        this.f5592f = zArr;
        this.h = starGift;
        this.f5590b = z10;
        this.f5591c = z11;
        this.d = j3;
        this.f5593n = tL_textWithEntities;
        this.f5594r = o4Var;
    }
}
