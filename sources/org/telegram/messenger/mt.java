package org.telegram.messenger;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.td0;
public abstract class mt {
    public static void a(boolean[] zArr, td0 td0Var, boolean z10, androidx.emoji2.text.n nVar, Context context, int i7, Runnable[] runnableArr, TL_account.passkeyLoginOptions passkeyloginoptions, TLRPC.TL_error tL_error) {
        if (!zArr[0]) {
            if (tL_error != null) {
                td0Var.a(0L, null, tL_error.text);
                return;
            }
            try {
                v0.p pVar = new v0.p(new JSONObject(passkeyloginoptions.options.data).getJSONObject("publicKey").toString());
                ArrayList arrayList = new ArrayList();
                arrayList.add(pVar);
                v0.m mVar = new v0.m(hd.f.l(arrayList), !z10);
                try {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    nVar.c(context, mVar, cancellationSignal, context.getMainExecutor(), new kt(td0Var, context, i7));
                    runnableArr[0] = new a(cancellationSignal, 11);
                } catch (Exception e10) {
                    td0Var.a(0L, null, e10.getMessage());
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                td0Var.a(0L, null, e11.getMessage());
            }
        }
    }

    public static void b(final int i7, final Context context, final s10 s10Var) {
        if (!r2.f26212i) {
            return;
        }
        kotlin.jvm.internal.j.e(context, "context");
        final androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(context, 3);
        final org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
        t1Var.r(500L);
        ConnectionsManager.getInstance(i7).sendRequestTyped(new TL_account.initPasskeyRegistration(), new d3.b(1), new s10() {
            @Override
            public final void a(Object obj, Object obj2) {
                androidx.emoji2.text.n nVar2 = nVar;
                Context context2 = context;
                int i10 = i7;
                TL_account.passkeyRegistrationOptions passkeyregistrationoptions = (TL_account.passkeyRegistrationOptions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.t1.this.dismiss();
                s10 s10Var2 = s10Var;
                if (tL_error != null) {
                    s10Var2.a(null, tL_error.text);
                    return;
                }
                try {
                    try {
                        nVar2.b(context2, new v0.e(new JSONObject(passkeyregistrationoptions.options.data).getJSONObject("publicKey").toString()), new lt(new et(i10, context2, s10Var2)));
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        g0.h3(new ft(s10Var2, e10, 0));
                    }
                } catch (Exception e11) {
                    a8.g(e11, true);
                    s10Var2.a(null, e11.getMessage());
                }
            }
        });
    }
}
