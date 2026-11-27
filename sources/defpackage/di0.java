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
public final class di0 implements wh0 {
    public static final k09 k;
    public static wo8 l;
    public static di0 m;
    public static boolean n;
    public static NumberFormat o;
    public final vh0 d;
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

    public di0(Context context) {
        vh0 vh0Var;
        tj tjVar = new tj(context);
        tjVar.a = new Object();
        tjVar.c = this;
        if (context != null) {
            if (((di0) tjVar.c) != null) {
                if (((sae) tjVar.a) != null) {
                    ((sae) tjVar.a).getClass();
                    di0 di0Var = (di0) tjVar.c;
                    sae saeVar = (sae) tjVar.a;
                    if (di0Var != null) {
                        di0 di0Var2 = (di0) tjVar.c;
                        if (tjVar.a()) {
                            vh0Var = new cnd(saeVar, context, di0Var2, tjVar);
                        } else {
                            vh0Var = new vh0(saeVar, context, di0Var2, tjVar);
                        }
                    } else if (tjVar.a()) {
                        vh0Var = new cnd(saeVar, context, tjVar);
                    } else {
                        vh0Var = new vh0(saeVar, context, tjVar);
                    }
                    this.d = vh0Var;
                    return;
                }
                lq5.j("Pending purchases for one-time products must be supported.");
                throw null;
            }
            lq5.j("Please provide a valid listener for purchases updates.");
            throw null;
        }
        lq5.j("Please provide a valid Context.");
        throw null;
    }

    public static String f(String str, int i, long j, boolean z) {
        if (str != null && !str.isEmpty()) {
            if ("TON".equalsIgnoreCase(str)) {
                return "TON " + (j / 1.0E9d);
            } else if ("XTR".equalsIgnoreCase(str)) {
                return "XTR ".concat(ob6.E(j, ','));
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

    public static di0 h() {
        di0 di0Var = m;
        if (di0Var == null) {
            di0 di0Var2 = new di0(a.b);
            m = di0Var2;
            return di0Var2;
        }
        return di0Var;
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
        jn7.e().m(jn7.m5, new Object[0]);
    }

    @Override
    public final void a(gi0 gi0Var) {
        cc4.b("Billing: Setup finished with result " + gi0Var);
        if (gi0Var.a == 0) {
            this.g = false;
            this.j = 3;
            try {
                o(Collections.singletonList(k), new zh0(this, (byte) 1));
            } catch (Exception e) {
                cc4.g(e, true);
            }
            p("inapp", new zh0(this, (byte) 2));
            p("subs", new zh0(this, (byte) 2));
            ArrayList arrayList = this.i;
            if (!arrayList.isEmpty()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    hl.c3((Runnable) arrayList.get(i));
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
        cc4.b("Billing: Service disconnected");
        if (this.g) {
            i = 15000;
        } else {
            i = 5000;
        }
        this.g = true;
        hl.d3(new yh0(this, (byte) 1), i);
    }

    public final void c(String str, pt2 pt2Var) {
        this.a.put(str, pt2Var);
    }

    public final void d(Purchase purchase, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Runnable runnable) {
        if (!(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiftCode) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiveaway) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentAuthCode)) {
            return;
        }
        cc4.b("BillingController consumeGiftPurchase " + inputStorePaymentPurpose + " " + purchase.a() + " " + purchase.b());
        String b = purchase.b();
        if (b != null) {
            mt2 mt2Var = new mt2((byte) 0);
            mt2Var.b = b;
            this.d.a(mt2Var, new ie(inputStorePaymentPurpose, purchase, runnable, (byte) 4));
            return;
        }
        lq5.j("Purchase token must be set");
    }

    public final String e(long j, String str) {
        return f(str, g(str), j, false);
    }

    public final int g(String str) {
        HashMap hashMap = this.c;
        ii0.a(hashMap);
        return ((Integer) Map.EL.getOrDefault(hashMap, str, 0)).intValue();
    }

    public final boolean j() {
        vh0 vh0Var = this.d;
        vh0Var.getClass();
        return vh0Var.o();
    }

    public final void k(Activity activity, k5 k5Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list) {
        l(activity, k5Var, inputStorePaymentPurpose, list, null, false);
    }

    public final void l(Activity activity, k5 k5Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, ekd ekdVar, boolean z) {
        String encodeToString;
        if (j() && activity != null) {
            if (((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) && !z) {
                cc4.b("BillingController.launchBillingFlow, checking consumables");
                p("inapp", new kh(this, activity, k5Var, inputStorePaymentPurpose, list, ekdVar));
                return;
            }
            if (z) {
                cc4.b("BillingController.launchBillingFlow, consumables checked, launching flow...");
            }
            boolean o2 = yac.h(k5Var.a).o();
            int i = k5Var.a;
            boolean z2 = false;
            if (o2) {
                encodeToString = Base64.encodeToString(String.valueOf(yac.h(i).e()).getBytes(lk1.a), 0);
            } else {
                encodeToString = Base64.encodeToString(uh9.k(i, "account-").getBytes(lk1.a), 0);
            }
            long nextLong = Utilities.b.nextLong();
            cc4.b("BillingUtilities.savePurpose id=" + nextLong + " paymentPurpose=" + inputStorePaymentPurpose);
            SerializedData serializedData = new SerializedData(8);
            serializedData.writeInt64(nextLong);
            String f = Utilities.f(serializedData.toByteArray());
            serializedData.cleanup();
            cc4.b("BillingUtilities.savePurpose id_hex=" + f + " paymentPurpose=" + inputStorePaymentPurpose);
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
                cc4.b("BillingUtilities.savePurpose: sending short version, original size is " + tLObject.getObjectSize() + " bytes");
                tLObject.a = 0;
                tLObject.c = null;
            }
            SerializedData serializedData3 = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData3);
            String f3 = Utilities.f(serializedData3.toByteArray());
            serializedData3.cleanup();
            a.b.getSharedPreferences("purchases", 0).edit().putString(f, f2).apply();
            cc4.b("BillingUtilities.savePurpose: saved {" + f2 + "} under " + f);
            StringBuilder sb = new StringBuilder("BillingUtilities.savePurpose: but sending {");
            sb.append(f3);
            sb.append("}");
            cc4.b(sb.toString());
            ?? obj2 = new Object();
            obj2.b = (byte) 0;
            obj2.a = true;
            ArrayList arrayList = new ArrayList(list);
            ib3 ib3Var = obj2;
            if (ekdVar != null) {
                ?? obj3 = new Object();
                obj3.c = (String) ekdVar.b;
                obj3.b = ekdVar.a;
                ib3Var = obj3;
            }
            vh0 vh0Var = this.d;
            boolean isEmpty = arrayList.isEmpty();
            if (!isEmpty) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj4 = arrayList.get(i2);
                    i2++;
                    if (((ei0) obj4) == null) {
                        lq5.j("ProductDetailsParams cannot be null.");
                        return;
                    }
                }
                ?? obj5 = new Object();
                if (!isEmpty && !((ei0) arrayList.get(0)).a.b.optString("packageName").isEmpty()) {
                    z2 = true;
                }
                obj5.b = z2;
                obj5.a = encodeToString;
                obj5.c = f3;
                boolean isEmpty2 = TextUtils.isEmpty((String) ib3Var.c);
                if (!ib3Var.a && isEmpty2) {
                    lq5.j("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                } else {
                    ?? obj6 = new Object();
                    obj6.b = (String) ib3Var.c;
                    obj6.a = ib3Var.b;
                    obj = obj6;
                }
                obj5.d = obj;
                obj5.f = new ArrayList();
                obj5.e = vjd.p(arrayList);
                int i3 = vh0Var.b(activity, obj5).a;
                if (i3 != 0) {
                    StringBuilder sb2 = new StringBuilder("Billing: Launch Error: ");
                    sb2.append(i3);
                    sb2.append(", ");
                    sb2.append(encodeToString);
                    sb2.append(", ");
                    uh9.s(f3, sb2);
                    return;
                }
                return;
            }
            lq5.j("Details of the products must be provided.");
        }
    }

    public final void m(defpackage.gi0 r19, java.util.List r20, final defpackage.es6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.di0.m(gi0, java.util.List, es6):void");
    }

    public final void n(gi0 gi0Var, List list) {
        long j;
        cc4.b("Billing: Query product details finished " + gi0Var + ", " + list);
        if (gi0Var.a == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                wo8 wo8Var = (wo8) it.next();
                if (wo8Var.c.equals("telegram_premium")) {
                    l = wo8Var;
                }
            }
            if (l == null) {
                r();
                return;
            }
            boolean z = n;
            int i = jn7.m5;
            if (z) {
                n = false;
                jn7.e().m(i, new Object[0]);
            }
            jn7.e().m(i, new Object[0]);
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
            hl.d3(new yh0(this, (byte) 0), j);
        }
    }

