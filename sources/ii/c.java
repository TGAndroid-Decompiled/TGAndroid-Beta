package ii;

import android.content.Context;
import di.m3;
import di.v6;
import fi.h0;
import ki.y0;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.lc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.iy0;
public final class c implements RequestDelegate {
    public final int f16288a = 2;
    public final long f16289b;
    public final Object f16290c;
    public final int d;
    public final Object f16291e;
    public final Object f16292f;
    public final Object f16293g;
    public final Object h;
    public final Object f16294i;

    public c(Context context, h0 h0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, lc lcVar, org.telegram.messenger.video.d dVar, int i7) {
        this.f16291e = context;
        this.f16292f = h0Var;
        this.f16289b = j3;
        this.f16290c = bArr;
        this.f16293g = aVar;
        this.h = lcVar;
        this.f16294i = dVar;
        this.d = i7;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f16288a) {
            case 0:
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.f16291e;
                final TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f16292f;
                final g2 g2Var = (g2) this.f16290c;
                final q10 q10Var = (q10) this.f16293g;
                final Runnable runnable = (Runnable) this.h;
                final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f16294i;
                final long j3 = this.f16289b;
                final int i7 = this.d;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        TLRPC.TL_error tL_error2 = TLRPC.TL_error.this;
                        ConnectionsManager connectionsManager2 = connectionsManager;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        g2 g2Var2 = g2Var;
                        long j10 = j3;
                        q10 q10Var2 = q10Var;
                        Runnable runnable2 = runnable;
                        int i10 = i7;
                        if (tL_error2 != null) {
                            if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                                connectionsManager2.sendRequest(new TL_account.getPassword(), new e(twoStepVerificationActivity2, g2Var2, j10, q10Var2, runnable2, i10), 8);
                                return;
                            }
                            n.f16347a[i10] = false;
                            twoStepVerificationActivity2.t0();
                            if (n.h(tL_error2, twoStepVerificationActivity2)) {
                                return;
                            }
                            if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, twoStepVerificationActivity2.getParentActivity(), twoStepVerificationActivity2.getResourceProvider());
                                String N0 = gd.N0(2131751285, null);
                                t1 t1Var = alertDialog$Builder.f28774a;
                                t1Var.S = N0;
                                t1Var.U = gd.N0(2131749327, null);
                                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                                alertDialog$Builder.k(gd.N0(2131751279, null), new v6(twoStepVerificationActivity2, 24));
                                twoStepVerificationActivity2.showDialog(t1Var);
                                return;
                            }
                            if (!"PASSWORD_HASH_INVALID".equals(tL_error2.text)) {
                                twoStepVerificationActivity2.finishFragment();
                            }
                            lc.e0(tL_error2);
                            return;
                        }
                        TLRPC.TL_payments_withdrawStarsRevenueToWallet tL_payments_withdrawStarsRevenueToWallet = new TLRPC.TL_payments_withdrawStarsRevenueToWallet();
                        tL_payments_withdrawStarsRevenueToWallet.ton = true;
                        tL_payments_withdrawStarsRevenueToWallet.peer = mp.u1(i10).l1(j10.i(i10).e());
                        tL_payments_withdrawStarsRevenueToWallet.tmp_password = ((TL_account.tmpPassword) tLObject).tmp_password;
                        connectionsManager2.sendRequest(tL_payments_withdrawStarsRevenueToWallet, new f(i10, q10Var2, inputCheckPasswordSRP, twoStepVerificationActivity2, runnable2, g2Var2, j10));
                    }
                });
                return;
            case 1:
                g0.g3(new y0((t1) this.f16291e, tLObject, (org.telegram.messenger.c) this.f16292f, (g70) this.f16293g, this.f16289b, (Context) this.h, (g2) this.f16290c, this.d, (TLRPC.Peer) this.f16294i));
                return;
            default:
                Context context = (Context) this.f16291e;
                h0 h0Var = (h0) this.f16292f;
                byte[] bArr = (byte[]) this.f16290c;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f16293g;
                lc lcVar = (lc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f16294i;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        g0.g3(new m3(tLObject, context, h0Var, this.f16289b, bArr, aVar, lcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        g0.h3(new iy0(aVar, lcVar, context, h0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        g0.h3(new j01(aVar, lcVar, this.d, 15), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    g0.h3(new iy0(aVar, lcVar, context, h0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public c(ConnectionsManager connectionsManager, TwoStepVerificationActivity twoStepVerificationActivity, g2 g2Var, long j3, q10 q10Var, Runnable runnable, int i7, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP) {
        this.f16291e = connectionsManager;
        this.f16292f = twoStepVerificationActivity;
        this.f16290c = g2Var;
        this.f16289b = j3;
        this.f16293g = q10Var;
        this.h = runnable;
        this.d = i7;
        this.f16294i = inputCheckPasswordSRP;
    }

    public c(t1 t1Var, org.telegram.messenger.c cVar, g70 g70Var, long j3, Context context, g2 g2Var, int i7, TLRPC.Peer peer) {
        this.f16291e = t1Var;
        this.f16292f = cVar;
        this.f16293g = g70Var;
        this.f16289b = j3;
        this.h = context;
        this.f16290c = g2Var;
        this.d = i7;
        this.f16294i = peer;
    }
}
