package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class e35 implements i8c {
    public final byte a = 0;
    public final String b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public e35(int i, c cVar, ki7 ki7Var, j35 j35Var, String str, byte[] bArr, byte[] bArr2, wjb wjbVar) {
        this.c = i;
        this.d = cVar;
        this.e = j35Var;
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
                j35 j35Var = (j35) obj5;
                byte[] bArr = (byte[]) obj4;
                byte[] bArr2 = (byte[]) obj3;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                String str = (String) obj2;
                if (!j35Var.e || j35Var.d) {
                    if (sendtransfer == null) {
                        if (str == null) {
                            str = k96.M0(2131742723, null);
                        }
                        u21.c0(str);
                        j35Var.d = false;
                        if (!j35Var.f) {
                            j35Var.f = true;
                            j35Var.b.a();
                        }
                        if (!j35Var.e) {
                            j35Var.a.dismiss();
                            return;
                        }
                        return;
                    }
                    int i2 = this.c;
                    ConnectionsManager.getInstance(i2).sendRequestTyped(sendtransfer, new hc((byte) 0), new ah4(i2, cVar, this.b, bArr, bArr2, sendtransfer, j35Var));
                    return;
                }
                return;
            case 1:
                ip7 ip7Var = (ip7) obj6;
                Context context = (Context) obj5;
                wjb wjbVar = (wjb) obj4;
                u21 u21Var = (u21) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                HashMap hashMap = vp7.c;
                String str2 = this.b;
                int i3 = this.c;
                if (updates != null) {
                    hashMap.put(str2, Long.valueOf(SystemClock.elapsedRealtime() + 60000));
                    vp7.c();
                    na7.q1(i3).Q3(updates, false);
                    if (ip7Var != null) {
                        ip7Var.run();
                    }
                    m21 Q = vp7.h().Q(2131623990, 36, k96.M0(2131749602, null));
                    Q.t = true;
                    Q.j();
                    return;
                }
                hashMap.remove(str2);
                vp7.c();
                cq7.r(context, i3, wjbVar, u21Var, tL_error, null);
                return;
            default:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj6;
                Context context2 = (Context) obj5;
                wjb wjbVar2 = (wjb) obj4;
                nna nnaVar = (nna) obj3;
                w05 w05Var = (w05) obj;
                Boolean bool = (Boolean) obj2;
                w05Var.h = new TL_wallet.walletOnchainGiftActionDelist();
                w05Var.i = tL_starGiftUnique;
                int i4 = this.c;
                mp7 mp7Var = new mp7(context2, i4, tL_starGiftUnique, wjbVar2);
                String str3 = this.b;
                String a0 = k96.a0(null, null, 2131749870, str3);
                if (bool.booleanValue()) {
                    i = 2131749513;
                } else {
                    i = 2131749514;
                }
                mp7Var.e1(k96.M0(i, null), a0);
                mp7Var.Y1.f(k96.M0(2131749540, null), cq7.i(w05Var.b), null, null);
                mp7Var.c2.i(k96.M0(2131750416, null), false, true);
                mp7Var.p2 = 2131749615;
                mp7Var.d1(w05Var);
                mp7Var.c1(new q76(nnaVar, tL_starGiftUnique, str3, i4, (byte) 14), new x15(tL_starGiftUnique, str3, (byte) 12), new xp7(context2, i4, wjbVar2, mp7Var, bool, (byte) 0));
                mp7Var.show();
                return;
        }
    }

    public e35(String str, int i, ip7 ip7Var, Context context, wjb wjbVar, u21 u21Var) {
        this.b = str;
        this.c = i;
        this.d = ip7Var;
        this.e = context;
        this.f = wjbVar;
        this.g = u21Var;
    }

    public e35(TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i, wjb wjbVar, String str, nna nnaVar) {
        this.d = tL_starGiftUnique;
        this.e = context;
        this.c = i;
        this.f = wjbVar;
        this.b = str;
        this.g = nnaVar;
    }
}
