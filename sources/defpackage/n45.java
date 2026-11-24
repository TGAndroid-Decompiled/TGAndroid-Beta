package defpackage;

import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.WalletEngine2;
public final class n45 implements jac {
    public final byte a = 0;
    public final boolean b;
    public final byte[] c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public n45(w45 w45Var, byte[] bArr, s45 s45Var, u35 u35Var, boolean z, y25 y25Var) {
        this.d = w45Var;
        this.c = bArr;
        this.e = s45Var;
        this.f = u35Var;
        this.b = z;
        this.g = y25Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i;
        String str;
        String str2;
        switch (this.a) {
            case 0:
                w45 w45Var = (w45) this.d;
                byte[] bArr = this.c;
                s45 s45Var = (s45) this.e;
                u35 u35Var = (u35) this.f;
                boolean z = this.b;
                y25 y25Var = (y25) this.g;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                if (tL_error == null) {
                    if (bool instanceof TLRPC.TL_boolTrue) {
                        s45Var.o = true;
                        if (!z && s45Var.l < 0) {
                            if ("disconnect".equals(s45Var.e)) {
                                w45Var.y(s45Var, y25Var, new JSONObject(), -1, null, u35Var);
                                return;
                            } else if ("signData".equals(s45Var.e)) {
                                if (w45Var.A(s45Var) && !w45Var.i(s45Var)) {
                                    Utilities.e.c(new xo1(w45Var, y25Var, s45Var, u35Var, (byte) 28));
                                    return;
                                } else {
                                    w45Var.y(s45Var, y25Var, null, 0, "Request expired or wallet changed", u35Var);
                                    return;
                                }
                            } else if ("signMessage".equals(s45Var.e)) {
                                WalletEngine2 walletEngine2 = w45Var.b.b;
                                if (walletEngine2 != null && w45Var.A(s45Var) && !w45Var.i(s45Var)) {
                                    v45 v45Var = s45Var.f;
                                    walletEngine2.signMessage(y25Var, v45Var, "ton-connect:" + s45Var.a.id + ":" + s45Var.b, new nv0(w45Var, s45Var, y25Var, u35Var, (byte) 10));
                                    return;
                                }
                                w45Var.y(s45Var, y25Var, null, 0, "Wallet unavailable or request expired", u35Var);
                                return;
                            } else {
                                w45Var.B(s45Var, y25Var, u35Var);
                                return;
                            }
                        }
                        if (z) {
                            i = 300;
                            str = "User declined the request";
                        } else {
                            i = s45Var.l;
                            str = s45Var.j;
                        }
                        w45Var.y(s45Var, y25Var, null, i, str, u35Var);
                        return;
                    }
                } else if ("TONCONNECT_REQUEST_ALREADY_CLAIMED".equals(tL_error.text) || "TONCONNECT_REQUEST_EXPIRED".equals(tL_error.text) || "TONCONNECT_REQUEST_NOT_FOUND".equals(tL_error.text)) {
                    s45Var.n = true;
                }
                u35Var.a(w45.z(tL_error, "claimRequest"));
                return;
            default:
                boolean z2 = this.b;
                txc txcVar = (txc) this.d;
                TLRPC.WidgetQueryType widgetQueryType = (TLRPC.WidgetQueryType) this.e;
                byte[] bArr2 = this.c;
                int[] iArr = (int[]) this.f;
                tm3 tm3Var = (tm3) this.g;
                TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!z2 && tL_error2 != null && (str2 = tL_error2.text) != null && (str2.startsWith("INPUT_METHOD_INVALID") || tL_error2.text.startsWith("INPUT_CONSTRUCTOR_INVALID"))) {
                    wxc.k[txcVar.b] = true;
                    wxc.z(txcVar, widgetQueryType, bArr2, iArr, tm3Var);
                    return;
                }
                tm3Var.a(tL_messages_botWidgetQueryAnswer, tL_error2);
                return;
        }
    }

    public n45(boolean z, txc txcVar, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, tm3 tm3Var) {
        this.b = z;
        this.d = txcVar;
        this.e = widgetQueryType;
        this.c = bArr;
        this.f = iArr;
        this.g = tm3Var;
    }
}
