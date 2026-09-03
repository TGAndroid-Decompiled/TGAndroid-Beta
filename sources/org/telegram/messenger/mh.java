package org.telegram.messenger;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.vl0;
import org.telegram.ui.yi1;
import org.telegram.ui.zi1;
public final class mh implements Utilities.Callback2 {
    public final int f17832a = 0;
    public final int f17833b;
    public final Object f17834c;
    public final Object d;
    public final Object e;
    public final Object f17835f;

    public mh(org.telegram.ui.ActionBar.d2 d2Var, Utilities.Callback2 callback2, androidx.biometric.t tVar, Context context, int i10) {
        this.f17834c = d2Var;
        this.d = callback2;
        this.e = tVar;
        this.f17835f = context;
        this.f17833b = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17832a) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.d2) this.f17834c, (Utilities.Callback2) this.d, (androidx.biometric.t) this.e, (Context) this.f17835f, this.f17833b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ph.d dVar = (ph.d) this.f17834c;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.d;
                View view = (View) this.e;
                c5.j jVar = (c5.j) this.f17835f;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dVar.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                    String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.qc(g3Var.topBulletinContainer, g3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        return;
                    }
                    int i10 = this.f17833b;
                    int currentDatacenterId = ConnectionsManager.getInstance(i10).getCurrentDatacenterId();
                    boolean isTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
                    StringBuilder m9 = e2.c.m("wear-auth: sending /token account=", i10, " dcId=", currentDatacenterId, " isTest=");
                    m9.append(isTestBackend);
                    FileLog.d(m9.toString());
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] c3 = zi1.c(jVar, queryParameter, currentDatacenterId, isTestBackend);
                        com.google.android.gms.common.api.internal.t0 t0Var = new a8.e(applicationContext, com.google.android.gms.common.api.i.f2713c).h;
                        m8.i0 i0Var = new m8.i0(t0Var, (String) jVar.f2154c, "/tg-wear-auth/token", c3);
                        t0Var.f2860b.d(0, i0Var);
                        b6.m.n(i0Var, m8.k0.f13807a).addOnSuccessListener(new vl0(28, jVar, dVar)).addOnFailureListener(new yi1(dVar, 1));
                        g3Var.dismiss();
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        new org.telegram.ui.Components.qc(g3Var.topBulletinContainer, g3Var.getResourcesProvider()).c0(e.getMessage(), false);
                        return;
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.ai.u(g3Var.topBulletinContainer, g3Var.getResourcesProvider(), tL_error, false);
                    return;
                } else {
                    new org.telegram.ui.Components.qc(g3Var.topBulletinContainer, g3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                    return;
                }
        }
    }

    public mh(ph.d dVar, org.telegram.ui.ActionBar.g3 g3Var, int i10, View view, c5.j jVar) {
        this.f17834c = dVar;
        this.d = g3Var;
        this.f17833b = i10;
        this.e = view;
        this.f17835f = jVar;
    }
}
