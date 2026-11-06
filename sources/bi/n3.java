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
                    p10 i7 = p10.i(k7Var.f28612a);
                    i7.f24488y = null;
                    i7.v(false);
                    k7Var.V1(this.f4397b, bVar, runnable);
                    return;
                }
                bVar.c(false);
                dialogInterface.dismiss();
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.f4398c;
                org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.d;
                org.telegram.ui.Wallet.t tVar = (org.telegram.ui.Wallet.t) this.f4399e;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.f4400f;
                byte[] bArr = (byte[]) obj;
                if (!f2Var.j(b2Var) && f2Var.A(b2Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = b2Var.f42097a.f27214id;
                    tonconnectclaimrequest.msg_id = b2Var.f42098b;
                    tonconnectclaimrequest.app_request_id = b2Var.d;
                    boolean z9 = this.f4397b;
                    tonconnectclaimrequest.declined = z9;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    f2Var.f42439f.sendRequestTyped(tonconnectclaimrequest, new d3.b(1), new org.telegram.ui.Wallet.w1(f2Var, bArr, b2Var, tVar, z9, k0Var));
                    return;
                }
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                tVar.a("Request expired or wallet changed");
                return;
        }
    }

    public n3(org.telegram.ui.Wallet.f2 f2Var, org.telegram.ui.Wallet.b2 b2Var, org.telegram.ui.Wallet.t tVar, boolean z9, org.telegram.ui.Wallet.k0 k0Var) {
        this.f4398c = f2Var;
        this.d = b2Var;
        this.f4399e = tVar;
        this.f4397b = z9;
        this.f4400f = k0Var;
    }
}
