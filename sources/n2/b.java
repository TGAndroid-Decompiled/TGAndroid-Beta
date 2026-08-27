package n2;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.ProxyBillingActivity;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.internal.play_billing.a1;
import com.google.android.gms.internal.play_billing.b1;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.n3;
import com.google.android.gms.internal.play_billing.o3;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.telegram.messenger.BillingController;

public class b extends a {
    public final Long A;
    public final com.google.android.gms.internal.play_billing.h B;

    public final String f18108c;
    public final String d;

    public volatile f f18110f;

    public final Context f18111g;
    public final g5.b h;

    public volatile com.google.android.gms.internal.play_billing.c f18112i;

    public volatile s f18113j;

    public boolean f18114k;

    public boolean f18116m;

    public boolean f18117n;

    public boolean f18118o;

    public boolean f18119p;

    public boolean f18120q;

    public boolean f18121r;

    public boolean f18122s;

    public boolean f18123t;

    public boolean f18124u;
    public boolean v;

    public boolean f18125w;

    public final w9.d f18126x;

    public final boolean f18127y;

    public ExecutorService f18128z;

    public final Object f18106a = new Object();

    public volatile int f18107b = 0;

    public final Handler f18109e = new Handler(Looper.getMainLooper());

    public int f18115l = 0;

    public b(w9.d dVar, Context context, n nVar, androidx.emoji2.text.f fVar) {
        long jNextLong = new Random().nextLong();
        this.A = Long.valueOf(jNextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f4031a;
        this.f18108c = "8.0.0";
        String strW = w();
        this.d = strW;
        this.f18111g = context.getApplicationContext();
        n3 n3VarX = o3.x();
        n3VarX.c();
        o3.v((o3) n3VarX.f4129b);
        if (strW != null) {
            n3VarX.c();
            o3.w((o3) n3VarX.f4129b, strW);
        }
        String packageName = this.f18111g.getPackageName();
        n3VarX.c();
        o3.t((o3) n3VarX.f4129b, packageName);
        n3VarX.c();
        o3.q((o3) n3VarX.f4129b, jNextLong);
        n3VarX.c();
        o3.u((o3) n3VarX.f4129b);
        int i10 = Build.VERSION.SDK_INT;
        n3VarX.c();
        o3.n((o3) n3VarX.f4129b, i10);
        n3VarX.d();
        try {
            int i11 = this.f18111g.getPackageManager().getPackageInfo(this.f18111g.getPackageName(), 0).versionCode;
            n3VarX.c();
            o3.o((o3) n3VarX.f4129b, i11);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new g5.b(this.f18111g, (o3) n3VarX.a());
        if (nVar == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f18110f = new f(this.f18111g, nVar, this.h);
        this.f18126x = dVar;
        this.f18127y = false;
        this.f18111g.getPackageName();
    }

    public static Future f(Callable callable, long j10, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new a9.o(25, futureSubmit, runnable), (long) (j10 * 0.95d));
            return futureSubmit;
        } catch (Exception e9) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Async task throws exception!", e9);
            return null;
        }
    }

