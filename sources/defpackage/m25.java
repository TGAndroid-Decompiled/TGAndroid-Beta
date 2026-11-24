package defpackage;

import java.util.Arrays;
import org.telegram.tgnet.tl.TL_wallet;
public final class m25 implements p8c {
    public final byte a = 1;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public m25(w25 w25Var, s25 s25Var, x15 x15Var, boolean z, y05 y05Var) {
        this.c = w25Var;
        this.d = s25Var;
        this.e = x15Var;
        this.b = z;
        this.f = y05Var;
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
                w25 w25Var = (w25) obj5;
                s25 s25Var = (s25) obj4;
                x15 x15Var = (x15) obj3;
                y05 y05Var = (y05) obj2;
                byte[] bArr = (byte[]) obj;
                if (!w25Var.i(s25Var) && w25Var.A(s25Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = s25Var.a.id;
                    tonconnectclaimrequest.msg_id = s25Var.b;
                    tonconnectclaimrequest.app_request_id = s25Var.d;
                    boolean z = this.b;
                    tonconnectclaimrequest.declined = z;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    w25Var.f.sendRequestTyped(tonconnectclaimrequest, new hc((byte) 0), new n25(w25Var, bArr, s25Var, x15Var, z, y05Var));
                    return;
                }
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                x15Var.a("Request expired or wallet changed");
                return;
            default:
                vqa vqaVar = (vqa) obj5;
                c01 c01Var = (c01) obj4;
                Runnable runnable = (Runnable) obj3;
                hd hdVar = (hd) obj2;
                if (((Boolean) obj).booleanValue()) {
                    y6c h = y6c.h(vqaVar.a);
                    h.y = null;
                    h.u(false);
                    vqaVar.Z1(this.b, c01Var, runnable);
                    return;
                }
                c01Var.c(false);
                hdVar.dismiss();
                runnable.run();
                return;
        }
    }

    public m25(vqa vqaVar, boolean z, c01 c01Var, Runnable runnable, hd hdVar) {
        this.c = vqaVar;
        this.b = z;
        this.d = c01Var;
        this.e = runnable;
        this.f = hdVar;
    }
}
