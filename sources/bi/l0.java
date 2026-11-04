package bi;

import android.os.SystemClock;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.fc;
import org.telegram.ui.nq;
public final class l0 implements n10 {
    public final int f3787a;
    public final boolean f3788b;
    public final cs f3789c;
    public final Object d;

    public l0(cs csVar, Object obj, boolean z10, int i3) {
        this.f3787a = i3;
        this.f3789c = csVar;
        this.d = obj;
        this.f3788b = z10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        int i3 = this.f3787a;
        boolean z10 = false;
        boolean z11 = this.f3788b;
        Object obj3 = this.d;
        cs csVar = this.f3789c;
        switch (i3) {
            case 0:
                o0 o0Var = (o0) csVar;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                a1 a1Var = o0Var.f3807b;
                if (o0Var.f3811n == ((int[]) obj3)[0] && !o0Var.F) {
                    o0Var.f3811n = 0;
                    boolean z12 = true;
                    if (tL_exportedNoPaidMessagesToken == null) {
                        String str2 = null;
                        if (tL_error != null) {
                            str = tL_error.text;
                        } else {
                            str = null;
                        }
                        a8.d("QrShare: exportNoPaidMessagesToken " + str);
                        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken2 = o0Var.f3810f;
                        if (tL_exportedNoPaidMessagesToken2 != null) {
                            if (tL_exportedNoPaidMessagesToken2.expires == 0) {
                                z12 = false;
                            }
                            if (z12 == z11) {
                                if (str != null) {
                                    a1Var.getClass();
                                    a1Var.d1(2131232436, bd.M0(2131751106, null), null);
                                    return;
                                }
                                return;
                            }
                        }
                        o0Var.d = 0;
                        o0Var.f().edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (a1Var.f3611w0) {
                            if (str != null) {
                                str2 = bd.M0(2131751106, null);
                            }
                            a1Var.U0(str2);
                            return;
                        } else if (str != null) {
                            a1Var.d1(2131232436, bd.M0(2131751106, null), null);
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
                            o0Var.f3810f = tL_exportedNoPaidMessagesToken;
                            o0Var.h = SystemClock.elapsedRealtime();
                            a1Var.setFreeLink(o0Var.d(tL_exportedNoPaidMessagesToken));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                nq nqVar = (nq) csVar;
                l8 l8Var = (l8) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    nqVar.getMessagesController().O3(updates, false);
                    return;
                }
                nqVar.getClass();
                if (tL_error2 != null) {
                    l8Var.setChecked(z11);
                    fc.a0(nqVar).f0(tL_error2, false);
                    return;
                }
                return;
        }
    }
}
