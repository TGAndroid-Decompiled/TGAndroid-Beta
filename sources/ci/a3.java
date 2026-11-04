package ci;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.h10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.e51;
public final class a3 implements u10 {
    public final int f4807a = 0;
    public final boolean f4808b;
    public final Object f4809c;
    public final Object d;
    public final Object f4810e;
    public final Object f4811f;

    public a3(l6 l6Var, boolean z10, sf.b bVar, Runnable runnable, DialogInterface dialogInterface) {
        this.f4809c = l6Var;
        this.f4808b = z10;
        this.d = bVar;
        this.f4810e = runnable;
        this.f4811f = dialogInterface;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f4807a) {
            case 0:
                l6 l6Var = (l6) this.f4809c;
                sf.b bVar = (sf.b) this.d;
                Runnable runnable = (Runnable) this.f4810e;
                DialogInterface dialogInterface = (DialogInterface) this.f4811f;
                if (((Boolean) obj).booleanValue()) {
                    h10 i3 = h10.i(l6Var.f28583a);
                    i3.f22859y = null;
                    i3.v(false);
                    l6Var.V1(this.f4808b, bVar, runnable);
                    return;
                }
                bVar.c(false);
                dialogInterface.dismiss();
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) this.f4809c;
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) this.d;
                e51 e51Var = (e51) this.f4810e;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.f4811f;
                byte[] bArr = (byte[]) obj;
                if (!c2Var.j(y1Var) && c2Var.A(y1Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = y1Var.f43456a.f27264id;
                    tonconnectclaimrequest.msg_id = y1Var.f43457b;
                    tonconnectclaimrequest.app_request_id = y1Var.d;
                    boolean z10 = this.f4808b;
                    tonconnectclaimrequest.declined = z10;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    c2Var.f42381f.sendRequestTyped(tonconnectclaimrequest, new c3.b(1), new org.telegram.ui.Wallet.t1(c2Var, bArr, y1Var, e51Var, z10, h0Var));
                    return;
                }
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                e51Var.a("Request expired or wallet changed");
                return;
        }
    }

    public a3(org.telegram.ui.Wallet.c2 c2Var, org.telegram.ui.Wallet.y1 y1Var, e51 e51Var, boolean z10, org.telegram.ui.Wallet.h0 h0Var) {
        this.f4809c = c2Var;
        this.d = y1Var;
        this.f4810e = e51Var;
        this.f4808b = z10;
        this.f4811f = h0Var;
    }
}
