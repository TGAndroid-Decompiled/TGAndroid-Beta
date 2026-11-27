package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class p45 implements icc {
    public final byte a;
    public final a55 b;
    public final long c;
    public final int d;
    public final Object e;

    public p45(a55 a55Var, Object obj, long j, int i, byte b) {
        this.a = b;
        this.b = a55Var;
        this.e = obj;
        this.c = j;
        this.d = i;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        final long j;
        final int i;
        final TL_wallet.tonConnectRequest tonconnectrequest;
        TL_wallet.tonConnectSession tonconnectsession;
        byte b = this.a;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                final g45 g45Var = (g45) obj3;
                final TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                final a55 a55Var = this.b;
                c cVar = a55Var.b;
                byte[] bArr = null;
                if (tL_error == null && tonconnectpending != null) {
                    ArrayList<TL_wallet.tonConnectRequest> arrayList = tonconnectpending.requests;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (true) {
                        j = this.c;
                        i = this.d;
                        if (i2 < size) {
                            TL_wallet.tonConnectRequest tonconnectrequest2 = arrayList.get(i2);
                            i2++;
                            TL_wallet.tonConnectRequest tonconnectrequest3 = tonconnectrequest2;
                            if (tonconnectrequest3.session_id == j && tonconnectrequest3.msg_id == i) {
                                tonconnectrequest = tonconnectrequest3;
                            }
                        } else {
                            tonconnectrequest = null;
                        }
                    }
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.id == j && tonconnectrequest.expires > a55Var.f.getCurrentTime()) {
                        final String x = cVar.x();
                        if (cVar.D() != null) {
                            bArr = (byte[]) cVar.D().clone();
                        }
                        final byte[] bArr2 = bArr;
                        cVar.E(true, false, false, new icc() {
                            @Override
                            public final void a(Object obj4, Object obj5) {
                                a55 a55Var2 = a55.this;
                                g45 g45Var2 = g45Var;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = x;
                                byte[] bArr3 = bArr2;
                                long j2 = j;
                                int i3 = i;
                                c35 c35Var = (c35) obj4;
                                String str2 = (String) obj5;
                                a55Var2.getClass();
                                if (c35Var != null && str2 == null) {
                                    c35 b2 = c35Var.b();
                                    Utilities.e.c(new ds0(a55Var2, tonconnectpending2, tonconnectrequest4, b2, str, bArr3, new qe2(b2, g45Var2, (byte) 24), j2, i3));
                                    return;
                                }
                                a55Var2.h = false;
                                if (str2 == null) {
                                    str2 = "Recovery phrase is unavailable";
                                }
                                g45Var2.a(null, str2);
                            }
                        });
                        return;
                    }
                    a55Var.h = false;
                    g45Var.a(null, "This request has expired or has already been answered");
                    return;
                }
                a55Var.h = false;
                g45Var.a(null, a55.z(tL_error, "getPending"));
                return;
            default:
                pcc pccVar = (pcc) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    this.b.d(this.d, this.c, pccVar);
                    return;
                } else {
                    pccVar.a(a55.z(tL_error2, "closeSession"));
                    return;
                }
        }
    }
}
