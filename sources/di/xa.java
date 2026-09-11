package di;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class xa implements Runnable {
    public final int f8412a = 0;
    public final boolean f8413b;
    public final boolean f8414c;
    public final long d;
    public final Object f8415e;
    public final Object f8416f;
    public final TLObject h;
    public final TLObject f8417n;
    public final Object f8418r;

    public xa(pc pcVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j3, boolean z11, TLRPC.TL_error tL_error, bi.oa oaVar) {
        this.f8415e = pcVar;
        this.f8416f = tLObject;
        this.h = tL_startLive;
        this.f8413b = z10;
        this.d = j3;
        this.f8414c = z11;
        this.f8417n = tL_error;
        this.f8418r = oaVar;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.xa.run():void");
    }

    public xa(zh.s5 s5Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, yh.l4 l4Var) {
        this.f8415e = s5Var;
        this.f8416f = zArr;
        this.h = starGift;
        this.f8413b = z10;
        this.f8414c = z11;
        this.d = j3;
        this.f8417n = tL_textWithEntities;
        this.f8418r = l4Var;
    }
}
