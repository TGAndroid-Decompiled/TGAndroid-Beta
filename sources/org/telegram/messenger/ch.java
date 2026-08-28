package org.telegram.messenger;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ci1;
import org.telegram.ui.di1;
import org.telegram.ui.nl0;
public final class ch implements Utilities.Callback2 {
    public final int f20005a = 1;
    public final int f20006b;
    public final Object f20007c;
    public final Object d;
    public final Object f20008e;
    public final Object f20009f;

    public ch(kh.d dVar, org.telegram.ui.ActionBar.f3 f3Var, int i9, View view, b3.b bVar) {
        this.f20007c = dVar;
        this.d = f3Var;
        this.f20006b = i9;
        this.f20008e = view;
        this.f20009f = bVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20005a) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.c2) this.f20007c, (Utilities.Callback2) this.d, (g6.b) this.f20008e, (Context) this.f20009f, this.f20006b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                kh.d dVar = (kh.d) this.f20007c;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                View view = (View) this.f20008e;
                b3.b bVar = (b3.b) this.f20009f;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dVar.setLoading(false);
                if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
                    Uri parse = Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url);
                    String queryParameter = Uri.parse("?" + parse.getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.oc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        return;
                    }
                    int i9 = this.f20006b;
                    int currentDatacenterId = ConnectionsManager.getInstance(i9).getCurrentDatacenterId();
                    boolean isTestBackend = ConnectionsManager.getInstance(i9).isTestBackend();
                    StringBuilder o6 = e2.c.o("wear-auth: sending /token account=", i9, " dcId=", currentDatacenterId, " isTest=");
                    o6.append(isTestBackend);
                    FileLog.d(o6.toString());
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] c10 = di1.c(bVar, queryParameter, currentDatacenterId, isTestBackend);
                        com.google.android.gms.common.api.internal.t0 t0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f2753c).h;
                        i8.j0 j0Var = new i8.j0(t0Var, (String) bVar.f1415c, "/tg-wear-auth/token", c10);
                        t0Var.f2908b.d(0, j0Var);
                        x5.l.n(j0Var, i8.l0.f11003a).addOnSuccessListener(new nl0(29, bVar, dVar)).addOnFailureListener(new ci1(dVar, 1));
                        f3Var.dismiss();
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        new org.telegram.ui.Components.oc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0(e10.getMessage(), false);
                        return;
                    }
                } else if (tL_error != null) {
                    org.telegram.ui.Cells.j2.s(f3Var.topBulletinContainer, f3Var.getResourcesProvider(), tL_error, false);
                    return;
                } else {
                    new org.telegram.ui.Components.oc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                    return;
                }
        }
    }

    public ch(org.telegram.ui.ActionBar.c2 c2Var, Utilities.Callback2 callback2, g6.b bVar, Context context, int i9) {
        this.f20007c = c2Var;
        this.d = callback2;
        this.f20008e = bVar;
        this.f20009f = context;
        this.f20006b = i9;
    }
}
