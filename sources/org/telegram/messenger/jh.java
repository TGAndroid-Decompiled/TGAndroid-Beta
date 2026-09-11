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
import org.telegram.ui.qv0;
public final class jh implements Utilities.Callback2 {
    public final int f18103a = 1;
    public final int f18104b;
    public final Object f18105c;
    public final Object d;
    public final Object f18106e;
    public final Object f18107f;

    public jh(di.d dVar, org.telegram.ui.ActionBar.f3 f3Var, int i10, View view, cf.c cVar) {
        this.f18105c = dVar;
        this.d = f3Var;
        this.f18104b = i10;
        this.f18106e = view;
        this.f18107f = cVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18103a) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.b2) this.f18105c, (Utilities.Callback2) this.d, (androidx.biometric.s) this.f18106e, (Context) this.f18107f, this.f18104b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                di.d dVar = (di.d) this.f18105c;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                View view = (View) this.f18106e;
                cf.c cVar = (cf.c) this.f18107f;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dVar.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                    String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.yc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        return;
                    }
                    int i10 = this.f18104b;
                    int currentDatacenterId = ConnectionsManager.getInstance(i10).getCurrentDatacenterId();
                    boolean isTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
                    StringBuilder k10 = com.google.android.gms.internal.vision.e2.k("wear-auth: sending /token account=", i10, " dcId=", currentDatacenterId, " isTest=");
                    k10.append(isTestBackend);
                    FileLog.d(k10.toString());
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] c10 = lj1.c(cVar, queryParameter, currentDatacenterId, isTestBackend);
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.u0(applicationContext, com.google.android.gms.common.api.i.f4958c).h;
                        b8.e eVar = new b8.e(t0Var, (String) cVar.d, "/tg-wear-auth/token", c10);
                        t0Var.f5111b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.f49610a).addOnSuccessListener(new qv0(20, cVar, dVar)).addOnFailureListener(new kj1(dVar, 1));
                        f3Var.dismiss();
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        new org.telegram.ui.Components.yc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0(e7.getMessage(), false);
                        return;
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.Cells.p6.q(f3Var.topBulletinContainer, f3Var.getResourcesProvider(), tL_error, false);
                    return;
                } else {
                    new org.telegram.ui.Components.yc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                    return;
                }
        }
    }

    public jh(org.telegram.ui.ActionBar.b2 b2Var, Utilities.Callback2 callback2, androidx.biometric.s sVar, Context context, int i10) {
        this.f18105c = b2Var;
        this.d = callback2;
        this.f18106e = sVar;
        this.f18107f = context;
        this.f18104b = i10;
    }
}
