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
public final class ov4 extends rf0 {
    public static volatile ov4[] h = new ov4[4];
    public final ym4 a;
    public final LongSparseArray b;
    public final ArrayList c;
    public boolean d;
    public final LongSparseArray e;
    public final r89 f;

    public ov4(int i) {
        super(i);
        this.a = new ym4((byte) 19);
        this.b = new LongSparseArray();
        this.c = new ArrayList();
        this.e = new LongSparseArray();
        this.f = new r89(0, false);
    }

    public static ov4 c(int i) {
        ov4 ov4Var;
        ov4 ov4Var2 = h[i];
        if (ov4Var2 == null) {
            synchronized (ov4.class) {
                ov4Var = h[i];
                if (ov4Var == null) {
                    ov4[] ov4VarArr = h;
                    ov4 ov4Var3 = new ov4(i);
                    ov4VarArr[i] = ov4Var3;
                    ov4Var = ov4Var3;
                }
            }
            return ov4Var;
        }
        return ov4Var2;
    }

    public final void a(TL_stars.StarGift starGift, TL_stars.StarGiftAuctionState starGiftAuctionState, TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
        lv4 d = d(starGift.id);
        kv4 kv4Var = d.b;
        if (kv4Var == null) {
            kv4 kv4Var2 = new kv4(this.currentAccount, starGift, starGiftAuctionState, tL_StarGiftAuctionUserState);
            d.b = kv4Var2;
            kv4Var2.h = d.c;
        } else {
            kv4Var.d = starGift;
            kv4Var.a(starGiftAuctionState);
            kv4 kv4Var3 = d.b;
            kv4Var3.e = tL_StarGiftAuctionUserState;
            kv4Var3.h();
        }
        o();
        g(starGift.id);
    }

    public final kv4 b(long j) {
        lv4 lv4Var = (lv4) this.b.get(j);
        if (lv4Var != null) {
            return lv4Var.b;
        }
        return null;
    }

    public final lv4 d(long j) {
        LongSparseArray longSparseArray = this.b;
        lv4 lv4Var = (lv4) longSparseArray.get(j);
        if (lv4Var == null) {
            lv4 lv4Var2 = new lv4(j);
            longSparseArray.put(j, lv4Var2);
            return lv4Var2;
        }
        return lv4Var;
    }

