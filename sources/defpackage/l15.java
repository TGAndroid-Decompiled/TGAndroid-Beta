package defpackage;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.TwoStepVerificationActivity;
public final class l15 implements RequestDelegate {
    public final byte a = 2;
    public final long b;
    public final Object c;
    public final int d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public l15(he heVar, j5 j5Var, uv5 uv5Var, long j, Context context, d dVar, int i, TLRPC.Peer peer) {
        this.e = heVar;
        this.f = j5Var;
        this.g = uv5Var;
        this.b = j;
        this.h = context;
        this.c = dVar;
        this.d = i;
        this.i = peer;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.i;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.c;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                final ConnectionsManager connectionsManager = (ConnectionsManager) obj6;
                final TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj5;
                final d dVar = (d) obj4;
                final qt0 qt0Var = (qt0) obj3;
                final wz wzVar = (wz) obj2;
                final TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP = (TLRPC.TL_inputCheckPasswordSRP) obj;
                final long j = this.b;
                final int i = this.d;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        TLRPC.TL_error tL_error2 = TLRPC.TL_error.this;
                        ConnectionsManager connectionsManager2 = connectionsManager;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        d dVar2 = dVar;
                        long j2 = j;
                        qt0 qt0Var2 = qt0Var;
                        wz wzVar2 = wzVar;
                        int i2 = i;
                        if (tL_error2 != null) {
                            if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                                connectionsManager2.sendRequest(new TL_account.getPassword(), new n15(twoStepVerificationActivity2, dVar2, j2, qt0Var2, wzVar2, i2), 8);
                                return;
                            }
                            u15.a[i2] = false;
                            twoStepVerificationActivity2.t0();
                            if (u15.h(tL_error2, twoStepVerificationActivity2)) {
                                return;
                            }
                            if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, twoStepVerificationActivity2.getResourceProvider(), twoStepVerificationActivity2.getParentActivity());
                                String M0 = jb6.M0(2131751234, null);
                                he heVar = alertDialog$Builder.a;
                                heVar.S = M0;
                                heVar.U = jb6.M0(2131749277, null);
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                alertDialog$Builder.j(jb6.M0(2131751228, null), new o15(twoStepVerificationActivity2, (byte) 0));
                                twoStepVerificationActivity2.showDialog(heVar);
                                return;
                            }
                            if (!"PASSWORD_HASH_INVALID".equals(tL_error2.text)) {
                                twoStepVerificationActivity2.finishFragment();
                            }
                            c41.e0(tL_error2);
                            return;
                        }
                        TLRPC.TL_payments_withdrawStarsRevenueToWallet tL_payments_withdrawStarsRevenueToWallet = new TLRPC.TL_payments_withdrawStarsRevenueToWallet();
                        tL_payments_withdrawStarsRevenueToWallet.ton = true;
                        tL_payments_withdrawStarsRevenueToWallet.peer = oc7.r1(i2).i1(z8c.h(i2).e());
                        tL_payments_withdrawStarsRevenueToWallet.tmp_password = ((TL_account.tmpPassword) tLObject).tmp_password;
                        connectionsManager2.sendRequest(tL_payments_withdrawStarsRevenueToWallet, new xs0(i2, qt0Var2, tL_inputCheckPasswordSRP, twoStepVerificationActivity2, wzVar2, dVar2, j2));
                    }
                });
                return;
            case 1:
                gm.c3(new dt0((he) obj6, tLObject, (j5) obj5, (uv5) obj3, this.b, (Context) obj2, (d) obj4, this.d, (TLRPC.Peer) obj));
                return;
            default:
                Context context = (Context) obj6;
                q63 q63Var = (q63) obj5;
                byte[] bArr = (byte[]) obj4;
                bo1 bo1Var = (bo1) obj3;
                c41 c41Var = (c41) obj2;
                ecc eccVar = (ecc) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        gm.c3(new xh3((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject, context, q63Var, this.b, bArr, bo1Var, c41Var, eccVar, (byte) 1));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        gm.d3(new w99(bo1Var, c41Var, context, q63Var, (byte) 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        gm.d3(new v99(bo1Var, c41Var, this.d, (byte) 1), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    gm.d3(new w99(bo1Var, c41Var, context, q63Var, (byte) 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public l15(Context context, q63 q63Var, long j, byte[] bArr, bo1 bo1Var, c41 c41Var, ecc eccVar, int i) {
        this.e = context;
        this.f = q63Var;
        this.b = j;
        this.c = bArr;
        this.g = bo1Var;
        this.h = c41Var;
        this.i = eccVar;
        this.d = i;
    }

    public l15(ConnectionsManager connectionsManager, TwoStepVerificationActivity twoStepVerificationActivity, d dVar, long j, qt0 qt0Var, wz wzVar, int i, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        this.e = connectionsManager;
        this.f = twoStepVerificationActivity;
        this.c = dVar;
        this.b = j;
        this.g = qt0Var;
        this.h = wzVar;
        this.d = i;
        this.i = tL_inputCheckPasswordSRP;
    }
}
