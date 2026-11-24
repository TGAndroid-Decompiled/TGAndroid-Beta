package defpackage;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class t35 implements jac {
    public final byte a = 1;
    public final w45 b;
    public final TL_wallet.tonConnectSession c;
    public final String d;
    public final byte[] e;
    public final Object f;
    public final Object g;
    public final Object h;

    public t35(w45 w45Var, lf2 lf2Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.b = w45Var;
        this.f = lf2Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        w45 w45Var = this.b;
        switch (b) {
            case 0:
                u35 u35Var = (u35) this.f;
                y25 y25Var = (y25) this.g;
                TL_wallet.tonConnectSession tonconnectsession = this.c;
                String str = this.d;
                byte[] bArr = this.e;
                r45 r45Var = (r45) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                w45Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.e.c(new lo0(w45Var, y25Var, tonconnectsession, str, bArr, r45Var, tonconnectchallenge, u35Var, (byte) 4));
                    return;
                } else {
                    u35Var.a(w45.z(tL_error, "registerKey"));
                    return;
                }
            default:
                lf2 lf2Var = (lf2) this.f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.c;
                String str2 = this.d;
                byte[] bArr2 = this.e;
                JSONArray jSONArray = (JSONArray) this.g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                y25 y25Var2 = (y25) obj;
                String str3 = (String) obj2;
                w45Var.getClass();
                if (str3 == null && y25Var2 != null) {
                    y25 b2 = y25Var2.b();
                    Utilities.e.c(new lo0(w45Var, b2, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new lf2(b2, lf2Var, (byte) 26), (byte) 5));
                    return;
                }
                if (str3 == null) {
                    str3 = "Recovery phrase is unavailable";
                }
                lf2Var.a(null, str3);
                return;
        }
    }

    public t35(w45 w45Var, u35 u35Var, y25 y25Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, r45 r45Var) {
        this.b = w45Var;
        this.f = u35Var;
        this.g = y25Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.h = r45Var;
    }
}
