package ai;

import android.os.SystemClock;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.hc;
import org.telegram.ui.oq;
public final class u0 implements v10 {
    public final int f1649a;
    public final boolean f1650b;
    public final ls f1651c;
    public final Object d;

    public u0(ls lsVar, Object obj, boolean z9, int i7) {
        this.f1649a = i7;
        this.f1651c = lsVar;
        this.d = obj;
        this.f1650b = z9;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        int i7 = this.f1649a;
        boolean z9 = false;
        boolean z10 = this.f1650b;
        Object obj3 = this.d;
        ls lsVar = this.f1651c;
        switch (i7) {
            case 0:
                y0 y0Var = (y0) lsVar;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                l1 l1Var = y0Var.f1690b;
                if (y0Var.f1694n == ((int[]) obj3)[0] && !y0Var.E) {
                    y0Var.f1694n = 0;
                    boolean z11 = true;
                    if (tL_exportedNoPaidMessagesToken == null) {
                        String str2 = null;
                        if (tL_error != null) {
                            str = tL_error.text;
                        } else {
                            str = null;
                        }
                        a8.d("QrShare: exportNoPaidMessagesToken " + str);
                        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken2 = y0Var.f1693f;
                        if (tL_exportedNoPaidMessagesToken2 != null) {
                            if (tL_exportedNoPaidMessagesToken2.expires == 0) {
                                z11 = false;
                            }
                            if (z11 == z10) {
                                if (str != null) {
                                    l1Var.getClass();
                                    l1Var.d1(2131232436, id.M0(2131751106, null), null);
                                    return;
                                }
                                return;
                            }
                        }
                        y0Var.d = 0;
                        y0Var.f().edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (l1Var.f1524v0) {
                            if (str != null) {
                                str2 = id.M0(2131751106, null);
                            }
                            l1Var.U0(str2);
                            return;
                        } else if (str != null) {
                            l1Var.d1(2131232436, id.M0(2131751106, null), null);
                            return;
                        } else {
                            return;
                        }
                    }
                    int i10 = y0Var.d;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            z9 = true;
                        }
                        if (z10 == z9) {
                            if (tL_exportedNoPaidMessagesToken.expires == 0) {
                                y0Var.f().edit().putString("qrNoPaidToken", tL_exportedNoPaidMessagesToken.token).putString("qrNoPaidUrl", tL_exportedNoPaidMessagesToken.url).apply();
                            }
                            y0Var.f1693f = tL_exportedNoPaidMessagesToken;
                            y0Var.h = SystemClock.elapsedRealtime();
                            l1Var.setFreeLink(y0Var.d(tL_exportedNoPaidMessagesToken));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                oq oqVar = (oq) lsVar;
                m8 m8Var = (m8) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    oqVar.getMessagesController().O3(updates, false);
                    return;
                }
                oqVar.getClass();
                if (tL_error2 != null) {
                    m8Var.setChecked(z10);
                    hc.a0(oqVar).f0(tL_error2, false);
                    return;
                }
                return;
        }
    }
}
