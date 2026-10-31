package ag;

import org.telegram.tgnet.TLRPC;
public final class n0 implements Runnable {
    public final int f648a;
    public final boolean f649b;
    public final Object f650c;
    public final Object d;
    public final Object e;
    public final Object f651f;

    public n0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f648a = i10;
        this.f650c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f651f = obj4;
        this.f649b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ag.n0.run():void");
    }

    public n0(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.f648a = i10;
        this.f650c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f649b = z10;
        this.f651f = obj4;
    }

    public n0(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.f648a = i10;
        this.f650c = obj;
        this.d = obj2;
        this.f649b = z10;
        this.e = obj3;
        this.f651f = obj4;
    }

    public n0(Object obj, boolean z10, Object obj2, Object obj3, Object obj4, int i10) {
        this.f648a = i10;
        this.f650c = obj;
        this.f649b = z10;
        this.d = obj2;
        this.e = obj3;
        this.f651f = obj4;
    }

    public n0(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j10, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f648a = 3;
        this.f650c = payments_giveawayinfo;
        this.f649b = z10;
        this.d = str;
        this.e = tL_messageMediaGiveaway;
        this.f651f = k2Var;
    }
}
