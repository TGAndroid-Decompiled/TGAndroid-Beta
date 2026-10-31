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
import org.telegram.ui.a80;
public final class x9 extends f1 {
    public static volatile x9[] h = new x9[4];
    public final androidx.activity.o f19232a;
    public final LongSparseArray f19233b;
    public final ArrayList f19234c;
    public boolean d;
    public final LongSparseArray e;
    public final je.b f19235f;

    public x9(int i10) {
        super(i10);
        this.f19232a = new androidx.activity.o(2);
        this.f19233b = new LongSparseArray();
        this.f19234c = new ArrayList();
        this.e = new LongSparseArray();
        this.f19235f = new je.b(false, true);
    }

    public static x9 c(int i10) {
        x9 x9Var;
        x9 x9Var2 = h[i10];
        if (x9Var2 == null) {
            synchronized (x9.class) {
                try {
                    x9Var = h[i10];
                    if (x9Var == null) {
                        x9[] x9VarArr = h;
                        x9 x9Var3 = new x9(i10);
                        x9VarArr[i10] = x9Var3;
                        x9Var = x9Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return x9Var;
        }
        return x9Var2;
    }

    public final void a(TL_stars.StarGift starGift, TL_stars.StarGiftAuctionState starGiftAuctionState, TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
        u9 d = d(starGift.f20021id);
        t9 t9Var = d.f18270b;
        if (t9Var == null) {
            t9 t9Var2 = new t9(this.currentAccount, starGift, starGiftAuctionState, tL_StarGiftAuctionUserState);
            d.f18270b = t9Var2;
            t9Var2.h = d.f18271c;
        } else {
            t9Var.d = starGift;
            t9Var.a(starGiftAuctionState);
            t9 t9Var3 = d.f18270b;
            t9Var3.e = tL_StarGiftAuctionUserState;
            t9Var3.h();
        }
        o();
        g(starGift.f20021id);
    }

    public final t9 b(long j10) {
        u9 u9Var = (u9) this.f19233b.get(j10);
        if (u9Var != null) {
            return u9Var.f18270b;
        }
        return null;
    }

    public final u9 d(long j10) {
        LongSparseArray longSparseArray = this.f19233b;
        u9 u9Var = (u9) longSparseArray.get(j10);
        if (u9Var == null) {
            u9 u9Var2 = new u9(j10);
            longSparseArray.put(j10, u9Var2);
            return u9Var2;
        }
        return u9Var;
    }

    public final void e(long j10, q20 q20Var) {
        t9 t9Var;
        u9 u9Var = (u9) this.f19233b.get(j10);
        if (u9Var != null && (t9Var = u9Var.f18270b) != null) {
            ArrayList arrayList = u9Var.f18273g;
            if (arrayList != null && t9Var.e.acquired_count == arrayList.size()) {
                q20Var.a(u9Var.f18273g);
                return;
            }
            TL_payments.TL_getStarGiftAuctionAcquiredGifts tL_getStarGiftAuctionAcquiredGifts = new TL_payments.TL_getStarGiftAuctionAcquiredGifts();
            tL_getStarGiftAuctionAcquiredGifts.gift_id = j10;
            getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionAcquiredGifts, new a3.b(1), new o9(this, q20Var, u9Var));
            return;
        }
        q20Var.a(null);
    }

    public final void f(long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        a(tL_StarGiftAuctionState.gift, tL_StarGiftAuctionState.state, tL_StarGiftAuctionState.user_state);
        u9 u9Var = (u9) this.f19233b.get(j10);
        if (u9Var != null && u9Var.e) {
            d4 d4Var = new d4(this, u9Var, j10, 11);
            u9Var.d = d4Var;
            i0.h3(d4Var, tL_StarGiftAuctionState.timeout * 1000);
        }
    }

    public final void g(long j10) {
        Iterator it;
        t9 b10 = b(j10);
        androidx.activity.o oVar = this.f19232a;
        Long valueOf = Long.valueOf(j10);
        synchronized (((HashMap) oVar.d)) {
            try {
                je.b bVar = (je.b) ((HashMap) oVar.d).get(valueOf);
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
                ((w9) it.next()).c(b10);
            }
        }
    }

    public final void h(TL_update.TL_updateStarGiftAuctionState tL_updateStarGiftAuctionState) {
        t9 t9Var;
        u9 u9Var = (u9) this.f19233b.get(tL_updateStarGiftAuctionState.gift_id);
        if (u9Var != null && (t9Var = u9Var.f18270b) != null && t9Var.a(tL_updateStarGiftAuctionState.state)) {
            o();
            g(u9Var.f18269a);
        }
    }

    public final void i(TL_update.TL_updateStarGiftAuctionUserState tL_updateStarGiftAuctionUserState) {
        t9 t9Var;
        u9 u9Var = (u9) this.f19233b.get(tL_updateStarGiftAuctionUserState.gift_id);
        if (u9Var != null && (t9Var = u9Var.f18270b) != null) {
            t9Var.e = tL_updateStarGiftAuctionUserState.user_state;
            t9Var.h();
            o();
            g(u9Var.f18269a);
        }
    }

    public final void j(long j10, q20 q20Var) {
        TL_stars.getStarGiftUpgradeAttributes getstargiftupgradeattributes = new TL_stars.getStarGiftUpgradeAttributes();
        getstargiftupgradeattributes.gift_id = j10;
        getConnectionsManager().sendRequestTyped(getstargiftupgradeattributes, new a3.b(1), new s9(q20Var, 0));
    }

    public final void k(long j10, ph.l lVar, long j11, a80 a80Var) {
        boolean z10;
        u9 u9Var = (u9) this.f19233b.get(j10);
        if (u9Var != null && !u9Var.f18272f) {
            if (!rh.e6.y(this.currentAccount, false).e) {
                rh.e6.y(this.currentAccount, false).r(new m9(this, a80Var, j10, lVar, j11));
                return;
            }
            t9 t9Var = u9Var.f18270b;
            if (t9Var != null && t9Var.e.bid_amount > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u9Var.f18272f = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            TLRPC.TL_inputInvoiceStarGiftAuctionBid tL_inputInvoiceStarGiftAuctionBid = new TLRPC.TL_inputInvoiceStarGiftAuctionBid();
            tL_inputInvoiceStarGiftAuctionBid.gift_id = j10;
            tL_inputInvoiceStarGiftAuctionBid.bid_amount = j11;
            tL_inputInvoiceStarGiftAuctionBid.update_bid = z10;
            if (lVar != null) {
                long j12 = lVar.f45172a;
                if (j12 == 0) {
                    tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
                } else {
                    tL_inputInvoiceStarGiftAuctionBid.peer = getMessagesController().i1(j12);
                }
                tL_inputInvoiceStarGiftAuctionBid.message = lVar.f45174c;
                tL_inputInvoiceStarGiftAuctionBid.hide_name = lVar.f45173b;
            } else if (!z10) {
                tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
                tL_inputInvoiceStarGiftAuctionBid.hide_name = false;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftAuctionBid;
            getConnectionsManager().sendRequestTyped(tL_payments_getPaymentForm, new a3.b(1), new n9(this, a80Var, u9Var, tL_payments_getPaymentForm, 0));
            return;
        }
        a80Var.a(Boolean.FALSE, null);
    }

    public final t9 l(long j10, w9 w9Var) {
        androidx.activity.o oVar = this.f19232a;
        Long valueOf = Long.valueOf(j10);
        synchronized (((HashMap) oVar.d)) {
            try {
                je.b bVar = (je.b) ((HashMap) oVar.d).get(valueOf);
                if (bVar == null) {
                    bVar = (je.b) oVar.f954c;
                    if (bVar != null) {
                        oVar.f954c = bVar.h;
                        bVar.h = null;
                    } else {
                        bVar = new je.b(false, oVar.f953b);
                    }
                    ((HashMap) oVar.d).put(valueOf, bVar);
                }
                bVar.add(w9Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m(j10);
        return b(j10);
    }

    public final void m(long j10) {
        u9 d = d(j10);
        d.e = true;
        d4 d4Var = d.d;
        if (d4Var != null) {
            i0.r(d4Var);
            d.d = null;
        }
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = d.f18269a;
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        t9 t9Var = d.f18270b;
        int i10 = 0;
        if (t9Var != null) {
            if (t9Var.f()) {
                i10 = Integer.MAX_VALUE;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = t9Var.f18036f;
                if (tL_starGiftAuctionState != null) {
                    i10 = tL_starGiftAuctionState.version;
                }
            }
        }
        tL_getStarGiftAuctionState.version = i10;
        getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new a3.b(1), new q9(this, j10));
    }

    public final void n(long j10, w9 w9Var) {
        androidx.activity.o oVar = this.f19232a;
        Long valueOf = Long.valueOf(j10);
        synchronized (((HashMap) oVar.d)) {
            try {
                je.b bVar = (je.b) ((HashMap) oVar.d).get(valueOf);
                if (bVar != null) {
                    bVar.remove(w9Var);
                    if (bVar.isEmpty()) {
                        ((HashMap) oVar.d).remove(valueOf);
                        bVar.h = (je.b) oVar.f954c;
                        oVar.f954c = bVar;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        u9 u9Var = (u9) this.f19233b.get(j10);
        if (u9Var != null) {
            u9Var.e = this.f19232a.b(Long.valueOf(j10));
            d4 d4Var = u9Var.d;
            if (d4Var != null) {
                i0.r(d4Var);
                u9Var.d = null;
            }
        }
    }

    public final void o() {
        SharedPreferences sharedPreferences = getMessagesController().f7;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong("lastGiftAuctionTimeUpdate", System.currentTimeMillis()).apply();
        }
        ArrayList arrayList = this.f19234c;
        arrayList.clear();
        LongSparseArray longSparseArray = this.f19233b;
        int size = longSparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            u9 u9Var = (u9) longSparseArray.valueAt(i10);
            t9 t9Var = u9Var.f18270b;
            if (t9Var != null && !t9Var.f()) {
                t9 t9Var2 = u9Var.f18270b;
                if (t9Var2.e.bid_amount > 0) {
                    arrayList.add(t9Var2);
                }
            }
        }
        List.EL.sort(arrayList, Comparator$CC.comparingInt(new bi.t6(2)));
        Iterator it = this.f19235f.iterator();
        while (it.hasNext()) {
            ((v9) it.next()).g(arrayList);
        }
        zs.f(this.currentAccount).k(zs.Q3, new Object[0]);
    }
}
