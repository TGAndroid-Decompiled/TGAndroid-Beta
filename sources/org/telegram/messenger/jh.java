package org.telegram.messenger;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.aj1;
import org.telegram.ui.bj1;
import org.telegram.ui.gs0;
public final class jh implements Utilities.Callback2 {
    public final int f16744a = 1;
    public final int f16745b;
    public final Object f16746c;
    public final Object d;
    public final Object e;
    public final Object f16747f;

    public jh(ci.d dVar, org.telegram.ui.ActionBar.g3 g3Var, int i10, View view, cf.c cVar) {
        this.f16746c = dVar;
        this.d = g3Var;
        this.f16745b = i10;
        this.e = view;
        this.f16747f = cVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16744a) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.c2) this.f16746c, (Utilities.Callback2) this.d, (q2.b) this.e, (Context) this.f16747f, this.f16745b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ci.d dVar = (ci.d) this.f16746c;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.d;
                View view = (View) this.e;
                cf.c cVar = (cf.c) this.f16747f;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dVar.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                    String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.xc(g3Var.topBulletinContainer, g3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        return;
                    }
                    int i10 = this.f16745b;
                    int currentDatacenterId = ConnectionsManager.getInstance(i10).getCurrentDatacenterId();
                    boolean isTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
                    StringBuilder l4 = hg.k0.l("wear-auth: sending /token account=", i10, " dcId=", currentDatacenterId, " isTest=");
                    l4.append(isTestBackend);
                    FileLog.d(l4.toString());
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] c10 = bj1.c(cVar, queryParameter, currentDatacenterId, isTestBackend);
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f6018c).h;
                        b8.e eVar = new b8.e(t0Var, (String) cVar.d, "/tg-wear-auth/token", c10);
                        t0Var.f6161b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.f46704a).addOnSuccessListener(new gs0(21, cVar, dVar)).addOnFailureListener(new aj1(dVar, 1));
                        g3Var.dismiss();
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        new org.telegram.ui.Components.xc(g3Var.topBulletinContainer, g3Var.getResourcesProvider()).c0(e.getMessage(), false);
                        return;
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.Cells.c1.s(g3Var.topBulletinContainer, g3Var.getResourcesProvider(), tL_error, false);
                    return;
                } else {
                    new org.telegram.ui.Components.xc(g3Var.topBulletinContainer, g3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                    return;
                }
        }
    }

    public jh(org.telegram.ui.ActionBar.c2 c2Var, Utilities.Callback2 callback2, q2.b bVar, Context context, int i10) {
        this.f16746c = c2Var;
        this.d = callback2;
        this.e = bVar;
        this.f16747f = context;
        this.f16745b = i10;
    }
}
