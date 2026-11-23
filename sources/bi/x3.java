package bi;

import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
public final class x3 implements r10 {
    public final int f4241a = 2;
    public final Object f4242b;
    public final int f4243c;
    public final Object d;
    public final String f4244e;
    public final Object f4245f;
    public final Object f4246g;

    public x3(int i7, org.telegram.ui.Wallet.u0 u0Var, org.telegram.ui.Wallet.d3 d3Var, org.telegram.ui.Wallet.y2 y2Var, String str, byte[] bArr, byte[] bArr2, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f4243c = i7;
        this.f4245f = u0Var;
        this.f4242b = y2Var;
        this.f4244e = str;
        this.d = bArr;
        this.f4246g = bArr2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10 = this.f4241a;
        Object obj3 = this.f4246g;
        Object obj4 = this.d;
        Object obj5 = this.f4242b;
        Object obj6 = this.f4245f;
        switch (i10) {
            case 0:
                Runnable runnable = (Runnable) obj6;
                Context context = (Context) obj5;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj4;
                lc lcVar = (lc) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                HashMap hashMap = i4.f3727c;
                String str = this.f4244e;
                int i11 = this.f4243c;
                if (updates != null) {
                    hashMap.put(str, Long.valueOf(SystemClock.elapsedRealtime() + 60000));
                    i4.c();
                    np.u1(i11).V3(updates, false);
                    if (runnable != null) {
                        runnable.run();
                    }
                    gc Q = i4.h().Q(2131623990, 36, hd.N0(2131749601, null));
                    Q.f35537t = true;
                    Q.j();
                    return;
                }
                hashMap.remove(str);
                i4.c();
                x4.r(context, i11, h6Var, lcVar, tL_error, null);
                return;
            case 1:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj6;
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj4;
                di.k1 k1Var = (di.k1) obj3;
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) obj;
                Boolean bool = (Boolean) obj2;
                p0Var.h = new TL_wallet.walletOnchainGiftActionDelist();
                p0Var.f44781i = tL_starGiftUnique;
                int i12 = this.f4243c;
                s3 s3Var = new s3(i12, context2, tL_starGiftUnique, h6Var2);
                String str2 = this.f4244e;
                String a02 = hd.a0(null, null, 2131749869, str2);
                if (bool.booleanValue()) {
                    i7 = 2131749512;
                } else {
                    i7 = 2131749513;
                }
                s3Var.k1(hd.N0(i7, null), a02);
                s3Var.Z1.e(hd.N0(2131749539, null), x4.i(p0Var.f44776b), null, null);
                s3Var.d2.i(hd.N0(2131750415, null), false, true);
                s3Var.f4080q2 = 2131749614;
                s3Var.j1(p0Var);
                s3Var.i1(new ai.b1(k1Var, tL_starGiftUnique, str2, i12, 1), new ai.y1(3, tL_starGiftUnique, str2), new k4(context2, i12, h6Var2, s3Var, bool, 0));
                s3Var.show();
                return;
            default:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj6;
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj5;
                byte[] bArr = (byte[]) obj4;
                byte[] bArr2 = (byte[]) obj3;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                String str3 = (String) obj2;
                if (!y2Var.f45346e || y2Var.d) {
                    if (sendtransfer == null) {
                        if (str3 == null) {
                            str3 = hd.N0(2131742720, null);
                        }
                        lc.c0(str3);
                        y2Var.d = false;
                        if (!y2Var.f45347f) {
                            y2Var.f45347f = true;
                            y2Var.f45344b.a();
                        }
                        if (!y2Var.f45346e) {
                            y2Var.f45343a.dismiss();
                            return;
                        }
                        return;
                    }
                    int i13 = this.f4243c;
                    ConnectionsManager.getInstance(i13).sendRequestTyped(sendtransfer, new d3.b(1), new m4(i13, u0Var, this.f4244e, bArr, bArr2, sendtransfer, y2Var));
                    return;
                }
                return;
        }
    }

    public x3(String str, int i7, Runnable runnable, Context context, org.telegram.ui.ActionBar.h6 h6Var, lc lcVar) {
        this.f4244e = str;
        this.f4243c = i7;
        this.f4245f = runnable;
        this.f4242b = context;
        this.d = h6Var;
        this.f4246g = lcVar;
    }

    public x3(TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, String str, di.k1 k1Var) {
        this.f4245f = tL_starGiftUnique;
        this.f4242b = context;
        this.f4243c = i7;
        this.d = h6Var;
        this.f4244e = str;
        this.f4246g = k1Var;
    }
}
