package org.telegram.messenger;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.cj1;
import org.telegram.ui.dj1;
import org.telegram.ui.ds0;
public final class jh implements Utilities.Callback2 {
    public final int f16732a = 1;
    public final int f16733b;
    public final Object f16734c;
    public final Object d;
    public final Object e;
    public final Object f16735f;

    public jh(ci.d dVar, org.telegram.ui.ActionBar.e3 e3Var, int i10, View view, cf.c cVar) {
        this.f16734c = dVar;
        this.d = e3Var;
        this.f16733b = i10;
        this.e = view;
        this.f16735f = cVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16732a) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.a2) this.f16734c, (Utilities.Callback2) this.d, (q2.b) this.e, (Context) this.f16735f, this.f16733b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ci.d dVar = (ci.d) this.f16734c;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.d;
                View view = (View) this.e;
                cf.c cVar = (cf.c) this.f16735f;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dVar.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                    String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.yc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        return;
                    }
                    int i10 = this.f16733b;
                    int currentDatacenterId = ConnectionsManager.getInstance(i10).getCurrentDatacenterId();
                    boolean isTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
                    StringBuilder k10 = hg.c.k("wear-auth: sending /token account=", i10, " dcId=", currentDatacenterId, " isTest=");
                    k10.append(isTestBackend);
                    FileLog.d(k10.toString());
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] c10 = dj1.c(cVar, queryParameter, currentDatacenterId, isTestBackend);
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f6017c).h;
                        b8.e eVar = new b8.e(t0Var, (String) cVar.d, "/tg-wear-auth/token", c10);
                        t0Var.f6160b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.f46648a).addOnSuccessListener(new ds0(21, cVar, dVar)).addOnFailureListener(new cj1(dVar, 1));
                        e3Var.dismiss();
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        new org.telegram.ui.Components.yc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).c0(e.getMessage(), false);
                        return;
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.Cells.c1.r(e3Var.topBulletinContainer, e3Var.getResourcesProvider(), tL_error, false);
                    return;
                } else {
                    new org.telegram.ui.Components.yc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                    return;
                }
        }
    }

    public jh(org.telegram.ui.ActionBar.a2 a2Var, Utilities.Callback2 callback2, q2.b bVar, Context context, int i10) {
        this.f16734c = a2Var;
        this.d = callback2;
        this.e = bVar;
        this.f16735f = context;
        this.f16733b = i10;
    }
}
