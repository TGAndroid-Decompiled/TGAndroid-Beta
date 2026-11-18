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
public final class r1 implements f5.o, f5.c {
    public static final f5.p f26523k;
    public static f5.m f26524l;
    public static r1 f26525m;
    public static boolean f26526n;
    public static NumberFormat f26527o;
    public final f5.b d;
    public String f26531e;
    public String f26532f;
    public boolean f26533g;
    public Runnable h;
    public final HashMap f26528a = new HashMap();
    public final Set f26529b = Collections.newSetFromMap(new ConcurrentHashMap());
    public final HashMap f26530c = new HashMap();
    public final ArrayList f26534i = new ArrayList();
    public int f26535j = 0;

    static {
        f5.a aVar = new f5.a();
        aVar.f11245c = "subs";
        aVar.f11244b = "telegram_premium";
        f26523k = aVar.a();
    }

    public r1(Context context) {
        f5.b bVar;
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(context);
        fVar.f2242a = new w7.s(8);
        fVar.f2244c = this;
        if (context != null) {
            if (((r1) fVar.f2244c) != null) {
                if (((w7.s) fVar.f2242a) != null) {
                    ((w7.s) fVar.f2242a).getClass();
                    if (((r1) fVar.f2244c) != null) {
                        w7.s sVar = (w7.s) fVar.f2242a;
                        r1 r1Var = (r1) fVar.f2244c;
                        if (fVar.a()) {
                            bVar = new f5.w(sVar, context, r1Var, fVar);
                        } else {
                            bVar = new f5.b(sVar, context, r1Var, fVar);
                        }
                    } else {
                        w7.s sVar2 = (w7.s) fVar.f2242a;
                        if (fVar.a()) {
                            bVar = new f5.w(sVar2, context, fVar);
                        } else {
                            bVar = new f5.b(sVar2, context, fVar);
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
        if (fVar.f11283a == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f5.m mVar = (f5.m) it.next();
                if (mVar.f11301c.equals("telegram_premium")) {
                    f26524l = mVar;
                }
            }
            if (f26524l == null) {
                r();
                return;
            }
            boolean z10 = f26526n;
            int i7 = ks.f25154m5;
            if (z10) {
                f26526n = false;
                ks.e().m(i7, new Object[0]);
            }
            ks.e().m(i7, new Object[0]);
            return;
        }
        r();
        int i10 = r1Var.f26535j - 1;
        r1Var.f26535j = i10;
        if (i10 > 0) {
            if (i10 == 2) {
                j3 = 1000;
            } else {
                j3 = 10000;
            }
            g0.h3(new k1(r1Var, 0), j3);
        }
    }

    public static String g(String str, int i7, long j3, boolean z10) {
        if (str != null && !str.isEmpty()) {
            if ("TON".equalsIgnoreCase(str)) {
                return "TON " + (j3 / 1.0E9d);
            } else if ("XTR".equalsIgnoreCase(str)) {
                return i5.c.l(j3, ',', new StringBuilder("XTR "));
            } else {
                Currency currency = Currency.getInstance(str);
                if (currency != null) {
                    if (f26527o == null) {
                        f26527o = NumberFormat.getCurrencyInstance();
                    }
                    f26527o.setCurrency(currency);
                    if (z10) {
                        f26527o.setMaximumFractionDigits(0);
                        f26527o.setMinimumFractionDigits(0);
                        return f26527o.format(Math.round(j3 / Math.pow(10.0d, i7)));
                    }
                    int defaultFractionDigits = currency.getDefaultFractionDigits();
                    f26527o.setMinimumFractionDigits(defaultFractionDigits);
                    f26527o.setMaximumFractionDigits(defaultFractionDigits);
                    return f26527o.format(j3 / Math.pow(10.0d, i7));
                }
                return j3 + " " + str;
            }
        }
        return String.valueOf(j3);
    }

    public static r1 i() {
        if (f26525m == null) {
            f26525m = new r1(t0.f26913b);
        }
        return f26525m;
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
        if (f26526n) {
            return;
        }
        f26526n = true;
        ks.e().m(ks.f25154m5, new Object[0]);
    }

    @Override
    public final void a(f5.f fVar) {
        a8.b("Billing: Setup finished with result " + fVar);
        if (fVar.f11283a == 0) {
            this.f26533g = false;
            this.f26535j = 3;
            try {
                o(Collections.singletonList(f26523k), new p1(this));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            p("inapp", new p1(this));
            p("subs", new p1(this));
            ArrayList arrayList = this.f26534i;
            if (!arrayList.isEmpty()) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    g0.g3((Runnable) arrayList.get(i7));
                }
                arrayList.clear();
            }
        } else if (!this.f26533g) {
            r();
        }
    }

    @Override
    public final void b() {
        int i7;
        a8.b("Billing: Service disconnected");
        if (this.f26533g) {
            i7 = 15000;
        } else {
            i7 = 5000;
        }
        this.f26533g = true;
        g0.h3(new k1(this, 1), i7);
    }

    public final void d(String str, q0.a aVar) {
        this.f26528a.put(str, aVar);
    }

    public final void e(Purchase purchase, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Runnable runnable) {
        if (!(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiftCode) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiveaway) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentAuthCode)) {
            return;
        }
        a8.b("BillingController consumeGiftPurchase " + inputStorePaymentPurpose + " " + purchase.a() + " " + purchase.c());
        String c10 = purchase.c();
        if (c10 != null) {
            ?? obj = new Object();
            obj.f11286a = c10;
            this.d.a(obj, new i(inputStorePaymentPurpose, purchase, runnable));
            return;
        }
        throw new IllegalArgumentException("Purchase token must be set");
    }

    public final String f(long j3, String str) {
        return g(str, h(str), j3, false);
    }

    public final int h(String str) {
        HashMap hashMap = this.f26530c;
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

    public final void m(final Activity activity, final c cVar, final TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, final List list, final com.google.android.gms.internal.clearcut.y0 y0Var, boolean z10) {
        String encodeToString;
        if (k() && activity != null) {
            if (((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) && !z10) {
                a8.b("BillingController.launchBillingFlow, checking consumables");
                p("inapp", new f5.n() {
                    @Override
                    public final void b(f5.f r14, java.util.List r15) {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.l1.b(f5.f, java.util.List):void");
                    }
                });
                return;
            }
            if (z10) {
                a8.b("BillingController.launchBillingFlow, consumables checked, launching flow...");
            }
            boolean p10 = j10.i(cVar.f23218a).p();
            boolean z11 = false;
            if (p10) {
                encodeToString = Base64.encodeToString(String.valueOf(j10.i(cVar.f23218a).e()).getBytes(g9.j.f13252a), 0);
            } else {
                encodeToString = Base64.encodeToString(("account-" + cVar.f23218a).getBytes(g9.j.f13252a), 0);
            }
            long nextLong = Utilities.f22777b.nextLong();
            a8.b("BillingUtilities.savePurpose id=" + nextLong + " paymentPurpose=" + inputStorePaymentPurpose);
            SerializedData serializedData = new SerializedData(8);
            serializedData.writeInt64(nextLong);
            String f10 = Utilities.f(serializedData.toByteArray());
            serializedData.cleanup();
            a8.b("BillingUtilities.savePurpose id_hex=" + f10 + " paymentPurpose=" + inputStorePaymentPurpose);
            ?? tLObject = new TLObject();
            tLObject.f3186b = nextLong;
            tLObject.f3185a = 1;
            tLObject.f3187c = inputStorePaymentPurpose;
            SerializedData serializedData2 = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData2);
            String f11 = Utilities.f(serializedData2.toByteArray());
            serializedData2.cleanup();
            if (tLObject.getObjectSize() > 28) {
                a8.b("BillingUtilities.savePurpose: sending short version, original size is " + tLObject.getObjectSize() + " bytes");
                tLObject.f3185a = 0;
                tLObject.f3187c = null;
            }
            SerializedData serializedData3 = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData3);
            String f12 = Utilities.f(serializedData3.toByteArray());
            serializedData3.cleanup();
            t0.f26913b.getSharedPreferences("purchases", 0).edit().putString(f10, f11).apply();
            a8.b("BillingUtilities.savePurpose: saved {" + f11 + "} under " + f10);
            StringBuilder sb2 = new StringBuilder("BillingUtilities.savePurpose: but sending {");
            sb2.append(f12);
            sb2.append("}");
            a8.b(sb2.toString());
            ?? obj = new Object();
            obj.f3355b = 0;
            obj.f3354a = true;
            ArrayList arrayList = new ArrayList(list);
            bg.w0 w0Var = obj;
            if (y0Var != null) {
                ?? obj2 = new Object();
                obj2.f3356c = y0Var.f6965c;
                obj2.f3355b = y0Var.f6964b;
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
                if (!isEmpty && !((f5.d) arrayList.get(0)).f11276a.f11300b.optString("packageName").isEmpty()) {
                    z11 = true;
                }
                obj4.f11278a = z11;
                obj4.f11279b = encodeToString;
                obj4.f11280c = f12;
                boolean z12 = true;
                if (TextUtils.isEmpty((String) w0Var.f3356c) && TextUtils.isEmpty(null)) {
                    z12 = false;
                }
                boolean isEmpty2 = TextUtils.isEmpty(null);
                if (z12 && !isEmpty2) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!w0Var.f3354a && !z12 && isEmpty2) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                com.google.android.gms.internal.clearcut.y0 y0Var2 = new com.google.android.gms.internal.clearcut.y0(2);
                y0Var2.f6965c = (String) w0Var.f3356c;
                y0Var2.f6964b = w0Var.f3355b;
                obj4.d = y0Var2;
                obj4.f11282f = new ArrayList();
                obj4.f11281e = com.google.android.gms.internal.play_billing.r.p(arrayList);
                int i10 = bVar.b(activity, obj4).f11283a;
                if (i10 != 0) {
                    StringBuilder sb3 = new StringBuilder("Billing: Launch Error: ");
                    sb3.append(i10);
                    sb3.append(", ");
                    sb3.append(encodeToString);
                    sb3.append(", ");
                    p5.c.s(f12, sb3);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
    }

    public final void n(f5.f r19, java.util.List r20, final org.telegram.messenger.yf r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.r1.n(f5.f, java.util.List, org.telegram.messenger.yf):void");
    }

    public final void o(List list, q1 q1Var) {
        if (k()) {
            cb.c cVar = new cb.c(19);
            if (list != null && !list.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    f5.p pVar = (f5.p) it.next();
                    if (!"play_pass_subs".equals(pVar.f11307b)) {
                        hashSet.add(pVar.f11307b);
                    }
                }
                if (hashSet.size() <= 1) {
                    com.google.android.gms.internal.play_billing.r p10 = com.google.android.gms.internal.play_billing.r.p(list);
                    cVar.f5151b = p10;
                    if (p10 != null) {
                        this.d.c(new d6.i(cVar), new j1(q1Var, 0));
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

    public final void p(String str, f5.n nVar) {
        f5.b bVar = this.d;
        bVar.getClass();
        if (f5.b.f(new f5.r(bVar, nVar, str), 30000L, new m9.u(17, bVar, nVar), bVar.r(), bVar.e()) == null) {
            f5.f u10 = bVar.u();
            bVar.z(25, 9, u10);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f7114b;
            nVar.b(u10, com.google.android.gms.internal.play_billing.v.f7141e);
        }
    }

    public final void q() {
        if (!k()) {
            try {
                bg.b.a(this.f26530c);
                if (!s2.b()) {
                    this.d.d(this);
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
