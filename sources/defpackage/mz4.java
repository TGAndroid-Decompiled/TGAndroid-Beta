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
public final class mz4 implements RequestDelegate {
    public final byte a = 2;
    public final long b;
    public final Object c;
    public final int d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public mz4(hd hdVar, j5 j5Var, vt5 vt5Var, long j, Context context, d dVar, int i, TLRPC.Peer peer) {
        this.e = hdVar;
        this.f = j5Var;
        this.g = vt5Var;
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
                final is0 is0Var = (is0) obj3;
                final wy wyVar = (wy) obj2;
                final TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP = (TLRPC.TL_inputCheckPasswordSRP) obj;
                final long j = this.b;
                final int i = this.d;
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        TLRPC.TL_error tL_error2 = TLRPC.TL_error.this;
                        ConnectionsManager connectionsManager2 = connectionsManager;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        d dVar2 = dVar;
                        long j2 = j;
                        is0 is0Var2 = is0Var;
                        wy wyVar2 = wyVar;
                        int i2 = i;
                        if (tL_error2 != null) {
                            if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                                connectionsManager2.sendRequest(new TL_account.getPassword(), new oz4(twoStepVerificationActivity2, dVar2, j2, is0Var2, wyVar2, i2), 8);
                                return;
                            }
                            uz4.a[i2] = false;
                            twoStepVerificationActivity2.s0();
                            if (uz4.h(tL_error2, twoStepVerificationActivity2)) {
                                return;
                            }
                            if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, twoStepVerificationActivity2.getResourceProvider(), twoStepVerificationActivity2.getParentActivity());
                                String M0 = k96.M0(2131751285, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M0;
                                hdVar.U = k96.M0(2131749328, null);
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                alertDialog$Builder.j(k96.M0(2131751279, null), new pz4(twoStepVerificationActivity2, (byte) 0));
                                twoStepVerificationActivity2.showDialog(hdVar);
                                return;
                            }
                            if (!"PASSWORD_HASH_INVALID".equals(tL_error2.text)) {
                                twoStepVerificationActivity2.finishFragment();
                            }
                            u21.e0(tL_error2);
                            return;
                        }
                        TLRPC.TL_payments_withdrawStarsRevenueToWallet tL_payments_withdrawStarsRevenueToWallet = new TLRPC.TL_payments_withdrawStarsRevenueToWallet();
                        tL_payments_withdrawStarsRevenueToWallet.ton = true;
                        tL_payments_withdrawStarsRevenueToWallet.peer = na7.q1(i2).h1(y6c.h(i2).e());
                        tL_payments_withdrawStarsRevenueToWallet.tmp_password = ((TL_account.tmpPassword) tLObject).tmp_password;
                        connectionsManager2.sendRequest(tL_payments_withdrawStarsRevenueToWallet, new pr0(i2, is0Var2, tL_inputCheckPasswordSRP, twoStepVerificationActivity2, wyVar2, dVar2, j2));
                    }
                });
                return;
            case 1:
                gl.d3(new vr0((hd) obj6, tLObject, (j5) obj5, (vt5) obj3, this.b, (Context) obj2, (d) obj4, this.d, (TLRPC.Peer) obj));
                return;
            default:
                Context context = (Context) obj6;
                e53 e53Var = (e53) obj5;
                byte[] bArr = (byte[]) obj4;
                en1 en1Var = (en1) obj3;
                u21 u21Var = (u21) obj2;
                dac dacVar = (dac) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        gl.d3(new kg3((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject, context, e53Var, this.b, bArr, en1Var, u21Var, dacVar, (byte) 1));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        gl.e3(new u79(en1Var, u21Var, context, e53Var, (byte) 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        gl.e3(new t79(en1Var, u21Var, this.d, (byte) 1), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    gl.e3(new u79(en1Var, u21Var, context, e53Var, (byte) 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public mz4(Context context, e53 e53Var, long j, byte[] bArr, en1 en1Var, u21 u21Var, dac dacVar, int i) {
        this.e = context;
        this.f = e53Var;
        this.b = j;
        this.c = bArr;
        this.g = en1Var;
        this.h = u21Var;
        this.i = dacVar;
        this.d = i;
    }

    public mz4(ConnectionsManager connectionsManager, TwoStepVerificationActivity twoStepVerificationActivity, d dVar, long j, is0 is0Var, wy wyVar, int i, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        this.e = connectionsManager;
        this.f = twoStepVerificationActivity;
        this.c = dVar;
        this.b = j;
        this.g = is0Var;
        this.h = wyVar;
        this.d = i;
        this.i = tL_inputCheckPasswordSRP;
    }
}
