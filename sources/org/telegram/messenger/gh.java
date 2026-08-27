package org.telegram.messenger;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.bi1;
import org.telegram.ui.ci1;
import org.telegram.ui.nl0;

public final class gh implements Utilities.Callback2 {

    public final int f20397a = 1;

    public final int f20398b;

    public final Object f20399c;
    public final Object d;

    public final Object f20400e;

    public final Object f20401f;

    public gh(lh.d dVar, org.telegram.ui.ActionBar.e3 e3Var, int i10, View view, af.h hVar) {
        this.f20399c = dVar;
        this.d = e3Var;
        this.f20398b = i10;
        this.f20400e = view;
        this.f20401f = hVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20397a) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.b2) this.f20399c, (Utilities.Callback2) this.d, (v0.j) this.f20400e, (Context) this.f20401f, this.f20398b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                lh.d dVar = (lh.d) this.f20399c;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.d;
                View view = (View) this.f20400e;
                af.h hVar = (af.h) this.f20401f;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dVar.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.mc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                    } else {
                        int i10 = this.f20398b;
                        int currentDatacenterId = ConnectionsManager.getInstance(i10).getCurrentDatacenterId();
                        boolean zIsTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
                        StringBuilder sbP = com.google.android.recaptcha.internal.a.p("wear-auth: sending /token account=", i10, " dcId=", currentDatacenterId, " isTest=");
                        sbP.append(zIsTestBackend);
                        FileLog.d(sbP.toString());
                        Context applicationContext = view.getContext().getApplicationContext();
                        try {
                            byte[] bArrC = ci1.c(hVar, queryParameter, currentDatacenterId, zIsTestBackend);
                            com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f3198c);
                            String str = (String) hVar.f276c;
                            com.google.android.gms.common.api.internal.t0 t0Var = v0Var.h;
                            j8.i0 i0Var = new j8.i0(t0Var, str, "/tg-wear-auth/token", bArrC);
                            t0Var.f3353b.d(0, i0Var);
                            y5.l.n(i0Var, j8.k0.f12800a).addOnSuccessListener(new nl0(29, hVar, dVar)).addOnFailureListener(new bi1(dVar, 1));
                            e3Var.dismiss();
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            new org.telegram.ui.Components.mc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).c0(e9.getMessage(), false);
                            return;
                        }
                    }
                } else if (tL_error == null) {
                    new org.telegram.ui.Components.mc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                } else {
                    org.telegram.ui.Cells.pa.t(e3Var.topBulletinContainer, e3Var.getResourcesProvider(), tL_error, false);
                }
                break;
        }
    }

    public gh(org.telegram.ui.ActionBar.b2 b2Var, Utilities.Callback2 callback2, v0.j jVar, Context context, int i10) {
        this.f20399c = b2Var;
        this.d = callback2;
        this.f20400e = jVar;
        this.f20401f = context;
        this.f20398b = i10;
    }
}
