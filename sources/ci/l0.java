package ci;

import android.os.SystemClock;
import org.telegram.messenger.a8;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.lc;
import org.telegram.ui.rq;
public final class l0 implements r10 {
    public final int f5741a;
    public final boolean f5742b;
    public final gs f5743c;
    public final Object d;

    public l0(gs gsVar, Object obj, boolean z10, int i7) {
        this.f5741a = i7;
        this.f5743c = gsVar;
        this.d = obj;
        this.f5742b = z10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        int i7 = this.f5741a;
        boolean z10 = false;
        boolean z11 = this.f5742b;
        Object obj3 = this.d;
        gs gsVar = this.f5743c;
        switch (i7) {
            case 0:
                o0 o0Var = (o0) gsVar;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                z0 z0Var = o0Var.f5761b;
                if (o0Var.f5765n == ((int[]) obj3)[0] && !o0Var.F) {
                    o0Var.f5765n = 0;
                    boolean z12 = true;
                    if (tL_exportedNoPaidMessagesToken == null) {
                        String str2 = null;
                        if (tL_error != null) {
                            str = tL_error.text;
                        } else {
                            str = null;
                        }
                        a8.d("QrShare: exportNoPaidMessagesToken " + str);
                        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken2 = o0Var.f5764f;
                        if (tL_exportedNoPaidMessagesToken2 != null) {
                            if (tL_exportedNoPaidMessagesToken2.expires == 0) {
                                z12 = false;
                            }
                            if (z12 == z11) {
                                if (str != null) {
                                    z0Var.getClass();
                                    z0Var.d1(2131232438, hd.N0(2131751093, null), null);
                                    return;
                                }
                                return;
                            }
                        }
                        o0Var.d = 0;
                        o0Var.f().edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (z0Var.f6097w0) {
                            if (str != null) {
                                str2 = hd.N0(2131751093, null);
                            }
                            z0Var.U0(str2);
                            return;
                        } else if (str != null) {
                            z0Var.d1(2131232438, hd.N0(2131751093, null), null);
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
                            o0Var.f5764f = tL_exportedNoPaidMessagesToken;
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
                rq rqVar = (rq) gsVar;
                n8 n8Var = (n8) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    rqVar.getMessagesController().V3(updates, false);
                    return;
                }
                rqVar.getClass();
                if (tL_error2 != null) {
                    n8Var.setChecked(z11);
                    lc.b0(rqVar).g0(tL_error2, false);
                    return;
                }
                return;
        }
    }
}
