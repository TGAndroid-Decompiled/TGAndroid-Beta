package bi;

import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
public final class t3 implements q10 {
    public final int f4050a = 2;
    public final Object f4051b;
    public final int f4052c;
    public final Object d;
    public final String f4053e;
    public final Object f4054f;
    public final Object f4055g;

    public t3(int i7, org.telegram.ui.Wallet.u0 u0Var, org.telegram.ui.Wallet.d3 d3Var, org.telegram.ui.Wallet.y2 y2Var, String str, byte[] bArr, byte[] bArr2, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f4052c = i7;
        this.f4054f = u0Var;
        this.f4051b = y2Var;
        this.f4053e = str;
        this.d = bArr;
        this.f4055g = bArr2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10 = this.f4050a;
        Object obj3 = this.f4055g;
        Object obj4 = this.d;
        Object obj5 = this.f4051b;
        Object obj6 = this.f4054f;
        switch (i10) {
            case 0:
                Runnable runnable = (Runnable) obj6;
                Context context = (Context) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                lc lcVar = (lc) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                HashMap hashMap = e4.f3545c;
                String str = this.f4053e;
                int i11 = this.f4052c;
                if (updates != null) {
                    hashMap.put(str, Long.valueOf(SystemClock.elapsedRealtime() + 60000));
                    e4.c();
                    mp.u1(i11).V3(updates, false);
                    if (runnable != null) {
                        runnable.run();
                    }
                    gc Q = e4.h().Q(2131623990, 36, gd.M0(2131749602, null));
                    Q.f35471t = true;
                    Q.j();
                    return;
                }
                hashMap.remove(str);
                e4.c();
                u4.r(context, i11, i6Var, lcVar, tL_error, null);
                return;
            case 1:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj6;
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj4;
                di.k1 k1Var = (di.k1) obj3;
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) obj;
                Boolean bool = (Boolean) obj2;
                p0Var.h = new TL_wallet.walletOnchainGiftActionDelist();
                p0Var.f44737i = tL_starGiftUnique;
                int i12 = this.f4052c;
                o3 o3Var = new o3(i12, context2, tL_starGiftUnique, i6Var2);
                String str2 = this.f4053e;
                String a02 = gd.a0(null, null, 2131749870, str2);
                if (bool.booleanValue()) {
                    i7 = 2131749513;
                } else {
                    i7 = 2131749514;
                }
                o3Var.k1(gd.M0(i7, null), a02);
                o3Var.Z1.e(gd.M0(2131749540, null), u4.i(p0Var.f44732b), null, null);
                o3Var.d2.i(gd.M0(2131750416, null), false, true);
                o3Var.f3906q2 = 2131749615;
                o3Var.j1(p0Var);
                o3Var.i1(new t4(k1Var, tL_starGiftUnique, str2, i12, 0), new ai.v1(3, tL_starGiftUnique, str2), new g4(context2, i12, i6Var2, o3Var, bool, 0));
                o3Var.show();
                return;
            default:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj6;
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj5;
                byte[] bArr = (byte[]) obj4;
                byte[] bArr2 = (byte[]) obj3;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                String str3 = (String) obj2;
                if (!y2Var.f45302e || y2Var.d) {
                    if (sendtransfer == null) {
                        if (str3 == null) {
                            str3 = gd.M0(2131742728, null);
                        }
                        lc.c0(str3);
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
                    int i13 = this.f4052c;
                    ConnectionsManager.getInstance(i13).sendRequestTyped(sendtransfer, new d3.b(1), new i4(i13, u0Var, this.f4053e, bArr, bArr2, sendtransfer, y2Var));
                    return;
                }
                return;
        }
    }

    public t3(String str, int i7, Runnable runnable, Context context, org.telegram.ui.ActionBar.i6 i6Var, lc lcVar) {
        this.f4053e = str;
        this.f4052c = i7;
        this.f4054f = runnable;
        this.f4051b = context;
        this.d = i6Var;
        this.f4055g = lcVar;
    }

    public t3(TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, String str, di.k1 k1Var) {
        this.f4054f = tL_starGiftUnique;
        this.f4051b = context;
        this.f4052c = i7;
        this.d = i6Var;
        this.f4053e = str;
        this.f4055g = k1Var;
    }
}
