package defpackage;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class k25 implements jac {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public k25(Object obj, Object obj2, Object obj3, boolean z, byte b) {
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
                y25 y25Var = (y25) this.d;
                jac jacVar = (jac) this.e;
                boolean z = this.b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge == null) {
                    y25Var.close();
                    if (tL_error == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = tL_error.text;
                    }
                    jacVar.a(null, str);
                    return;
                }
                int currentTime = ConnectionsManager.getInstance(cVar.a).getCurrentTime();
                StringBuilder sb = new StringBuilder("received proof challenge, expires at ");
                ts2.v(sb, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                sb.append(proofchallenge.expires - currentTime);
                sb.append("s");
                c.O(sb.toString());
                Utilities.d.c(new m25(cVar, z, y25Var, proofchallenge, currentTime, jacVar));
                return;
            default:
                w45 w45Var = (w45) this.c;
                iu iuVar = (iu) this.d;
                s45 s45Var = (s45) this.e;
                boolean z2 = this.b;
                y25 y25Var2 = (y25) obj;
                String str2 = (String) obj2;
                if (y25Var2 != null && str2 == null) {
                    y25 b = y25Var2.b();
                    u35 u35Var = new u35(b, iuVar, (byte) 2);
                    String str3 = s45Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = s45Var.a;
                    if ("sendTransaction".equals(str3) && oc7.r1(w45Var.a).X3.contains(w45.k(tonconnectsession.id, s45Var.b).concat(".transfer"))) {
                        w45Var.B(s45Var, b, u35Var);
                        return;
                    }
                    m45 m45Var = new m45(w45Var, s45Var, u35Var, z2, b);
                    if (tonconnectsession.closed) {
                        m45Var.a(null);
                        return;
                    }
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.id;
                    tonconnectregisterkey.client_id = tonconnectsession.client_id;
                    w45Var.f.sendRequestTyped(tonconnectregisterkey, new kc((byte) 0), new nv0(u35Var, b, s45Var, m45Var, (byte) 8));
                    return;
                }
                if (str2 == null) {
                    str2 = "Recovery phrase is unavailable";
                }
                iuVar.a(str2);
                return;
        }
    }
}
