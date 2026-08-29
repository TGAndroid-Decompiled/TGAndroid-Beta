package org.telegram.messenger;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.di1;
import org.telegram.ui.ei1;
import org.telegram.ui.kl0;
public final class jh implements Utilities.Callback2 {
    public final int f20692a = 1;
    public final int f20693b;
    public final Object f20694c;
    public final Object d;
    public final Object f20695e;
    public final Object f20696f;

    public jh(nh.d dVar, org.telegram.ui.ActionBar.f3 f3Var, int i10, View view, a5.j jVar) {
        this.f20694c = dVar;
        this.d = f3Var;
        this.f20693b = i10;
        this.f20695e = view;
        this.f20696f = jVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20692a) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.c2) this.f20694c, (Utilities.Callback2) this.d, (w5.h) this.f20695e, (Context) this.f20696f, this.f20693b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                nh.d dVar = (nh.d) this.f20694c;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                View view = (View) this.f20695e;
                a5.j jVar = (a5.j) this.f20696f;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dVar.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                    String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.tc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        return;
                    }
                    int i10 = this.f20693b;
                    int currentDatacenterId = ConnectionsManager.getInstance(i10).getCurrentDatacenterId();
                    boolean isTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
                    StringBuilder o10 = com.google.android.recaptcha.internal.a.o("wear-auth: sending /token account=", i10, " dcId=", currentDatacenterId, " isTest=");
                    o10.append(isTestBackend);
                    FileLog.d(o10.toString());
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] c3 = ei1.c(jVar, queryParameter, currentDatacenterId, isTestBackend);
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f3767c).h;
                        k8.j0 j0Var = new k8.j0(t0Var, (String) jVar.f213c, "/tg-wear-auth/token", c3);
                        t0Var.f3922b.d(0, j0Var);
                        z5.l.n(j0Var, k8.l0.f13526a).addOnSuccessListener(new kl0(29, jVar, dVar)).addOnFailureListener(new di1(dVar, 1));
                        f3Var.dismiss();
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        new org.telegram.ui.Components.tc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0(e10.getMessage(), false);
                        return;
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.th.t(f3Var.topBulletinContainer, f3Var.getResourcesProvider(), tL_error, false);
                    return;
                } else {
                    new org.telegram.ui.Components.tc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                    return;
                }
        }
    }

    public jh(org.telegram.ui.ActionBar.c2 c2Var, Utilities.Callback2 callback2, w5.h hVar, Context context, int i10) {
        this.f20694c = c2Var;
        this.d = callback2;
        this.f20695e = hVar;
        this.f20696f = context;
        this.f20693b = i10;
    }
}
