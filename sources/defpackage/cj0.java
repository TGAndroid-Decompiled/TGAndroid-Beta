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
public final class cj0 implements vi0 {
    public static final zy8 k;
    public static ln8 l;
    public static cj0 m;
    public static boolean n;
    public static NumberFormat o;
    public final ui0 d;
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

    public cj0(Context context) {
        ui0 ui0Var;
        sk skVar = new sk(context);
        skVar.a = new Object();
        skVar.c = this;
        if (context != null) {
            if (((cj0) skVar.c) != null) {
                if (((f8e) skVar.a) != null) {
                    ((f8e) skVar.a).getClass();
                    cj0 cj0Var = (cj0) skVar.c;
                    f8e f8eVar = (f8e) skVar.a;
                    if (cj0Var != null) {
                        cj0 cj0Var2 = (cj0) skVar.c;
                        if (skVar.a()) {
                            ui0Var = new nkd(f8eVar, context, cj0Var2, skVar);
                        } else {
                            ui0Var = new ui0(f8eVar, context, cj0Var2, skVar);
                        }
                    } else if (skVar.a()) {
                        ui0Var = new nkd(f8eVar, context, skVar);
                    } else {
                        ui0Var = new ui0(f8eVar, context, skVar);
                    }
                    this.d = ui0Var;
                    return;
                }
                u36.j("Pending purchases for one-time products must be supported.");
                throw null;
            }
            u36.j("Please provide a valid listener for purchases updates.");
            throw null;
        }
        u36.j("Please provide a valid Context.");
        throw null;
    }

