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
public final class u9 extends c1 {
    public static volatile u9[] h = new u9[4];
    public final androidx.activity.n f27239a;
    public final LongSparseArray f27240b;
    public final ArrayList f27241c;
    public boolean d;
    public final LongSparseArray f27242e;
    public final xe.b f27243f;

    public u9(int i7) {
        super(i7);
        this.f27239a = new androidx.activity.n(11);
        this.f27240b = new LongSparseArray();
        this.f27241c = new ArrayList();
        this.f27242e = new LongSparseArray();
        this.f27243f = new xe.b(false, true);
    }

    public static u9 c(int i7) {
        u9 u9Var;
        u9 u9Var2 = h[i7];
        if (u9Var2 == null) {
            synchronized (u9.class) {
                try {
                    u9Var = h[i7];
                    if (u9Var == null) {
                        u9[] u9VarArr = h;
                        u9 u9Var3 = new u9(i7);
                        u9VarArr[i7] = u9Var3;
                        u9Var = u9Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return u9Var;
        }
        return u9Var2;
    }

    public final void a(TL_stars.StarGift starGift, TL_stars.StarGiftAuctionState starGiftAuctionState, TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
        r9 d = d(starGift.f28721id);
        q9 q9Var = d.f26659b;
        if (q9Var == null) {
            q9 q9Var2 = new q9(this.currentAccount, starGift, starGiftAuctionState, tL_StarGiftAuctionUserState);
            d.f26659b = q9Var2;
            q9Var2.h = d.f26660c;
        } else {
            q9Var.d = starGift;
            q9Var.a(starGiftAuctionState);
            q9 q9Var3 = d.f26659b;
            q9Var3.f26483e = tL_StarGiftAuctionUserState;
            q9Var3.h();
        }
        o();
        g(starGift.f28721id);
    }

    public final q9 b(long j3) {
        r9 r9Var = (r9) this.f27240b.get(j3);
        if (r9Var != null) {
            return r9Var.f26659b;
        }
        return null;
    }

    public final r9 d(long j3) {
        LongSparseArray longSparseArray = this.f27240b;
        r9 r9Var = (r9) longSparseArray.get(j3);
        if (r9Var == null) {
            r9 r9Var2 = new r9(j3);
            longSparseArray.put(j3, r9Var2);
            return r9Var2;
        }
        return r9Var;
    }

    public final void e(long j3, w10 w10Var) {
        q9 q9Var;
        r9 r9Var = (r9) this.f27240b.get(j3);
        if (r9Var != null && (q9Var = r9Var.f26659b) != null) {
            ArrayList arrayList = r9Var.f26663g;
            if (arrayList != null && q9Var.f26483e.acquired_count == arrayList.size()) {
                w10Var.a(r9Var.f26663g);
                return;
            }
            TL_payments.TL_getStarGiftAuctionAcquiredGifts tL_getStarGiftAuctionAcquiredGifts = new TL_payments.TL_getStarGiftAuctionAcquiredGifts();
            tL_getStarGiftAuctionAcquiredGifts.gift_id = j3;
            getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionAcquiredGifts, new d3.b(1), new l9(this, w10Var, r9Var));
            return;
        }
        w10Var.a(null);
    }

    public final void f(long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        a(tL_StarGiftAuctionState.gift, tL_StarGiftAuctionState.state, tL_StarGiftAuctionState.user_state);
        r9 r9Var = (r9) this.f27240b.get(j3);
        if (r9Var != null && r9Var.f26661e) {
            d4 d4Var = new d4(this, r9Var, j3, 11);
            r9Var.d = d4Var;
            g0.h3(d4Var, tL_StarGiftAuctionState.timeout * 1000);
        }
    }

    public final void g(long j3) {
        Iterator it;
        q9 b10 = b(j3);
        androidx.activity.n nVar = this.f27239a;
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
                ((t9) it.next()).c(b10);
            }
        }
    }

    public final void h(TL_update.TL_updateStarGiftAuctionState tL_updateStarGiftAuctionState) {
        q9 q9Var;
        r9 r9Var = (r9) this.f27240b.get(tL_updateStarGiftAuctionState.gift_id);
        if (r9Var != null && (q9Var = r9Var.f26659b) != null && q9Var.a(tL_updateStarGiftAuctionState.state)) {
            o();
            g(r9Var.f26658a);
        }
    }

    public final void i(TL_update.TL_updateStarGiftAuctionUserState tL_updateStarGiftAuctionUserState) {
        q9 q9Var;
        r9 r9Var = (r9) this.f27240b.get(tL_updateStarGiftAuctionUserState.gift_id);
        if (r9Var != null && (q9Var = r9Var.f26659b) != null) {
            q9Var.f26483e = tL_updateStarGiftAuctionUserState.user_state;
            q9Var.h();
            o();
            g(r9Var.f26658a);
        }
    }

    public final void j(long j3, w10 w10Var) {
        TL_stars.getStarGiftUpgradeAttributes getstargiftupgradeattributes = new TL_stars.getStarGiftUpgradeAttributes();
        getstargiftupgradeattributes.gift_id = j3;
        getConnectionsManager().sendRequestTyped(getstargiftupgradeattributes, new d3.b(1), new p9(w10Var, 0));
    }

