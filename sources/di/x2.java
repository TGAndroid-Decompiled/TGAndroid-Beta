package di;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.k10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.p51;
public final class x2 implements y10 {
    public final int f9987a = 0;
    public final boolean f9988b;
    public final Object f9989c;
    public final Object d;
    public final Object f9990e;
    public final Object f9991f;

    public x2(f6 f6Var, boolean z10, vf.b bVar, Runnable runnable, DialogInterface dialogInterface) {
        this.f9989c = f6Var;
        this.f9988b = z10;
        this.d = bVar;
        this.f9990e = runnable;
        this.f9991f = dialogInterface;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f9987a) {
            case 0:
                f6 f6Var = (f6) this.f9989c;
                vf.b bVar = (vf.b) this.d;
                Runnable runnable = (Runnable) this.f9990e;
                DialogInterface dialogInterface = (DialogInterface) this.f9991f;
                if (((Boolean) obj).booleanValue()) {
                    k10 i7 = k10.i(f6Var.f30139a);
                    i7.f24962y = null;
                    i7.v(false);
                    f6Var.i2(this.f9988b, bVar, runnable);
                    return;
                }
                bVar.c(false);
                dialogInterface.dismiss();
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.f9989c;
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) this.d;
                p51 p51Var = (p51) this.f9990e;
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.f9991f;
                byte[] bArr = (byte[]) obj;
                if (!l2Var.j(h2Var) && l2Var.A(h2Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = h2Var.f44299a.f28660id;
                    tonconnectclaimrequest.msg_id = h2Var.f44300b;
                    tonconnectclaimrequest.app_request_id = h2Var.d;
                    boolean z10 = this.f9988b;
                    tonconnectclaimrequest.declined = z10;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    l2Var.f44493f.sendRequestTyped(tonconnectclaimrequest, new d3.b(1), new org.telegram.ui.Wallet.c2(l2Var, bArr, h2Var, p51Var, z10, r0Var));
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
        this.f9989c = l2Var;
        this.d = h2Var;
        this.f9990e = p51Var;
        this.f9988b = z10;
        this.f9991f = r0Var;
    }
}
