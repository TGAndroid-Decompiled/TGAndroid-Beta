package di;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.m10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.x21;
public final class t2 implements z10 {
    public final int f9459a = 0;
    public final boolean f9460b;
    public final Object f9461c;
    public final Object d;
    public final Object f9462e;
    public final Object f9463f;

    public t2(c6 c6Var, boolean z10, vf.b bVar, Runnable runnable, DialogInterface dialogInterface) {
        this.f9461c = c6Var;
        this.f9460b = z10;
        this.d = bVar;
        this.f9462e = runnable;
        this.f9463f = dialogInterface;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f9459a) {
            case 0:
                c6 c6Var = (c6) this.f9461c;
                vf.b bVar = (vf.b) this.d;
                Runnable runnable = (Runnable) this.f9462e;
                DialogInterface dialogInterface = (DialogInterface) this.f9463f;
                if (((Boolean) obj).booleanValue()) {
                    m10 i7 = m10.i(c6Var.f29679a);
                    i7.f24970y = null;
                    i7.v(false);
                    c6Var.W1(this.f9460b, bVar, runnable);
                    return;
                }
                bVar.c(false);
                dialogInterface.dismiss();
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.f9461c;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.d;
                x21 x21Var = (x21) this.f9462e;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.f9463f;
                byte[] bArr = (byte[]) obj;
                if (!d2Var.j(z1Var) && d2Var.A(z1Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = z1Var.f44776a.f28313id;
                    tonconnectclaimrequest.msg_id = z1Var.f44777b;
                    tonconnectclaimrequest.app_request_id = z1Var.d;
                    boolean z10 = this.f9460b;
                    tonconnectclaimrequest.declined = z10;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    d2Var.f43733f.sendRequestTyped(tonconnectclaimrequest, new d3.b(1), new org.telegram.ui.Wallet.u1(d2Var, bArr, z1Var, x21Var, z10, i0Var));
                    return;
                }
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                x21Var.a("Request expired or wallet changed");
                return;
        }
    }

    public t2(org.telegram.ui.Wallet.d2 d2Var, org.telegram.ui.Wallet.z1 z1Var, x21 x21Var, boolean z10, org.telegram.ui.Wallet.i0 i0Var) {
        this.f9461c = d2Var;
        this.d = z1Var;
        this.f9462e = x21Var;
        this.f9460b = z10;
        this.f9463f = i0Var;
    }
}
