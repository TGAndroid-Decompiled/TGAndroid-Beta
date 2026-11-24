package defpackage;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class k05 implements i8c {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public k05(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        switch (this.a) {
            case 0:
                c cVar = (c) this.c;
                y05 y05Var = (y05) this.d;
                i8c i8cVar = (i8c) this.e;
                boolean z = this.b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge == null) {
                    y05Var.close();
                    if (tL_error == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = tL_error.text;
                    }
                    i8cVar.a(null, str);
                    return;
                }
                int currentTime = ConnectionsManager.getInstance(cVar.a).getCurrentTime();
                StringBuilder sb = new StringBuilder("received proof challenge, expires at ");
                ir2.w(sb, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                sb.append(proofchallenge.expires - currentTime);
                sb.append("s");
                c.O(sb.toString());
                Utilities.d.c(new m05(cVar, z, y05Var, proofchallenge, currentTime, i8cVar));
                return;
            default:
                w25 w25Var = (w25) this.c;
                ht htVar = (ht) this.d;
                s25 s25Var = (s25) this.e;
                boolean z2 = this.b;
                y05 y05Var2 = (y05) obj;
                String str2 = (String) obj2;
                if (y05Var2 != null && str2 == null) {
                    y05 b = y05Var2.b();
                    x15 x15Var = new x15(b, htVar, (byte) 1);
                    String str3 = s25Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = s25Var.a;
                    if ("sendTransaction".equals(str3) && na7.q1(w25Var.a).X3.contains(w25.k(tonconnectsession.id, s25Var.b).concat(".transfer"))) {
                        w25Var.B(s25Var, b, x15Var);
                        return;
                    }
                    m25 m25Var = new m25(w25Var, s25Var, x15Var, z2, b);
                    if (tonconnectsession.closed) {
                        m25Var.a(null);
                        return;
                    }
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.id;
                    tonconnectregisterkey.client_id = tonconnectsession.client_id;
                    w25Var.f.sendRequestTyped(tonconnectregisterkey, new hc((byte) 0), new eu0(x15Var, b, s25Var, m25Var, (byte) 8));
                    return;
                }
                if (str2 == null) {
                    str2 = "Recovery phrase is unavailable";
                }
                htVar.a(str2);
                return;
        }
    }
}
