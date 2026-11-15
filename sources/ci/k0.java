package ci;

import android.os.SystemClock;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.cc;
import org.telegram.ui.qq;
public final class k0 implements s10 {
    public final int f5416a;
    public final boolean f5417b;
    public final is f5418c;
    public final Object d;

    public k0(is isVar, Object obj, boolean z10, int i7) {
        this.f5416a = i7;
        this.f5418c = isVar;
        this.d = obj;
        this.f5417b = z10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        int i7 = this.f5416a;
        boolean z10 = false;
        boolean z11 = this.f5417b;
        Object obj3 = this.d;
        is isVar = this.f5418c;
        switch (i7) {
            case 0:
                n0 n0Var = (n0) isVar;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                z0 z0Var = n0Var.f5440b;
                if (n0Var.f5444n == ((int[]) obj3)[0] && !n0Var.F) {
                    n0Var.f5444n = 0;
                    boolean z12 = true;
                    if (tL_exportedNoPaidMessagesToken == null) {
                        String str2 = null;
                        if (tL_error != null) {
                            str = tL_error.text;
                        } else {
                            str = null;
                        }
                        a8.d("QrShare: exportNoPaidMessagesToken " + str);
                        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken2 = n0Var.f5443f;
                        if (tL_exportedNoPaidMessagesToken2 != null) {
                            if (tL_exportedNoPaidMessagesToken2.expires == 0) {
                                z12 = false;
                            }
                            if (z12 == z11) {
                                if (str != null) {
                                    z0Var.getClass();
                                    z0Var.d1(2131232437, hd.M0(2131751105, null), null);
                                    return;
                                }
                                return;
                            }
                        }
                        n0Var.d = 0;
                        n0Var.f().edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (z0Var.f5782w0) {
                            if (str != null) {
                                str2 = hd.M0(2131751105, null);
                            }
                            z0Var.U0(str2);
                            return;
                        } else if (str != null) {
                            z0Var.d1(2131232437, hd.M0(2131751105, null), null);
                            return;
                        } else {
                            return;
                        }
                    }
                    int i10 = n0Var.d;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            z10 = true;
                        }
                        if (z11 == z10) {
                            if (tL_exportedNoPaidMessagesToken.expires == 0) {
                                n0Var.f().edit().putString("qrNoPaidToken", tL_exportedNoPaidMessagesToken.token).putString("qrNoPaidUrl", tL_exportedNoPaidMessagesToken.url).apply();
                            }
                            n0Var.f5443f = tL_exportedNoPaidMessagesToken;
                            n0Var.h = SystemClock.elapsedRealtime();
                            z0Var.setFreeLink(n0Var.d(tL_exportedNoPaidMessagesToken));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                qq qqVar = (qq) isVar;
                l8 l8Var = (l8) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    qqVar.getMessagesController().O3(updates, false);
                    return;
                }
                qqVar.getClass();
                if (tL_error2 != null) {
                    l8Var.setChecked(z11);
                    cc.a0(qqVar).f0(tL_error2, false);
                    return;
                }
                return;
        }
    }
}
