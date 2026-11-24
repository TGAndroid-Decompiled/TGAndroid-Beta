package defpackage;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import j$.util.Comparator$CC;
import j$.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
public final class kt4 extends pf0 {
    public static volatile kt4[] h = new kt4[4];
    public final sk4 a;
    public final LongSparseArray b;
    public final ArrayList c;
    public boolean d;
    public final LongSparseArray e;
    public final e59 f;

    public kt4(int i) {
        super(i);
        this.a = new sk4((byte) 19);
        this.b = new LongSparseArray();
        this.c = new ArrayList();
        this.e = new LongSparseArray();
        this.f = new e59(0, false);
    }

    public static kt4 c(int i) {
        kt4 kt4Var;
        kt4 kt4Var2 = h[i];
        if (kt4Var2 == null) {
            synchronized (kt4.class) {
                kt4Var = h[i];
                if (kt4Var == null) {
                    kt4[] kt4VarArr = h;
                    kt4 kt4Var3 = new kt4(i);
                    kt4VarArr[i] = kt4Var3;
                    kt4Var = kt4Var3;
                }
            }
            return kt4Var;
        }
        return kt4Var2;
    }

    public final void a(TL_stars.StarGift starGift, TL_stars.StarGiftAuctionState starGiftAuctionState, TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
        ht4 d = d(starGift.id);
        gt4 gt4Var = d.b;
        if (gt4Var == null) {
            gt4 gt4Var2 = new gt4(this.currentAccount, starGift, starGiftAuctionState, tL_StarGiftAuctionUserState);
            d.b = gt4Var2;
            gt4Var2.h = d.c;
        } else {
            gt4Var.d = starGift;
            gt4Var.a(starGiftAuctionState);
            gt4 gt4Var3 = d.b;
            gt4Var3.e = tL_StarGiftAuctionUserState;
            gt4Var3.h();
        }
        o();
        g(starGift.id);
    }

    public final gt4 b(long j) {
        ht4 ht4Var = (ht4) this.b.get(j);
        if (ht4Var != null) {
            return ht4Var.b;
        }
        return null;
    }

    public final ht4 d(long j) {
        LongSparseArray longSparseArray = this.b;
        ht4 ht4Var = (ht4) longSparseArray.get(j);
        if (ht4Var == null) {
            ht4 ht4Var2 = new ht4(j);
            longSparseArray.put(j, ht4Var2);
            return ht4Var2;
        }
        return ht4Var;
    }

