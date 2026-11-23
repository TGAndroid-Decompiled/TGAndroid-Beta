package org.telegram.messenger;

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
public final class v9 extends c1 {
    public static volatile v9[] h = new v9[4];
    public final androidx.activity.n f27334a;
    public final LongSparseArray f27335b;
    public final ArrayList f27336c;
    public boolean d;
    public final LongSparseArray f27337e;
    public final xe.b f27338f;

    public v9(int i7) {
        super(i7);
        this.f27334a = new androidx.activity.n(11);
        this.f27335b = new LongSparseArray();
        this.f27336c = new ArrayList();
        this.f27337e = new LongSparseArray();
        this.f27338f = new xe.b(false, true);
    }

    public static v9 c(int i7) {
        v9 v9Var;
        v9 v9Var2 = h[i7];
        if (v9Var2 == null) {
            synchronized (v9.class) {
                try {
                    v9Var = h[i7];
                    if (v9Var == null) {
                        v9[] v9VarArr = h;
                        v9 v9Var3 = new v9(i7);
                        v9VarArr[i7] = v9Var3;
                        v9Var = v9Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return v9Var;
        }
        return v9Var2;
    }

    public final void a(TL_stars.StarGift starGift, TL_stars.StarGiftAuctionState starGiftAuctionState, TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
        s9 d = d(starGift.f28663id);
        r9 r9Var = d.f26772b;
        if (r9Var == null) {
            r9 r9Var2 = new r9(this.currentAccount, starGift, starGiftAuctionState, tL_StarGiftAuctionUserState);
            d.f26772b = r9Var2;
            r9Var2.h = d.f26773c;
        } else {
            r9Var.d = starGift;
            r9Var.a(starGiftAuctionState);
            r9 r9Var3 = d.f26772b;
            r9Var3.f26582e = tL_StarGiftAuctionUserState;
            r9Var3.h();
        }
        o();
        g(starGift.f28663id);
    }

    public final r9 b(long j3) {
        s9 s9Var = (s9) this.f27335b.get(j3);
        if (s9Var != null) {
            return s9Var.f26772b;
        }
        return null;
    }

    public final s9 d(long j3) {
        LongSparseArray longSparseArray = this.f27335b;
        s9 s9Var = (s9) longSparseArray.get(j3);
        if (s9Var == null) {
            s9 s9Var2 = new s9(j3);
            longSparseArray.put(j3, s9Var2);
            return s9Var2;
        }
        return s9Var;
    }

    public final void e(long j3, y10 y10Var) {
        r9 r9Var;
        s9 s9Var = (s9) this.f27335b.get(j3);
        if (s9Var != null && (r9Var = s9Var.f26772b) != null) {
            ArrayList arrayList = s9Var.f26776g;
            if (arrayList != null && r9Var.f26582e.acquired_count == arrayList.size()) {
                y10Var.a(s9Var.f26776g);
                return;
            }
            TL_payments.TL_getStarGiftAuctionAcquiredGifts tL_getStarGiftAuctionAcquiredGifts = new TL_payments.TL_getStarGiftAuctionAcquiredGifts();
            tL_getStarGiftAuctionAcquiredGifts.gift_id = j3;
            getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionAcquiredGifts, new d3.b(1), new m9(this, y10Var, s9Var));
            return;
        }
        y10Var.a(null);
    }

    public final void f(long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        a(tL_StarGiftAuctionState.gift, tL_StarGiftAuctionState.state, tL_StarGiftAuctionState.user_state);
        s9 s9Var = (s9) this.f27335b.get(j3);
        if (s9Var != null && s9Var.f26774e) {
            d4 d4Var = new d4(this, s9Var, j3, 11);
            s9Var.d = d4Var;
            g0.h3(d4Var, tL_StarGiftAuctionState.timeout * 1000);
        }
    }

    public final void g(long j3) {
        Iterator it;
        r9 b10 = b(j3);
        androidx.activity.n nVar = this.f27334a;
        Long valueOf = Long.valueOf(j3);
        synchronized (((HashMap) nVar.d)) {
            try {
                xe.b bVar = (xe.b) ((HashMap) nVar.d).get(valueOf);
                if (bVar != null) {
                    it = bVar.iterator();
                } else {
                    it = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (b10 != null && it != null) {
            while (it.hasNext()) {
                ((u9) it.next()).c(b10);
            }
        }
    }

    public final void h(TL_update.TL_updateStarGiftAuctionState tL_updateStarGiftAuctionState) {
        r9 r9Var;
        s9 s9Var = (s9) this.f27335b.get(tL_updateStarGiftAuctionState.gift_id);
        if (s9Var != null && (r9Var = s9Var.f26772b) != null && r9Var.a(tL_updateStarGiftAuctionState.state)) {
            o();
            g(s9Var.f26771a);
        }
    }

    public final void i(TL_update.TL_updateStarGiftAuctionUserState tL_updateStarGiftAuctionUserState) {
        r9 r9Var;
        s9 s9Var = (s9) this.f27335b.get(tL_updateStarGiftAuctionUserState.gift_id);
        if (s9Var != null && (r9Var = s9Var.f26772b) != null) {
            r9Var.f26582e = tL_updateStarGiftAuctionUserState.user_state;
            r9Var.h();
            o();
            g(s9Var.f26771a);
        }
    }

    public final void j(long j3, y10 y10Var) {
        TL_stars.getStarGiftUpgradeAttributes getstargiftupgradeattributes = new TL_stars.getStarGiftUpgradeAttributes();
        getstargiftupgradeattributes.gift_id = j3;
        getConnectionsManager().sendRequestTyped(getstargiftupgradeattributes, new d3.b(1), new q9(y10Var, 0));
    }

    public final void k(long j3, bi.x xVar, long j10, bi.n nVar) {
        boolean z10;
        s9 s9Var = (s9) this.f27335b.get(j3);
        if (s9Var != null && !s9Var.f26775f) {
            if (!di.y8.y(this.currentAccount, false).f10088e) {
                di.y8.y(this.currentAccount, false).r(new k9(this, nVar, j3, xVar, j10));
                return;
            }
            r9 r9Var = s9Var.f26772b;
            if (r9Var != null && r9Var.f26582e.bid_amount > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            s9Var.f26775f = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            TLRPC.TL_inputInvoiceStarGiftAuctionBid tL_inputInvoiceStarGiftAuctionBid = new TLRPC.TL_inputInvoiceStarGiftAuctionBid();
            tL_inputInvoiceStarGiftAuctionBid.gift_id = j3;
            tL_inputInvoiceStarGiftAuctionBid.bid_amount = j10;
            tL_inputInvoiceStarGiftAuctionBid.update_bid = z10;
            if (xVar != null) {
                long j11 = xVar.f4233a;
                if (j11 == 0) {
                    tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
                } else {
                    tL_inputInvoiceStarGiftAuctionBid.peer = getMessagesController().l1(j11);
                }
                tL_inputInvoiceStarGiftAuctionBid.message = xVar.f4235c;
                tL_inputInvoiceStarGiftAuctionBid.hide_name = xVar.f4234b;
            } else if (!z10) {
                tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
                tL_inputInvoiceStarGiftAuctionBid.hide_name = false;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftAuctionBid;
            getConnectionsManager().sendRequestTyped(tL_payments_getPaymentForm, new d3.b(1), new l9(this, nVar, s9Var, tL_payments_getPaymentForm, 0));
            return;
        }
        nVar.a(Boolean.FALSE, null);
    }

    public final r9 l(long j3, u9 u9Var) {
        androidx.activity.n nVar = this.f27334a;
        Long valueOf = Long.valueOf(j3);
        synchronized (((HashMap) nVar.d)) {
            try {
                xe.b bVar = (xe.b) ((HashMap) nVar.d).get(valueOf);
                if (bVar == null) {
                    bVar = (xe.b) nVar.f1808c;
                    if (bVar != null) {
                        nVar.f1808c = bVar.h;
                        bVar.h = null;
                    } else {
                        bVar = new xe.b(false, nVar.f1807b);
                    }
                    ((HashMap) nVar.d).put(valueOf, bVar);
                }
                bVar.add(u9Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m(j3);
        return b(j3);
    }

    public final void m(long j3) {
        s9 d = d(j3);
        d.f26774e = true;
        d4 d4Var = d.d;
        if (d4Var != null) {
            g0.r(d4Var);
            d.d = null;
        }
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = d.f26771a;
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        r9 r9Var = d.f26772b;
        int i7 = 0;
        if (r9Var != null) {
            if (r9Var.f()) {
                i7 = Integer.MAX_VALUE;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = r9Var.f26583f;
                if (tL_starGiftAuctionState != null) {
                    i7 = tL_starGiftAuctionState.version;
                }
            }
        }
        tL_getStarGiftAuctionState.version = i7;
        getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new d3.b(1), new o9(this, j3));
    }

    public final void n(long j3, u9 u9Var) {
        androidx.activity.n nVar = this.f27334a;
        Long valueOf = Long.valueOf(j3);
        synchronized (((HashMap) nVar.d)) {
            try {
                xe.b bVar = (xe.b) ((HashMap) nVar.d).get(valueOf);
                if (bVar != null) {
                    bVar.remove(u9Var);
                    if (bVar.isEmpty()) {
                        ((HashMap) nVar.d).remove(valueOf);
                        bVar.h = (xe.b) nVar.f1808c;
                        nVar.f1808c = bVar;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        s9 s9Var = (s9) this.f27335b.get(j3);
        if (s9Var != null) {
            s9Var.f26774e = this.f27334a.c(Long.valueOf(j3));
            d4 d4Var = s9Var.d;
            if (d4Var != null) {
                g0.r(d4Var);
                s9Var.d = null;
            }
        }
    }

    public final void o() {
        SharedPreferences sharedPreferences = getMessagesController().h7;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong("lastGiftAuctionTimeUpdate", System.currentTimeMillis()).apply();
        }
        ArrayList arrayList = this.f27336c;
        arrayList.clear();
        LongSparseArray longSparseArray = this.f27335b;
        int size = longSparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            s9 s9Var = (s9) longSparseArray.valueAt(i7);
            r9 r9Var = s9Var.f26772b;
            if (r9Var != null && !r9Var.f()) {
                r9 r9Var2 = s9Var.f26772b;
                if (r9Var2.f26582e.bid_amount > 0) {
                    arrayList.add(r9Var2);
                }
            }
        }
        List.EL.sort(arrayList, Comparator$CC.comparingInt(new bg.d(11)));
        Iterator it = this.f27338f.iterator();
        while (it.hasNext()) {
            ((t9) it.next()).g(arrayList);
        }
        ls.f(this.currentAccount).k(ls.T3, new Object[0]);
    }
}
