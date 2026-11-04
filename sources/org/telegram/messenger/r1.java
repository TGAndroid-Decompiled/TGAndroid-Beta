package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.android.billingclient.api.Purchase;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r1 implements e5.n, e5.c {
    public static final e5.o f25027k;
    public static e5.l f25028l;
    public static r1 f25029m;
    public static boolean f25030n;
    public static NumberFormat f25031o;
    public final e5.b d;
    public String f25035e;
    public String f25036f;
    public boolean f25037g;
    public Runnable h;
    public final HashMap f25032a = new HashMap();
    public final Set f25033b = Collections.newSetFromMap(new ConcurrentHashMap());
    public final HashMap f25034c = new HashMap();
    public final ArrayList f25038i = new ArrayList();
    public int f25039j = 0;

    static {
        e5.a aVar = new e5.a();
        aVar.f9555c = "subs";
        aVar.f9554b = "telegram_premium";
        f25027k = aVar.a();
    }

    public r1(Context context) {
        e5.b bVar;
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(context);
        fVar.f1722a = new nb.a(6);
        fVar.f1724c = this;
        if (context != null) {
            if (((r1) fVar.f1724c) != null) {
                if (((nb.a) fVar.f1722a) != null) {
                    ((nb.a) fVar.f1722a).getClass();
                    if (((r1) fVar.f1724c) != null) {
                        nb.a aVar = (nb.a) fVar.f1722a;
                        r1 r1Var = (r1) fVar.f1724c;
                        if (fVar.a()) {
                            bVar = new e5.w(aVar, context, r1Var, fVar);
                        } else {
                            bVar = new e5.b(aVar, context, r1Var, fVar);
                        }
                    } else {
                        nb.a aVar2 = (nb.a) fVar.f1722a;
                        if (fVar.a()) {
                            bVar = new e5.w(aVar2, context, fVar);
                        } else {
                            bVar = new e5.b(aVar2, context, fVar);
                        }
                    }
                    this.d = bVar;
                    return;
                }
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        throw new IllegalArgumentException("Please provide a valid Context.");
    }

    public static void c(r1 r1Var, e5.f fVar, List list) {
        long j10;
        a8.b("Billing: Query product details finished " + fVar + ", " + list);
        if (fVar.f9593a == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e5.l lVar = (e5.l) it.next();
                if (lVar.f9611c.equals("telegram_premium")) {
                    f25028l = lVar;
                }
            }
            if (f25028l == null) {
                r();
                return;
            }
            boolean z10 = f25030n;
            int i3 = hs.f23253j5;
            if (z10) {
                f25030n = false;
                hs.e().m(i3, new Object[0]);
            }
            hs.e().m(i3, new Object[0]);
            return;
        }
        r();
        int i10 = r1Var.f25039j - 1;
        r1Var.f25039j = i10;
        if (i10 > 0) {
            if (i10 == 2) {
                j10 = 1000;
            } else {
                j10 = 10000;
            }
            g0.i3(new j1(r1Var, 0), j10);
        }
    }

    public static String g(String str, int i3, long j10, boolean z10) {
        if (str != null && !str.isEmpty()) {
            if ("TON".equalsIgnoreCase(str)) {
                return "TON " + (j10 / 1.0E9d);
            } else if ("XTR".equalsIgnoreCase(str)) {
                return k2.p1.l(j10, ',', new StringBuilder("XTR "));
            } else {
                Currency currency = Currency.getInstance(str);
                if (currency != null) {
                    if (f25031o == null) {
                        f25031o = NumberFormat.getCurrencyInstance();
                    }
                    f25031o.setCurrency(currency);
                    if (z10) {
                        f25031o.setMaximumFractionDigits(0);
                        f25031o.setMinimumFractionDigits(0);
                        return f25031o.format(Math.round(j10 / Math.pow(10.0d, i3)));
                    }
                    int defaultFractionDigits = currency.getDefaultFractionDigits();
                    f25031o.setMinimumFractionDigits(defaultFractionDigits);
                    f25031o.setMaximumFractionDigits(defaultFractionDigits);
                    return f25031o.format(j10 / Math.pow(10.0d, i3));
                }
                return j10 + " " + str;
            }
        }
        return String.valueOf(j10);
    }

    public static r1 i() {
        if (f25029m == null) {
            f25029m = new r1(t0.f25457b);
        }
        return f25029m;
    }

    public static String j(int i3) {
        if (i3 != 12) {
            switch (i3) {
                case -3:
                    return "SERVICE_TIMEOUT";
                case -2:
                    return "FEATURE_NOT_SUPPORTED";
                case -1:
                    return "SERVICE_DISCONNECTED";
                case 0:
                    return "OK";
                case 1:
                    return "USER_CANCELED";
                case 2:
                    return "SERVICE_UNAVAILABLE";
                case 3:
                    return "BILLING_UNAVAILABLE";
                case 4:
                    return "ITEM_UNAVAILABLE";
                case 5:
                    return "DEVELOPER_ERROR";
                case 6:
                    return "ERROR";
                case 7:
                    return "ITEM_ALREADY_OWNED";
                case 8:
                    return "ITEM_NOT_OWNED";
                default:
                    return "BILLING_UNKNOWN_ERROR";
            }
        }
        return "NETWORK_ERROR";
    }

    public static void r() {
        if (f25030n) {
            return;
        }
        f25030n = true;
        hs.e().m(hs.f23253j5, new Object[0]);
    }

    @Override
    public final void a(e5.f fVar) {
        a8.b("Billing: Setup finished with result " + fVar);
        if (fVar.f9593a == 0) {
            this.f25037g = false;
            this.f25039j = 3;
            try {
                o(Collections.singletonList(f25027k), new m1(this));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            p("inapp", new m1(this));
            p("subs", new m1(this));
            ArrayList arrayList = this.f25038i;
            if (!arrayList.isEmpty()) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    g0.h3((Runnable) arrayList.get(i3));
                }
                arrayList.clear();
            }
        } else if (!this.f25037g) {
            r();
        }
    }

    @Override
    public final void b() {
        int i3;
        a8.b("Billing: Service disconnected");
        if (this.f25037g) {
            i3 = 15000;
        } else {
            i3 = 5000;
        }
        this.f25037g = true;
        g0.i3(new j1(this, 1), i3);
    }

    public final void d(String str, q0.a aVar) {
        this.f25032a.put(str, aVar);
    }

    public final void e(Purchase purchase, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Runnable runnable) {
        if (!(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiftCode) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiveaway) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentAuthCode)) {
            return;
        }
        a8.b("BillingController consumeGiftPurchase " + inputStorePaymentPurpose + " " + purchase.a() + " " + purchase.c());
        String c2 = purchase.c();
        if (c2 != null) {
            ?? obj = new Object();
            obj.f7212a = c2;
            this.d.a(obj, new i(inputStorePaymentPurpose, purchase, runnable));
            return;
        }
        throw new IllegalArgumentException("Purchase token must be set");
    }

    public final String f(long j10, String str) {
        return g(str, h(str), j10, false);
    }

    public final int h(String str) {
        HashMap hashMap = this.f25034c;
        cg.b.a(hashMap);
        return ((Integer) Map.EL.getOrDefault(hashMap, str, 0)).intValue();
    }

    public final boolean k() {
        e5.b bVar = this.d;
        bVar.getClass();
        return bVar.o();
    }

    public final void l(Activity activity, c cVar, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list) {
        m(activity, cVar, inputStorePaymentPurpose, list, null, false);
    }

    public final void m(final Activity activity, final c cVar, final TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, final List list, final ad.b bVar, boolean z10) {
        String encodeToString;
        if (k() && activity != null) {
            if (((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) && !z10) {
                a8.b("BillingController.launchBillingFlow, checking consumables");
                p("inapp", new e5.m() {
                    @Override
                    public final void a(e5.f r14, java.util.List r15) {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.k1.a(e5.f, java.util.List):void");
                    }
                });
                return;
            }
            if (z10) {
                a8.b("BillingController.launchBillingFlow, consumables checked, launching flow...");
            }
            boolean p10 = h10.i(cVar.f21919a).p();
            boolean z11 = false;
            if (p10) {
                encodeToString = Base64.encodeToString(String.valueOf(h10.i(cVar.f21919a).e()).getBytes(f9.j.f11512a), 0);
            } else {
                encodeToString = Base64.encodeToString(("account-" + cVar.f21919a).getBytes(f9.j.f11512a), 0);
            }
            long nextLong = Utilities.f21385b.nextLong();
            a8.b("BillingUtilities.savePurpose id=" + nextLong + " paymentPurpose=" + inputStorePaymentPurpose);
            SerializedData serializedData = new SerializedData(8);
            serializedData.writeInt64(nextLong);
            String f10 = Utilities.f(serializedData.toByteArray());
            serializedData.cleanup();
            a8.b("BillingUtilities.savePurpose id_hex=" + f10 + " paymentPurpose=" + inputStorePaymentPurpose);
            ?? tLObject = new TLObject();
            tLObject.f4606b = nextLong;
            tLObject.f4605a = 1;
            tLObject.f4607c = inputStorePaymentPurpose;
            SerializedData serializedData2 = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData2);
            String f11 = Utilities.f(serializedData2.toByteArray());
            serializedData2.cleanup();
            if (tLObject.getObjectSize() > 28) {
                a8.b("BillingUtilities.savePurpose: sending short version, original size is " + tLObject.getObjectSize() + " bytes");
                tLObject.f4605a = 0;
                tLObject.f4607c = null;
            }
            SerializedData serializedData3 = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData3);
            String f12 = Utilities.f(serializedData3.toByteArray());
            serializedData3.cleanup();
            t0.f25457b.getSharedPreferences("purchases", 0).edit().putString(f10, f11).apply();
            a8.b("BillingUtilities.savePurpose: saved {" + f11 + "} under " + f10);
            StringBuilder sb2 = new StringBuilder("BillingUtilities.savePurpose: but sending {");
            sb2.append(f12);
            sb2.append("}");
            a8.b(sb2.toString());
            ?? obj = new Object();
            obj.f4758b = 0;
            obj.f4757a = true;
            ArrayList arrayList = new ArrayList(list);
            cg.v0 v0Var = obj;
            if (bVar != null) {
                ?? obj2 = new Object();
                obj2.f4759c = bVar.f315b;
                obj2.f4758b = bVar.f316c;
                v0Var = obj2;
            }
            e5.b bVar2 = this.d;
            boolean isEmpty = arrayList.isEmpty();
            if (!isEmpty) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj3 = arrayList.get(i3);
                    i3++;
                    if (((e5.d) obj3) == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                }
                ?? obj4 = new Object();
                if (!isEmpty && !((e5.d) arrayList.get(0)).f9586a.f9610b.optString("packageName").isEmpty()) {
                    z11 = true;
                }
                obj4.f9588a = z11;
                obj4.f9589b = encodeToString;
                obj4.f9590c = f12;
                boolean z12 = true;
                if (TextUtils.isEmpty((String) v0Var.f4759c) && TextUtils.isEmpty(null)) {
                    z12 = false;
                }
                boolean isEmpty2 = TextUtils.isEmpty(null);
                if (z12 && !isEmpty2) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!v0Var.f4757a && !z12 && isEmpty2) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                ad.b bVar3 = new ad.b(2);
                bVar3.f315b = (String) v0Var.f4759c;
                bVar3.f316c = v0Var.f4758b;
                obj4.d = bVar3;
                obj4.f9592f = new ArrayList();
                obj4.f9591e = com.google.android.gms.internal.play_billing.r.p(arrayList);
                int i10 = bVar2.b(activity, obj4).f9593a;
                if (i10 != 0) {
                    StringBuilder sb3 = new StringBuilder("Billing: Launch Error: ");
                    sb3.append(i10);
                    sb3.append(", ");
                    sb3.append(encodeToString);
                    sb3.append(", ");
                    k2.p1.w(f12, sb3);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
    }

    public final void n(e5.f r19, java.util.List r20, final org.telegram.messenger.fg r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.r1.n(e5.f, java.util.List, org.telegram.messenger.fg):void");
    }

    public final void o(List list, q1 q1Var) {
        if (k()) {
            c6.i iVar = new c6.i(19);
            if (list != null && !list.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    e5.o oVar = (e5.o) it.next();
                    if (!"play_pass_subs".equals(oVar.f9617b)) {
                        hashSet.add(oVar.f9617b);
                    }
                }
                if (hashSet.size() <= 1) {
                    com.google.android.gms.internal.play_billing.r p10 = com.google.android.gms.internal.play_billing.r.p(list);
                    iVar.f4235b = p10;
                    if (p10 != null) {
                        this.d.c(new android.support.v4.media.c(iVar), new p1(q1Var, 0));
                        return;
                    }
                    throw new IllegalArgumentException("Product list must be set to a non empty list.");
                }
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        throw new IllegalStateException("Billing: Controller should be ready for this call!");
    }

    public final void p(String str, e5.m mVar) {
        e5.b bVar = this.d;
        bVar.getClass();
        if (e5.b.f(new e5.q(bVar, mVar, str), 30000L, new l9.u(11, bVar, mVar), bVar.r(), bVar.e()) == null) {
            e5.f u10 = bVar.u();
            bVar.y(25, 9, u10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f7499b;
            mVar.a(u10, com.google.android.gms.internal.play_billing.v.f7526e);
        }
    }

    public final void q() {
        if (!k()) {
            try {
                cg.b.a(this.f25034c);
                if (!r2.b()) {
                    this.d.d(this);
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
