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
public final class kh implements Utilities.Callback2 {
    public final int f18175a = 1;
    public final int f18176b;
    public final Object f18177c;
    public final Object d;
    public final Object f18178e;
    public final Object f18179f;

    public kh(di.d dVar, org.telegram.ui.ActionBar.f3 f3Var, int i10, View view, cf.c cVar) {
        this.f18177c = dVar;
        this.d = f3Var;
        this.f18176b = i10;
        this.f18178e = view;
        this.f18179f = cVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18175a) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.b2) this.f18177c, (Utilities.Callback2) this.d, (androidx.biometric.s) this.f18178e, (Context) this.f18179f, this.f18176b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                di.d dVar = (di.d) this.f18177c;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                View view = (View) this.f18178e;
                cf.c cVar = (cf.c) this.f18179f;
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
                    int i10 = this.f18176b;
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

    public kh(org.telegram.ui.ActionBar.b2 b2Var, Utilities.Callback2 callback2, androidx.biometric.s sVar, Context context, int i10) {
        this.f18177c = b2Var;
        this.d = callback2;
        this.f18178e = sVar;
        this.f18179f = context;
        this.f18176b = i10;
    }
}
