package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class e55 implements jac {
    public final byte a = 0;
    public final String b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public e55(int i, c cVar, mk7 mk7Var, j55 j55Var, String str, byte[] bArr, byte[] bArr2, ylb ylbVar) {
        this.c = i;
        this.d = cVar;
        this.e = j55Var;
        this.b = str;
        this.f = bArr;
        this.g = bArr2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i;
        byte b = this.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                c cVar = (c) obj6;
                j55 j55Var = (j55) obj5;
                byte[] bArr = (byte[]) obj4;
                byte[] bArr2 = (byte[]) obj3;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                String str = (String) obj2;
                if (!j55Var.e || j55Var.d) {
                    if (sendtransfer == null) {
                        if (str == null) {
                            str = jb6.M0(2131742649, null);
                        }
                        c41.c0(str);
                        j55Var.d = false;
                        if (!j55Var.f) {
                            j55Var.f = true;
                            j55Var.b.a();
                        }
                        if (!j55Var.e) {
                            j55Var.a.dismiss();
                            return;
                        }
                        return;
                    }
                    int i2 = this.c;
                    ConnectionsManager.getInstance(i2).sendRequestTyped(sendtransfer, new kc((byte) 0), new cj4(i2, cVar, this.b, bArr, bArr2, sendtransfer, j55Var));
                    return;
                }
                return;
            case 1:
                lr7 lr7Var = (lr7) obj6;
                Context context = (Context) obj5;
                ylb ylbVar = (ylb) obj4;
                c41 c41Var = (c41) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                HashMap hashMap = yr7.c;
                String str2 = this.b;
                int i3 = this.c;
                if (updates != null) {
                    hashMap.put(str2, Long.valueOf(SystemClock.elapsedRealtime() + 60000));
                    yr7.c();
                    oc7.r1(i3).T3(updates, false);
                    if (lr7Var != null) {
                        lr7Var.run();
                    }
                    u31 Q = yr7.h().Q(2131623990, 36, jb6.M0(2131749551, null));
                    Q.u = true;
                    Q.j();
                    return;
                }
                hashMap.remove(str2);
                yr7.c();
                fs7.r(context, i3, ylbVar, c41Var, tL_error, null);
                return;
            default:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj6;
                Context context2 = (Context) obj5;
                ylb ylbVar2 = (ylb) obj4;
                npa npaVar = (npa) obj3;
                w25 w25Var = (w25) obj;
                Boolean bool = (Boolean) obj2;
                w25Var.h = new TL_wallet.walletOnchainGiftActionDelist();
                w25Var.i = tL_starGiftUnique;
                int i4 = this.c;
                pr7 pr7Var = new pr7(context2, i4, tL_starGiftUnique, ylbVar2);
                String str3 = this.b;
                String a0 = jb6.a0(null, null, 2131749819, str3);
                if (bool.booleanValue()) {
                    i = 2131749462;
                } else {
                    i = 2131749463;
                }
                pr7Var.e1(jb6.M0(i, null), a0);
                pr7Var.Y1.f(jb6.M0(2131749489, null), fs7.i(w25Var.b), null, null);
                pr7Var.c2.i(jb6.M0(2131750365, null), false, true);
                pr7Var.p2 = 2131749564;
                pr7Var.d1(w25Var);
                pr7Var.c1(new v36(npaVar, tL_starGiftUnique, str3, i4, (byte) 15), new u35(tL_starGiftUnique, str3, (byte) 13), new as7(context2, i4, ylbVar2, pr7Var, bool, (byte) 0));
                pr7Var.show();
                return;
        }
    }

    public e55(String str, int i, lr7 lr7Var, Context context, ylb ylbVar, c41 c41Var) {
        this.b = str;
        this.c = i;
        this.d = lr7Var;
        this.e = context;
        this.f = ylbVar;
        this.g = c41Var;
    }

    public e55(TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i, ylb ylbVar, String str, npa npaVar) {
        this.d = tL_starGiftUnique;
        this.e = context;
        this.c = i;
        this.f = ylbVar;
        this.b = str;
        this.g = npaVar;
    }
}
