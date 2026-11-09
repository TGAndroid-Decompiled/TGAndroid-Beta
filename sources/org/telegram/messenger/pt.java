package org.telegram.messenger;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.vd0;
public abstract class pt {
    public static void a(boolean[] zArr, vd0 vd0Var, boolean z9, k0.b bVar, Context context, int i7, Runnable[] runnableArr, TL_account.passkeyLoginOptions passkeyloginoptions, TLRPC.TL_error tL_error) {
        if (!zArr[0]) {
            if (tL_error != null) {
                vd0Var.a(0L, null, tL_error.text);
                return;
            }
            try {
                v0.q qVar = new v0.q(new JSONObject(passkeyloginoptions.options.data).getJSONObject("publicKey").toString());
                ArrayList arrayList = new ArrayList();
                arrayList.add(qVar);
                v0.n nVar = new v0.n(hd.f.l(arrayList), !z9);
                try {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    bVar.c(context, nVar, cancellationSignal, context.getMainExecutor(), new nt(vd0Var, context, i7));
                    runnableArr[0] = new a(cancellationSignal, 11);
                } catch (Exception e10) {
                    vd0Var.a(0L, null, e10.getMessage());
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                vd0Var.a(0L, null, e11.getMessage());
            }
        }
    }

    public static void b(final int i7, final Context context, final v10 v10Var) {
        if (!r2.f25218i) {
            return;
        }
        kotlin.jvm.internal.j.e(context, "context");
        final k0.b bVar = new k0.b(context);
        final org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
        u1Var.r(500L);
        ConnectionsManager.getInstance(i7).sendRequestTyped(new TL_account.initPasskeyRegistration(), new d3.b(1), new v10() {
            @Override
            public final void a(Object obj, Object obj2) {
                k0.b bVar2 = bVar;
                Context context2 = context;
                int i10 = i7;
                TL_account.passkeyRegistrationOptions passkeyregistrationoptions = (TL_account.passkeyRegistrationOptions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.u1.this.dismiss();
                v10 v10Var2 = v10Var;
                if (tL_error != null) {
                    v10Var2.a(null, tL_error.text);
                    return;
                }
                try {
                    try {
                        bVar2.b(context2, new v0.e(new JSONObject(passkeyregistrationoptions.options.data).getJSONObject("publicKey").toString()), new ot(new ht(i10, context2, v10Var2)));
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        g0.h3(new jt(v10Var2, e10, 0));
                    }
                } catch (Exception e11) {
                    a8.g(e11, true);
                    v10Var2.a(null, e11.getMessage());
                }
            }
        });
    }
}
