package bi;

import android.content.Context;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lc;
public final class s4 implements q10 {
    public final int f4055a = 1;
    public final int f4056b;
    public final String f4057c;
    public final Object d;
    public final Object f4058e;
    public final Object f4059f;
    public final Object f4060g;

    public s4(int i7, org.telegram.ui.Wallet.u0 u0Var, org.telegram.ui.Wallet.d3 d3Var, org.telegram.ui.Wallet.y2 y2Var, String str, byte[] bArr, byte[] bArr2, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f4056b = i7;
        this.d = u0Var;
        this.f4058e = y2Var;
        this.f4057c = str;
        this.f4059f = bArr;
        this.f4060g = bArr2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10 = this.f4055a;
        Object obj3 = this.f4060g;
        Object obj4 = this.f4059f;
        Object obj5 = this.f4058e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj6;
                Context context = (Context) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                di.k1 k1Var = (di.k1) obj3;
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) obj;
                Boolean bool = (Boolean) obj2;
                p0Var.h = new TL_wallet.walletOnchainGiftActionDelist();
                p0Var.f44737i = tL_starGiftUnique;
                int i11 = this.f4056b;
                o3 o3Var = new o3(i11, context, tL_starGiftUnique, i6Var);
                String str = this.f4057c;
                String a02 = gd.a0(null, null, 2131749870, str);
                if (bool.booleanValue()) {
                    i7 = 2131749513;
                } else {
                    i7 = 2131749514;
                }
                o3Var.k1(gd.M0(i7, null), a02);
                o3Var.Z1.e(gd.M0(2131749540, null), v4.i(p0Var.f44732b), null, null);
                o3Var.d2.i(gd.M0(2131750416, null), false, true);
                o3Var.f3940q2 = 2131749615;
                o3Var.j1(p0Var);
                o3Var.i1(new u4(k1Var, tL_starGiftUnique, str, i11, 0), new ai.v1(3, tL_starGiftUnique, str), new h4(context, i11, i6Var, o3Var, bool, 0));
                o3Var.show();
                return;
            default:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj6;
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj5;
                byte[] bArr = (byte[]) obj4;
                byte[] bArr2 = (byte[]) obj3;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                String str2 = (String) obj2;
                if (!y2Var.f45302e || y2Var.d) {
                    if (sendtransfer == null) {
                        if (str2 == null) {
                            str2 = gd.M0(2131742728, null);
                        }
                        lc.c0(str2);
                        y2Var.d = false;
                        if (!y2Var.f45303f) {
                            y2Var.f45303f = true;
                            y2Var.f45300b.a();
                        }
                        if (!y2Var.f45302e) {
                            y2Var.f45299a.dismiss();
                            return;
                        }
                        return;
                    }
                    int i12 = this.f4056b;
                    ConnectionsManager.getInstance(i12).sendRequestTyped(sendtransfer, new d3.b(1), new j4(i12, u0Var, this.f4057c, bArr, bArr2, sendtransfer, y2Var));
                    return;
                }
                return;
        }
    }

    public s4(TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, String str, di.k1 k1Var) {
        this.d = tL_starGiftUnique;
        this.f4058e = context;
        this.f4056b = i7;
        this.f4059f = i6Var;
        this.f4057c = str;
        this.f4060g = k1Var;
    }
}
