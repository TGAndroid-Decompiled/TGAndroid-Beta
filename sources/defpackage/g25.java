package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class g25 implements i8c {
    public final byte a;
    public final w25 b;
    public final long c;
    public final int d;
    public final Object e;

    public g25(w25 w25Var, Object obj, long j, int i, byte b) {
        this.a = b;
        this.b = w25Var;
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
                final u15 u15Var = (u15) obj3;
                final TL_wallet.tonConnectPending tonconnectpending = (TL_wallet.tonConnectPending) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                final w25 w25Var = this.b;
                c cVar = w25Var.b;
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
                    if (tonconnectrequest != null && (tonconnectsession = tonconnectpending.session) != null && tonconnectsession.id == j && tonconnectrequest.expires > w25Var.f.getCurrentTime()) {
                        final String x = cVar.x();
                        if (cVar.D() != null) {
                            bArr = (byte[]) cVar.D().clone();
                        }
                        final byte[] bArr2 = bArr;
                        cVar.E(true, false, false, new i8c() {
                            @Override
                            public final void a(Object obj4, Object obj5) {
                                w25 w25Var2 = w25.this;
                                u15 u15Var2 = u15Var;
                                TL_wallet.tonConnectPending tonconnectpending2 = tonconnectpending;
                                TL_wallet.tonConnectRequest tonconnectrequest4 = tonconnectrequest;
                                String str = x;
                                byte[] bArr3 = bArr2;
                                long j2 = j;
                                int i3 = i;
                                y05 y05Var = (y05) obj4;
                                String str2 = (String) obj5;
                                w25Var2.getClass();
                                if (y05Var != null && str2 == null) {
                                    y05 b2 = y05Var.b();
                                    Utilities.e.c(new vr0(w25Var2, tonconnectpending2, tonconnectrequest4, b2, str, bArr3, new ae2(b2, u15Var2, (byte) 23), j2, i3));
                                    return;
                                }
                                w25Var2.h = false;
                                if (str2 == null) {
                                    str2 = "Recovery phrase is unavailable";
                                }
                                u15Var2.a(null, str2);
                            }
                        });
                        return;
                    }
                    w25Var.h = false;
                    u15Var.a(null, "This request has expired or has already been answered");
                    return;
                }
                w25Var.h = false;
                u15Var.a(null, w25.z(tL_error, "getPending"));
                return;
            default:
                p8c p8cVar = (p8c) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    this.b.d(this.d, this.c, p8cVar);
                    return;
                } else {
                    p8cVar.a(w25.z(tL_error2, "closeSession"));
                    return;
                }
        }
    }
}
