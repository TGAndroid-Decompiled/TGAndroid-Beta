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
public final class lv4 extends pg0 {
    public static volatile lv4[] h = new lv4[4];
    public final mj4 a;
    public final LongSparseArray b;
    public final ArrayList c;
    public boolean d;
    public final LongSparseArray e;
    public final g79 f;

    public lv4(int i) {
        super(i);
        this.a = new mj4((byte) 21);
        this.b = new LongSparseArray();
        this.c = new ArrayList();
        this.e = new LongSparseArray();
        this.f = new g79(0, false);
    }

    public static lv4 c(int i) {
        lv4 lv4Var;
        lv4 lv4Var2 = h[i];
        if (lv4Var2 == null) {
            synchronized (lv4.class) {
                lv4Var = h[i];
                if (lv4Var == null) {
                    lv4[] lv4VarArr = h;
                    lv4 lv4Var3 = new lv4(i);
                    lv4VarArr[i] = lv4Var3;
                    lv4Var = lv4Var3;
                }
            }
            return lv4Var;
        }
        return lv4Var2;
    }

    public final void a(TL_stars.StarGift starGift, TL_stars.StarGiftAuctionState starGiftAuctionState, TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
        iv4 d = d(starGift.id);
        hv4 hv4Var = d.b;
        if (hv4Var == null) {
            hv4 hv4Var2 = new hv4(this.currentAccount, starGift, starGiftAuctionState, tL_StarGiftAuctionUserState);
            d.b = hv4Var2;
            hv4Var2.h = d.c;
        } else {
            hv4Var.d = starGift;
            hv4Var.a(starGiftAuctionState);
            hv4 hv4Var3 = d.b;
            hv4Var3.e = tL_StarGiftAuctionUserState;
            hv4Var3.h();
        }
        o();
        g(starGift.id);
    }

    public final hv4 b(long j) {
        iv4 iv4Var = (iv4) this.b.get(j);
        if (iv4Var != null) {
            return iv4Var.b;
        }
        return null;
    }

    public final iv4 d(long j) {
        LongSparseArray longSparseArray = this.b;
        iv4 iv4Var = (iv4) longSparseArray.get(j);
        if (iv4Var == null) {
            iv4 iv4Var2 = new iv4(j);
            longSparseArray.put(j, iv4Var2);
            return iv4Var2;
        }
        return iv4Var;
    }

