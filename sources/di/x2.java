package di;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.i10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.a31;
public final class x2 implements w10 {
    public final int f9985a = 0;
    public final boolean f9986b;
    public final Object f9987c;
    public final Object d;
    public final Object f9988e;
    public final Object f9989f;

    public x2(f6 f6Var, boolean z10, vf.b bVar, Runnable runnable, DialogInterface dialogInterface) {
        this.f9987c = f6Var;
        this.f9986b = z10;
        this.d = bVar;
        this.f9988e = runnable;
        this.f9989f = dialogInterface;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f9985a) {
            case 0:
                f6 f6Var = (f6) this.f9987c;
                vf.b bVar = (vf.b) this.d;
                Runnable runnable = (Runnable) this.f9988e;
                DialogInterface dialogInterface = (DialogInterface) this.f9989f;
                if (((Boolean) obj).booleanValue()) {
                    i10 i7 = i10.i(f6Var.f30223a);
                    i7.f24667y = null;
                    i7.v(false);
                    f6Var.i2(this.f9986b, bVar, runnable);
                    return;
                }
                bVar.c(false);
                dialogInterface.dismiss();
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.m2 m2Var = (org.telegram.ui.Wallet.m2) this.f9987c;
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) this.d;
                a31 a31Var = (a31) this.f9988e;
                org.telegram.ui.Wallet.s0 s0Var = (org.telegram.ui.Wallet.s0) this.f9989f;
                byte[] bArr = (byte[]) obj;
                if (!m2Var.j(i2Var) && m2Var.A(i2Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = i2Var.f44461a.f28754id;
                    tonconnectclaimrequest.msg_id = i2Var.f44462b;
                    tonconnectclaimrequest.app_request_id = i2Var.d;
                    boolean z10 = this.f9986b;
                    tonconnectclaimrequest.declined = z10;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    m2Var.f44652f.sendRequestTyped(tonconnectclaimrequest, new d3.b(1), new org.telegram.ui.Wallet.d2(m2Var, bArr, i2Var, a31Var, z10, s0Var));
                    return;
                }
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                a31Var.a("Request expired or wallet changed");
                return;
        }
    }

    public x2(org.telegram.ui.Wallet.m2 m2Var, org.telegram.ui.Wallet.i2 i2Var, a31 a31Var, boolean z10, org.telegram.ui.Wallet.s0 s0Var) {
        this.f9987c = m2Var;
        this.d = i2Var;
        this.f9988e = a31Var;
        this.f9986b = z10;
        this.f9989f = s0Var;
    }
}
