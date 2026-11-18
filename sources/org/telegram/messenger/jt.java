package org.telegram.messenger;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ud0;
public abstract class jt {
    public static void a(boolean[] zArr, ud0 ud0Var, boolean z10, androidx.emoji2.text.n nVar, Context context, int i7, Runnable[] runnableArr, TL_account.passkeyLoginOptions passkeyloginoptions, TLRPC.TL_error tL_error) {
        if (!zArr[0]) {
            if (tL_error != null) {
                ud0Var.a(0L, null, tL_error.text);
                return;
            }
            try {
                v0.p pVar = new v0.p(new JSONObject(passkeyloginoptions.options.data).getJSONObject("publicKey").toString());
                ArrayList arrayList = new ArrayList();
                arrayList.add(pVar);
                v0.m mVar = new v0.m(hd.f.l(arrayList), !z10);
                try {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    nVar.d(context, mVar, cancellationSignal, context.getMainExecutor(), new gt(ud0Var, context, i7));
                    runnableArr[0] = new a(cancellationSignal, 11);
                } catch (Exception e10) {
                    ud0Var.a(0L, null, e10.getMessage());
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                ud0Var.a(0L, null, e11.getMessage());
            }
        }
    }

    public static void b(final int i7, final Context context, final q10 q10Var) {
        if (!s2.f26729i) {
            return;
        }
        kotlin.jvm.internal.j.e(context, "context");
        final androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(context, 4);
        final org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
        u1Var.r(500L);
        ConnectionsManager.getInstance(i7).sendRequestTyped(new TL_account.initPasskeyRegistration(), new d3.b(1), new q10() {
            @Override
            public final void a(Object obj, Object obj2) {
                androidx.emoji2.text.n nVar2 = nVar;
                Context context2 = context;
                int i10 = i7;
                TL_account.passkeyRegistrationOptions passkeyregistrationoptions = (TL_account.passkeyRegistrationOptions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.u1.this.dismiss();
                q10 q10Var2 = q10Var;
                if (tL_error != null) {
                    q10Var2.a(null, tL_error.text);
                    return;
                }
                try {
                    try {
                        nVar2.c(context2, new v0.e(new JSONObject(passkeyregistrationoptions.options.data).getJSONObject("publicKey").toString()), new ht(new bt(i10, context2, q10Var2)));
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        g0.g3(new ct(q10Var2, e10, 0));
                    }
                } catch (Exception e11) {
                    a8.g(e11, true);
                    q10Var2.a(null, e11.getMessage());
                }
            }
        });
    }
}