    public static void p(b bVar, int i10) {
        if (i10 != 0) {
            bVar.k(0);
            return;
        }
        synchronized (bVar.f18106a) {
            try {
                if (bVar.f18107b == 3) {
                    return;
                }
                bVar.k(2);
                f fVar = bVar.f18110f != null ? bVar.f18110f : null;
                if (fVar != null) {
                    boolean z10 = bVar.f18124u;
                    c0 c0Var = (c0) fVar.f18145e;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    fVar.f18142a = z10;
                    c0 c0Var2 = (c0) fVar.f18146f;
                    Context context = (Context) fVar.f18143b;
                    c0Var2.a(context, intentFilter2);
                    if (fVar.f18142a) {
                        c0Var.b(context, intentFilter);
                    } else {
                        c0Var.a(context, intentFilter);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean q(b bVar) {
        boolean z10;
        synchronized (bVar.f18106a) {
            z10 = true;
            if (bVar.f18107b != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public static String w() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void A(int i10, int i11, g gVar, String str) {
        try {
            int i12 = y.f18189a;
            h(y.b(i10, i11, gVar, str, l3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void B(int i10, g gVar, long j10, boolean z10) {
        try {
            int i11 = y.f18189a;
            try {
                this.h.z(y.b(i10, 2, gVar, null, l3.BROADCAST_ACTION_UNSPECIFIED), this.f18115l, j10, z10);
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void C(int i10, g gVar, String str, long j10, boolean z10) {
        try {
            int i11 = y.f18189a;
            try {
                this.h.z(y.b(i10, 2, gVar, str, l3.BROADCAST_ACTION_UNSPECIFIED), this.f18115l, j10, z10);
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void D(g gVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f18109e.post(new a9.o(this, gVar, false, 24));
    }

    @Override
    public void a(ec.a aVar, h hVar) {
        if (f(new r(this, hVar, aVar, 0), 30000L, new q1(this, hVar, aVar, false, 8), r(), e()) == null) {
            g gVarU = u();
            y(25, 4, gVarU);
            hVar.a(gVarU, aVar.f5368b);
        }
    }

    @Override
    public g b(Activity activity, final f fVar) {
        String str;
        String str2;
        g gVarA;
        i iVar;
        g gVarA2;
        long j10;
        long j11;
        String str3;
        Future futureF;
        String str4;
        ?? r10;
        ?? r11;
        long j12;
        long j13;
        int iB;
        int i10;
        boolean z10;
        String string;
        String str5;
        boolean z11;
        String str6;
        boolean z12;
        final int i11;
        long jNextLong = new Random().nextLong();
        if (this.f18110f == null || ((n) this.f18110f.f18144c) == null) {
            g gVar = a0.f18104o;
            z(12, gVar, jNextLong);
            return gVar;
        }
        try {
            com.google.android.gms.internal.play_billing.u.g("BillingClient", "Already connected or not opted into auto reconnection.");
            g gVar2 = a0.f18097g;
            TimeUnit.MILLISECONDS.getClass();
            int i12 = gVar2.f18147a;
            if (i12 == 0) {
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Reconnection succeeded with result: " + i12);
            } else {
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed with result: " + i12);
            }
        } catch (Exception e9) {
            if (e9 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error during reconnection attempt: ", e9);
        }
        if (!o()) {
            g gVar3 = a0.h;
            z(2, gVar3, jNextLong);
            D(gVar3);
            return gVar3;
        }
        synchronized (this.f18106a) {
            try {
                if (this.f18113j != null) {
                    this.f18113j.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) fVar.f18146f);
        com.google.android.gms.internal.play_billing.r rVar = (com.google.android.gms.internal.play_billing.r) fVar.f18145e;
        Iterator it = arrayList.iterator();
        if ((it.hasNext() ? it.next() : null) != null) {
            throw new ClassCastException();
        }
        com.google.android.gms.internal.play_billing.p pVar = (com.google.android.gms.internal.play_billing.p) rVar.iterator();
        d dVar = (d) (pVar.hasNext() ? pVar.next() : null);
        l lVar = dVar.f18134a;
        String str7 = lVar.f18163c;
        String str8 = lVar.d;
        if (str8.equals("subs") && !this.f18114k) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Current client doesn't support subscriptions.");
            g gVar4 = a0.f18099j;
            B(9, gVar4, jNextLong, false);
            D(gVar4);
            return gVar4;
        }
        if (((String) fVar.f18143b) == null && ((String) fVar.f18144c) == null) {
            e eVar = (e) fVar.d;
            eVar.getClass();
            if (eVar.f18141b == 0 && !fVar.f18142a) {
                com.google.android.gms.internal.play_billing.r rVar2 = (com.google.android.gms.internal.play_billing.r) fVar.f18145e;
                if (rVar2 != null) {
                    int size = rVar2.size();
                    for (int i13 = 0; i13 < size; i13++) {
                    }
                }
            } else if (!this.f18116m) {
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Current client doesn't support extra params for buy intent.");
                g gVar5 = a0.f18095e;
                B(18, gVar5, jNextLong, false);
                D(gVar5);
                return gVar5;
            }
        } else if (!this.f18116m) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Current client doesn't support extra params for buy intent.");
            g gVar6 = a0.f18095e;
            B(18, gVar6, jNextLong, false);
            D(gVar6);
            return gVar6;
        }
        if (arrayList.size() > 1 && !this.f18120q) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Current client doesn't support multi-item purchases.");
            g gVar7 = a0.f18100k;
            B(19, gVar7, jNextLong, false);
            D(gVar7);
            return gVar7;
        }
        if (!rVar.isEmpty() && !this.f18121r) {
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            g gVar8 = a0.f18102m;
            B(20, gVar8, jNextLong, false);
            D(gVar8);
            return gVar8;
        }
        if (!((com.google.android.gms.internal.play_billing.r) fVar.f18145e).isEmpty()) {
            d dVar2 = (d) ((com.google.android.gms.internal.play_billing.r) fVar.f18145e).get(0);
            int i14 = 1;
            str = null;
            while (true) {
                if (i14 >= ((com.google.android.gms.internal.play_billing.r) fVar.f18145e).size()) {
                    str2 = str7;
                    l lVar2 = dVar2.f18134a;
                    String strOptString = lVar2.f18162b.optString("packageName");
                    HashMap map = new HashMap();
                    HashSet hashSet = new HashSet();
                    com.google.android.gms.internal.play_billing.r rVar3 = (com.google.android.gms.internal.play_billing.r) fVar.f18145e;
                    int size2 = rVar3.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 < size2) {
                            com.google.android.gms.internal.play_billing.r rVar4 = rVar3;
                            d dVar3 = (d) rVar3.get(i15);
                            int i16 = size2;
                            l lVar3 = dVar3.f18134a;
                            int i17 = i15;
                            ArrayList arrayList2 = lVar3.h;
                            String str9 = lVar3.f18163c;
                            if (arrayList2 != null && dVar3.f18135b == null) {
                                gVarA = a0.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str9);
                                break;
                            }
                            if (map.containsKey(str9)) {
                                gVarA = a0.a(5, "ProductId can not be duplicated. Invalid product id: " + lVar3.f18163c + ".");
                                break;
                            }
                            map.put(lVar3.f18163c, dVar3);
                            if (!lVar2.d.equals("play_pass_subs") && !lVar3.d.equals("play_pass_subs") && !strOptString.equals(lVar3.f18162b.optString("packageName"))) {
                                gVarA = a0.a(5, "All products must have the same package name.");
                                break;
                            }
                            i15 = i17 + 1;
                            size2 = i16;
                            rVar3 = rVar4;
                            hashSet = hashSet;
                        } else {
                            Iterator it2 = hashSet.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    ArrayList arrayList3 = lVar2.f18167i;
                                    String str10 = dVar2.f18135b;
                                    if (str10 != null && arrayList3 != null) {
                                        int size3 = arrayList3.size();
                                        int i18 = 0;
                                        do {
                                            if (i18 >= size3) {
                                                iVar = null;
                                                break;
                                            }
                                            Object obj = arrayList3.get(i18);
                                            i18++;
                                            iVar = (i) obj;
                                        } while (!str10.equals(iVar.d));
                                        if (iVar != null && iVar.f18155g != null) {
                                            gVarA = a0.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                            break;
                                        }
                                        gVarA = a0.f18097g;
                                        break;
                                    }
                                    gVarA = a0.f18097g;
                                    break;
                                }
                                String str11 = (String) it2.next();
                                if (map.containsKey(str11)) {
                                    gVarA = a0.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str11 + ".");
                                    break;
                                }
                            }
                        }
                    }
                    gVarA2 = gVarA;
                    break;
                }
                d dVar4 = (d) ((com.google.android.gms.internal.play_billing.r) fVar.f18145e).get(i14);
                str2 = str7;
                if (!dVar4.f18134a.d.equals(dVar2.f18134a.d) && !dVar4.f18134a.d.equals("play_pass_subs")) {
                    gVarA2 = a0.a(5, "All products should have same ProductType.");
                    break;
                }
                i14++;
                str7 = str2;
            }
        } else {
            str2 = str7;
            gVarA2 = a0.f18097g;
            str = null;
        }
        if (gVarA2 != a0.f18097g) {
            B(108, gVarA2, jNextLong, false);
            D(gVarA2);
            return gVarA2;
        }
        if (this.f18116m) {
            boolean z13 = this.f18117n;
            this.f18126x.getClass();
            this.f18126x.getClass();
            boolean z14 = this.f18127y;
            String str12 = this.f18108c;
            String str13 = this.d;
            long jLongValue = this.A.longValue();
            this.f18111g.getPackageName();
            int i19 = com.google.android.gms.internal.play_billing.u.f4131a;
            final Bundle bundle = new Bundle();
            com.google.android.gms.internal.play_billing.u.b(bundle, str12, str13, jLongValue);
            bundle.putLong("billingClientTransactionId", j10);
            int i20 = ((e) fVar.d).f18141b;
            if (i20 != 0) {
                j10 = r4;
                bundle.putInt("prorationMode", i20);
            }
            j10 = r4;
            if (!TextUtils.isEmpty((String) fVar.f18143b)) {
                bundle.putString("accountId", (String) fVar.f18143b);
            }
            if (!TextUtils.isEmpty((String) fVar.f18144c)) {
                bundle.putString("obfuscatedProfileId", (String) fVar.f18144c);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(str)));
            }
            if (!TextUtils.isEmpty(((e) fVar.d).f18140a)) {
                bundle.putString("oldSkuPurchaseToken", ((e) fVar.d).f18140a);
            }
            if (TextUtils.isEmpty(str)) {
                str5 = str;
            } else {
                str5 = str;
                bundle.putString("oldSkuPurchaseId", str5);
            }
            ((e) fVar.d).getClass();
            if (!TextUtils.isEmpty(str5)) {
                ((e) fVar.d).getClass();
                bundle.putString("originalExternalTransactionId", str5);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("paymentsPurchaseParams", str5);
            }
            if (z13) {
                z11 = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z11 = true;
            }
            if (z14) {
                bundle.putBoolean("enableAlternativeBilling", z11);
            }
            ArrayList arrayList4 = new ArrayList();
            com.google.android.gms.internal.play_billing.p pVarListIterator = ((com.google.android.gms.internal.play_billing.r) fVar.f18145e).listIterator(0);
            while (pVarListIterator.hasNext()) {
            }
            if (!arrayList4.isEmpty()) {
                a1 a1VarN = b1.n();
                a1VarN.c();
                b1.o((b1) a1VarN.f4129b, arrayList4);
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((b1) a1VarN.a()).a());
            }
            if (arrayList.isEmpty()) {
                ArrayList<String> arrayList5 = new ArrayList<>(rVar.size() - 1);
                ArrayList<String> arrayList6 = new ArrayList<>(rVar.size() - 1);
                ArrayList<String> arrayList7 = new ArrayList<>();
                ArrayList<String> arrayList8 = new ArrayList<>();
                ArrayList<String> arrayList9 = new ArrayList<>();
                ArrayList<Integer> arrayList10 = new ArrayList<>();
                int i21 = 0;
                while (i21 < rVar.size()) {
                    d dVar5 = (d) rVar.get(i21);
                    l lVar4 = dVar5.f18134a;
                    long j14 = j10;
                    if (!lVar4.f18165f.isEmpty()) {
                        arrayList7.add(lVar4.f18165f);
                    }
                    arrayList8.add(dVar5.f18135b);
                    String str14 = lVar4.f18166g;
                    ArrayList arrayList11 = lVar4.f18167i;
                    if (arrayList11 == null || arrayList11.isEmpty()) {
                        str6 = str14;
                        break;
                    }
                    ArrayList arrayList12 = lVar4.f18167i;
                    int size4 = arrayList12.size();
                    int i22 = 0;
                    while (true) {
                        if (i22 >= size4) {
                            str6 = str14;
                            break;
                        }
                        Object obj2 = arrayList12.get(i22);
                        i22++;
                        ArrayList arrayList13 = arrayList12;
                        i iVar2 = (i) obj2;
                        String str15 = str14;
                        if (!TextUtils.isEmpty(iVar2.f18154f)) {
                            str6 = iVar2.f18154f;
                            break;
                        }
                        str14 = str15;
                        arrayList12 = arrayList13;
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        arrayList9.add(str6);
                    }
                    if (i21 > 0) {
                        arrayList5.add(((d) rVar.get(i21)).f18134a.f18163c);
                        arrayList6.add(((d) rVar.get(i21)).f18134a.d);
                    }
                    i21++;
                    j10 = j14;
                }
                j11 = j10;
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList8);
                if (!arrayList10.isEmpty()) {
                    bundle.putIntegerArrayList("autoPayBalanceThresholdList", arrayList10);
                }
                if (!arrayList7.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList7);
                }
                if (!arrayList9.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList9);
                }
                if (!arrayList5.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList5);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList6);
                }
            } else {
                ArrayList<String> arrayList14 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    it3.next().getClass();
                    throw new ClassCastException();
                }
                if (!arrayList14.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList14);
                }
                if (arrayList.size() > 1) {
                    ArrayList<String> arrayList15 = new ArrayList<>(arrayList.size() - 1);
                    ArrayList<String> arrayList16 = new ArrayList<>(arrayList.size() - 1);
                    if (1 < arrayList.size()) {
                        arrayList.get(1).getClass();
                        throw new ClassCastException();
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList15);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList16);
                }
                j11 = j10;
            }
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f18118o) {
                g gVar9 = a0.f18101l;
                B(21, gVar9, j11, false);
                D(gVar9);
                return gVar9;
            }
            if (TextUtils.isEmpty(dVar.f18134a.f18162b.optString("packageName"))) {
                z12 = false;
            } else {
                bundle.putString("skuPackageName", dVar.f18134a.f18162b.optString("packageName"));
                z12 = true;
            }
            str3 = null;
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("accountName", null);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundle.putString("proxyPackage", stringExtra);
                try {
                    bundle.putString("proxyPackageVersion", this.f18111g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle.putString("proxyPackageVersion", "package not found");
                }
            }
            if (this.f18121r && !rVar.isEmpty()) {
                i11 = 17;
            } else if (this.f18119p && z12) {
                i11 = 15;
            } else {
                i11 = this.f18117n ? 9 : 6;
            }
            final String str16 = str2;
            final String str17 = str8;
            futureF = f(new Callable(i11, str16, str17, fVar, bundle) {

                public final int f18137b;

                public final String f18138c;
                public final String d;

                public final Bundle f18139e;

                {
                    this.f18139e = bundle;
                }

                @Override
                public final Object call() {
                    Bundle bundleC;
                    com.google.android.gms.internal.play_billing.c cVar;
                    b bVar = this.f18136a;
                    int i23 = this.f18137b;
                    String str18 = this.f18138c;
                    String str19 = this.d;
                    Bundle bundle2 = this.f18139e;
                    try {
                        synchronized (bVar.f18106a) {
                            cVar = bVar.f18112i;
                        }
                        if (cVar == null) {
                            return com.google.android.gms.internal.play_billing.u.c(107, a0.h);
                        }
                        return ((com.google.android.gms.internal.play_billing.a) cVar).X0(i23, bVar.f18111g.getPackageName(), str18, str19, bundle2);
                    } catch (DeadObjectException e10) {
                        g gVar10 = a0.h;
                        String strA = y.a(e10);
                        bundleC = com.google.android.gms.internal.play_billing.u.c(5, gVar10);
                        if (strA != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strA);
                        }
                        return bundleC;
                    } catch (Exception e11) {
                        g gVar11 = a0.f18096f;
                        String strA2 = y.a(e11);
                        bundleC = com.google.android.gms.internal.play_billing.u.c(5, gVar11);
                        if (strA2 != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strA2);
                        }
                        return bundleC;
                    }
                }
            }, 5000L, null, this.f18109e, e());
            str4 = str17;
        } else {
            j10 = r4;
            j11 = j10;
            str3 = str;
            String str18 = str8;
            futureF = f(new r(this, str2, str18, 3), 5000L, null, this.f18109e, e());
            str4 = str18;
        }
        try {
            if (futureF == null) {
                try {
                    g gVar10 = a0.f18093b;
                    B(25, gVar10, j11, false);
                    D(gVar10);
                    return gVar10;
                } catch (CancellationException e10) {
                    e = e10;
                    j13 = j11;
                    r11 = j13;
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    g gVar11 = a0.f18098i;
                    C(4, gVar11, y.a(e), r11, false);
                    D(gVar11);
                    return gVar11;
                } catch (TimeoutException e11) {
                    e = e11;
                    j13 = j11;
                    r11 = j13;
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    g gVar12 = a0.f18098i;
                    C(4, gVar12, y.a(e), r11, false);
                    D(gVar12);
                    return gVar12;
                } catch (Exception e12) {
                    e = e12;
                    j12 = j11;
                    r10 = j12;
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    g gVar13 = a0.h;
                    C(5, gVar13, y.a(e), r10, false);
                    D(gVar13);
                    return gVar13;
                }
            }
            long j15 = j11;
            Bundle bundle2 = (Bundle) futureF.get(5000L, TimeUnit.MILLISECONDS);
            int iA = com.google.android.gms.internal.play_billing.u.a("BillingClient", bundle2);
            String strF = com.google.android.gms.internal.play_billing.u.f("BillingClient", bundle2);
            if (iA == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                intent2.putExtra("billingClientTransactionId", j15);
                intent2.putExtra("wasServiceAutoReconnected", false);
                activity.startActivity(intent2);
                return a0.f18097g;
            }
            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Unable to buy item, Error response code: " + iA);
            g gVarA3 = a0.a(iA, strF);
            if (bundle2 == null) {
                i10 = 1;
                iB = 1;
            } else {
                try {
                    Object obj3 = bundle2.get("LOG_REASON");
                    if (obj3 != null) {
                        if (obj3 instanceof Integer) {
                            iB = a9.p.b(((Integer) obj3).intValue());
                            i10 = 1;
                        } else {
                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Unexpected type for bundle log reason: " + obj3.getClass().getName());
                        }
                    }
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th2.getMessage())));
                }
                i10 = 1;
                iB = 1;
            }
            if (iB == i10) {
                iB = 23;
            }
            if (bundle2 == null) {
                string = str3;
                z10 = false;
            } else {
                try {
                    z10 = false;
                    string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                } catch (Throwable th3) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th3.getMessage())));
                    string = str3;
                    z10 = false;
                }
            }
            try {
                C(iB, gVarA3, string, j15, z10);
                D(gVarA3);
                return gVarA3;
            } catch (CancellationException e13) {
                e = e13;
                j13 = j15;
                r11 = j13;
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                g gVar14 = a0.f18098i;
                C(4, gVar14, y.a(e), r11, false);
                D(gVar14);
                return gVar14;
            } catch (TimeoutException e14) {
                e = e14;
                j13 = j15;
                r11 = j13;
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                g gVar15 = a0.f18098i;
                C(4, gVar15, y.a(e), r11, false);
                D(gVar15);
                return gVar15;
            } catch (Exception e15) {
                e = e15;
                j12 = j15;
                r10 = j12;
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                g gVar16 = a0.h;
                C(5, gVar16, y.a(e), r10, false);
                D(gVar16);
                return gVar16;
            }
        } catch (CancellationException e16) {
            e = e16;
            r11 = str4;
        } catch (TimeoutException e17) {
            e = e17;
            r11 = str4;
        } catch (Exception e18) {
            e = e18;
            r10 = str4;
        }
    }

    @Override
    public void c(n1.d dVar, org.telegram.messenger.d dVar2) {
        if (f(new r(this, dVar2, dVar, 1), 30000L, new a9.o(this, dVar2, false, 26), r(), e()) == null) {
            g gVarU = u();
            y(25, 7, gVarU);
            com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f4109b;
            com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.f4136e;
            dVar2.a(gVarU, new p(vVar, vVar));
        }
    }

    @Override
    public void d(BillingController billingController) {
        l(billingController);
    }

    public final synchronized ExecutorService e() {
        try {
            if (this.f18128z == null) {
                this.f18128z = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.u.f4131a, new f9.v(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f18128z;
    }

    public final void g(h hVar, String str, g gVar, int i10, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str2, exc);
        A(i10, 4, gVar, y.a(exc));
        hVar.a(gVar, str);
    }

    public final void h(f3 f3Var) {
        try {
            g5.b bVar = this.h;
            int i10 = this.f18115l;
            bVar.getClass();
            try {
                n3 n3Var = (n3) ((o3) bVar.f6389b).g();
                n3Var.c();
                o3.p((o3) n3Var.f4129b, i10);
                bVar.f6389b = (o3) n3Var.a();
                bVar.w(f3Var);
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void i(h3 h3Var) {
        try {
            g5.b bVar = this.h;
            int i10 = this.f18115l;
            bVar.getClass();
            try {
                n3 n3Var = (n3) ((o3) bVar.f6389b).g();
                n3Var.c();
                o3.p((o3) n3Var.f4129b, i10);
                o3 o3Var = (o3) n3Var.a();
                bVar.f6389b = o3Var;
                try {
                    bVar.E(h3Var, o3Var);
                } catch (Throwable th) {
                    com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th);
                }
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void j(int i10, g gVar) {
        try {
            int i11 = y.f18189a;
            e3 e3Var = (e3) y.b(i10, 6, gVar, null, l3.BROADCAST_ACTION_UNSPECIFIED).g();
            b4 b4VarR = c4.r();
            b4VarR.d(false);
            b4VarR.e();
            e3Var.e(b4VarR);
            h((f3) e3Var.a());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void k(int i10) {
        String str;
        String str2;
        synchronized (this.f18106a) {
            try {
                if (this.f18107b == 3) {
                    return;
                }
                int i11 = this.f18107b;
                if (i11 == 0) {
                    str = "DISCONNECTED";
                } else if (i11 != 1) {
                    str = i11 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str = "CONNECTING";
                }
                if (i10 == 0) {
                    str2 = "DISCONNECTED";
                } else if (i10 != 1) {
                    str2 = i10 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str2 = "CONNECTING";
                }
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.f18107b = i10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(c cVar) {
        int i10;
        g gVarT;
        synchronized (this.f18106a) {
            try {
                if (o()) {
                    gVarT = t();
                } else if (this.f18107b == 1) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    gVarT = a0.f18094c;
                    j(37, gVarT);
                } else if (this.f18107b == 3) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    gVarT = a0.h;
                    j(38, gVarT);
                } else {
                    k(1);
                    m();
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Starting in-app billing setup.");
                    this.f18113j = new s(this, cVar);
                    com.google.android.gms.internal.play_billing.m mVar = this.f18113j.f18179b;
                    mVar.f4075c = 0L;
                    mVar.f4074b = false;
                    mVar.a();
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> listQueryIntentServices = this.f18111g.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        i10 = 41;
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        i10 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f18108c);
                                synchronized (this.f18106a) {
                                    try {
                                        if (this.f18107b == 2) {
                                            gVarT = t();
                                        } else if (this.f18107b != 1) {
                                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            gVarT = a0.h;
                                            j(105, gVarT);
                                        } else {
                                            s sVar = this.f18113j;
                                            if (this.f18111g.bindService(intent2, sVar, 1)) {
                                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service was bonded successfully.");
                                                gVarT = null;
                                            } else {
                                                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Connection to Billing service is blocked.");
                                                i10 = 39;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        } else {
                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    k(0);
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Billing service unavailable on device.");
                    gVarT = a0.f18092a;
                    j(i10, gVarT);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (gVarT != null) {
            cVar.onBillingSetupFinished(gVarT);
        }
    }

    public final void m() {
        synchronized (this.f18106a) {
            if (this.f18113j != null) {
                try {
                    this.f18111g.unbindService(this.f18113j);
                    this.f18112i = null;
                    this.f18113j = null;
                } catch (Throwable th) {
                    try {
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "There was an exception while unbinding service!", th);
                        this.f18112i = null;
                        this.f18113j = null;
                    } catch (Throwable th2) {
                        this.f18112i = null;
                        this.f18113j = null;
                        throw th2;
                    }
                }
            }
        }
    }

    public final boolean n() {
        com.google.android.gms.internal.play_billing.h hVar = this.B;
        if (hVar == null) {
            throw new NullPointerException("ticker");
        }
        long jA = hVar.a();
        long j10 = 30000;
        long jConvert = 30000;
        int i10 = 1;
        while (i10 <= 3) {
            try {
                if (Math.max(0L, jConvert) <= 0) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No time remaining for reconnection attempt.");
                    return o();
                }
                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Already connected or not opted into auto reconnection.");
                g gVar = a0.f18097g;
                TimeUnit.MILLISECONDS.getClass();
                int i11 = gVar.f18147a;
                if (i11 == 0) {
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Reconnection succeeded with result: " + i11);
                    return o();
                }
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed with result: " + i11);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long jA2 = (hVar.a() - jA) + 0;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                jConvert = j10 - timeUnit.convert(jA2, timeUnit2);
                long j11 = j10;
                long jPow = ((long) Math.pow(2.0d, i10 - 1)) * 1000;
                if (jConvert < jPow) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return o();
                }
                if (i10 < 3 && jPow > 0) {
                    try {
                        Thread.sleep(jPow);
                        jConvert = j11 - timeUnit.convert((hVar.a() - jA) + 0, timeUnit2);
                    } catch (InterruptedException e9) {
                        Thread.currentThread().interrupt();
                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error sleeping during reconnection attempt: ", e9);
                    }
                }
                i10++;
                j10 = j11;
            } catch (Exception e10) {
                if (e10 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error during reconnection attempt: ", e10);
            }
        }
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Max retries reached.");
        return o();
    }

    public final boolean o() {
        boolean z10;
        synchronized (this.f18106a) {
            try {
                z10 = false;
                if (this.f18107b == 2 && this.f18112i != null && this.f18113j != null) {
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public final Handler r() {
        return Looper.myLooper() == null ? this.f18109e : new Handler(Looper.myLooper());
    }

    public final u5.k s(g gVar, int i10, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        A(i10, 7, gVar, y.a(exc));
        return new u5.k(gVar.f18147a, gVar.f18149c, new ArrayList(), new ArrayList());
    }

    public final g t() {
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        g3 g3VarS = h3.s();
        g3VarS.c();
        h3.r((h3) g3VarS.f4129b, 6);
        b4 b4VarR = c4.r();
        b4VarR.c();
        c4.q((c4) b4VarR.f4129b);
        b4VarR.d(false);
        b4VarR.e();
        g3VarS.c();
        h3.q((h3) g3VarS.f4129b, (c4) b4VarR.a());
        i((h3) g3VarS.a());
        return a0.f18097g;
    }

    public final g u() {
        int[] iArr = {0, 3};
        synchronized (this.f18106a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.f18107b == iArr[i10]) {
                    return a0.h;
                }
            }
            return a0.f18096f;
        }
    }

    public final void v() {
        if (TextUtils.isEmpty(null)) {
            this.f18111g.getPackageName();
        }
    }

    public final g5.b x(g gVar, int i10, String str, Exception exc) {
        A(i10, 9, gVar, y.a(exc));
        com.google.android.gms.internal.play_billing.u.i("BillingClient", str, exc);
        return new g5.b(gVar, null, false, 24);
    }

    public final void y(int i10, int i11, g gVar) {
        try {
            int i12 = y.f18189a;
            h(y.b(i10, i11, gVar, null, l3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void z(int i10, g gVar, long j10) {
        try {
            int i11 = y.f18189a;
            try {
                this.h.x(y.b(i10, 2, gVar, null, l3.BROADCAST_ACTION_UNSPECIFIED), this.f18115l, j10);
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public b(w9.d dVar, Context context, androidx.emoji2.text.f fVar) {
        long jNextLong = new Random().nextLong();
        this.A = Long.valueOf(jNextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f4031a;
        this.f18108c = "8.0.0";
        String strW = w();
        this.d = strW;
        this.f18111g = context.getApplicationContext();
        n3 n3VarX = o3.x();
        n3VarX.c();
        o3.v((o3) n3VarX.f4129b);
        if (strW != null) {
            n3VarX.c();
            o3.w((o3) n3VarX.f4129b, strW);
        }
        String packageName = this.f18111g.getPackageName();
        n3VarX.c();
        o3.t((o3) n3VarX.f4129b, packageName);
        n3VarX.c();
        o3.q((o3) n3VarX.f4129b, jNextLong);
        n3VarX.c();
        o3.u((o3) n3VarX.f4129b);
        int i10 = Build.VERSION.SDK_INT;
        n3VarX.c();
        o3.n((o3) n3VarX.f4129b, i10);
        n3VarX.d();
        try {
            int i11 = this.f18111g.getPackageManager().getPackageInfo(this.f18111g.getPackageName(), 0).versionCode;
            n3VarX.c();
            o3.o((o3) n3VarX.f4129b, i11);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new g5.b(this.f18111g, (o3) n3VarX.a());
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f18110f = new f(this.f18111g, null, this.h);
        this.f18126x = dVar;
        this.f18111g.getPackageName();
    }
}