    public final void e(long j, pcc pccVar) {
        kv4 kv4Var;
        lv4 lv4Var = (lv4) this.b.get(j);
        if (lv4Var != null && (kv4Var = lv4Var.b) != null) {
            ArrayList arrayList = lv4Var.g;
            if (arrayList != null && kv4Var.e.acquired_count == arrayList.size()) {
                pccVar.a(lv4Var.g);
                return;
            }
            TL_payments.TL_getStarGiftAuctionAcquiredGifts tL_getStarGiftAuctionAcquiredGifts = new TL_payments.TL_getStarGiftAuctionAcquiredGifts();
            tL_getStarGiftAuctionAcquiredGifts.gift_id = j;
            getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionAcquiredGifts, new ic((byte) 0), new p(this, pccVar, lv4Var, (byte) 9));
            return;
        }
        pccVar.a(null);
    }

    public final void f(long j, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        a(tL_StarGiftAuctionState.gift, tL_StarGiftAuctionState.state, tL_StarGiftAuctionState.user_state);
        lv4 lv4Var = (lv4) this.b.get(j);
        if (lv4Var != null && lv4Var.e) {
            ue2 ue2Var = new ue2(this, lv4Var, j, (byte) 22);
            lv4Var.d = ue2Var;
            hl.d3(ue2Var, tL_StarGiftAuctionState.timeout * 1000);
        }
    }

    public final void g(long j) {
        Iterator it;
        kv4 b = b(j);
        ym4 ym4Var = this.a;
        Long valueOf = Long.valueOf(j);
        synchronized (((HashMap) ym4Var.c)) {
            r89 r89Var = (r89) ((HashMap) ym4Var.c).get(valueOf);
            if (r89Var != null) {
                it = r89Var.iterator();
            } else {
                it = null;
            }
        }
        if (b != null && it != null) {
            while (it.hasNext()) {
                ((nv4) it.next()).q(b);
            }
        }
    }

    public final void h(TL_update.TL_updateStarGiftAuctionState tL_updateStarGiftAuctionState) {
        kv4 kv4Var;
        lv4 lv4Var = (lv4) this.b.get(tL_updateStarGiftAuctionState.gift_id);
        if (lv4Var != null && (kv4Var = lv4Var.b) != null && kv4Var.a(tL_updateStarGiftAuctionState.state)) {
            o();
            g(lv4Var.a);
        }
    }

    public final void i(TL_update.TL_updateStarGiftAuctionUserState tL_updateStarGiftAuctionUserState) {
        kv4 kv4Var;
        lv4 lv4Var = (lv4) this.b.get(tL_updateStarGiftAuctionUserState.gift_id);
        if (lv4Var != null && (kv4Var = lv4Var.b) != null) {
            kv4Var.e = tL_updateStarGiftAuctionUserState.user_state;
            kv4Var.h();
            o();
            g(lv4Var.a);
        }
    }

    public final void j(long j, pcc pccVar) {
        TL_stars.getStarGiftUpgradeAttributes getstargiftupgradeattributes = new TL_stars.getStarGiftUpgradeAttributes();
        getstargiftupgradeattributes.gift_id = j;
        getConnectionsManager().sendRequestTyped(getstargiftupgradeattributes, new ic((byte) 0), new jv4(pccVar, (byte) 0));
    }

    public final void k(long j, ty tyVar, long j2, ky kyVar) {
        boolean z;
        lv4 lv4Var = (lv4) this.b.get(j);
        if (lv4Var != null && !lv4Var.f) {
            if (!jxa.v(this.currentAccount, false).e) {
                jxa.v(this.currentAccount, false).o(new hv4(this, kyVar, j, tyVar, j2));
                return;
            }
            kv4 kv4Var = lv4Var.b;
            if (kv4Var != null && kv4Var.e.bid_amount > 0) {
                z = true;
            } else {
                z = false;
            }
            lv4Var.f = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            TLRPC.TL_inputInvoiceStarGiftAuctionBid tL_inputInvoiceStarGiftAuctionBid = new TLRPC.TL_inputInvoiceStarGiftAuctionBid();
            tL_inputInvoiceStarGiftAuctionBid.gift_id = j;
            tL_inputInvoiceStarGiftAuctionBid.bid_amount = j2;
            tL_inputInvoiceStarGiftAuctionBid.update_bid = z;
            if (tyVar != null) {
                long j3 = tyVar.a;
                if (j3 == 0) {
                    tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
                } else {
                    tL_inputInvoiceStarGiftAuctionBid.peer = getMessagesController().j1(j3);
                }
                tL_inputInvoiceStarGiftAuctionBid.message = tyVar.c;
                tL_inputInvoiceStarGiftAuctionBid.hide_name = tyVar.b;
            } else if (!z) {
                tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
                tL_inputInvoiceStarGiftAuctionBid.hide_name = false;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftAuctionBid;
            getConnectionsManager().sendRequestTyped(tL_payments_getPaymentForm, new ic((byte) 0), new nu0(this, kyVar, lv4Var, tL_payments_getPaymentForm, (byte) 1));
            return;
        }
        kyVar.a(Boolean.FALSE, null);
    }

    public final kv4 l(long j, nv4 nv4Var) {
        ym4 ym4Var = this.a;
        Long valueOf = Long.valueOf(j);
        synchronized (((HashMap) ym4Var.c)) {
            r89 r89Var = (r89) ((HashMap) ym4Var.c).get(valueOf);
            if (r89Var == null) {
                r89Var = (r89) ym4Var.b;
                if (r89Var != null) {
                    ym4Var.b = r89Var.h;
                    r89Var.h = null;
                } else {
                    r89Var = new r89(0, false);
                }
                ((HashMap) ym4Var.c).put(valueOf, r89Var);
            }
            r89Var.add(nv4Var);
        }
        m(j);
        return b(j);
    }

    public final void m(long j) {
        int i;
        lv4 d = d(j);
        d.e = true;
        ue2 ue2Var = d.d;
        if (ue2Var != null) {
            hl.r(ue2Var);
            d.d = null;
        }
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = d.a;
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        kv4 kv4Var = d.b;
        if (kv4Var != null) {
            if (kv4Var.f()) {
                i = Integer.MAX_VALUE;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = kv4Var.f;
                if (tL_starGiftAuctionState != null) {
                    i = tL_starGiftAuctionState.version;
                }
            }
            tL_getStarGiftAuctionState.version = i;
            getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new ic((byte) 0), new ky(this, j, (byte) 2));
        }
        i = 0;
        tL_getStarGiftAuctionState.version = i;
        getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new ic((byte) 0), new ky(this, j, (byte) 2));
    }

    public final void n(long j, nv4 nv4Var) {
        ym4 ym4Var = this.a;
        Long valueOf = Long.valueOf(j);
        synchronized (((HashMap) ym4Var.c)) {
            r89 r89Var = (r89) ((HashMap) ym4Var.c).get(valueOf);
            if (r89Var != null) {
                r89Var.remove(nv4Var);
                if (r89Var.isEmpty()) {
                    ((HashMap) ym4Var.c).remove(valueOf);
                    r89Var.h = (r89) ym4Var.b;
                    ym4Var.b = r89Var;
                }
            }
        }
        lv4 lv4Var = (lv4) this.b.get(j);
        if (lv4Var != null) {
            lv4Var.e = this.a.I(Long.valueOf(j));
            ue2 ue2Var = lv4Var.d;
            if (ue2Var != null) {
                hl.r(ue2Var);
                lv4Var.d = null;
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
            lv4 lv4Var = (lv4) longSparseArray.valueAt(i);
            kv4 kv4Var = lv4Var.b;
            if (kv4Var != null && !kv4Var.f()) {
                kv4 kv4Var2 = lv4Var.b;
                if (kv4Var2.e.bid_amount > 0) {
                    arrayList.add(kv4Var2);
                }
            }
        }
        List.EL.sort(arrayList, Comparator$CC.comparingInt(new nm((byte) 5)));
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((mv4) it.next()).c(arrayList);
        }
        jn7.f(this.currentAccount).k(jn7.T3, new Object[0]);
    }
}