    public static String f(String str, int i, long j, boolean z) {
        if (str != null && !str.isEmpty()) {
            if ("TON".equalsIgnoreCase(str)) {
                return "TON " + (j / 1.0E9d);
            } else if ("XTR".equalsIgnoreCase(str)) {
                return "XTR ".concat(jb6.E(j, ','));
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

    public static cj0 h() {
        cj0 cj0Var = m;
        if (cj0Var == null) {
            cj0 cj0Var2 = new cj0(a.b);
            m = cj0Var2;
            return cj0Var2;
        }
        return cj0Var;
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
        nm7.e().m(nm7.n5, new Object[0]);
    }

    @Override
    public final void a(fj0 fj0Var) {
        fc4.b("Billing: Setup finished with result " + fj0Var);
        if (fj0Var.a == 0) {
            this.g = false;
            this.j = 3;
            try {
                o(Collections.singletonList(k), new yi0(this, (byte) 1));
            } catch (Exception e) {
                fc4.g(e, true);
            }
            p("inapp", new yi0(this, (byte) 2));
            p("subs", new yi0(this, (byte) 2));
            ArrayList arrayList = this.i;
            if (!arrayList.isEmpty()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    gm.c3((Runnable) arrayList.get(i));
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
        fc4.b("Billing: Service disconnected");
        if (this.g) {
            i = 15000;
        } else {
            i = 5000;
        }
        this.g = true;
        gm.d3(new xi0(this, (byte) 1), i);
    }

    public final void c(String str, gu2 gu2Var) {
        this.a.put(str, gu2Var);
    }

    public final void d(Purchase purchase, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Runnable runnable) {
        if (!(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiftCode) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiveaway) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentAuthCode)) {
            return;
        }
        fc4.b("BillingController consumeGiftPurchase " + inputStorePaymentPurpose + " " + purchase.a() + " " + purchase.b());
        String b = purchase.b();
        if (b != null) {
            du2 du2Var = new du2();
            du2Var.b = b;
            this.d.a(du2Var, new jf(inputStorePaymentPurpose, purchase, runnable, (byte) 4));
            return;
        }
        u36.j("Purchase token must be set");
    }

    public final String e(long j, String str) {
        return f(str, g(str), j, false);
    }

    public final int g(String str) {
        HashMap hashMap = this.c;
        hj0.a(hashMap);
        return ((Integer) Map.EL.getOrDefault(hashMap, str, 0)).intValue();
    }

    public final boolean j() {
        ui0 ui0Var = this.d;
        ui0Var.getClass();
        return ui0Var.o();
    }

    public final void k(Activity activity, j5 j5Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list) {
        l(activity, j5Var, inputStorePaymentPurpose, list, null, false);
    }

    public final void l(Activity activity, j5 j5Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, ohd ohdVar, boolean z) {
        String encodeToString;
        if (j() && activity != null) {
            if (((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) && !z) {
                fc4.b("BillingController.launchBillingFlow, checking consumables");
                p("inapp", new ze(this, activity, j5Var, inputStorePaymentPurpose, list, ohdVar));
                return;
            }
            if (z) {
                fc4.b("BillingController.launchBillingFlow, consumables checked, launching flow...");
            }
            boolean o2 = z8c.h(j5Var.a).o();
            int i = j5Var.a;
            boolean z2 = false;
            if (o2) {
                encodeToString = Base64.encodeToString(String.valueOf(z8c.h(i).e()).getBytes(kl1.a), 0);
            } else {
                encodeToString = Base64.encodeToString(hg9.j(i, "account-").getBytes(kl1.a), 0);
            }
            long nextLong = Utilities.b.nextLong();
            fc4.b("BillingUtilities.savePurpose id=" + nextLong + " paymentPurpose=" + inputStorePaymentPurpose);
            SerializedData serializedData = new SerializedData(8);
            serializedData.writeInt64(nextLong);
            String f = Utilities.f(serializedData.toByteArray());
            serializedData.cleanup();
            fc4.b("BillingUtilities.savePurpose id_hex=" + f + " paymentPurpose=" + inputStorePaymentPurpose);
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
                fc4.b("BillingUtilities.savePurpose: sending short version, original size is " + tLObject.getObjectSize() + " bytes");
                tLObject.a = 0;
                tLObject.c = null;
            }
            SerializedData serializedData3 = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData3);
            String f3 = Utilities.f(serializedData3.toByteArray());
            serializedData3.cleanup();
            a.b.getSharedPreferences("purchases", 0).edit().putString(f, f2).apply();
            fc4.b("BillingUtilities.savePurpose: saved {" + f2 + "} under " + f);
            StringBuilder sb = new StringBuilder("BillingUtilities.savePurpose: but sending {");
            sb.append(f3);
            sb.append("}");
            fc4.b(sb.toString());
            ?? obj2 = new Object();
            obj2.b = (byte) 0;
            obj2.a = true;
            ArrayList arrayList = new ArrayList(list);
            bc3 bc3Var = obj2;
            if (ohdVar != null) {
                ?? obj3 = new Object();
                obj3.c = (String) ohdVar.b;
                obj3.b = ohdVar.a;
                bc3Var = obj3;
            }
            ui0 ui0Var = this.d;
            boolean isEmpty = arrayList.isEmpty();
            if (!isEmpty) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj4 = arrayList.get(i2);
                    i2++;
                    if (((dj0) obj4) == null) {
                        u36.j("ProductDetailsParams cannot be null.");
                        return;
                    }
                }
                ?? obj5 = new Object();
                if (!isEmpty && !((dj0) arrayList.get(0)).a.b.optString("packageName").isEmpty()) {
                    z2 = true;
                }
                obj5.b = z2;
                obj5.a = encodeToString;
                obj5.c = f3;
                boolean isEmpty2 = TextUtils.isEmpty((String) bc3Var.c);
                if (!bc3Var.a && isEmpty2) {
                    u36.j("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                } else {
                    ?? obj6 = new Object();
                    obj6.b = (String) bc3Var.c;
                    obj6.a = bc3Var.b;
                    obj = obj6;
                }
                obj5.d = obj;
                obj5.f = new ArrayList();
                obj5.e = fhd.p(arrayList);
                int i3 = ui0Var.b(activity, obj5).a;
                if (i3 != 0) {
                    StringBuilder sb2 = new StringBuilder("Billing: Launch Error: ");
                    sb2.append(i3);
                    sb2.append(", ");
                    sb2.append(encodeToString);
                    sb2.append(", ");
                    hg9.r(f3, sb2);
                    return;
                }
                return;
            }
            u36.j("Details of the products must be provided.");
        }
    }

    public final void m(defpackage.fj0 r19, java.util.List r20, final defpackage.op6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj0.m(fj0, java.util.List, op6):void");
    }

    public final void n(fj0 fj0Var, List list) {
        long j;
        fc4.b("Billing: Query product details finished " + fj0Var + ", " + list);
        if (fj0Var.a == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ln8 ln8Var = (ln8) it.next();
                if (ln8Var.c.equals("telegram_premium")) {
                    l = ln8Var;
                }
            }
            if (l == null) {
                r();
                return;
            }
            boolean z = n;
            int i = nm7.n5;
            if (z) {
                n = false;
                nm7.e().m(i, new Object[0]);
            }
            nm7.e().m(i, new Object[0]);
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
            gm.d3(new xi0(this, (byte) 0), j);
        }
    }

    public final void o(List list, bj0 bj0Var) {
        if (j()) {
            ai4 ai4Var = new ai4((byte) 25, false);
            if (list != null && !list.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zy8 zy8Var = (zy8) it.next();
                    if (!"play_pass_subs".equals(zy8Var.b)) {
                        hashSet.add(zy8Var.b);
                    }
                }
                if (hashSet.size() <= 1) {
                    fhd p = fhd.p(list);
                    ai4Var.b = p;
                    if (p != null) {
                        this.d.c(new oo8(ai4Var), new xg0(bj0Var, (byte) 3));
                        return;
                    }
                    u36.j("Product list must be set to a non empty list.");
                    return;
                }
                u36.j("All products should be of the same product type.");
                return;
            }
            u36.j("Product list cannot be empty.");
            return;
        }
        dq9.m("Billing: Controller should be ready for this call!");
    }

    public final void p(String str, xw8 xw8Var) {
        ui0 ui0Var = this.d;
        ui0Var.getClass();
        if (ui0.f(new r6d(ui0Var, xw8Var, str), 30000L, new us4(ui0Var, xw8Var, (byte) 18), ui0Var.r(), ui0Var.e()) == null) {
            fj0 u = ui0Var.u();
            ui0Var.x(25, 9, u);
            tgd tgdVar = fhd.b;
            xw8Var.a(u, ojd.e);
        }
    }

    public final void q() {
        if (!j()) {
            try {
                hj0.a(this.c);
                if (!e21.b()) {
                    this.d.d(this);
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }
}
