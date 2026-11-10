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
public final class r1 implements f5.n, f5.c {
    public static final f5.o f25201k;
    public static f5.l f25202l;
    public static r1 f25203m;
    public static boolean f25204n;
    public static NumberFormat f25205o;
    public final f5.b d;
    public String f25209e;
    public String f25210f;
    public boolean f25211g;
    public Runnable h;
    public final HashMap f25206a = new HashMap();
    public final Set f25207b = Collections.newSetFromMap(new ConcurrentHashMap());
    public final HashMap f25208c = new HashMap();
    public final ArrayList f25212i = new ArrayList();
    public int f25213j = 0;

    static {
        ?? obj = new Object();
        obj.f11118b = "subs";
        obj.f11117a = "telegram_premium";
        f25201k = obj.a();
    }

    public r1(Context context) {
        f5.b bVar;
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(context);
        fVar.f2299a = new sa.d(8);
        fVar.f2301c = this;
        if (context != null) {
            if (((r1) fVar.f2301c) != null) {
                if (((sa.d) fVar.f2299a) != null) {
                    ((sa.d) fVar.f2299a).getClass();
                    if (((r1) fVar.f2301c) != null) {
                        sa.d dVar = (sa.d) fVar.f2299a;
                        r1 r1Var = (r1) fVar.f2301c;
                        if (fVar.a()) {
                            bVar = new f5.w(dVar, context, r1Var, fVar);
                        } else {
                            bVar = new f5.b(dVar, context, r1Var, fVar);
                        }
                    } else {
                        sa.d dVar2 = (sa.d) fVar.f2299a;
                        if (fVar.a()) {
                            bVar = new f5.w(dVar2, context, fVar);
                        } else {
                            bVar = new f5.b(dVar2, context, fVar);
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

    public static void c(r1 r1Var, f5.f fVar, List list) {
        long j3;
        a8.b("Billing: Query product details finished " + fVar + ", " + list);
        if (fVar.f11156a == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f5.l lVar = (f5.l) it.next();
                if (lVar.f11173c.equals("telegram_premium")) {
                    f25202l = lVar;
                }
            }
            if (f25202l == null) {
                r();
                return;
            }
            boolean z9 = f25204n;
            int i7 = qs.f25028j5;
            if (z9) {
                f25204n = false;
                qs.e().m(i7, new Object[0]);
            }
            qs.e().m(i7, new Object[0]);
            return;
        }
        r();
        int i10 = r1Var.f25213j - 1;
        r1Var.f25213j = i10;
        if (i10 > 0) {
            if (i10 == 2) {
                j3 = 1000;
            } else {
                j3 = 10000;
            }
            g0.i3(new k1(r1Var, 0), j3);
        }
    }

    public static String g(String str, int i7, long j3, boolean z9) {
        if (str != null && !str.isEmpty()) {
            if ("TON".equalsIgnoreCase(str)) {
                return "TON " + (j3 / 1.0E9d);
            } else if ("XTR".equalsIgnoreCase(str)) {
                return jg.g.m(j3, ',', new StringBuilder("XTR "));
            } else {
                Currency currency = Currency.getInstance(str);
                if (currency != null) {
                    if (f25205o == null) {
                        f25205o = NumberFormat.getCurrencyInstance();
                    }
                    f25205o.setCurrency(currency);
                    if (z9) {
                        f25205o.setMaximumFractionDigits(0);
                        f25205o.setMinimumFractionDigits(0);
                        return f25205o.format(Math.round(j3 / Math.pow(10.0d, i7)));
                    }
                    int defaultFractionDigits = currency.getDefaultFractionDigits();
                    f25205o.setMinimumFractionDigits(defaultFractionDigits);
                    f25205o.setMaximumFractionDigits(defaultFractionDigits);
                    return f25205o.format(j3 / Math.pow(10.0d, i7));
                }
                return j3 + " " + str;
            }
        }
        return String.valueOf(j3);
    }

    public static r1 i() {
        if (f25203m == null) {
            f25203m = new r1(t0.f25570b);
        }
        return f25203m;
    }

    public static String j(int i7) {
        if (i7 != 12) {
            switch (i7) {
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
        if (f25204n) {
            return;
        }
        f25204n = true;
        qs.e().m(qs.f25028j5, new Object[0]);
    }

    @Override
    public final void a(f5.f fVar) {
        a8.b("Billing: Setup finished with result " + fVar);
        if (fVar.f11156a == 0) {
            this.f25211g = false;
            this.f25213j = 3;
            try {
                o(Collections.singletonList(f25201k), new p1(this));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            p("inapp", new p1(this));
            p("subs", new p1(this));
            ArrayList arrayList = this.f25212i;
            if (!arrayList.isEmpty()) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    g0.h3((Runnable) arrayList.get(i7));
                }
                arrayList.clear();
            }
        } else if (!this.f25211g) {
            r();
        }
    }

    @Override
    public final void b() {
        int i7;
        a8.b("Billing: Service disconnected");
        if (this.f25211g) {
            i7 = 15000;
        } else {
            i7 = 5000;
        }
        this.f25211g = true;
        g0.i3(new k1(this, 1), i7);
    }

    public final void d(String str, q0.a aVar) {
        this.f25206a.put(str, aVar);
    }

    public final void e(Purchase purchase, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Runnable runnable) {
        if (!(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiftCode) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiveaway) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentAuthCode)) {
            return;
        }
        a8.b("BillingController consumeGiftPurchase " + inputStorePaymentPurpose + " " + purchase.a() + " " + purchase.c());
        String c10 = purchase.c();
        if (c10 != null) {
            ?? obj = new Object();
            obj.f787a = c10;
            this.d.a(obj, new i(inputStorePaymentPurpose, purchase, runnable));
            return;
        }
        throw new IllegalArgumentException("Purchase token must be set");
    }

    public final String f(long j3, String str) {
        return g(str, h(str), j3, false);
    }

    public final int h(String str) {
        HashMap hashMap = this.f25208c;
        bg.b.a(hashMap);
        return ((Integer) Map.EL.getOrDefault(hashMap, str, 0)).intValue();
    }

    public final boolean k() {
        f5.b bVar = this.d;
        bVar.getClass();
        return bVar.o();
    }

    public final void l(Activity activity, c cVar, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list) {
        m(activity, cVar, inputStorePaymentPurpose, list, null, false);
    }

    public final void m(final Activity activity, final c cVar, final TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, final List list, final com.google.android.gms.internal.clearcut.z0 z0Var, boolean z9) {
        String encodeToString;
        if (k() && activity != null) {
            if (((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) && !z9) {
                a8.b("BillingController.launchBillingFlow, checking consumables");
                p("inapp", new f5.m() {
                    @Override
                    public final void b(f5.f r14, java.util.List r15) {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.l1.b(f5.f, java.util.List):void");
                    }
                });
                return;
            }
            if (z9) {
                a8.b("BillingController.launchBillingFlow, consumables checked, launching flow...");
            }
            boolean p10 = p10.i(cVar.f21770a).p();
            boolean z10 = false;
            if (p10) {
                encodeToString = Base64.encodeToString(String.valueOf(p10.i(cVar.f21770a).e()).getBytes(g9.j.f13592a), 0);
            } else {
                encodeToString = Base64.encodeToString(("account-" + cVar.f21770a).getBytes(g9.j.f13592a), 0);
            }
            long nextLong = Utilities.f21339b.nextLong();
            a8.b("BillingUtilities.savePurpose id=" + nextLong + " paymentPurpose=" + inputStorePaymentPurpose);
            SerializedData serializedData = new SerializedData(8);
            serializedData.writeInt64(nextLong);
            String f10 = Utilities.f(serializedData.toByteArray());
            serializedData.cleanup();
            a8.b("BillingUtilities.savePurpose id_hex=" + f10 + " paymentPurpose=" + inputStorePaymentPurpose);
            ?? tLObject = new TLObject();
            tLObject.f3233b = nextLong;
            tLObject.f3232a = 1;
            tLObject.f3234c = inputStorePaymentPurpose;
            SerializedData serializedData2 = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData2);
            String f11 = Utilities.f(serializedData2.toByteArray());
            serializedData2.cleanup();
            if (tLObject.getObjectSize() > 28) {
                a8.b("BillingUtilities.savePurpose: sending short version, original size is " + tLObject.getObjectSize() + " bytes");
                tLObject.f3232a = 0;
                tLObject.f3234c = null;
            }
            SerializedData serializedData3 = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData3);
            String f12 = Utilities.f(serializedData3.toByteArray());
            serializedData3.cleanup();
            t0.f25570b.getSharedPreferences("purchases", 0).edit().putString(f10, f11).apply();
            a8.b("BillingUtilities.savePurpose: saved {" + f11 + "} under " + f10);
            StringBuilder sb2 = new StringBuilder("BillingUtilities.savePurpose: but sending {");
            sb2.append(f12);
            sb2.append("}");
            a8.b(sb2.toString());
            ?? obj = new Object();
            obj.f3393b = 0;
            obj.f3392a = true;
            ArrayList arrayList = new ArrayList(list);
            bg.w0 w0Var = obj;
            if (z0Var != null) {
                ?? obj2 = new Object();
                obj2.f3394c = z0Var.f7301c;
                obj2.f3393b = z0Var.f7300b;
                w0Var = obj2;
            }
            f5.b bVar = this.d;
            boolean isEmpty = arrayList.isEmpty();
            if (!isEmpty) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj3 = arrayList.get(i7);
                    i7++;
                    if (((f5.d) obj3) == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                }
                ?? obj4 = new Object();
                if (!isEmpty && !((f5.d) arrayList.get(0)).f11149a.f11172b.optString("packageName").isEmpty()) {
                    z10 = true;
                }
                obj4.f11151a = z10;
                obj4.f11152b = encodeToString;
                obj4.f11153c = f12;
                boolean z11 = true;
                if (TextUtils.isEmpty((String) w0Var.f3394c) && TextUtils.isEmpty(null)) {
                    z11 = false;
                }
                boolean isEmpty2 = TextUtils.isEmpty(null);
                if (z11 && !isEmpty2) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!w0Var.f3392a && !z11 && isEmpty2) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                com.google.android.gms.internal.clearcut.z0 z0Var2 = new com.google.android.gms.internal.clearcut.z0(2);
                z0Var2.f7301c = (String) w0Var.f3394c;
                z0Var2.f7300b = w0Var.f3393b;
                obj4.d = z0Var2;
                obj4.f11155f = new ArrayList();
                obj4.f11154e = com.google.android.gms.internal.play_billing.r.p(arrayList);
                int i10 = bVar.b(activity, obj4).f11156a;
                if (i10 != 0) {
                    StringBuilder sb3 = new StringBuilder("Billing: Launch Error: ");
                    sb3.append(i10);
                    sb3.append(", ");
                    sb3.append(encodeToString);
                    sb3.append(", ");
                    org.telegram.ui.Cells.f1.u(f12, sb3);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
    }

    public final void n(f5.f r19, java.util.List r20, final org.telegram.messenger.ng r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.r1.n(f5.f, java.util.List, org.telegram.messenger.ng):void");
    }

    public final void o(List list, q1 q1Var) {
        if (k()) {
            d6.i iVar = new d6.i(21, false);
            if (list != null && !list.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    f5.o oVar = (f5.o) it.next();
                    if (!"play_pass_subs".equals(oVar.f11179b)) {
                        hashSet.add(oVar.f11179b);
                    }
                }
                if (hashSet.size() <= 1) {
                    com.google.android.gms.internal.play_billing.r p10 = com.google.android.gms.internal.play_billing.r.p(list);
                    iVar.f8212b = p10;
                    if (p10 != null) {
                        this.d.c(new aa.n(iVar), new j1(q1Var, 0));
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

    public final void p(String str, f5.m mVar) {
        f5.b bVar = this.d;
        bVar.getClass();
        if (f5.b.f(new f5.q(bVar, mVar, str), 30000L, new m9.u(17, bVar, mVar), bVar.r(), bVar.e()) == null) {
            f5.f u10 = bVar.u();
            bVar.y(25, 9, u10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f7447b;
            mVar.b(u10, com.google.android.gms.internal.play_billing.v.f7474e);
        }
    }

    public final void q() {
        if (!k()) {
            try {
                bg.b.a(this.f25208c);
                if (!r2.b()) {
                    this.d.d(this);
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
