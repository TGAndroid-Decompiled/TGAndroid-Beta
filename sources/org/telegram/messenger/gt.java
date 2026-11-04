package org.telegram.messenger;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.qd0;
public abstract class gt {
    public static void a(boolean[] zArr, qd0 qd0Var, boolean z10, androidx.biometric.t tVar, Context context, int i3, Runnable[] runnableArr, TL_account.passkeyLoginOptions passkeyloginoptions, TLRPC.TL_error tL_error) {
        if (!zArr[0]) {
            if (tL_error != null) {
                qd0Var.a(0L, null, tL_error.text);
                return;
            }
            try {
                v0.o oVar = new v0.o(new JSONObject(passkeyloginoptions.options.data).getJSONObject("publicKey").toString());
                ArrayList arrayList = new ArrayList();
                arrayList.add(oVar);
                v0.m mVar = new v0.m(ed.g.l(arrayList), !z10);
                try {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    Executor executor = context.getMainExecutor();
                    et etVar = new et(qd0Var, context, i3);
                    kotlin.jvm.internal.j.e(executor, "executor");
                    v0.i c2 = androidx.emoji2.text.n.c(new androidx.emoji2.text.n(context, 4), mVar);
                    if (c2 == null) {
                        etVar.a(new w0.h(1, "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                    } else {
                        c2.onGetCredential(context, mVar, cancellationSignal, executor, etVar);
                    }
                    runnableArr[0] = new vs(cancellationSignal, 1);
                } catch (Exception e10) {
                    qd0Var.a(0L, null, e10.getMessage());
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                qd0Var.a(0L, null, e11.getMessage());
            }
        }
    }

    public static void b(final int i3, final Context context, final n10 n10Var) {
        if (!r2.f25046i) {
            return;
        }
        kotlin.jvm.internal.j.e(context, "context");
        final androidx.biometric.t tVar = new androidx.biometric.t(context, 2);
        final org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, context, null);
        s1Var.r(500L);
        ConnectionsManager.getInstance(i3).sendRequestTyped(new TL_account.initPasskeyRegistration(), new c3.b(1), new n10() {
            @Override
            public final void a(Object obj, Object obj2) {
                androidx.biometric.t tVar2 = tVar;
                Context context2 = context;
                int i10 = i3;
                TL_account.passkeyRegistrationOptions passkeyregistrationoptions = (TL_account.passkeyRegistrationOptions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.s1.this.dismiss();
                n10 n10Var2 = n10Var;
                if (tL_error != null) {
                    n10Var2.a(null, tL_error.text);
                    return;
                }
                try {
                    try {
                        tVar2.b(context2, new v0.e(new JSONObject(passkeyregistrationoptions.options.data).getJSONObject("publicKey").toString()), new ft(new zs(i10, context2, n10Var2)));
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        g0.h3(new at(n10Var2, e10, 0));
                    }
                } catch (Exception e11) {
                    a8.g(e11, true);
                    n10Var2.a(null, e11.getMessage());
                }
            }
        });
    }
}
