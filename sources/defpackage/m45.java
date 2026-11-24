package defpackage;

import java.util.Arrays;
import org.telegram.tgnet.tl.TL_wallet;
public final class m45 implements qac {
    public final byte a = 0;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public m45(w45 w45Var, s45 s45Var, u35 u35Var, boolean z, y25 y25Var) {
        this.c = w45Var;
        this.d = s45Var;
        this.e = u35Var;
        this.b = z;
        this.f = y25Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                w45 w45Var = (w45) obj5;
                s45 s45Var = (s45) obj4;
                u35 u35Var = (u35) obj3;
                y25 y25Var = (y25) obj2;
                byte[] bArr = (byte[]) obj;
                if (!w45Var.i(s45Var) && w45Var.A(s45Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = s45Var.a.id;
                    tonconnectclaimrequest.msg_id = s45Var.b;
                    tonconnectclaimrequest.app_request_id = s45Var.d;
                    boolean z = this.b;
                    tonconnectclaimrequest.declined = z;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    w45Var.f.sendRequestTyped(tonconnectclaimrequest, new kc((byte) 0), new n45(w45Var, bArr, s45Var, u35Var, z, y25Var));
                    return;
                }
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                u35Var.a("Request expired or wallet changed");
                return;
            default:
                wsa wsaVar = (wsa) obj5;
                k11 k11Var = (k11) obj4;
                Runnable runnable = (Runnable) obj3;
                he heVar = (he) obj2;
                if (((Boolean) obj).booleanValue()) {
                    z8c h = z8c.h(wsaVar.a);
                    h.y = null;
                    h.u(false);
                    wsaVar.Z1(this.b, k11Var, runnable);
                    return;
                }
                k11Var.c(false);
                heVar.dismiss();
                runnable.run();
                return;
        }
    }

    public m45(wsa wsaVar, boolean z, k11 k11Var, Runnable runnable, he heVar) {
        this.c = wsaVar;
        this.b = z;
        this.d = k11Var;
        this.e = runnable;
        this.f = heVar;
    }
}
