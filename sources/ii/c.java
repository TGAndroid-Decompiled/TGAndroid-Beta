package ii;

import android.content.Context;
import di.m3;
import di.v6;
import fi.h0;
import ki.y0;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.lc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.iy0;
public final class c implements RequestDelegate {
    public final int f16291a = 2;
    public final long f16292b;
    public final Object f16293c;
    public final int d;
    public final Object f16294e;
    public final Object f16295f;
    public final Object f16296g;
    public final Object h;
    public final Object f16297i;

    public c(Context context, h0 h0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, lc lcVar, org.telegram.messenger.video.d dVar, int i7) {
        this.f16294e = context;
        this.f16295f = h0Var;
        this.f16292b = j3;
        this.f16293c = bArr;
        this.f16296g = aVar;
        this.h = lcVar;
        this.f16297i = dVar;
        this.d = i7;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f16291a) {
            case 0:
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.f16294e;
                final TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f16295f;
                final g2 g2Var = (g2) this.f16293c;
                final r10 r10Var = (r10) this.f16296g;
                final Runnable runnable = (Runnable) this.h;
                final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f16297i;
                final long j3 = this.f16292b;
                final int i7 = this.d;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        TLRPC.TL_error tL_error2 = TLRPC.TL_error.this;
                        ConnectionsManager connectionsManager2 = connectionsManager;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        g2 g2Var2 = g2Var;
                        long j10 = j3;
                        r10 r10Var2 = r10Var;
                        Runnable runnable2 = runnable;
                        int i10 = i7;
                        if (tL_error2 != null) {
                            if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                                connectionsManager2.sendRequest(new TL_account.getPassword(), new e(twoStepVerificationActivity2, g2Var2, j10, r10Var2, runnable2, i10), 8);
                                return;
                            }
                            n.f16350a[i10] = false;
                            twoStepVerificationActivity2.t0();
                            if (n.h(tL_error2, twoStepVerificationActivity2)) {
                                return;
                            }
                            if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, twoStepVerificationActivity2.getParentActivity(), twoStepVerificationActivity2.getResourceProvider());
                                String N0 = hd.N0(2131751285, null);
                                t1 t1Var = alertDialog$Builder.f28777a;
                                t1Var.S = N0;
                                t1Var.U = hd.N0(2131749327, null);
                                alertDialog$Builder.h(hd.N0(2131752577, null), null);
                                alertDialog$Builder.k(hd.N0(2131751279, null), new v6(twoStepVerificationActivity2, 24));
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
                        tL_payments_withdrawStarsRevenueToWallet.peer = np.u1(i10).l1(k10.i(i10).e());
                        tL_payments_withdrawStarsRevenueToWallet.tmp_password = ((TL_account.tmpPassword) tLObject).tmp_password;
                        connectionsManager2.sendRequest(tL_payments_withdrawStarsRevenueToWallet, new f(i10, r10Var2, inputCheckPasswordSRP, twoStepVerificationActivity2, runnable2, g2Var2, j10));
                    }
                });
                return;
            case 1:
                g0.g3(new y0((t1) this.f16294e, tLObject, (org.telegram.messenger.c) this.f16295f, (g70) this.f16296g, this.f16292b, (Context) this.h, (g2) this.f16293c, this.d, (TLRPC.Peer) this.f16297i));
                return;
            default:
                Context context = (Context) this.f16294e;
                h0 h0Var = (h0) this.f16295f;
                byte[] bArr = (byte[]) this.f16293c;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f16296g;
                lc lcVar = (lc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f16297i;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        g0.g3(new m3(tLObject, context, h0Var, this.f16292b, bArr, aVar, lcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        g0.h3(new iy0(aVar, lcVar, context, h0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        g0.h3(new f21(aVar, lcVar, this.d, 14), 200L);
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

    public c(ConnectionsManager connectionsManager, TwoStepVerificationActivity twoStepVerificationActivity, g2 g2Var, long j3, r10 r10Var, Runnable runnable, int i7, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP) {
        this.f16294e = connectionsManager;
        this.f16295f = twoStepVerificationActivity;
        this.f16293c = g2Var;
        this.f16292b = j3;
        this.f16296g = r10Var;
        this.h = runnable;
        this.d = i7;
        this.f16297i = inputCheckPasswordSRP;
    }

    public c(t1 t1Var, org.telegram.messenger.c cVar, g70 g70Var, long j3, Context context, g2 g2Var, int i7, TLRPC.Peer peer) {
        this.f16294e = t1Var;
        this.f16295f = cVar;
        this.f16296g = g70Var;
        this.f16292b = j3;
        this.h = context;
        this.f16293c = g2Var;
        this.d = i7;
        this.f16297i = peer;
    }
}
