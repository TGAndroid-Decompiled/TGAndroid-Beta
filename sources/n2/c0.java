package n2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.n1;
import com.google.android.gms.internal.play_billing.n3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p2;
import com.google.android.gms.internal.play_billing.r1;
import com.google.android.gms.internal.play_billing.s3;
import com.google.android.gms.internal.play_billing.u3;
import java.util.ArrayList;

public final class c0 extends BroadcastReceiver {

    public boolean f18131a;

    public final boolean f18132b;

    public final f f18133c;

    public c0(f fVar, boolean z10) {
        this.f18133c = fVar;
        this.f18132b = z10;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f18131a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f18132b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f18131a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) throws Throwable {
        c0 c0Var;
        try {
            try {
                if (this.f18131a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    c0Var = this;
                    context.registerReceiver(c0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f18132b ? 4 : 2);
                } else {
                    c0Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                c0Var.f18131a = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void c(Bundle bundle, g gVar, int i10, l3 l3Var, long j10, boolean z10) {
        n1 n1VarC;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
                ((g5.b) ((z) this.f18133c.d)).y(y.b(23, i10, gVar, null, l3Var), j10, z10);
                return;
            }
            z zVar = (z) this.f18133c.d;
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i11 = n1.f4085a;
            synchronized (n1.class) {
                int i12 = n1.f4085a;
                p2 p2Var = p2.f4099c;
                n1VarC = r1.c();
                int i13 = n1.f4085a;
            }
            ((g5.b) zVar).y(f3.n(byteArray, n1VarC), j10, z10);
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        l3 l3Var;
        g gVarE;
        long j10;
        ArrayList arrayList;
        g gVar;
        g5.b bVar;
        o3 o3Var;
        int iIntValue;
        String action = intent.getAction();
        int iHashCode = action.hashCode();
        l3 l3Var2 = l3.LOCAL_PURCHASES_UPDATED_ACTION;
        l3 l3Var3 = l3.PURCHASES_UPDATED_ACTION;
        l3 l3Var4 = l3.ALTERNATIVE_BILLING_ACTION;
        if (iHashCode != -1484087650) {
            if (iHashCode != -337612916) {
                if (iHashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                    l3Var = l3Var4;
                } else {
                    l3Var = l3.BROADCAST_ACTION_UNSPECIFIED;
                }
            } else if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                l3Var = l3Var2;
            } else {
                l3Var = l3.BROADCAST_ACTION_UNSPECIFIED;
            }
        } else if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            l3Var = l3Var3;
        } else {
            l3Var = l3.BROADCAST_ACTION_UNSPECIFIED;
        }
        int i10 = (l3Var.equals(l3Var2) || l3Var.equals(l3Var4)) ? 2 : l3Var.equals(l3Var3) ? 32 : 1;
        Bundle extras = intent.getExtras();
        f fVar = this.f18133c;
        if (extras == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Bundle is null.");
            z zVar = (z) fVar.d;
            g gVar2 = a0.f18096f;
            ((g5.b) zVar).w(y.b(11, i10, gVar2, null, l3Var));
            n nVar = (n) fVar.f18144c;
            if (nVar != null) {
                nVar.onPurchasesUpdated(gVar2, null);
                return;
            }
            return;
        }
        if (i10 == 2) {
            int i11 = com.google.android.gms.internal.play_billing.u.f4131a;
            j3.a aVarA = g.a();
            aVarA.f12301a = com.google.android.gms.internal.play_billing.u.a("BillingBroadcastManager", intent.getExtras());
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Unexpected null bundle received!");
            } else {
                Object obj = extras2.get("SUB_RESPONSE_CODE");
                if (obj == null) {
                    com.google.android.gms.internal.play_billing.u.g("BillingBroadcastManager", "getLaunchBillingFlowSubResponseCodeFromBundle() got null response code, assuming OK");
                } else {
                    if (obj instanceof Integer) {
                        iIntValue = ((Integer) obj).intValue();
                    } else {
                        com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                    }
                    aVarA.f12302b = iIntValue;
                    aVarA.f12303c = com.google.android.gms.internal.play_billing.u.f("BillingBroadcastManager", intent.getExtras());
                    gVarE = aVarA.a();
                }
            }
            iIntValue = 0;
            aVarA.f12302b = iIntValue;
            aVarA.f12303c = com.google.android.gms.internal.play_billing.u.f("BillingBroadcastManager", intent.getExtras());
            gVarE = aVarA.a();
        } else {
            gVarE = com.google.android.gms.internal.play_billing.u.e("BillingBroadcastManager", intent);
        }
        long j11 = extras.getLong("billingClientTransactionId", 0L);
        boolean z10 = extras.getBoolean("wasServiceAutoReconnected", false);
        if (!l3Var.equals(l3Var3) && !l3Var.equals(l3Var2)) {
            if (l3Var.equals(l3Var4)) {
                if (gVarE.f18147a != 0) {
                    c(extras, gVarE, i10, l3Var, j11, z10);
                    n nVar2 = (n) fVar.f18144c;
                    com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f4109b;
                    nVar2.onPurchasesUpdated(gVarE, com.google.android.gms.internal.play_billing.v.f4136e);
                    return;
                }
                fVar.getClass();
                com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                z zVar2 = (z) fVar.d;
                g gVar3 = a0.f18096f;
                ((g5.b) zVar2).y(y.b(77, i10, gVar3, null, l3Var), j11, z10);
                n nVar3 = (n) fVar.f18144c;
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.f4109b;
                nVar3.onPurchasesUpdated(gVar3, com.google.android.gms.internal.play_billing.v.f4136e);
                return;
            }
            return;
        }
        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList2 = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            j10 = 0;
            Purchase purchaseJ = com.google.android.gms.internal.play_billing.u.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseJ == null) {
                com.google.android.gms.internal.play_billing.u.g("BillingHelper", "Couldn't find single purchase data as well.");
                arrayList = null;
            } else {
                arrayList2.add(purchaseJ);
            }
            if (gVarE.f18147a == 0) {
                z zVar3 = (z) fVar.d;
                h3 h3VarC = y.c(i10, l3Var);
                bVar = (g5.b) zVar3;
                bVar.getClass();
                try {
                    g3 g3Var = (g3) h3VarC.g();
                    s3 s3Var = (s3) h3VarC.n().g();
                    s3Var.c();
                    u3.n((u3) s3Var.f4129b, z10);
                    g3Var.c();
                    h3.p((h3) g3Var.f4129b, (u3) s3Var.a());
                    h3 h3Var = (h3) g3Var.a();
                    if (j11 == j10) {
                        o3Var = (o3) bVar.f6389b;
                    } else {
                        n3 n3Var = (n3) ((o3) bVar.f6389b).g();
                        n3Var.c();
                        o3.r((o3) n3Var.f4129b, j11);
                        o3Var = (o3) n3Var.a();
                    }
                    bVar.E(h3Var, o3Var);
                } catch (Throwable th) {
                    com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th);
                }
                gVar = gVarE;
            } else {
                gVar = gVarE;
                c(extras, gVar, i10, l3Var, j11, z10);
            }
            ((n) fVar.f18144c).onPurchasesUpdated(gVar, arrayList);
        }
        j10 = 0;
        com.google.android.gms.internal.play_billing.u.g("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i12 = 0; i12 < stringArrayList.size() && i12 < stringArrayList2.size(); i12++) {
            Purchase purchaseJ2 = com.google.android.gms.internal.play_billing.u.j(stringArrayList.get(i12), stringArrayList2.get(i12));
            if (purchaseJ2 != null) {
                arrayList2.add(purchaseJ2);
            }
        }
        arrayList = arrayList2;
        if (gVarE.f18147a == 0) {
            z zVar4 = (z) fVar.d;
            h3 h3VarC2 = y.c(i10, l3Var);
            bVar = (g5.b) zVar4;
            bVar.getClass();
            g3 g3Var2 = (g3) h3VarC2.g();
            s3 s3Var2 = (s3) h3VarC2.n().g();
            s3Var2.c();
            u3.n((u3) s3Var2.f4129b, z10);
            g3Var2.c();
            h3.p((h3) g3Var2.f4129b, (u3) s3Var2.a());
            h3 h3Var2 = (h3) g3Var2.a();
            if (j11 == j10) {
                o3Var = (o3) bVar.f6389b;
            } else {
                n3 n3Var2 = (n3) ((o3) bVar.f6389b).g();
                n3Var2.c();
                o3.r((o3) n3Var2.f4129b, j11);
                o3Var = (o3) n3Var2.a();
            }
            bVar.E(h3Var2, o3Var);
            gVar = gVarE;
        } else {
            gVar = gVarE;
            c(extras, gVar, i10, l3Var, j11, z10);
        }
        ((n) fVar.f18144c).onPurchasesUpdated(gVar, arrayList);
    }
}
