package defpackage;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.TwoStepVerificationActivity;
public final class q15 implements RequestDelegate {
    public final byte a = 2;
    public final long b;
    public final Object c;
    public final int d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public q15(id idVar, k5 k5Var, zv5 zv5Var, long j, Context context, e eVar, int i, TLRPC.Peer peer) {
        this.e = idVar;
        this.f = k5Var;
        this.g = zv5Var;
        this.b = j;
        this.h = context;
        this.c = eVar;
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
                final e eVar = (e) obj4;
                final qs0 qs0Var = (qs0) obj3;
                final wy wyVar = (wy) obj2;
                final TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP = (TLRPC.TL_inputCheckPasswordSRP) obj;
                final long j = this.b;
                final int i = this.d;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        TLRPC.TL_error tL_error2 = TLRPC.TL_error.this;
                        ConnectionsManager connectionsManager2 = connectionsManager;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        e eVar2 = eVar;
                        long j2 = j;
                        qs0 qs0Var2 = qs0Var;
                        wy wyVar2 = wyVar;
                        int i2 = i;
                        if (tL_error2 != null) {
                            if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                                connectionsManager2.sendRequest(new TL_account.getPassword(), new s15(twoStepVerificationActivity2, eVar2, j2, qs0Var2, wyVar2, i2), 8);
                                return;
                            }
                            z15.a[i2] = false;
                            twoStepVerificationActivity2.s0();
                            if (z15.h(tL_error2, twoStepVerificationActivity2)) {
                                return;
                            }
                            if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, twoStepVerificationActivity2.getResourceProvider(), twoStepVerificationActivity2.getParentActivity());
                                String M0 = ob6.M0(2131751262, null);
                                id idVar = alertDialog$Builder.a;
                                idVar.S = M0;
                                idVar.U = ob6.M0(2131749274, null);
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                alertDialog$Builder.j(ob6.M0(2131751256, null), new t15(twoStepVerificationActivity2, (byte) 0));
                                twoStepVerificationActivity2.showDialog(idVar);
                                return;
                            }
                            if (!"PASSWORD_HASH_INVALID".equals(tL_error2.text)) {
                                twoStepVerificationActivity2.finishFragment();
                            }
                            d31.e0(tL_error2);
                            return;
                        }
                        TLRPC.TL_payments_withdrawStarsRevenueToWallet tL_payments_withdrawStarsRevenueToWallet = new TLRPC.TL_payments_withdrawStarsRevenueToWallet();
                        tL_payments_withdrawStarsRevenueToWallet.ton = true;
                        tL_payments_withdrawStarsRevenueToWallet.peer = uc7.s1(i2).j1(yac.h(i2).e());
                        tL_payments_withdrawStarsRevenueToWallet.tmp_password = ((TL_account.tmpPassword) tLObject).tmp_password;
                        connectionsManager2.sendRequest(tL_payments_withdrawStarsRevenueToWallet, new xr0(i2, qs0Var2, tL_inputCheckPasswordSRP, twoStepVerificationActivity2, wyVar2, eVar2, j2));
                    }
                });
                return;
            case 1:
                hl.c3(new ds0((id) obj6, tLObject, (k5) obj5, (zv5) obj3, this.b, (Context) obj2, (e) obj4, this.d, (TLRPC.Peer) obj));
                return;
            default:
                Context context = (Context) obj6;
                w53 w53Var = (w53) obj5;
                byte[] bArr = (byte[]) obj4;
                vn1 vn1Var = (vn1) obj3;
                d31 d31Var = (d31) obj2;
                dec decVar = (dec) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        hl.c3(new eh3((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject, context, w53Var, this.b, bArr, vn1Var, d31Var, decVar, (byte) 1));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        hl.d3(new gb9(vn1Var, d31Var, context, w53Var, (byte) 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        hl.d3(new a39(vn1Var, d31Var, this.d, (byte) 2), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    hl.d3(new gb9(vn1Var, d31Var, context, w53Var, (byte) 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public q15(Context context, w53 w53Var, long j, byte[] bArr, vn1 vn1Var, d31 d31Var, dec decVar, int i) {
        this.e = context;
        this.f = w53Var;
        this.b = j;
        this.c = bArr;
        this.g = vn1Var;
        this.h = d31Var;
        this.i = decVar;
        this.d = i;
    }

    public q15(ConnectionsManager connectionsManager, TwoStepVerificationActivity twoStepVerificationActivity, e eVar, long j, qs0 qs0Var, wy wyVar, int i, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        this.e = connectionsManager;
        this.f = twoStepVerificationActivity;
        this.c = eVar;
        this.b = j;
        this.g = qs0Var;
        this.h = wyVar;
        this.d = i;
        this.i = tL_inputCheckPasswordSRP;
    }
}
