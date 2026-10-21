package ai;

import android.content.DialogInterface;
import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class r3 implements Utilities.Callback {
    public final int f2102a = 0;
    public final boolean f2103b;
    public final Object f2104c;
    public final Object d;
    public final Object e;
    public final Object f2105f;

    public r3(l7 l7Var, boolean z10, pf.c cVar, Runnable runnable, DialogInterface dialogInterface) {
        this.f2104c = l7Var;
        this.f2103b = z10;
        this.d = cVar;
        this.e = runnable;
        this.f2105f = dialogInterface;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f2102a) {
            case 0:
                l7.U0((l7) this.f2104c, this.f2103b, (pf.c) this.d, (Runnable) this.e, (DialogInterface) this.f2105f, (Boolean) obj);
                return;
            default:
                final org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.f2104c;
                final org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.d;
                final org.telegram.ui.Wallet.x xVar = (org.telegram.ui.Wallet.x) this.e;
                final org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.f2105f;
                final byte[] bArr = (byte[]) obj;
                if (!f2Var.i(b2Var) && f2Var.y(b2Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = b2Var.f34016a.f20534id;
                    tonconnectclaimrequest.msg_id = b2Var.f34017b;
                    tonconnectclaimrequest.app_request_id = b2Var.d;
                    final boolean z10 = this.f2103b;
                    tonconnectclaimrequest.declined = z10;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    f2Var.f34198f.sendRequestTyped(tonconnectclaimrequest, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj2, Object obj3) {
                            int i10;
                            String str;
                            f2 f2Var2 = f2.this;
                            byte[] bArr2 = bArr;
                            b2 b2Var2 = b2Var;
                            x xVar2 = xVar;
                            boolean z11 = z10;
                            j0 j0Var2 = j0Var;
                            TLRPC.Bool bool = (TLRPC.Bool) obj2;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                            if (bArr2 != null) {
                                Arrays.fill(bArr2, (byte) 0);
                            }
                            if (tL_error == null && (bool instanceof TLRPC.TL_boolTrue)) {
                                b2Var2.f34027o = true;
                                if (!z11 && b2Var2.f34024l < 0) {
                                    if ("disconnect".equals(b2Var2.e)) {
                                        f2Var2.w(b2Var2, j0Var2, new JSONObject(), -1, null, xVar2);
                                        return;
                                    } else if ("signData".equals(b2Var2.e)) {
                                        if (f2Var2.y(b2Var2) && !f2Var2.i(b2Var2)) {
                                            Utilities.globalQueue.postRunnable(new w6(f2Var2, j0Var2, b2Var2, xVar2, 9));
                                            return;
                                        } else {
                                            f2Var2.w(b2Var2, j0Var2, null, 0, "Request expired or wallet changed", xVar2);
                                            return;
                                        }
                                    } else if ("signMessage".equals(b2Var2.e)) {
                                        WalletEngine2 walletEngine2 = f2Var2.f34196b.f34478b;
                                        if (walletEngine2 != null && f2Var2.y(b2Var2) && !f2Var2.i(b2Var2)) {
                                            e2 e2Var = b2Var2.f34019f;
                                            walletEngine2.signMessage(j0Var2, e2Var, "ton-connect:" + b2Var2.f34016a.f20534id + ":" + b2Var2.f34017b, new q(f2Var2, b2Var2, j0Var2, xVar2, 8));
                                            return;
                                        }
                                        f2Var2.w(b2Var2, j0Var2, null, 0, "Wallet unavailable or request expired", xVar2);
                                        return;
                                    } else {
                                        f2Var2.z(b2Var2, j0Var2, xVar2);
                                        return;
                                    }
                                }
                                if (z11) {
                                    i10 = 300;
                                } else {
                                    i10 = b2Var2.f34024l;
                                }
                                int i11 = i10;
                                if (z11) {
                                    str = "User declined the request";
                                } else {
                                    str = b2Var2.f34022j;
                                }
                                f2Var2.w(b2Var2, j0Var2, null, i11, str, xVar2);
                                return;
                            }
                            if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                                b2Var2.f34026n = true;
                            }
                            xVar2.run(f2.x(tL_error, "claimRequest"));
                        }
                    });
                    return;
                }
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                xVar.run("Request expired or wallet changed");
                return;
        }
    }

    public r3(org.telegram.ui.Wallet.f2 f2Var, org.telegram.ui.Wallet.b2 b2Var, org.telegram.ui.Wallet.x xVar, boolean z10, org.telegram.ui.Wallet.j0 j0Var) {
        this.f2104c = f2Var;
        this.d = b2Var;
        this.e = xVar;
        this.f2103b = z10;
        this.f2105f = j0Var;
    }
}
