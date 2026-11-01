package org.telegram.messenger;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ze0;
public abstract class bu {
    public static void a(boolean[] zArr, ze0 ze0Var, boolean z10, q2.b bVar, Context context, int i10, Runnable[] runnableArr, TL_account.passkeyLoginOptions passkeyloginoptions, TLRPC.TL_error tL_error) {
        if (!zArr[0]) {
            if (tL_error != null) {
                ze0Var.a(0L, null, tL_error.text);
                return;
            }
            try {
                v0.o oVar = new v0.o(new JSONObject(passkeyloginoptions.options.data).getJSONObject("publicKey").toString());
                ArrayList arrayList = new ArrayList();
                arrayList.add(oVar);
                v0.m mVar = new v0.m(bd.i.m(arrayList), !z10);
                try {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    Executor executor = context.getMainExecutor();
                    zt ztVar = new zt(ze0Var, context, i10);
                    kotlin.jvm.internal.i.e(executor, "executor");
                    v0.i c10 = k0.b.c(new k0.b(context), mVar);
                    if (c10 == null) {
                        ztVar.g(new w0.h(1, "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                    } else {
                        c10.onGetCredential(context, mVar, cancellationSignal, executor, ztVar);
                    }
                    runnableArr[0] = new ns(cancellationSignal, 2);
                } catch (Exception e) {
                    ze0Var.a(0L, null, e.getMessage());
                }
            } catch (Exception e7) {
                f8.g(e7, true);
                ze0Var.a(0L, null, e7.getMessage());
            }
        }
    }

    public static void b(final int i10, final Context context, final k20 k20Var) {
        if (!v2.f18583i) {
            return;
        }
        kotlin.jvm.internal.i.e(context, "context");
        final q2.b bVar = new q2.b(context, 1);
        final org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, context, null);
        x1Var.r(500L);
        ConnectionsManager.getInstance(i10).sendRequestTyped(new TL_account.initPasskeyRegistration(), new a3.b(1), new k20() {
            @Override
            public final void a(Object obj, Object obj2) {
                q2.b bVar2 = bVar;
                Context context2 = context;
                int i11 = i10;
                TL_account.passkeyRegistrationOptions passkeyregistrationoptions = (TL_account.passkeyRegistrationOptions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.x1.this.dismiss();
                k20 k20Var2 = k20Var;
                if (tL_error != null) {
                    k20Var2.a(null, tL_error.text);
                    return;
                }
                try {
                    try {
                        bVar2.a(context2, new v0.e(new JSONObject(passkeyregistrationoptions.options.data).getJSONObject("publicKey").toString()), new au(new ut(i11, context2, k20Var2)));
                    } catch (Exception e) {
                        f8.g(e, true);
                        i0.g3(new vt(k20Var2, e, 0));
                    }
                } catch (Exception e7) {
                    f8.g(e7, true);
                    k20Var2.a(null, e7.getMessage());
                }
            }
        });
    }
}