    public final void o(List list, ci0 ci0Var) {
        if (j()) {
            j09 j09Var = new j09((byte) 0);
            if (list != null && !list.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    k09 k09Var = (k09) it.next();
                    if (!"play_pass_subs".equals(k09Var.b)) {
                        hashSet.add(k09Var.b);
                    }
                }
                if (hashSet.size() <= 1) {
                    vjd p = vjd.p(list);
                    j09Var.b = p;
                    if (p != null) {
                        this.d.c(new l09(j09Var), new tg0(ci0Var, (byte) 1));
                        return;
                    }
                    lq5.j("Product list must be set to a non empty list.");
                    return;
                }
                lq5.j("All products should be of the same product type.");
                return;
            }
            lq5.j("Product list cannot be empty.");
            return;
        }
        grb.i("Billing: Controller should be ready for this call!");
    }

    public final void p(String str, fy8 fy8Var) {
        vh0 vh0Var = this.d;
        vh0Var.getClass();
        if (vh0.f(new h9d(vh0Var, fy8Var, str), 30000L, new xs4(vh0Var, fy8Var, (byte) 18), vh0Var.r(), vh0Var.e()) == null) {
            gi0 u = vh0Var.u();
            vh0Var.x(25, 9, u);
            jjd jjdVar = vjd.b;
            fy8Var.a(u, emd.e);
        }
    }

    public final void q() {
        if (!j()) {
            try {
                ii0.a(this.c);
                if (!f11.b()) {
                    this.d.d(this);
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }
}
