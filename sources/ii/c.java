package ii;

import android.content.Context;
import di.c7;
import di.m3;
import fi.h0;
import ki.z0;
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
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.lc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.iy0;
public final class c implements RequestDelegate {
    public final int f16263a = 2;
    public final long f16264b;
    public final Object f16265c;
    public final int d;
    public final Object f16266e;
    public final Object f16267f;
    public final Object f16268g;
    public final Object h;
    public final Object f16269i;

    public c(Context context, h0 h0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, lc lcVar, org.telegram.messenger.video.d dVar, int i7) {
        this.f16266e = context;
        this.f16267f = h0Var;
        this.f16264b = j3;
        this.f16265c = bArr;
        this.f16268g = aVar;
        this.h = lcVar;
        this.f16269i = dVar;
        this.d = i7;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f16263a) {
            case 0:
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.f16266e;
                final TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f16267f;
                final h2 h2Var = (h2) this.f16265c;
                final q10 q10Var = (q10) this.f16268g;
                final Runnable runnable = (Runnable) this.h;
                final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) this.f16269i;
                final long j3 = this.f16264b;
                final int i7 = this.d;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        TLRPC.TL_error tL_error2 = TLRPC.TL_error.this;
                        ConnectionsManager connectionsManager2 = connectionsManager;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        h2 h2Var2 = h2Var;
                        long j10 = j3;
                        q10 q10Var2 = q10Var;
                        Runnable runnable2 = runnable;
                        int i10 = i7;
                        if (tL_error2 != null) {
                            if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                                connectionsManager2.sendRequest(new TL_account.getPassword(), new e(twoStepVerificationActivity2, h2Var2, j10, q10Var2, runnable2, i10), 8);
                                return;
                            }
                            n.f16322a[i10] = false;
                            twoStepVerificationActivity2.t0();
                            if (n.h(tL_error2, twoStepVerificationActivity2)) {
                                return;
                            }
                            if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, twoStepVerificationActivity2.getParentActivity(), twoStepVerificationActivity2.getResourceProvider());
                                String M0 = gd.M0(2131751286, null);
                                u1 u1Var = alertDialog$Builder.f28744a;
                                u1Var.S = M0;
                                u1Var.U = gd.M0(2131749328, null);
                                alertDialog$Builder.h(gd.M0(2131752578, null), null);
                                alertDialog$Builder.k(gd.M0(2131751280, null), new c7(twoStepVerificationActivity2, 23));
                                twoStepVerificationActivity2.showDialog(u1Var);
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
                        connectionsManager2.sendRequest(tL_payments_withdrawStarsRevenueToWallet, new f(i10, q10Var2, inputCheckPasswordSRP, twoStepVerificationActivity2, runnable2, h2Var2, j10));
                    }
                });
                return;
            case 1:
                g0.g3(new z0((u1) this.f16266e, tLObject, (org.telegram.messenger.c) this.f16267f, (e70) this.f16268g, this.f16264b, (Context) this.h, (h2) this.f16265c, this.d, (TLRPC.Peer) this.f16269i));
                return;
            default:
                Context context = (Context) this.f16266e;
                h0 h0Var = (h0) this.f16267f;
                byte[] bArr = (byte[]) this.f16265c;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.f16268g;
                lc lcVar = (lc) this.h;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.f16269i;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        g0.g3(new m3(tLObject, context, h0Var, this.f16264b, bArr, aVar, lcVar, dVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        g0.h3(new iy0(aVar, lcVar, context, h0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        g0.h3(new h01(aVar, lcVar, this.d, 15), 200L);
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

    public c(ConnectionsManager connectionsManager, TwoStepVerificationActivity twoStepVerificationActivity, h2 h2Var, long j3, q10 q10Var, Runnable runnable, int i7, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP) {
        this.f16266e = connectionsManager;
        this.f16267f = twoStepVerificationActivity;
        this.f16265c = h2Var;
        this.f16264b = j3;
        this.f16268g = q10Var;
        this.h = runnable;
        this.d = i7;
        this.f16269i = inputCheckPasswordSRP;
    }

    public c(u1 u1Var, org.telegram.messenger.c cVar, e70 e70Var, long j3, Context context, h2 h2Var, int i7, TLRPC.Peer peer) {
        this.f16266e = u1Var;
        this.f16267f = cVar;
        this.f16268g = e70Var;
        this.f16264b = j3;
        this.h = context;
        this.f16265c = h2Var;
        this.d = i7;
        this.f16269i = peer;
    }
}
