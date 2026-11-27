package defpackage;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class o25 implements icc {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public o25(Object obj, Object obj2, Object obj3, boolean z, byte b) {
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
                c35 c35Var = (c35) this.d;
                icc iccVar = (icc) this.e;
                boolean z = this.b;
                TL_wallet.proofChallenge proofchallenge = (TL_wallet.proofChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (proofchallenge == null) {
                    c35Var.close();
                    if (tL_error == null) {
                        str = "NULL_ERROR";
                    } else {
                        str = tL_error.text;
                    }
                    iccVar.a(null, str);
                    return;
                }
                int currentTime = ConnectionsManager.getInstance(cVar.a).getCurrentTime();
                StringBuilder sb = new StringBuilder("received proof challenge, expires at ");
                bs2.w(sb, proofchallenge.expires, ", now = ", currentTime, ", expires in ");
                sb.append(proofchallenge.expires - currentTime);
                sb.append("s");
                c.P(sb.toString());
                Utilities.d.c(new q25(cVar, z, c35Var, proofchallenge, currentTime, iccVar));
                return;
            default:
                a55 a55Var = (a55) this.c;
                gt gtVar = (gt) this.d;
                w45 w45Var = (w45) this.e;
                boolean z2 = this.b;
                c35 c35Var2 = (c35) obj;
                String str2 = (String) obj2;
                if (c35Var2 != null && str2 == null) {
                    c35 b = c35Var2.b();
                    v35 v35Var = new v35(b, gtVar, (byte) 4);
                    String str3 = w45Var.e;
                    TL_wallet.tonConnectSession tonconnectsession = w45Var.a;
                    if ("sendTransaction".equals(str3) && uc7.s1(a55Var.a).Y3.contains(a55.k(tonconnectsession.id, w45Var.b).concat(".transfer"))) {
                        a55Var.B(w45Var, b, v35Var);
                        return;
                    }
                    s45 s45Var = new s45(a55Var, w45Var, v35Var, z2, b);
                    if (tonconnectsession.closed) {
                        s45Var.a(null);
                        return;
                    }
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.id;
                    tonconnectregisterkey.client_id = tonconnectsession.client_id;
                    a55Var.f.sendRequestTyped(tonconnectregisterkey, new ic((byte) 0), new nu0(v35Var, b, w45Var, s45Var, (byte) 10));
                    return;
                }
                if (str2 == null) {
                    str2 = "Recovery phrase is unavailable";
                }
                gtVar.a(str2);
                return;
        }
    }
}
