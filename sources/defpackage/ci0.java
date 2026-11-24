package defpackage;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ci0 implements vh0 {
    public static final yw8 k;
    public static kl8 l;
    public static ci0 m;
    public static boolean n;
    public static NumberFormat o;
    public final uh0 d;
    public String e;
    public String f;
    public boolean g;
    public Runnable h;
    public final HashMap a = new HashMap();
    public final Set b = Collections.newSetFromMap(new ConcurrentHashMap());
    public final HashMap c = new HashMap();
    public final ArrayList i = new ArrayList();
    public int j = 0;

    static {
        ?? obj = new Object();
        obj.b = "subs";
        obj.a = "telegram_premium";
        k = obj.a();
    }

    public ci0(Context context) {
        uh0 uh0Var;
        sj sjVar = new sj(context);
        sjVar.a = new Object();
        sjVar.c = this;
        if (context != null) {
            if (((ci0) sjVar.c) != null) {
                if (((c6e) sjVar.a) != null) {
                    ((c6e) sjVar.a).getClass();
                    ci0 ci0Var = (ci0) sjVar.c;
                    c6e c6eVar = (c6e) sjVar.a;
                    if (ci0Var != null) {
                        ci0 ci0Var2 = (ci0) sjVar.c;
                        if (sjVar.a()) {
                            uh0Var = new lid(c6eVar, context, ci0Var2, sjVar);
                        } else {
                            uh0Var = new uh0(c6eVar, context, ci0Var2, sjVar);
                        }
                    } else if (sjVar.a()) {
                        uh0Var = new lid(c6eVar, context, sjVar);
                    } else {
                        uh0Var = new uh0(c6eVar, context, sjVar);
                    }
                    this.d = uh0Var;
                    return;
                }
                w26.j("Pending purchases for one-time products must be supported.");
                throw null;
            }
            w26.j("Please provide a valid listener for purchases updates.");
            throw null;
        }
        w26.j("Please provide a valid Context.");
        throw null;
    }

    public static String f(String str, int i, long j, boolean z) {
        if (str != null && !str.isEmpty()) {
            if ("TON".equalsIgnoreCase(str)) {
                return "TON " + (j / 1.0E9d);
            } else if ("XTR".equalsIgnoreCase(str)) {
                return "XTR ".concat(k96.E(j, ','));
            } else {
                Currency currency = Currency.getInstance(str);
                if (currency != null) {
                    NumberFormat numberFormat = o;
                    if (numberFormat == null) {
                        numberFormat = NumberFormat.getCurrencyInstance();
                        o = numberFormat;
                    }
                    numberFormat.setCurrency(currency);
                    if (z) {
                        o.setMaximumFractionDigits(0);
                        o.setMinimumFractionDigits(0);
                        return o.format(Math.round(j / Math.pow(10.0d, i)));
                    }
                    int defaultFractionDigits = currency.getDefaultFractionDigits();
                    o.setMinimumFractionDigits(defaultFractionDigits);
                    o.setMaximumFractionDigits(defaultFractionDigits);
                    return o.format(j / Math.pow(10.0d, i));
                }
                return j + " " + str;
            }
        }
        return String.valueOf(j);
    }

    public static ci0 h() {
        ci0 ci0Var = m;
        if (ci0Var == null) {
            ci0 ci0Var2 = new ci0(a.b);
            m = ci0Var2;
            return ci0Var2;
        }
        return ci0Var;
    }

    public static String i(int i) {
        if (i != 12) {
            switch (i) {
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
        if (n) {
            return;
        }
        n = true;
        kk7.e().m(kk7.l5, new Object[0]);
    }

    @Override
    public final void a(fi0 fi0Var) {
        fa4.b("Billing: Setup finished with result " + fi0Var);
        if (fi0Var.a == 0) {
            this.g = false;
            this.j = 3;
            try {
                o(Collections.singletonList(k), new yh0(this, (byte) 1));
            } catch (Exception e) {
                fa4.g(e, true);
            }
            p("inapp", new yh0(this, (byte) 2));
            p("subs", new yh0(this, (byte) 2));
            ArrayList arrayList = this.i;
            if (!arrayList.isEmpty()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    gl.d3((Runnable) arrayList.get(i));
                }
                arrayList.clear();
            }
        } else if (!this.g) {
            r();
        }
    }

    @Override
    public final void b() {
        int i;
        fa4.b("Billing: Service disconnected");
        if (this.g) {
            i = 15000;
        } else {
            i = 5000;
        }
        this.g = true;
        gl.e3(new xh0(this, (byte) 1), i);
    }

    public final void c(String str, vs2 vs2Var) {
        this.a.put(str, vs2Var);
    }

    public final void d(Purchase purchase, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Runnable runnable) {
        if (!(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiftCode) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiveaway) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentAuthCode)) {
            return;
        }
        fa4.b("BillingController consumeGiftPurchase " + inputStorePaymentPurpose + " " + purchase.a() + " " + purchase.b());
        String b = purchase.b();
        if (b != null) {
            ?? obj = new Object();
            obj.a = b;
            this.d.a(obj, new ie(inputStorePaymentPurpose, purchase, runnable, (byte) 4));
            return;
        }
        w26.j("Purchase token must be set");
    }

    public final String e(long j, String str) {
        return f(str, g(str), j, false);
    }

    public final int g(String str) {
        HashMap hashMap = this.c;
        hi0.a(hashMap);
        return ((Integer) Map.EL.getOrDefault(hashMap, str, 0)).intValue();
    }

    public final boolean j() {
        uh0 uh0Var = this.d;
        uh0Var.getClass();
        return uh0Var.o();
    }

    public final void k(Activity activity, j5 j5Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list) {
        l(activity, j5Var, inputStorePaymentPurpose, list, null, false);
    }

    public final void l(Activity activity, j5 j5Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, nfd nfdVar, boolean z) {
        String encodeToString;
        if (j() && activity != null) {
            if (((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) && !z) {
                fa4.b("BillingController.launchBillingFlow, checking consumables");
                p("inapp", new zd(this, activity, j5Var, inputStorePaymentPurpose, list, nfdVar));
                return;
            }
            if (z) {
                fa4.b("BillingController.launchBillingFlow, consumables checked, launching flow...");
            }
            boolean o2 = y6c.h(j5Var.a).o();
            int i = j5Var.a;
            boolean z2 = false;
            if (o2) {
                encodeToString = Base64.encodeToString(String.valueOf(y6c.h(i).e()).getBytes(ck1.a), 0);
            } else {
                encodeToString = Base64.encodeToString(de9.k(i, "account-").getBytes(ck1.a), 0);
            }
            long nextLong = Utilities.b.nextLong();
            fa4.b("BillingUtilities.savePurpose id=" + nextLong + " paymentPurpose=" + inputStorePaymentPurpose);
            SerializedData serializedData = new SerializedData(8);
            serializedData.writeInt64(nextLong);
            String f = Utilities.f(serializedData.toByteArray());
            serializedData.cleanup();
            fa4.b("BillingUtilities.savePurpose id_hex=" + f + " paymentPurpose=" + inputStorePaymentPurpose);
            ?? tLObject = new TLObject();
            tLObject.b = nextLong;
            tLObject.a = 1;
            tLObject.c = inputStorePaymentPurpose;
            SerializedData serializedData2 = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData2);
            String f2 = Utilities.f(serializedData2.toByteArray());
            serializedData2.cleanup();
            Object obj = null;
            if (tLObject.getObjectSize() > 28) {
                fa4.b("BillingUtilities.savePurpose: sending short version, original size is " + tLObject.getObjectSize() + " bytes");
                tLObject.a = 0;
                tLObject.c = null;
            }
            SerializedData serializedData3 = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData3);
            String f3 = Utilities.f(serializedData3.toByteArray());
            serializedData3.cleanup();
            a.b.getSharedPreferences("purchases", 0).edit().putString(f, f2).apply();
            fa4.b("BillingUtilities.savePurpose: saved {" + f2 + "} under " + f);
            StringBuilder sb = new StringBuilder("BillingUtilities.savePurpose: but sending {");
            sb.append(f3);
            sb.append("}");
            fa4.b(sb.toString());
            ?? obj2 = new Object();
            obj2.b = (byte) 0;
            obj2.a = true;
            ArrayList arrayList = new ArrayList(list);
            pa3 pa3Var = obj2;
            if (nfdVar != null) {
                ?? obj3 = new Object();
                obj3.c = (String) nfdVar.b;
                obj3.b = nfdVar.a;
                pa3Var = obj3;
            }
            uh0 uh0Var = this.d;
            boolean isEmpty = arrayList.isEmpty();
            if (!isEmpty) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj4 = arrayList.get(i2);
                    i2++;
                    if (((di0) obj4) == null) {
                        w26.j("ProductDetailsParams cannot be null.");
                        return;
                    }
                }
                ?? obj5 = new Object();
                if (!isEmpty && !((di0) arrayList.get(0)).a.b.optString("packageName").isEmpty()) {
                    z2 = true;
                }
                obj5.b = z2;
                obj5.a = encodeToString;
                obj5.c = f3;
                boolean isEmpty2 = TextUtils.isEmpty((String) pa3Var.c);
                if (!pa3Var.a && isEmpty2) {
                    w26.j("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                } else {
                    ?? obj6 = new Object();
                    obj6.b = (String) pa3Var.c;
                    obj6.a = pa3Var.b;
                    obj = obj6;
                }
                obj5.d = obj;
                obj5.f = new ArrayList();
                obj5.e = efd.p(arrayList);
                int i3 = uh0Var.b(activity, obj5).a;
                if (i3 != 0) {
                    StringBuilder sb2 = new StringBuilder("Billing: Launch Error: ");
                    sb2.append(i3);
                    sb2.append(", ");
                    sb2.append(encodeToString);
                    sb2.append(", ");
                    de9.s(f3, sb2);
                    return;
                }
                return;
            }
            w26.j("Details of the products must be provided.");
        }
    }

    public final void m(defpackage.fi0 r19, java.util.List r20, final defpackage.nn6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci0.m(fi0, java.util.List, nn6):void");
    }

    public final void n(fi0 fi0Var, List list) {
        long j;
        fa4.b("Billing: Query product details finished " + fi0Var + ", " + list);
        if (fi0Var.a == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kl8 kl8Var = (kl8) it.next();
                if (kl8Var.c.equals("telegram_premium")) {
                    l = kl8Var;
                }
            }
            if (l == null) {
                r();
                return;
            }
            boolean z = n;
            int i = kk7.l5;
            if (z) {
                n = false;
                kk7.e().m(i, new Object[0]);
            }
            kk7.e().m(i, new Object[0]);
            return;
        }
        r();
        int i2 = this.j - 1;
        this.j = i2;
        if (i2 > 0) {
            if (i2 == 2) {
                j = 1000;
            } else {
                j = 10000;
            }
            gl.e3(new xh0(this, (byte) 0), j);
        }
    }

    public final void o(List list, bi0 bi0Var) {
        if (j()) {
            ln8 ln8Var = new ln8((byte) 2, false);
            if (list != null && !list.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    yw8 yw8Var = (yw8) it.next();
                    if (!"play_pass_subs".equals(yw8Var.b)) {
                        hashSet.add(yw8Var.b);
                    }
                }
                if (hashSet.size() <= 1) {
                    efd p = efd.p(list);
                    ln8Var.b = p;
                    if (p != null) {
                        this.d.c(new z24(ln8Var), new sg0(bi0Var, (byte) 1));
                        return;
                    }
                    w26.j("Product list must be set to a non empty list.");
                    return;
                }
                w26.j("All products should be of the same product type.");
                return;
            }
            w26.j("Product list cannot be empty.");
            return;
        }
        sc8.j("Billing: Controller should be ready for this call!");
    }

    public final void p(String str, wu8 wu8Var) {
        uh0 uh0Var = this.d;
        uh0Var.getClass();
        if (uh0.f(new p4d(uh0Var, wu8Var, str), 30000L, new tq4(uh0Var, wu8Var, (byte) 18), uh0Var.r(), uh0Var.e()) == null) {
            fi0 u = uh0Var.u();
            uh0Var.x(25, 9, u);
            sed sedVar = efd.b;
            wu8Var.a(u, nhd.e);
        }
    }

    public final void q() {
        if (!j()) {
            try {
                hi0.a(this.c);
                if (!w01.b()) {
                    this.d.d(this);
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }
}
