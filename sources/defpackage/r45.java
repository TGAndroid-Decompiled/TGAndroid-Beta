package defpackage;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.WalletEngine2;
public final class r45 implements icc {
    public final byte a = 0;
    public final boolean b;
    public final byte[] c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public r45(a55 a55Var, byte[] bArr, w45 w45Var, v35 v35Var, boolean z, c35 c35Var) {
        this.d = a55Var;
        this.c = bArr;
        this.e = w45Var;
        this.f = v35Var;
        this.b = z;
        this.g = c35Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i;
        String str;
        String str2;
        switch (this.a) {
            case 0:
                a55 a55Var = (a55) this.d;
                byte[] bArr = this.c;
                w45 w45Var = (w45) this.e;
                v35 v35Var = (v35) this.f;
                boolean z = this.b;
                c35 c35Var = (c35) this.g;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                if (tL_error == null) {
                    if (bool instanceof TLRPC.TL_boolTrue) {
                        w45Var.o = true;
                        if (!z && w45Var.l < 0) {
                            if ("disconnect".equals(w45Var.e)) {
                                a55Var.y(w45Var, c35Var, new JSONObject(), -1, null, v35Var);
                                return;
                            } else if ("signData".equals(w45Var.e)) {
                                if (a55Var.A(w45Var) && !a55Var.i(w45Var)) {
                                    Utilities.e.c(new ao1(a55Var, c35Var, w45Var, v35Var, (byte) 26));
                                    return;
                                } else {
                                    a55Var.y(w45Var, c35Var, null, 0, "Request expired or wallet changed", v35Var);
                                    return;
                                }
                            } else if ("signMessage".equals(w45Var.e)) {
                                WalletEngine2 walletEngine2 = a55Var.b.b;
                                if (walletEngine2 != null && a55Var.A(w45Var) && !a55Var.i(w45Var)) {
                                    z45 z45Var = w45Var.f;
                                    walletEngine2.signMessage(c35Var, z45Var, "ton-connect:" + w45Var.a.id + ":" + w45Var.b, new nu0(a55Var, w45Var, c35Var, v35Var, (byte) 8));
                                    return;
                                }
                                a55Var.y(w45Var, c35Var, null, 0, "Wallet unavailable or request expired", v35Var);
                                return;
                            } else {
                                a55Var.B(w45Var, c35Var, v35Var);
                                return;
                            }
                        }
                        if (z) {
                            i = 300;
                            str = "User declined the request";
                        } else {
                            i = w45Var.l;
                            str = w45Var.j;
                        }
                        a55Var.y(w45Var, c35Var, null, i, str, v35Var);
                        return;
                    }
                } else if ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text)) {
                    w45Var.n = true;
                }
                v35Var.a(a55.z(tL_error, "claimRequest"));
                return;
            default:
                boolean z2 = this.b;
                h0d h0dVar = (h0d) this.d;
                TLRPC.WidgetQueryType widgetQueryType = (TLRPC.WidgetQueryType) this.e;
                byte[] bArr2 = this.c;
                int[] iArr = (int[]) this.f;
                am3 am3Var = (am3) this.g;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!z2 && tL_error2 != null && (str2 = tL_error2.text) != null && (str2.startsWith("INPUT_METHOD_INVALID") || tL_error2.text.startsWith("INPUT_CONSTRUCTOR_INVALID"))) {
                    k0d.k[h0dVar.b] = true;
                    k0d.z(h0dVar, widgetQueryType, bArr2, iArr, am3Var);
                    return;
                }
                am3Var.a(tL_messages_botWidgetQueryAnswer, tL_error2);
                return;
        }
    }

    public r45(boolean z, h0d h0dVar, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, am3 am3Var) {
        this.b = z;
        this.d = h0dVar;
        this.e = widgetQueryType;
        this.c = bArr;
        this.f = iArr;
        this.g = am3Var;
    }
}
