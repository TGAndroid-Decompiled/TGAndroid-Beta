package ai;

import android.content.DialogInterface;
import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class r3 implements Utilities.Callback {
    public final int f2107a = 0;
    public final boolean f2108b;
    public final Object f2109c;
    public final Object d;
    public final Object e;
    public final Object f2110f;

    public r3(l7 l7Var, boolean z10, pf.c cVar, Runnable runnable, DialogInterface dialogInterface) {
        this.f2109c = l7Var;
        this.f2108b = z10;
        this.d = cVar;
        this.e = runnable;
        this.f2110f = dialogInterface;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f2107a) {
            case 0:
                l7.T0((l7) this.f2109c, this.f2108b, (pf.c) this.d, (Runnable) this.e, (DialogInterface) this.f2110f, (Boolean) obj);
                return;
            default:
                final org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.f2109c;
                final org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.d;
                final org.telegram.ui.Wallet.w wVar = (org.telegram.ui.Wallet.w) this.e;
                final org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.f2110f;
                final byte[] bArr = (byte[]) obj;
                if (!e2Var.i(a2Var) && e2Var.y(a2Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = a2Var.f34272a.f20601id;
                    tonconnectclaimrequest.msg_id = a2Var.f34273b;
                    tonconnectclaimrequest.app_request_id = a2Var.d;
                    final boolean z10 = this.f2108b;
                    tonconnectclaimrequest.declined = z10;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    e2Var.f34432f.sendRequestTyped(tonconnectclaimrequest, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj2, Object obj3) {
                            int i10;
                            String str;
                            e2 e2Var2 = e2.this;
                            byte[] bArr2 = bArr;
                            a2 a2Var2 = a2Var;
                            w wVar2 = wVar;
                            boolean z11 = z10;
                            i0 i0Var2 = i0Var;
                            TLRPC.Bool bool = (TLRPC.Bool) obj2;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                            if (bArr2 != null) {
                                Arrays.fill(bArr2, (byte) 0);
                            }
                            if (tL_error == null && (bool instanceof TLRPC.TL_boolTrue)) {
                                a2Var2.f34283o = true;
                                if (!z11 && a2Var2.f34280l < 0) {
                                    if ("disconnect".equals(a2Var2.e)) {
                                        e2Var2.w(a2Var2, i0Var2, new JSONObject(), -1, null, wVar2);
                                        return;
                                    } else if ("signData".equals(a2Var2.e)) {
                                        if (e2Var2.y(a2Var2) && !e2Var2.i(a2Var2)) {
                                            Utilities.globalQueue.postRunnable(new w6(e2Var2, i0Var2, a2Var2, wVar2, 9));
                                            return;
                                        } else {
                                            e2Var2.w(a2Var2, i0Var2, null, 0, "Request expired or wallet changed", wVar2);
                                            return;
                                        }
                                    } else if ("signMessage".equals(a2Var2.e)) {
                                        WalletEngine2 walletEngine2 = e2Var2.f34430b.f34742b;
                                        if (walletEngine2 != null && e2Var2.y(a2Var2) && !e2Var2.i(a2Var2)) {
                                            d2 d2Var = a2Var2.f34275f;
                                            walletEngine2.signMessage(i0Var2, d2Var, "ton-connect:" + a2Var2.f34272a.f20601id + ":" + a2Var2.f34273b, new p(e2Var2, a2Var2, i0Var2, wVar2, 8));
                                            return;
                                        }
                                        e2Var2.w(a2Var2, i0Var2, null, 0, "Wallet unavailable or request expired", wVar2);
                                        return;
                                    } else {
                                        e2Var2.z(a2Var2, i0Var2, wVar2);
                                        return;
                                    }
                                }
                                if (z11) {
                                    i10 = 300;
                                } else {
                                    i10 = a2Var2.f34280l;
                                }
                                int i11 = i10;
                                if (z11) {
                                    str = "User declined the request";
                                } else {
                                    str = a2Var2.f34278j;
                                }
                                e2Var2.w(a2Var2, i0Var2, null, i11, str, wVar2);
                                return;
                            }
                            if (tL_error != null && ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text))) {
                                a2Var2.f34282n = true;
                            }
                            wVar2.run(e2.x(tL_error, "claimRequest"));
                        }
                    });
                    return;
                }
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                wVar.run("Request expired or wallet changed");
                return;
        }
    }

    public r3(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.a2 a2Var, org.telegram.ui.Wallet.w wVar, boolean z10, org.telegram.ui.Wallet.i0 i0Var) {
        this.f2109c = e2Var;
        this.d = a2Var;
        this.e = wVar;
        this.f2108b = z10;
        this.f2110f = i0Var;
    }
}
