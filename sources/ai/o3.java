package ai;

import android.content.DialogInterface;
import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class o3 implements Utilities.Callback {
    public final int f1929a = 0;
    public final boolean f1930b;
    public final Object f1931c;
    public final Object d;
    public final Object e;
    public final Object f1932f;

    public o3(k7 k7Var, boolean z10, pf.c cVar, Runnable runnable, DialogInterface dialogInterface) {
        this.f1931c = k7Var;
        this.f1930b = z10;
        this.d = cVar;
        this.e = runnable;
        this.f1932f = dialogInterface;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1929a) {
            case 0:
                k7.Y0((k7) this.f1931c, this.f1930b, (pf.c) this.d, (Runnable) this.e, (DialogInterface) this.f1932f, (Boolean) obj);
                return;
            default:
                final org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.f1931c;
                final org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.d;
                final org.telegram.ui.Wallet.x xVar = (org.telegram.ui.Wallet.x) this.e;
                final org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.f1932f;
                final byte[] bArr = (byte[]) obj;
                if (!f2Var.i(b2Var) && f2Var.y(b2Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = b2Var.f33997a.f20530id;
                    tonconnectclaimrequest.msg_id = b2Var.f33998b;
                    tonconnectclaimrequest.app_request_id = b2Var.d;
                    final boolean z10 = this.f1930b;
                    tonconnectclaimrequest.declined = z10;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    f2Var.f34171f.sendRequestTyped(tonconnectclaimrequest, new Object(), new Utilities.Callback2() {
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
                                b2Var2.f34008o = true;
                                if (!z11 && b2Var2.f34005l < 0) {
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
                                        WalletEngine2 walletEngine2 = f2Var2.f34169b.f34452b;
                                        if (walletEngine2 != null && f2Var2.y(b2Var2) && !f2Var2.i(b2Var2)) {
                                            e2 e2Var = b2Var2.f34000f;
                                            walletEngine2.signMessage(j0Var2, e2Var, "ton-connect:" + b2Var2.f33997a.f20530id + ":" + b2Var2.f33998b, new q(f2Var2, b2Var2, j0Var2, xVar2, 8));
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
                                    i10 = b2Var2.f34005l;
                                }
                                int i11 = i10;
                                if (z11) {
                                    str = "User declined the request";
                                } else {
                                    str = b2Var2.f34003j;
                                }
                                f2Var2.w(b2Var2, j0Var2, null, i11, str, xVar2);
                                return;
                            }
                            if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                                b2Var2.f34007n = true;
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

    public o3(org.telegram.ui.Wallet.f2 f2Var, org.telegram.ui.Wallet.b2 b2Var, org.telegram.ui.Wallet.x xVar, boolean z10, org.telegram.ui.Wallet.j0 j0Var) {
        this.f1931c = f2Var;
        this.d = b2Var;
        this.e = xVar;
        this.f1930b = z10;
        this.f1932f = j0Var;
    }
}
