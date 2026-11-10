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
                    p10 i7 = p10.i(k7Var.f28669a);
                    i7.f24503y = null;
                    i7.v(false);
                    k7Var.U1(this.f4397b, bVar, runnable);
                    return;
                }
                bVar.c(false);
                dialogInterface.dismiss();
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.f4398c;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.d;
                org.telegram.ui.Wallet.s sVar = (org.telegram.ui.Wallet.s) this.f4399e;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.f4400f;
                byte[] bArr = (byte[]) obj;
                if (!d2Var.j(z1Var) && d2Var.A(z1Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = z1Var.f43412a.f27222id;
                    tonconnectclaimrequest.msg_id = z1Var.f43413b;
                    tonconnectclaimrequest.app_request_id = z1Var.d;
                    boolean z9 = this.f4397b;
                    tonconnectclaimrequest.declined = z9;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    d2Var.f42290f.sendRequestTyped(tonconnectclaimrequest, new d3.b(1), new org.telegram.ui.Wallet.u1(d2Var, bArr, z1Var, sVar, z9, i0Var));
                    return;
                }
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                sVar.a("Request expired or wallet changed");
                return;
        }
    }

    public n3(org.telegram.ui.Wallet.d2 d2Var, org.telegram.ui.Wallet.z1 z1Var, org.telegram.ui.Wallet.s sVar, boolean z9, org.telegram.ui.Wallet.i0 i0Var) {
        this.f4398c = d2Var;
        this.d = z1Var;
        this.f4399e = sVar;
        this.f4397b = z9;
        this.f4400f = i0Var;
    }
}
