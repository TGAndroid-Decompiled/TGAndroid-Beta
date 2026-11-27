package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class b55 implements icc {
    public final byte a = 0;
    public final String b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public b55(int i, c cVar, tk7 tk7Var, n55 n55Var, String str, byte[] bArr, byte[] bArr2, vnb vnbVar) {
        this.c = i;
        this.d = cVar;
        this.e = n55Var;
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
                n55 n55Var = (n55) obj5;
                byte[] bArr = (byte[]) obj4;
                byte[] bArr2 = (byte[]) obj3;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                String str = (String) obj2;
                if (!n55Var.e || n55Var.d) {
                    if (sendtransfer == null) {
                        if (str == null) {
                            str = ob6.M0(2131742617, null);
                        }
                        d31.c0(str);
                        n55Var.d = false;
                        if (!n55Var.f) {
                            n55Var.f = true;
                            n55Var.b.a();
                        }
                        if (!n55Var.e) {
                            n55Var.a.dismiss();
                            return;
                        }
                        return;
                    }
                    int i2 = this.c;
                    ConnectionsManager.getInstance(i2).sendRequestTyped(sendtransfer, new ic((byte) 0), new bj4(i2, cVar, this.b, bArr, bArr2, sendtransfer, n55Var));
                    return;
                }
                return;
            case 1:
                is7 is7Var = (is7) obj6;
                Context context = (Context) obj5;
                vnb vnbVar = (vnb) obj4;
                d31 d31Var = (d31) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                HashMap hashMap = vs7.c;
                String str2 = this.b;
                int i3 = this.c;
                if (updates != null) {
                    hashMap.put(str2, Long.valueOf(SystemClock.elapsedRealtime() + 60000));
                    vs7.c();
                    uc7.s1(i3).Y3(updates, false);
                    if (is7Var != null) {
                        is7Var.run();
                    }
                    v21 Q = vs7.h().Q(2131623990, 36, ob6.M0(2131749563, null));
                    Q.u = true;
                    Q.j();
                    return;
                }
                hashMap.remove(str2);
                vs7.c();
                it7.u(context, i3, vnbVar, d31Var, tL_error, null);
                return;
            default:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj6;
                Context context2 = (Context) obj5;
                vnb vnbVar2 = (vnb) obj4;
                jra jraVar = (jra) obj3;
                a35 a35Var = (a35) obj;
                Boolean bool = (Boolean) obj2;
                a35Var.h = new TL_wallet.walletOnchainGiftActionDelist();
                a35Var.i = tL_starGiftUnique;
                int i4 = this.c;
                ms7 ms7Var = new ms7(context2, i4, tL_starGiftUnique, vnbVar2);
                String str3 = this.b;
                String a0 = ob6.a0(null, null, 2131749832, str3);
                if (bool.booleanValue()) {
                    i = 2131749474;
                } else {
                    i = 2131749475;
                }
                ms7Var.h1(ob6.M0(i, null), a0);
                ms7Var.Y1.f(ob6.M0(2131749501, null), it7.j(a35Var.b), null, null);
                ms7Var.e1(ob6.M0(2131750393, null));
                ms7Var.p2 = 2131749576;
                ms7Var.f1(a35Var);
                ms7Var.d1(new y36(jraVar, tL_starGiftUnique, str3, i4, (byte) 16), new v35(tL_starGiftUnique, str3, (byte) 13), new xs7(context2, i4, vnbVar2, ms7Var, bool, (byte) 1));
                ms7Var.show();
                return;
        }
    }

    public b55(String str, int i, is7 is7Var, Context context, vnb vnbVar, d31 d31Var) {
        this.b = str;
        this.c = i;
        this.d = is7Var;
        this.e = context;
        this.f = vnbVar;
        this.g = d31Var;
    }

    public b55(TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i, vnb vnbVar, String str, jra jraVar) {
        this.d = tL_starGiftUnique;
        this.e = context;
        this.c = i;
        this.f = vnbVar;
        this.b = str;
        this.g = jraVar;
    }
}
