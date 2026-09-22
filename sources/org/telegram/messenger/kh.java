package org.telegram.messenger;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.jj1;
import org.telegram.ui.kj1;
import org.telegram.ui.rv0;
public final class kh implements Utilities.Callback2 {
    public final int f16834a = 1;
    public final int f16835b;
    public final Object f16836c;
    public final Object d;
    public final Object e;
    public final Object f16837f;

    public kh(ci.d dVar, org.telegram.ui.ActionBar.f3 f3Var, int i10, View view, cf.c cVar) {
        this.f16836c = dVar;
        this.d = f3Var;
        this.f16835b = i10;
        this.e = view;
        this.f16837f = cVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16834a) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.b2) this.f16836c, (Utilities.Callback2) this.d, (l5.j) this.e, (Context) this.f16837f, this.f16835b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ci.d dVar = (ci.d) this.f16836c;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                View view = (View) this.e;
                cf.c cVar = (cf.c) this.f16837f;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dVar.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                    String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.xc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        return;
                    }
                    int i10 = this.f16835b;
                    int currentDatacenterId = ConnectionsManager.getInstance(i10).getCurrentDatacenterId();
                    boolean isTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
                    StringBuilder l4 = hg.k0.l("wear-auth: sending /token account=", i10, " dcId=", currentDatacenterId, " isTest=");
                    l4.append(isTestBackend);
                    FileLog.d(l4.toString());
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] c10 = kj1.c(cVar, queryParameter, currentDatacenterId, isTestBackend);
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f6033c).h;
                        b8.e eVar = new b8.e(t0Var, (String) cVar.d, "/tg-wear-auth/token", c10);
                        t0Var.f6176b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.f46703a).addOnSuccessListener(new rv0(20, cVar, dVar)).addOnFailureListener(new jj1(dVar, 1));
                        f3Var.dismiss();
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        new org.telegram.ui.Components.xc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0(e.getMessage(), false);
                        return;
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.Cells.c1.s(f3Var.topBulletinContainer, f3Var.getResourcesProvider(), tL_error, false);
                    return;
                } else {
                    new org.telegram.ui.Components.xc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                    return;
                }
        }
    }

    public kh(org.telegram.ui.ActionBar.b2 b2Var, Utilities.Callback2 callback2, l5.j jVar, Context context, int i10) {
        this.f16836c = b2Var;
        this.d = callback2;
        this.e = jVar;
        this.f16837f = context;
        this.f16835b = i10;
    }
}