    public final void k(long j3, bi.x xVar, long j10, bi.n nVar) {
        boolean z10;
        r9 r9Var = (r9) this.f27240b.get(j3);
        if (r9Var != null && !r9Var.f26662f) {
            if (!di.y8.y(this.currentAccount, false).f10049e) {
                di.y8.y(this.currentAccount, false).r(new j9(this, nVar, j3, xVar, j10));
                return;
            }
            q9 q9Var = r9Var.f26659b;
            if (q9Var != null && q9Var.f26483e.bid_amount > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            r9Var.f26662f = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            TLRPC.TL_inputInvoiceStarGiftAuctionBid tL_inputInvoiceStarGiftAuctionBid = new TLRPC.TL_inputInvoiceStarGiftAuctionBid();
            tL_inputInvoiceStarGiftAuctionBid.gift_id = j3;
            tL_inputInvoiceStarGiftAuctionBid.bid_amount = j10;
            tL_inputInvoiceStarGiftAuctionBid.update_bid = z10;
            if (xVar != null) {
                long j11 = xVar.f4191a;
                if (j11 == 0) {
                    tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
                } else {
                    tL_inputInvoiceStarGiftAuctionBid.peer = getMessagesController().l1(j11);
                }
                tL_inputInvoiceStarGiftAuctionBid.message = xVar.f4193c;
                tL_inputInvoiceStarGiftAuctionBid.hide_name = xVar.f4192b;
            } else if (!z10) {
                tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
                tL_inputInvoiceStarGiftAuctionBid.hide_name = false;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftAuctionBid;
            getConnectionsManager().sendRequestTyped(tL_payments_getPaymentForm, new d3.b(1), new k9(this, nVar, r9Var, tL_payments_getPaymentForm, 0));
            return;
        }
        nVar.a(Boolean.FALSE, null);
    }

    public final q9 l(long j3, t9 t9Var) {
        androidx.activity.n nVar = this.f27239a;
        Long valueOf = Long.valueOf(j3);
        synchronized (((HashMap) nVar.d)) {
            try {
                xe.b bVar = (xe.b) ((HashMap) nVar.d).get(valueOf);
                if (bVar == null) {
                    bVar = (xe.b) nVar.f1760c;
                    if (bVar != null) {
                        nVar.f1760c = bVar.h;
                        bVar.h = null;
                    } else {
                        bVar = new xe.b(false, nVar.f1759b);
                    }
                    ((HashMap) nVar.d).put(valueOf, bVar);
                }
                bVar.add(t9Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m(j3);
        return b(j3);
    }

    public final void m(long j3) {
        r9 d = d(j3);
        d.f26661e = true;
        d4 d4Var = d.d;
        if (d4Var != null) {
            g0.r(d4Var);
            d.d = null;
        }
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = d.f26658a;
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        q9 q9Var = d.f26659b;
        int i7 = 0;
        if (q9Var != null) {
            if (q9Var.f()) {
                i7 = Integer.MAX_VALUE;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = q9Var.f26484f;
                if (tL_starGiftAuctionState != null) {
                    i7 = tL_starGiftAuctionState.version;
                }
            }
        }
        tL_getStarGiftAuctionState.version = i7;
        getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new d3.b(1), new n9(this, j3));
    }

    public final void n(long j3, t9 t9Var) {
        androidx.activity.n nVar = this.f27239a;
        Long valueOf = Long.valueOf(j3);
        synchronized (((HashMap) nVar.d)) {
            try {
                xe.b bVar = (xe.b) ((HashMap) nVar.d).get(valueOf);
                if (bVar != null) {
                    bVar.remove(t9Var);
                    if (bVar.isEmpty()) {
                        ((HashMap) nVar.d).remove(valueOf);
                        bVar.h = (xe.b) nVar.f1760c;
                        nVar.f1760c = bVar;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        r9 r9Var = (r9) this.f27240b.get(j3);
        if (r9Var != null) {
            r9Var.f26661e = this.f27239a.c(Long.valueOf(j3));
            d4 d4Var = r9Var.d;
            if (d4Var != null) {
                g0.r(d4Var);
                r9Var.d = null;
            }
        }
    }

    public final void o() {
        SharedPreferences sharedPreferences = getMessagesController().h7;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong("lastGiftAuctionTimeUpdate", System.currentTimeMillis()).apply();
        }
        ArrayList arrayList = this.f27241c;
        arrayList.clear();
        LongSparseArray longSparseArray = this.f27240b;
        int size = longSparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            r9 r9Var = (r9) longSparseArray.valueAt(i7);
            q9 q9Var = r9Var.f26659b;
            if (q9Var != null && !q9Var.f()) {
                q9 q9Var2 = r9Var.f26659b;
                if (q9Var2.f26483e.bid_amount > 0) {
                    arrayList.add(q9Var2);
                }
            }
        }
        List.EL.sort(arrayList, Comparator$CC.comparingInt(new bg.d(11)));
        Iterator it = this.f27243f.iterator();
        while (it.hasNext()) {
            ((s9) it.next()).g(arrayList);
        }
        ks.f(this.currentAccount).k(ks.T3, new Object[0]);
    }
}
