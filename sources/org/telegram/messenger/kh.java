package org.telegram.messenger;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.kj1;
import org.telegram.ui.lj1;
import org.telegram.ui.rv0;
public final class kh implements Utilities.Callback2 {
    public final int f16586a = 1;
    public final int f16587b;
    public final Object f16588c;
    public final Object d;
    public final Object e;
    public final Object f16589f;

    public kh(ci.d dVar, org.telegram.ui.ActionBar.f3 f3Var, int i10, View view, cf.c cVar) {
        this.f16588c = dVar;
        this.d = f3Var;
        this.f16587b = i10;
        this.e = view;
        this.f16589f = cVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16586a) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.b2) this.f16588c, (Utilities.Callback2) this.d, (l5.j) this.e, (Context) this.f16589f, this.f16587b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                ci.d dVar = (ci.d) this.f16588c;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                View view = (View) this.e;
                cf.c cVar = (cf.c) this.f16589f;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dVar.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                    String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.vc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        return;
                    }
                    int i10 = this.f16587b;
                    int currentDatacenterId = ConnectionsManager.getInstance(i10).getCurrentDatacenterId();
                    boolean isTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
                    StringBuilder m10 = hg.c.m("wear-auth: sending /token account=", i10, " dcId=", currentDatacenterId, " isTest=");
                    m10.append(isTestBackend);
                    FileLog.d(m10.toString());
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] c10 = lj1.c(cVar, queryParameter, currentDatacenterId, isTestBackend);
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f6031c).h;
                        b8.e eVar = new b8.e(t0Var, (String) cVar.d, "/tg-wear-auth/token", c10);
                        t0Var.f6174b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.f46376a).addOnSuccessListener(new rv0(19, cVar, dVar)).addOnFailureListener(new kj1(dVar, 1));
                        f3Var.dismiss();
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        new org.telegram.ui.Components.vc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0(e.getMessage(), false);
                        return;
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.Cells.q3.r(f3Var.topBulletinContainer, f3Var.getResourcesProvider(), tL_error, false);
                    return;
                } else {
                    new org.telegram.ui.Components.vc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                    return;
                }
        }
    }

    public kh(org.telegram.ui.ActionBar.b2 b2Var, Utilities.Callback2 callback2, l5.j jVar, Context context, int i10) {
        this.f16588c = b2Var;
        this.d = callback2;
        this.e = jVar;
        this.f16589f = context;
        this.f16587b = i10;
    }
}
