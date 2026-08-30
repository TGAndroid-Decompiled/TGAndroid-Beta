package lh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class i6 implements Runnable {
    public final int f12610a = 0;
    public final boolean f12611b;
    public final long f12612c;
    public final boolean d;
    public final Object e;
    public final Object f12613f;
    public final TLObject h;
    public final TLObject f12614n;
    public final Object f12615r;

    public i6(t7 t7Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z4, boolean z10, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, kh.s5 s5Var) {
        this.e = t7Var;
        this.f12613f = zArr;
        this.h = starGift;
        this.f12611b = z4;
        this.d = z10;
        this.f12612c = j10;
        this.f12614n = tL_textWithEntities;
        this.f12615r = s5Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: lh.i6.run():void");
    }

    public i6(ph.da daVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z4, long j10, boolean z10, TLRPC.TL_error tL_error, org.telegram.ui.web.o0 o0Var) {
        this.e = daVar;
        this.f12613f = tLObject;
        this.h = tL_startLive;
        this.f12611b = z4;
        this.f12612c = j10;
        this.d = z10;
        this.f12614n = tL_error;
        this.f12615r = o0Var;
    }
}
