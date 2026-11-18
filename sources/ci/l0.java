package ci;

import android.os.SystemClock;
import org.telegram.messenger.a8;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.lc;
import org.telegram.ui.rq;
public final class l0 implements q10 {
    public final int f5712a;
    public final boolean f5713b;
    public final fs f5714c;
    public final Object d;

    public l0(fs fsVar, Object obj, boolean z10, int i7) {
        this.f5712a = i7;
        this.f5714c = fsVar;
        this.d = obj;
        this.f5713b = z10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        int i7 = this.f5712a;
        boolean z10 = false;
        boolean z11 = this.f5713b;
        Object obj3 = this.d;
        fs fsVar = this.f5714c;
        switch (i7) {
            case 0:
                o0 o0Var = (o0) fsVar;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                z0 z0Var = o0Var.f5732b;
                if (o0Var.f5736n == ((int[]) obj3)[0] && !o0Var.F) {
                    o0Var.f5736n = 0;
                    boolean z12 = true;
                    if (tL_exportedNoPaidMessagesToken == null) {
                        String str2 = null;
                        if (tL_error != null) {
                            str = tL_error.text;
                        } else {
                            str = null;
                        }
                        a8.d("QrShare: exportNoPaidMessagesToken " + str);
                        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken2 = o0Var.f5735f;
                        if (tL_exportedNoPaidMessagesToken2 != null) {
                            if (tL_exportedNoPaidMessagesToken2.expires == 0) {
                                z12 = false;
                            }
                            if (z12 == z11) {
                                if (str != null) {
                                    z0Var.getClass();
                                    z0Var.d1(2131232438, gd.M0(2131751094, null), null);
                                    return;
                                }
                                return;
                            }
                        }
                        o0Var.d = 0;
                        o0Var.f().edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (z0Var.f6068w0) {
                            if (str != null) {
                                str2 = gd.M0(2131751094, null);
                            }
                            z0Var.U0(str2);
                            return;
                        } else if (str != null) {
                            z0Var.d1(2131232438, gd.M0(2131751094, null), null);
                            return;
                        } else {
                            return;
                        }
                    }
                    int i10 = o0Var.d;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            z10 = true;
                        }
                        if (z11 == z10) {
                            if (tL_exportedNoPaidMessagesToken.expires == 0) {
                                o0Var.f().edit().putString("qrNoPaidToken", tL_exportedNoPaidMessagesToken.token).putString("qrNoPaidUrl", tL_exportedNoPaidMessagesToken.url).apply();
                            }
                            o0Var.f5735f = tL_exportedNoPaidMessagesToken;
                            o0Var.h = SystemClock.elapsedRealtime();
                            z0Var.setFreeLink(o0Var.d(tL_exportedNoPaidMessagesToken));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                rq rqVar = (rq) fsVar;
                m8 m8Var = (m8) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    rqVar.getMessagesController().V3(updates, false);
                    return;
                }
                rqVar.getClass();
                if (tL_error2 != null) {
                    m8Var.setChecked(z11);
                    lc.b0(rqVar).g0(tL_error2, false);
                    return;
                }
                return;
        }
    }
}
