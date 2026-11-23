package di;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class r7 implements Runnable {
    public final int f9656a = 0;
    public final boolean f9657b;
    public final long f9658c;
    public final boolean d;
    public final Object f9659e;
    public final Object f9660f;
    public final TLObject h;
    public final TLObject f9661n;
    public final Object f9662r;

    public r7(y8 y8Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, bi.r8 r8Var) {
        this.f9659e = y8Var;
        this.f9660f = zArr;
        this.h = starGift;
        this.f9657b = z10;
        this.d = z11;
        this.f9658c = j3;
        this.f9661n = tL_textWithEntities;
        this.f9662r = r8Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.r7.run():void");
    }

    public r7(hi.ta taVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j3, boolean z11, TLRPC.TL_error tL_error, hi.b0 b0Var) {
        this.f9659e = taVar;
        this.f9660f = tLObject;
        this.h = tL_startLive;
        this.f9657b = z10;
        this.f9658c = j3;
        this.d = z11;
        this.f9661n = tL_error;
        this.f9662r = b0Var;
    }
}
