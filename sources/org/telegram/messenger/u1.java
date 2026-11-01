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
public final class u1 implements c5.o, c5.c {
    public static final c5.p f18337k;
    public static c5.m f18338l;
    public static u1 f18339m;
    public static boolean f18340n;
    public static NumberFormat f18341o;
    public final c5.b d;
    public String e;
    public String f18345f;
    public boolean f18346g;
    public Runnable h;
    public final HashMap f18342a = new HashMap();
    public final Set f18343b = Collections.newSetFromMap(new ConcurrentHashMap());
    public final HashMap f18344c = new HashMap();
    public final ArrayList f18347i = new ArrayList();
    public int f18348j = 0;

    static {
        c5.a aVar = new c5.a();
        aVar.f3732c = "subs";
        aVar.f3731b = "telegram_premium";
        f18337k = aVar.a();
    }

    public u1(Context context) {
        c5.b bVar;
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(context);
        fVar.f1379a = new oa.d(4);
        fVar.f1381c = this;
        if (context != null) {
            if (((u1) fVar.f1381c) != null) {
                if (((oa.d) fVar.f1379a) != null) {
                    ((oa.d) fVar.f1379a).getClass();
                    if (((u1) fVar.f1381c) != null) {
                        oa.d dVar = (oa.d) fVar.f1379a;
                        u1 u1Var = (u1) fVar.f1381c;
                        if (fVar.a()) {
                            bVar = new c5.z(dVar, context, u1Var, fVar);
                        } else {
                            bVar = new c5.b(dVar, context, u1Var, fVar);
                        }
                    } else {
                        oa.d dVar2 = (oa.d) fVar.f1379a;
                        if (fVar.a()) {
                            bVar = new c5.z(dVar2, context, fVar);
                        } else {
                            bVar = new c5.b(dVar2, context, fVar);
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

    public static void c(u1 u1Var, c5.g gVar, List list) {
        long j10;
        f8.b("Billing: Query product details finished " + gVar + ", " + list);
        if (gVar.f3785a == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c5.m mVar = (c5.m) it.next();
                if (mVar.f3801c.equals("telegram_premium")) {
                    f18338l = mVar;
                }
            }
            if (f18338l == null) {
                r();
                return;
            }
            boolean z10 = f18340n;
            int i10 = at.f14733j5;
            if (z10) {
                f18340n = false;
                at.e().m(i10, new Object[0]);
            }
            at.e().m(i10, new Object[0]);
            return;
        }
        r();
        int i11 = u1Var.f18348j - 1;
        u1Var.f18348j = i11;
        if (i11 > 0) {
            if (i11 == 2) {
                j10 = 1000;
            } else {
                j10 = 10000;
            }
            i0.h3(new m1(u1Var, 0), j10);
        }
    }

    public static String g(String str, int i10, long j10, boolean z10) {
        if (str != null && !str.isEmpty()) {
            if ("TON".equalsIgnoreCase(str)) {
                return "TON " + (j10 / 1.0E9d);
            } else if ("XTR".equalsIgnoreCase(str)) {
                return i0.a.k(j10, ',', new StringBuilder("XTR "));
            } else {
                Currency currency = Currency.getInstance(str);
                if (currency != null) {
                    if (f18341o == null) {
                        f18341o = NumberFormat.getCurrencyInstance();
                    }
                    f18341o.setCurrency(currency);
                    if (z10) {
                        f18341o.setMaximumFractionDigits(0);
                        f18341o.setMinimumFractionDigits(0);
                        return f18341o.format(Math.round(j10 / Math.pow(10.0d, i10)));
                    }
                    int defaultFractionDigits = currency.getDefaultFractionDigits();
                    f18341o.setMinimumFractionDigits(defaultFractionDigits);
                    f18341o.setMaximumFractionDigits(defaultFractionDigits);
                    return f18341o.format(j10 / Math.pow(10.0d, i10));
                }
                return j10 + " " + str;
            }
        }
        return String.valueOf(j10);
    }

    public static u1 i() {
        if (f18339m == null) {
            f18339m = new u1(w0.f18945b);
        }
        return f18339m;
    }

    public static String j(int i10) {
        if (i10 != 12) {
            switch (i10) {
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
        if (f18340n) {
            return;
        }
        f18340n = true;
        at.e().m(at.f14733j5, new Object[0]);
    }

    @Override
    public final void a(c5.g gVar) {
        f8.b("Billing: Setup finished with result " + gVar);
        if (gVar.f3785a == 0) {
            this.f18346g = false;
            this.f18348j = 3;
            try {
                o(Collections.singletonList(f18337k), new p1(this));
            } catch (Exception e) {
                f8.g(e, true);
            }
            p("inapp", new p1(this));
            p("subs", new p1(this));
            ArrayList arrayList = this.f18347i;
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    i0.g3((Runnable) arrayList.get(i10));
                }
                arrayList.clear();
            }
        } else if (!this.f18346g) {
            r();
        }
    }

    @Override
    public final void b() {
        int i10;
        f8.b("Billing: Service disconnected");
        if (this.f18346g) {
            i10 = 15000;
        } else {
            i10 = 5000;
        }
        this.f18346g = true;
        i0.h3(new m1(this, 1), i10);
    }

    public final void d(String str, q0.a aVar) {
        this.f18342a.put(str, aVar);
    }

    public final void e(Purchase purchase, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Runnable runnable) {
        if (!(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiftCode) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiveaway) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentAuthCode)) {
            return;
        }
        f8.b("BillingController consumeGiftPurchase " + inputStorePaymentPurpose + " " + purchase.a() + " " + purchase.c());
        String c10 = purchase.c();
        if (c10 != null) {
            k6.h hVar = new k6.h(13);
            hVar.f10944b = c10;
            this.d.a(new j(inputStorePaymentPurpose, purchase, runnable), hVar);
            return;
        }
        throw new IllegalArgumentException("Purchase token must be set");
    }

    public final String f(long j10, String str) {
        return g(str, h(str), j10, false);
    }

    public final int h(String str) {
        HashMap hashMap = this.f18344c;
        rf.b.a(hashMap);
        return ((Integer) Map.EL.getOrDefault(hashMap, str, 0)).intValue();
    }

    public final boolean k() {
        c5.b bVar = this.d;
        bVar.getClass();
        return bVar.o();
    }

    public final void l(Activity activity, c cVar, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list) {
        m(activity, cVar, inputStorePaymentPurpose, list, null, false);
    }

    public final void m(final Activity activity, final c cVar, final TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, final List list, final ba.a aVar, boolean z10) {
        String encodeToString;
        if (k() && activity != null) {
            if (((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) && !z10) {
                f8.b("BillingController.launchBillingFlow, checking consumables");
                p("inapp", new c5.n() {
                    @Override
                    public final void b(c5.g r14, java.util.List r15) {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.n1.b(c5.g, java.util.List):void");
                    }
                });
                return;
            }
            if (z10) {
                f8.b("BillingController.launchBillingFlow, consumables checked, launching flow...");
            }
            boolean p5 = e20.i(cVar.f15043a).p();
            boolean z11 = false;
            if (p5) {
                encodeToString = Base64.encodeToString(String.valueOf(e20.i(cVar.f15043a).e()).getBytes(d9.j.f5805a), 0);
            } else {
                encodeToString = Base64.encodeToString(("account-" + cVar.f15043a).getBytes(d9.j.f5805a), 0);
            }
            long nextLong = Utilities.f14520b.nextLong();
            f8.b("BillingUtilities.savePurpose id=" + nextLong + " paymentPurpose=" + inputStorePaymentPurpose);
            SerializedData serializedData = new SerializedData(8);
            serializedData.writeInt64(nextLong);
            String f7 = Utilities.f(serializedData.toByteArray());
            serializedData.cleanup();
            f8.b("BillingUtilities.savePurpose id_hex=" + f7 + " paymentPurpose=" + inputStorePaymentPurpose);
            ?? tLObject = new TLObject();
            tLObject.f46500b = nextLong;
            tLObject.f46499a = 1;
            tLObject.f46501c = inputStorePaymentPurpose;
            SerializedData serializedData2 = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData2);
            String f10 = Utilities.f(serializedData2.toByteArray());
            serializedData2.cleanup();
            if (tLObject.getObjectSize() > 28) {
                f8.b("BillingUtilities.savePurpose: sending short version, original size is " + tLObject.getObjectSize() + " bytes");
                tLObject.f46499a = 0;
                tLObject.f46501c = null;
            }
            SerializedData serializedData3 = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData3);
            String f11 = Utilities.f(serializedData3.toByteArray());
            serializedData3.cleanup();
            w0.f18945b.getSharedPreferences("purchases", 0).edit().putString(f7, f10).apply();
            f8.b("BillingUtilities.savePurpose: saved {" + f10 + "} under " + f7);
            StringBuilder sb2 = new StringBuilder("BillingUtilities.savePurpose: but sending {");
            sb2.append(f11);
            sb2.append("}");
            f8.b(sb2.toString());
            ?? obj = new Object();
            obj.f3775a = 0;
            obj.f3776b = true;
            ArrayList arrayList = new ArrayList(list);
            c5.e eVar = obj;
            if (aVar != null) {
                ?? obj2 = new Object();
                obj2.f3777c = aVar.f2518b;
                obj2.f3775a = aVar.f2519c;
                eVar = obj2;
            }
            c5.b bVar = this.d;
            boolean isEmpty = arrayList.isEmpty();
            if (!isEmpty) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    if (((c5.d) obj3) == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                }
                ?? obj4 = new Object();
                if (!isEmpty && !((c5.d) arrayList.get(0)).f3770a.f3800b.optString("packageName").isEmpty()) {
                    z11 = true;
                }
                obj4.f3781a = z11;
                obj4.f3782b = encodeToString;
                obj4.f3783c = f11;
                boolean z12 = true;
                if (TextUtils.isEmpty((String) eVar.f3777c) && TextUtils.isEmpty(null)) {
                    z12 = false;
                }
                boolean isEmpty2 = TextUtils.isEmpty(null);
                if (z12 && !isEmpty2) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!eVar.f3776b && !z12 && isEmpty2) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                ba.a aVar2 = new ba.a(1);
                aVar2.f2518b = (String) eVar.f3777c;
                aVar2.f2519c = eVar.f3775a;
                obj4.d = aVar2;
                obj4.f3784f = new ArrayList();
                obj4.e = com.google.android.gms.internal.play_billing.r.t(arrayList);
                int i11 = bVar.b(activity, obj4).f3785a;
                if (i11 != 0) {
                    StringBuilder sb3 = new StringBuilder("Billing: Launch Error: ");
                    sb3.append(i11);
                    sb3.append(", ");
                    sb3.append(encodeToString);
                    sb3.append(", ");
                    a1.g.z(f11, sb3);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
    }

    public final void n(c5.g r19, java.util.List r20, final org.telegram.messenger.ng r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.u1.n(c5.g, java.util.List, org.telegram.messenger.ng):void");
    }

    public final void o(List list, t1 t1Var) {
        if (k()) {
            a6.i iVar = new a6.i(13);
            if (list != null && !list.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c5.p pVar = (c5.p) it.next();
                    if (!"play_pass_subs".equals(pVar.f3806b)) {
                        hashSet.add(pVar.f3806b);
                    }
                }
                if (hashSet.size() <= 1) {
                    com.google.android.gms.internal.play_billing.r t10 = com.google.android.gms.internal.play_billing.r.t(list);
                    iVar.f307b = t10;
                    if (t10 != null) {
                        this.d.c(new a4.l(iVar), new s1(t1Var, 0));
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

    public final void p(String str, c5.n nVar) {
        c5.b bVar = this.d;
        bVar.getClass();
        if (c5.b.f(new c5.r(bVar, nVar, str), 30000L, new j9.u(6, bVar, nVar), bVar.r(), bVar.e()) == null) {
            c5.g u10 = bVar.u();
            bVar.y(25, 9, u10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f5191b;
            nVar.b(u10, com.google.android.gms.internal.play_billing.v.e);
        }
    }

    public final void q() {
        if (!k()) {
            try {
                rf.b.a(this.f18344c);
                if (!v2.b()) {
                    this.d.d(this);
                }
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }
}
