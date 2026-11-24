package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class g45 implements jac {
    public final byte a;
    public final w45 b;
    public final long c;
    public final int d;
    public final Object e;

    public g45(w45 w45Var, Object obj, long j, int i, byte b) {
        this.a = b;
        this.b = w45Var;
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
                final v35 v35Var = (v35) obj3;
                final TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                final w45 w45Var = this.b;
                c cVar = w45Var.b;
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
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.id == j && tonconnectrequest.expires > w45Var.f.getCurrentTime()) {
                        final String x = cVar.x();
                        if (cVar.D() != null) {
                            bArr = (byte[]) cVar.D().clone();
                        }
                        final byte[] bArr2 = bArr;
                        cVar.E(true, false, false, new jac() {
                            @Override
                            public final void a(Object obj4, Object obj5) {
                                w45 w45Var2 = w45.this;
                                v35 v35Var2 = v35Var;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = x;
                                byte[] bArr3 = bArr2;
                                long j2 = j;
                                int i3 = i;
                                y25 y25Var = (y25) obj4;
                                String str2 = (String) obj5;
                                w45Var2.getClass();
                                if (y25Var != null && str2 == null) {
                                    y25 b2 = y25Var.b();
                                    Utilities.e.c(new dt0(w45Var2, tonconnectpending2, tonconnectrequest4, b2, str, bArr3, new lf2(b2, v35Var2, (byte) 25), j2, i3));
                                    return;
                                }
                                w45Var2.h = false;
                                if (str2 == null) {
                                    str2 = "Recovery phrase is unavailable";
                                }
                                v35Var2.a(null, str2);
                            }
                        });
                        return;
                    }
                    w45Var.h = false;
                    v35Var.a(null, "This request has expired or has already been answered");
                    return;
                }
                w45Var.h = false;
                v35Var.a(null, w45.z(tL_error, "getPending"));
                return;
            default:
                qac qacVar = (qac) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    this.b.d(this.d, this.c, qacVar);
                    return;
                } else {
                    qacVar.a(w45.z(tL_error2, "closeSession"));
                    return;
                }
        }
    }
}
