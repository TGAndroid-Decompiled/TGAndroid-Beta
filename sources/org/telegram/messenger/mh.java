package org.telegram.messenger;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ti1;
import org.telegram.ui.ui1;
import org.telegram.ui.vl0;
public final class mh implements Utilities.Callback2 {
    public final int f19374a = 0;
    public final int f19375b;
    public final Object f19376c;
    public final Object d;
    public final Object f19377e;
    public final Object f19378f;

    public mh(org.telegram.ui.ActionBar.d2 d2Var, Utilities.Callback2 callback2, k6.b bVar, Context context, int i10) {
        this.f19376c = d2Var;
        this.d = callback2;
        this.f19377e = bVar;
        this.f19378f = context;
        this.f19375b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19374a) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.d2) this.f19376c, (Utilities.Callback2) this.d, (k6.b) this.f19377e, (Context) this.f19378f, this.f19375b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                qh.d dVar = (qh.d) this.f19376c;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.d;
                View view = (View) this.f19377e;
                c5.j jVar = (c5.j) this.f19378f;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dVar.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                    String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.qc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        return;
                    }
                    int i10 = this.f19375b;
                    int currentDatacenterId = ConnectionsManager.getInstance(i10).getCurrentDatacenterId();
                    boolean isTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
                    StringBuilder m9 = e2.c.m("wear-auth: sending /token account=", i10, " dcId=", currentDatacenterId, " isTest=");
                    m9.append(isTestBackend);
                    FileLog.d(m9.toString());
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] c3 = ui1.c(jVar, queryParameter, currentDatacenterId, isTestBackend);
                        com.google.android.gms.common.api.internal.t0 t0Var = new a8.e(applicationContext, com.google.android.gms.common.api.i.f2658c).h;
                        m8.i0 i0Var = new m8.i0(t0Var, (String) jVar.f2317c, "/tg-wear-auth/token", c3);
                        t0Var.f2816b.d(0, i0Var);
                        b6.m.n(i0Var, m8.k0.f13539a).addOnSuccessListener(new vl0(28, jVar, dVar)).addOnFailureListener(new ti1(dVar, 1));
                        h3Var.dismiss();
                        return;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        new org.telegram.ui.Components.qc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).c0(e6.getMessage(), false);
                        return;
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.yh.u(h3Var.topBulletinContainer, h3Var.getResourcesProvider(), tL_error, false);
                    return;
                } else {
                    new org.telegram.ui.Components.qc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                    return;
                }
        }
    }

    public mh(qh.d dVar, org.telegram.ui.ActionBar.h3 h3Var, int i10, View view, c5.j jVar) {
        this.f19376c = dVar;
        this.d = h3Var;
        this.f19375b = i10;
        this.f19377e = view;
        this.f19378f = jVar;
    }
}
