package di;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.j10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.p51;
public final class x2 implements x10 {
    public final int f9989a = 0;
    public final boolean f9990b;
    public final Object f9991c;
    public final Object d;
    public final Object f9992e;
    public final Object f9993f;

    public x2(f6 f6Var, boolean z10, vf.b bVar, Runnable runnable, DialogInterface dialogInterface) {
        this.f9991c = f6Var;
        this.f9990b = z10;
        this.d = bVar;
        this.f9992e = runnable;
        this.f9993f = dialogInterface;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f9989a) {
            case 0:
                f6 f6Var = (f6) this.f9991c;
                vf.b bVar = (vf.b) this.d;
                Runnable runnable = (Runnable) this.f9992e;
                DialogInterface dialogInterface = (DialogInterface) this.f9993f;
                if (((Boolean) obj).booleanValue()) {
                    j10 i7 = j10.i(f6Var.f30189a);
                    i7.f24803y = null;
                    i7.v(false);
                    f6Var.i2(this.f9990b, bVar, runnable);
                    return;
                }
                bVar.c(false);
                dialogInterface.dismiss();
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.f9991c;
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) this.d;
                p51 p51Var = (p51) this.f9992e;
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.f9993f;
                byte[] bArr = (byte[]) obj;
                if (!l2Var.j(h2Var) && l2Var.A(h2Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = h2Var.f44289a.f28667id;
                    tonconnectclaimrequest.msg_id = h2Var.f44290b;
                    tonconnectclaimrequest.app_request_id = h2Var.d;
                    boolean z10 = this.f9990b;
                    tonconnectclaimrequest.declined = z10;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    l2Var.f44483f.sendRequestTyped(tonconnectclaimrequest, new d3.b(1), new org.telegram.ui.Wallet.c2(l2Var, bArr, h2Var, p51Var, z10, r0Var));
                    return;
                }
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                p51Var.a("Request expired or wallet changed");
                return;
        }
    }

    public x2(org.telegram.ui.Wallet.l2 l2Var, org.telegram.ui.Wallet.h2 h2Var, p51 p51Var, boolean z10, org.telegram.ui.Wallet.r0 r0Var) {
        this.f9991c = l2Var;
        this.d = h2Var;
        this.f9992e = p51Var;
        this.f9990b = z10;
        this.f9993f = r0Var;
    }
}
