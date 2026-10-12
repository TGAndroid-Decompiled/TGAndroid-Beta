package di;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class ta implements Runnable {
    public final int f7854a = 0;
    public final boolean f7855b;
    public final boolean f7856c;
    public final long d;
    public final Object e;
    public final Object f7857f;
    public final TLObject h;
    public final TLObject f7858n;
    public final Object f7859r;

    public ta(kc kcVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j10, boolean z11, TLRPC.TL_error tL_error, x8 x8Var) {
        this.e = kcVar;
        this.f7857f = tLObject;
        this.h = tL_startLive;
        this.f7855b = z10;
        this.d = j10;
        this.f7856c = z11;
        this.f7858n = tL_error;
        this.f7859r = x8Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.ta.run():void");
    }

    public ta(zh.n5 n5Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, yh.l4 l4Var) {
        this.e = n5Var;
        this.f7857f = zArr;
        this.h = starGift;
        this.f7855b = z10;
        this.f7856c = z11;
        this.d = j10;
        this.f7858n = tL_textWithEntities;
        this.f7859r = l4Var;
    }
}
