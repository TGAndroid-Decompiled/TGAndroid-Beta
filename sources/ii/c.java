package ii;

import android.content.Context;
import di.m3;
import di.v6;
import fi.h0;
import ki.y0;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.kc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.gy0;
public final class c implements RequestDelegate {
    public final int f16354a = 2;
    public final long f16355b;
    public final Object f16356c;
    public final int d;
    public final Object f16357e;
    public final Object f16358f;
    public final Object f16359g;
    public final Object h;
    public final Object f16360i;

    public c(Context context, h0 h0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, kc kcVar, org.telegram.messenger.video.d dVar, int i7) {
        this.f16357e = context;
        this.f16358f = h0Var;
        this.f16355b = j3;
        this.f16356c = bArr;
        this.f16359g = aVar;
        this.h = kcVar;
        this.f16360i = dVar;
        this.d = i7;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f16354a) {
            case 0:
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.f16357e;
                final TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f16358f;
                final g2 g2Var = (g2) this.f16356c;
                final p10 p10Var = (p10) this.f16359g;
                final Runnable runnable = (Runnable) this.h;
                final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f16360i;
                final long j3 = this.f16355b;
                final int i7 = this.d;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        TLRPC.TL_error tL_error2 = TLRPC.TL_error.this;
                        ConnectionsManager connectionsManager2 = connectionsManager;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        g2 g2Var2 = g2Var;
                        long j10 = j3;
                        p10 p10Var2 = p10Var;
                        Runnable runnable2 = runnable;
                        int i10 = i7;
                        if (tL_error2 != null) {
                            if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                                connectionsManager2.sendRequest(new TL_account.getPassword(), new e(twoStepVerificationActivity2, g2Var2, j10, p10Var2, runnable2, i10), 8);
                                return;
                            }
                            n.f16413a[i10] = false;
                            twoStepVerificationActivity2.t0();
                            if (n.h(tL_error2, twoStepVerificationActivity2)) {
                                return;
                            }
                            if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, twoStepVerificationActivity2.getParentActivity(), twoStepVerificationActivity2.getResourceProvider());
                                String N0 = gd.N0(2131751285, null);
                                t1 t1Var = alertDialog$Builder.f28835a;
                                t1Var.S = N0;
                                t1Var.U = gd.N0(2131749327, null);
                                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                                alertDialog$Builder.k(gd.N0(2131751279, null), new v6(twoStepVerificationActivity2, 26));
                                twoStepVerificationActivity2.showDialog(t1Var);
                                return;
                            }
                            if (!"PASSWORD_HASH_INVALID".equals(tL_error2.text)) {
                                twoStepVerificationActivity2.finishFragment();
                            }
                            kc.e0(tL_error2);
                            return;
                        }
                        TLRPC.TL_payments_withdrawStarsRevenueToWallet tL_payments_withdrawStarsRevenueToWallet = new TLRPC.TL_payments_withdrawStarsRevenueToWallet();
                        tL_payments_withdrawStarsRevenueToWallet.ton = true;
                        tL_payments_withdrawStarsRevenueToWallet.peer = mp.u1(i10).l1(i10.i(i10).e());
                        tL_payments_withdrawStarsRevenueToWallet.tmp_password = ((TL_account.tmpPassword) tLObject).tmp_password;
                        connectionsManager2.sendRequest(tL_payments_withdrawStarsRevenueToWallet, new f(i10, p10Var2, inputCheckPasswordSRP, twoStepVerificationActivity2, runnable2, g2Var2, j10));
                    }
                });
                return;
            case 1:
                g0.g3(new y0((t1) this.f16357e, tLObject, (org.telegram.messenger.c) this.f16358f, (d70) this.f16359g, this.f16355b, (Context) this.h, (g2) this.f16356c, this.d, (TLRPC.Peer) this.f16360i));
                return;
            default:
                Context context = (Context) this.f16357e;
                h0 h0Var = (h0) this.f16358f;
                byte[] bArr = (byte[]) this.f16356c;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f16359g;
                kc kcVar = (kc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f16360i;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        g0.g3(new m3(tLObject, context, h0Var, this.f16355b, bArr, aVar, kcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        g0.h3(new gy0(aVar, kcVar, context, h0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        g0.h3(new e21(aVar, kcVar, this.d, 14), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    g0.h3(new gy0(aVar, kcVar, context, h0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public c(ConnectionsManager connectionsManager, TwoStepVerificationActivity twoStepVerificationActivity, g2 g2Var, long j3, p10 p10Var, Runnable runnable, int i7, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP) {
        this.f16357e = connectionsManager;
        this.f16358f = twoStepVerificationActivity;
        this.f16356c = g2Var;
        this.f16355b = j3;
        this.f16359g = p10Var;
        this.h = runnable;
        this.d = i7;
        this.f16360i = inputCheckPasswordSRP;
    }

    public c(t1 t1Var, org.telegram.messenger.c cVar, d70 d70Var, long j3, Context context, g2 g2Var, int i7, TLRPC.Peer peer) {
        this.f16357e = t1Var;
        this.f16358f = cVar;
        this.f16359g = d70Var;
        this.f16355b = j3;
        this.h = context;
        this.f16356c = g2Var;
        this.d = i7;
        this.f16360i = peer;
    }
}
