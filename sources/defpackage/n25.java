package defpackage;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.WalletEngine2;
public final class n25 implements i8c {
    public final byte a = 0;
    public final boolean b;
    public final byte[] c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public n25(w25 w25Var, byte[] bArr, s25 s25Var, x15 x15Var, boolean z, y05 y05Var) {
        this.d = w25Var;
        this.c = bArr;
        this.e = s25Var;
        this.f = x15Var;
        this.b = z;
        this.g = y05Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i;
        String str;
        String str2;
        switch (this.a) {
            case 0:
                w25 w25Var = (w25) this.d;
                byte[] bArr = this.c;
                s25 s25Var = (s25) this.e;
                x15 x15Var = (x15) this.f;
                boolean z = this.b;
                y05 y05Var = (y05) this.g;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                if (tL_error == null) {
                    if (bool instanceof TLRPC.TL_boolTrue) {
                        s25Var.o = true;
                        if (!z && s25Var.l < 0) {
                            if ("disconnect".equals(s25Var.e)) {
                                w25Var.y(s25Var, y05Var, new JSONObject(), -1, null, x15Var);
                                return;
                            } else if ("signData".equals(s25Var.e)) {
                                if (w25Var.A(s25Var) && !w25Var.i(s25Var)) {
                                    Utilities.e.c(new hn1(w25Var, y05Var, s25Var, x15Var, (byte) 28));
                                    return;
                                } else {
                                    w25Var.y(s25Var, y05Var, null, 0, "Request expired or wallet changed", x15Var);
                                    return;
                                }
                            } else if ("signMessage".equals(s25Var.e)) {
                                WalletEngine2 walletEngine2 = w25Var.b.b;
                                if (walletEngine2 != null && w25Var.A(s25Var) && !w25Var.i(s25Var)) {
                                    v25 v25Var = s25Var.f;
                                    walletEngine2.signMessage(y05Var, v25Var, "ton-connect:" + s25Var.a.id + ":" + s25Var.b, new eu0(w25Var, s25Var, y05Var, x15Var, (byte) 10));
                                    return;
                                }
                                w25Var.y(s25Var, y05Var, null, 0, "Wallet unavailable or request expired", x15Var);
                                return;
                            } else {
                                w25Var.B(s25Var, y05Var, x15Var);
                                return;
                            }
                        }
                        if (z) {
                            i = 300;
                            str = "User declined the request";
                        } else {
                            i = s25Var.l;
                            str = s25Var.j;
                        }
                        w25Var.y(s25Var, y05Var, null, i, str, x15Var);
                        return;
                    }
                } else if ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text)) {
                    s25Var.n = true;
                }
                x15Var.a(w25.z(tL_error, "claimRequest"));
                return;
            default:
                boolean z2 = this.b;
                svc svcVar = (svc) this.d;
                TLRPC.WidgetQueryType widgetQueryType = (TLRPC.WidgetQueryType) this.e;
                byte[] bArr2 = this.c;
                int[] iArr = (int[]) this.f;
                il3 il3Var = (il3) this.g;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!z2 && tL_error2 != null && (str2 = tL_error2.text) != null && (str2.startsWith("INPUT_METHOD_INVALID") || tL_error2.text.startsWith("INPUT_CONSTRUCTOR_INVALID"))) {
                    vvc.k[svcVar.b] = true;
                    vvc.y(svcVar, widgetQueryType, bArr2, iArr, il3Var);
                    return;
                }
                il3Var.a(tL_messages_botWidgetQueryAnswer, tL_error2);
                return;
        }
    }

    public n25(boolean z, svc svcVar, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, il3 il3Var) {
        this.b = z;
        this.d = svcVar;
        this.e = widgetQueryType;
        this.c = bArr;
        this.f = iArr;
        this.g = il3Var;
    }
}
