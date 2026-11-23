package bi;

import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kc;
public final class z3 implements p10 {
    public final int f4284a = 2;
    public final Object f4285b;
    public final int f4286c;
    public final Object d;
    public final String f4287e;
    public final Object f4288f;
    public final Object f4289g;

    public z3(int i7, org.telegram.ui.Wallet.v0 v0Var, org.telegram.ui.Wallet.e3 e3Var, org.telegram.ui.Wallet.z2 z2Var, String str, byte[] bArr, byte[] bArr2, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f4286c = i7;
        this.f4288f = v0Var;
        this.f4285b = z2Var;
        this.f4287e = str;
        this.d = bArr;
        this.f4289g = bArr2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10 = this.f4284a;
        Object obj3 = this.f4289g;
        Object obj4 = this.d;
        Object obj5 = this.f4285b;
        Object obj6 = this.f4288f;
        switch (i10) {
            case 0:
                Runnable runnable = (Runnable) obj6;
                Context context = (Context) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                kc kcVar = (kc) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                HashMap hashMap = l4.f3803c;
                String str = this.f4287e;
                int i11 = this.f4286c;
                if (updates != null) {
                    hashMap.put(str, Long.valueOf(SystemClock.elapsedRealtime() + 60000));
                    l4.c();
                    mp.u1(i11).V3(updates, false);
                    if (runnable != null) {
                        runnable.run();
                    }
                    fc Q = l4.h().Q(2131623990, 36, gd.N0(2131749601, null));
                    Q.f35101t = true;
                    Q.j();
                    return;
                }
                hashMap.remove(str);
                l4.c();
                a5.r(context, i11, i6Var, kcVar, tL_error, null);
                return;
            case 1:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj6;
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj4;
                di.k1 k1Var = (di.k1) obj3;
                org.telegram.ui.Wallet.q0 q0Var = (org.telegram.ui.Wallet.q0) obj;
                Boolean bool = (Boolean) obj2;
                q0Var.h = new TL_wallet.walletOnchainGiftActionDelist();
                q0Var.f44909i = tL_starGiftUnique;
                int i12 = this.f4286c;
                u3 u3Var = new u3(i12, context2, tL_starGiftUnique, i6Var2);
                String str2 = this.f4287e;
                String a02 = gd.a0(null, null, 2131749869, str2);
                if (bool.booleanValue()) {
                    i7 = 2131749512;
                } else {
                    i7 = 2131749513;
                }
                u3Var.k1(gd.N0(i7, null), a02);
                u3Var.Z1.e(gd.N0(2131749539, null), a5.i(q0Var.f44904b), null, null);
                u3Var.d2.i(gd.N0(2131750415, null), false, true);
                u3Var.f4112q2 = 2131749614;
                u3Var.j1(q0Var);
                u3Var.i1(new ai.x0(k1Var, tL_starGiftUnique, str2, i12, 1), new ai.s1(3, tL_starGiftUnique, str2), new n4(context2, i12, i6Var2, u3Var, bool, 0));
                u3Var.show();
                return;
            default:
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) obj6;
                org.telegram.ui.Wallet.z2 z2Var = (org.telegram.ui.Wallet.z2) obj5;
                byte[] bArr = (byte[]) obj4;
                byte[] bArr2 = (byte[]) obj3;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                String str3 = (String) obj2;
                if (!z2Var.f45474e || z2Var.d) {
                    if (sendtransfer == null) {
                        if (str3 == null) {
                            str3 = gd.N0(2131742715, null);
                        }
                        kc.c0(str3);
                        z2Var.d = false;
                        if (!z2Var.f45475f) {
                            z2Var.f45475f = true;
                            z2Var.f45472b.a();
                        }
                        if (!z2Var.f45474e) {
                            z2Var.f45471a.dismiss();
                            return;
                        }
                        return;
                    }
                    int i13 = this.f4286c;
                    ConnectionsManager.getInstance(i13).sendRequestTyped(sendtransfer, new d3.b(1), new p4(i13, v0Var, this.f4287e, bArr, bArr2, sendtransfer, z2Var));
                    return;
                }
                return;
        }
    }

    public z3(String str, int i7, Runnable runnable, Context context, org.telegram.ui.ActionBar.i6 i6Var, kc kcVar) {
        this.f4287e = str;
        this.f4286c = i7;
        this.f4288f = runnable;
        this.f4285b = context;
        this.d = i6Var;
        this.f4289g = kcVar;
    }

    public z3(TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, String str, di.k1 k1Var) {
        this.f4288f = tL_starGiftUnique;
        this.f4285b = context;
        this.f4286c = i7;
        this.d = i6Var;
        this.f4287e = str;
        this.f4289g = k1Var;
    }
}
