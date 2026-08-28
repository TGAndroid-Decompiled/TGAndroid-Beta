package gh;

import kh.wb;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class l6 implements Runnable {
    public final int f8494a = 0;
    public final boolean f8495b;
    public final long f8496c;
    public final boolean d;
    public final Object f8497e;
    public final Object f8498f;
    public final TLObject h;
    public final TLObject f8499n;
    public final Object f8500r;

    public l6(v7 v7Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, fh.h6 h6Var) {
        this.f8497e = v7Var;
        this.f8498f = zArr;
        this.h = starGift;
        this.f8495b = z10;
        this.d = z11;
        this.f8496c = j10;
        this.f8499n = tL_textWithEntities;
        this.f8500r = h6Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gh.l6.run():void");
    }

    public l6(wb wbVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j10, boolean z11, TLRPC.TL_error tL_error, kh.f1 f1Var) {
        this.f8497e = wbVar;
        this.f8498f = tLObject;
        this.h = tL_startLive;
        this.f8495b = z10;
        this.f8496c = j10;
        this.d = z11;
        this.f8499n = tL_error;
        this.f8500r = f1Var;
    }
}
