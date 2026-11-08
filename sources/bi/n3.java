package bi;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_wallet;
public final class n3 implements c20 {
    public final int f4396a = 0;
    public final boolean f4397b;
    public final Object f4398c;
    public final Object d;
    public final Object f4399e;
    public final Object f4400f;

    public n3(k7 k7Var, boolean z9, vf.b bVar, Runnable runnable, DialogInterface dialogInterface) {
        this.f4398c = k7Var;
        this.f4397b = z9;
        this.d = bVar;
        this.f4399e = runnable;
        this.f4400f = dialogInterface;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f4396a) {
            case 0:
                k7 k7Var = (k7) this.f4398c;
                vf.b bVar = (vf.b) this.d;
                Runnable runnable = (Runnable) this.f4399e;
                DialogInterface dialogInterface = (DialogInterface) this.f4400f;
                if (((Boolean) obj).booleanValue()) {
                    p10 i7 = p10.i(k7Var.f28616a);
                    i7.f24499y = null;
                    i7.v(false);
                    k7Var.V1(this.f4397b, bVar, runnable);
                    return;
                }
                bVar.c(false);
                dialogInterface.dismiss();
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.f4398c;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.d;
                org.telegram.ui.Wallet.t tVar = (org.telegram.ui.Wallet.t) this.f4399e;
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.f4400f;
                byte[] bArr = (byte[]) obj;
                if (!e2Var.j(a2Var) && e2Var.A(a2Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = a2Var.f42093a.f27218id;
                    tonconnectclaimrequest.msg_id = a2Var.f42094b;
                    tonconnectclaimrequest.app_request_id = a2Var.d;
                    boolean z9 = this.f4397b;
                    tonconnectclaimrequest.declined = z9;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    e2Var.f42431f.sendRequestTyped(tonconnectclaimrequest, new d3.b(1), new org.telegram.ui.Wallet.v1(e2Var, bArr, a2Var, tVar, z9, j0Var));
                    return;
                }
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                tVar.a("Request expired or wallet changed");
                return;
        }
    }

    public n3(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.a2 a2Var, org.telegram.ui.Wallet.t tVar, boolean z9, org.telegram.ui.Wallet.j0 j0Var) {
        this.f4398c = e2Var;
        this.d = a2Var;
        this.f4399e = tVar;
        this.f4397b = z9;
        this.f4400f = j0Var;
    }
}
