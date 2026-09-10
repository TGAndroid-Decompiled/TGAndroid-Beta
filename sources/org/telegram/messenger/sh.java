package org.telegram.messenger;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.fz0;
import org.telegram.ui.oj1;
import org.telegram.ui.pj1;
public final class sh implements Utilities.Callback2 {
    public final int f16322a = 1;
    public final int f16323b;
    public final Object f16324c;
    public final Object d;
    public final Object e;
    public final Object f16325f;

    public sh(bi.d dVar, org.telegram.ui.ActionBar.h3 h3Var, int i10, View view, bi.u6 u6Var) {
        this.f16324c = dVar;
        this.d = h3Var;
        this.f16323b = i10;
        this.e = view;
        this.f16325f = u6Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16322a) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.d2) this.f16324c, (Utilities.Callback2) this.d, (androidx.biometric.s) this.e, (Context) this.f16325f, this.f16323b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                bi.d dVar = (bi.d) this.f16324c;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.d;
                View view = (View) this.e;
                bi.u6 u6Var = (bi.u6) this.f16325f;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dVar.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                    String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.wc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        return;
                    }
                    int i10 = this.f16323b;
                    int currentDatacenterId = ConnectionsManager.getInstance(i10).getCurrentDatacenterId();
                    boolean isTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
                    StringBuilder n10 = hc.b.n("wear-auth: sending /token account=", i10, " dcId=", currentDatacenterId, " isTest=");
                    n10.append(isTestBackend);
                    FileLog.d(n10.toString());
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] c10 = pj1.c(u6Var, queryParameter, currentDatacenterId, isTestBackend);
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f4808c).h;
                        b8.e eVar = new b8.e(t0Var, (String) u6Var.f3721c, "/tg-wear-auth/token", c10);
                        t0Var.f4951b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.f46530a).addOnSuccessListener(new fz0(15, u6Var, dVar)).addOnFailureListener(new oj1(dVar, 1));
                        h3Var.dismiss();
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        new org.telegram.ui.Components.wc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).c0(e.getMessage(), false);
                        return;
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.Cells.r6.q(h3Var.topBulletinContainer, h3Var.getResourcesProvider(), tL_error, false);
                    return;
                } else {
                    new org.telegram.ui.Components.wc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                    return;
                }
        }
    }

    public sh(org.telegram.ui.ActionBar.d2 d2Var, Utilities.Callback2 callback2, androidx.biometric.s sVar, Context context, int i10) {
        this.f16324c = d2Var;
        this.d = callback2;
        this.e = sVar;
        this.f16325f = context;
        this.f16323b = i10;
    }
}