    public final void e(long j, p8c p8cVar) {
        gt4 gt4Var;
        ht4 ht4Var = (ht4) this.b.get(j);
        if (ht4Var != null && (gt4Var = ht4Var.b) != null) {
            ArrayList arrayList = ht4Var.g;
            if (arrayList != null && gt4Var.e.acquired_count == arrayList.size()) {
                p8cVar.a(ht4Var.g);
                return;
            }
            TL_payments.TL_getStarGiftAuctionAcquiredGifts tL_getStarGiftAuctionAcquiredGifts = new TL_payments.TL_getStarGiftAuctionAcquiredGifts();
            tL_getStarGiftAuctionAcquiredGifts.gift_id = j;
            getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionAcquiredGifts, new hc((byte) 0), new p(this, p8cVar, ht4Var, (byte) 10));
            return;
        }
        p8cVar.a(null);
    }

    public final void f(long j, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        a(tL_StarGiftAuctionState.gift, tL_StarGiftAuctionState.state, tL_StarGiftAuctionState.user_state);
        ht4 ht4Var = (ht4) this.b.get(j);
        if (ht4Var != null && ht4Var.e) {
            de2 de2Var = new de2(this, ht4Var, j, (byte) 22);
            ht4Var.d = de2Var;
            gl.d3(de2Var, tL_StarGiftAuctionState.timeout * 1000);
        }
    }

    public final void g(long j) {
        Iterator it;
        gt4 b = b(j);
        sk4 sk4Var = this.a;
        Long valueOf = Long.valueOf(j);
        synchronized (((HashMap) sk4Var.c)) {
            e59 e59Var = (e59) ((HashMap) sk4Var.c).get(valueOf);
            if (e59Var != null) {
                it = e59Var.iterator();
            } else {
                it = null;
            }
        }
        if (b != null && it != null) {
            while (it.hasNext()) {
                ((jt4) it.next()).r(b);
            }
        }
    }

    public final void h(TL_update.TL_updateStarGiftAuctionState tL_updateStarGiftAuctionState) {
        gt4 gt4Var;
        ht4 ht4Var = (ht4) this.b.get(tL_updateStarGiftAuctionState.gift_id);
        if (ht4Var != null && (gt4Var = ht4Var.b) != null && gt4Var.a(tL_updateStarGiftAuctionState.state)) {
            o();
            g(ht4Var.a);
        }
    }

    public final void i(TL_update.TL_updateStarGiftAuctionUserState tL_updateStarGiftAuctionUserState) {
        gt4 gt4Var;
        ht4 ht4Var = (ht4) this.b.get(tL_updateStarGiftAuctionUserState.gift_id);
        if (ht4Var != null && (gt4Var = ht4Var.b) != null) {
            gt4Var.e = tL_updateStarGiftAuctionUserState.user_state;
            gt4Var.h();
            o();
            g(ht4Var.a);
        }
    }

    public final void j(long j, p8c p8cVar) {
        TL_stars.getStarGiftUpgradeAttributes getstargiftupgradeattributes = new TL_stars.getStarGiftUpgradeAttributes();
        getstargiftupgradeattributes.gift_id = j;
        getConnectionsManager().sendRequestTyped(getstargiftupgradeattributes, new hc((byte) 0), new ft4(p8cVar, (byte) 0));
    }

    public final void k(long j, sy syVar, long j2, jy jyVar) {
        boolean z;
        ht4 ht4Var = (ht4) this.b.get(j);
        if (ht4Var != null && !ht4Var.f) {
            if (!gta.v(this.currentAccount, false).e) {
                gta.v(this.currentAccount, false).o(new dt4(this, jyVar, j, syVar, j2));
                return;
            }
            gt4 gt4Var = ht4Var.b;
            if (gt4Var != null && gt4Var.e.bid_amount > 0) {
                z = true;
            } else {
                z = false;
            }
            ht4Var.f = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            TLRPC.TL_inputInvoiceStarGiftAuctionBid tL_inputInvoiceStarGiftAuctionBid = new TLRPC.TL_inputInvoiceStarGiftAuctionBid();
            tL_inputInvoiceStarGiftAuctionBid.gift_id = j;
            tL_inputInvoiceStarGiftAuctionBid.bid_amount = j2;
            tL_inputInvoiceStarGiftAuctionBid.update_bid = z;
            if (syVar != null) {
                long j3 = syVar.a;
                if (j3 == 0) {
                    tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
                } else {
                    tL_inputInvoiceStarGiftAuctionBid.peer = getMessagesController().h1(j3);
                }
                tL_inputInvoiceStarGiftAuctionBid.message = syVar.c;
                tL_inputInvoiceStarGiftAuctionBid.hide_name = syVar.b;
            } else if (!z) {
                tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
                tL_inputInvoiceStarGiftAuctionBid.hide_name = false;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftAuctionBid;
            getConnectionsManager().sendRequestTyped(tL_payments_getPaymentForm, new hc((byte) 0), new eu0(this, jyVar, ht4Var, tL_payments_getPaymentForm, (byte) 1));
            return;
        }
        jyVar.a(Boolean.FALSE, null);
    }

    public final gt4 l(long j, jt4 jt4Var) {
        sk4 sk4Var = this.a;
        Long valueOf = Long.valueOf(j);
        synchronized (((HashMap) sk4Var.c)) {
            e59 e59Var = (e59) ((HashMap) sk4Var.c).get(valueOf);
            if (e59Var == null) {
                e59Var = (e59) sk4Var.b;
                if (e59Var != null) {
                    sk4Var.b = e59Var.h;
                    e59Var.h = null;
                } else {
                    e59Var = new e59(0, false);
                }
                ((HashMap) sk4Var.c).put(valueOf, e59Var);
            }
            e59Var.add(jt4Var);
        }
        m(j);
        return b(j);
    }

    public final void m(long j) {
        int i;
        ht4 d = d(j);
        d.e = true;
        de2 de2Var = d.d;
        if (de2Var != null) {
            gl.r(de2Var);
            d.d = null;
        }
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = d.a;
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        gt4 gt4Var = d.b;
        if (gt4Var != null) {
            if (gt4Var.f()) {
                i = Integer.MAX_VALUE;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = gt4Var.f;
                if (tL_starGiftAuctionState != null) {
                    i = tL_starGiftAuctionState.version;
                }
            }
            tL_getStarGiftAuctionState.version = i;
            getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new hc((byte) 0), new jy(this, j, (byte) 2));
        }
        i = 0;
        tL_getStarGiftAuctionState.version = i;
        getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new hc((byte) 0), new jy(this, j, (byte) 2));
    }

    public final void n(long j, jt4 jt4Var) {
        sk4 sk4Var = this.a;
        Long valueOf = Long.valueOf(j);
        synchronized (((HashMap) sk4Var.c)) {
            e59 e59Var = (e59) ((HashMap) sk4Var.c).get(valueOf);
            if (e59Var != null) {
                e59Var.remove(jt4Var);
                if (e59Var.isEmpty()) {
                    ((HashMap) sk4Var.c).remove(valueOf);
                    e59Var.h = (e59) sk4Var.b;
                    sk4Var.b = e59Var;
                }
            }
        }
        ht4 ht4Var = (ht4) this.b.get(j);
        if (ht4Var != null) {
            ht4Var.e = this.a.y(Long.valueOf(j));
            de2 de2Var = ht4Var.d;
            if (de2Var != null) {
                gl.r(de2Var);
                ht4Var.d = null;
            }
        }
    }

    public final void o() {
        SharedPreferences sharedPreferences = getMessagesController().X3;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong("lastGiftAuctionTimeUpdate", System.currentTimeMillis()).apply();
        }
        ArrayList arrayList = this.c;
        arrayList.clear();
        LongSparseArray longSparseArray = this.b;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            ht4 ht4Var = (ht4) longSparseArray.valueAt(i);
            gt4 gt4Var = ht4Var.b;
            if (gt4Var != null && !gt4Var.f()) {
                gt4 gt4Var2 = ht4Var.b;
                if (gt4Var2.e.bid_amount > 0) {
                    arrayList.add(gt4Var2);
                }
            }
        }
        List.EL.sort(arrayList, Comparator$CC.comparingInt(new mm((byte) 5)));
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((it4) it.next()).c(arrayList);
        }
        kk7.f(this.currentAccount).k(kk7.S3, new Object[0]);
    }
}
