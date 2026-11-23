package di;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.k10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.p51;
public final class x2 implements y10 {
    public final int f10024a = 0;
    public final boolean f10025b;
    public final Object f10026c;
    public final Object d;
    public final Object f10027e;
    public final Object f10028f;

    public x2(f6 f6Var, boolean z10, vf.b bVar, Runnable runnable, DialogInterface dialogInterface) {
        this.f10026c = f6Var;
        this.f10025b = z10;
        this.d = bVar;
        this.f10027e = runnable;
        this.f10028f = dialogInterface;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f10024a) {
            case 0:
                f6 f6Var = (f6) this.f10026c;
                vf.b bVar = (vf.b) this.d;
                Runnable runnable = (Runnable) this.f10027e;
                DialogInterface dialogInterface = (DialogInterface) this.f10028f;
                if (((Boolean) obj).booleanValue()) {
                    k10 i7 = k10.i(f6Var.f30173a);
                    i7.f24998y = null;
                    i7.v(false);
                    f6Var.i2(this.f10025b, bVar, runnable);
                    return;
                }
                bVar.c(false);
                dialogInterface.dismiss();
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.f10026c;
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) this.d;
                p51 p51Var = (p51) this.f10027e;
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.f10028f;
                byte[] bArr = (byte[]) obj;
                if (!l2Var.j(h2Var) && l2Var.A(h2Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = h2Var.f44333a.f28696id;
                    tonconnectclaimrequest.msg_id = h2Var.f44334b;
                    tonconnectclaimrequest.app_request_id = h2Var.d;
                    boolean z10 = this.f10025b;
                    tonconnectclaimrequest.declined = z10;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    l2Var.f44527f.sendRequestTyped(tonconnectclaimrequest, new d3.b(1), new org.telegram.ui.Wallet.c2(l2Var, bArr, h2Var, p51Var, z10, r0Var));
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
        this.f10026c = l2Var;
        this.d = h2Var;
        this.f10027e = p51Var;
        this.f10025b = z10;
        this.f10028f = r0Var;
    }
}