    public final void e(long j, qac qacVar) {
        hv4 hv4Var;
        iv4 iv4Var = (iv4) this.b.get(j);
        if (iv4Var != null && (hv4Var = iv4Var.b) != null) {
            ArrayList arrayList = iv4Var.g;
            if (arrayList != null && hv4Var.e.acquired_count == arrayList.size()) {
                qacVar.a(iv4Var.g);
                return;
            }
            TL_payments.TL_getStarGiftAuctionAcquiredGifts tL_getStarGiftAuctionAcquiredGifts = new TL_payments.TL_getStarGiftAuctionAcquiredGifts();
            tL_getStarGiftAuctionAcquiredGifts.gift_id = j;
            getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionAcquiredGifts, new kc((byte) 0), new p(this, qacVar, iv4Var, (byte) 10));
            return;
        }
        qacVar.a(null);
    }

    public final void f(long j, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        a(tL_StarGiftAuctionState.gift, tL_StarGiftAuctionState.state, tL_StarGiftAuctionState.user_state);
        iv4 iv4Var = (iv4) this.b.get(j);
        if (iv4Var != null && iv4Var.e) {
            of2 of2Var = new of2(this, iv4Var, j, (byte) 22);
            iv4Var.d = of2Var;
            gm.d3(of2Var, tL_StarGiftAuctionState.timeout * 1000);
        }
    }

    public final void g(long j) {
        Iterator it;
        hv4 b = b(j);
        mj4 mj4Var = this.a;
        Long valueOf = Long.valueOf(j);
        synchronized (((HashMap) mj4Var.c)) {
            g79 g79Var = (g79) ((HashMap) mj4Var.c).get(valueOf);
            if (g79Var != null) {
                it = g79Var.iterator();
            } else {
                it = null;
            }
        }
        if (b != null && it != null) {
            while (it.hasNext()) {
                ((kv4) it.next()).q(b);
            }
        }
    }

    public final void h(TL_update.TL_updateStarGiftAuctionState tL_updateStarGiftAuctionState) {
        hv4 hv4Var;
        iv4 iv4Var = (iv4) this.b.get(tL_updateStarGiftAuctionState.gift_id);
        if (iv4Var != null && (hv4Var = iv4Var.b) != null && hv4Var.a(tL_updateStarGiftAuctionState.state)) {
            o();
            g(iv4Var.a);
        }
    }

    public final void i(TL_update.TL_updateStarGiftAuctionUserState tL_updateStarGiftAuctionUserState) {
        hv4 hv4Var;
        iv4 iv4Var = (iv4) this.b.get(tL_updateStarGiftAuctionUserState.gift_id);
        if (iv4Var != null && (hv4Var = iv4Var.b) != null) {
            hv4Var.e = tL_updateStarGiftAuctionUserState.user_state;
            hv4Var.h();
            o();
            g(iv4Var.a);
        }
    }

    public final void j(long j, qac qacVar) {
        TL_stars.getStarGiftUpgradeAttributes getstargiftupgradeattributes = new TL_stars.getStarGiftUpgradeAttributes();
        getstargiftupgradeattributes.gift_id = j;
        getConnectionsManager().sendRequestTyped(getstargiftupgradeattributes, new kc((byte) 0), new gv4(qacVar, (byte) 0));
    }

    public final void k(long j, sz szVar, long j2, jz jzVar) {
        boolean z;
        iv4 iv4Var = (iv4) this.b.get(j);
        if (iv4Var != null && !iv4Var.f) {
            if (!jva.v(this.currentAccount, false).e) {
                jva.v(this.currentAccount, false).o(new ev4(this, jzVar, j, szVar, j2));
                return;
            }
            hv4 hv4Var = iv4Var.b;
            if (hv4Var != null && hv4Var.e.bid_amount > 0) {
                z = true;
            } else {
                z = false;
            }
            iv4Var.f = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            TLRPC.TL_inputInvoiceStarGiftAuctionBid tL_inputInvoiceStarGiftAuctionBid = new TLRPC.TL_inputInvoiceStarGiftAuctionBid();
            tL_inputInvoiceStarGiftAuctionBid.gift_id = j;
            tL_inputInvoiceStarGiftAuctionBid.bid_amount = j2;
            tL_inputInvoiceStarGiftAuctionBid.update_bid = z;
            if (szVar != null) {
                long j3 = szVar.a;
                if (j3 == 0) {
                    tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
                } else {
                    tL_inputInvoiceStarGiftAuctionBid.peer = getMessagesController().i1(j3);
                }
                tL_inputInvoiceStarGiftAuctionBid.message = szVar.c;
                tL_inputInvoiceStarGiftAuctionBid.hide_name = szVar.b;
            } else if (!z) {
                tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
                tL_inputInvoiceStarGiftAuctionBid.hide_name = false;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftAuctionBid;
            getConnectionsManager().sendRequestTyped(tL_payments_getPaymentForm, new kc((byte) 0), new nv0(this, jzVar, iv4Var, tL_payments_getPaymentForm, (byte) 1));
            return;
        }
        jzVar.a(Boolean.FALSE, null);
    }

    public final hv4 l(long j, kv4 kv4Var) {
        mj4 mj4Var = this.a;
        Long valueOf = Long.valueOf(j);
        synchronized (((HashMap) mj4Var.c)) {
            g79 g79Var = (g79) ((HashMap) mj4Var.c).get(valueOf);
            if (g79Var == null) {
                g79Var = (g79) mj4Var.b;
                if (g79Var != null) {
                    mj4Var.b = g79Var.h;
                    g79Var.h = null;
                } else {
                    g79Var = new g79(0, false);
                }
                ((HashMap) mj4Var.c).put(valueOf, g79Var);
            }
            g79Var.add(kv4Var);
        }
        m(j);
        return b(j);
    }

    public final void m(long j) {
        int i;
        iv4 d = d(j);
        d.e = true;
        of2 of2Var = d.d;
        if (of2Var != null) {
            gm.r(of2Var);
            d.d = null;
        }
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = d.a;
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        hv4 hv4Var = d.b;
        if (hv4Var != null) {
            if (hv4Var.f()) {
                i = Integer.MAX_VALUE;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = hv4Var.f;
                if (tL_starGiftAuctionState != null) {
                    i = tL_starGiftAuctionState.version;
                }
            }
            tL_getStarGiftAuctionState.version = i;
            getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new kc((byte) 0), new jz(this, j, (byte) 2));
        }
        i = 0;
        tL_getStarGiftAuctionState.version = i;
        getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new kc((byte) 0), new jz(this, j, (byte) 2));
    }

    public final void n(long j, kv4 kv4Var) {
        mj4 mj4Var = this.a;
        Long valueOf = Long.valueOf(j);
        synchronized (((HashMap) mj4Var.c)) {
            g79 g79Var = (g79) ((HashMap) mj4Var.c).get(valueOf);
            if (g79Var != null) {
                g79Var.remove(kv4Var);
                if (g79Var.isEmpty()) {
                    ((HashMap) mj4Var.c).remove(valueOf);
                    g79Var.h = (g79) mj4Var.b;
                    mj4Var.b = g79Var;
                }
            }
        }
        iv4 iv4Var = (iv4) this.b.get(j);
        if (iv4Var != null) {
            iv4Var.e = this.a.p(Long.valueOf(j));
            of2 of2Var = iv4Var.d;
            if (of2Var != null) {
                gm.r(of2Var);
                iv4Var.d = null;
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
            iv4 iv4Var = (iv4) longSparseArray.valueAt(i);
            hv4 hv4Var = iv4Var.b;
            if (hv4Var != null && !hv4Var.f()) {
                hv4 hv4Var2 = iv4Var.b;
                if (hv4Var2.e.bid_amount > 0) {
                    arrayList.add(hv4Var2);
                }
            }
        }
        List.EL.sort(arrayList, Comparator$CC.comparingInt(new mn((byte) 5)));
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((jv4) it.next()).c(arrayList);
        }
        nm7.f(this.currentAccount).k(nm7.T3, new Object[0]);
    }
}
