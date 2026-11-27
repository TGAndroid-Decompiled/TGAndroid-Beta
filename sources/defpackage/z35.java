package defpackage;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class z35 implements icc {
    public final byte a = 1;
    public final a55 b;
    public final TL_wallet.tonConnectSession c;
    public final String d;
    public final byte[] e;
    public final Object f;
    public final Object g;
    public final Object h;

    public z35(a55 a55Var, qe2 qe2Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.b = a55Var;
        this.f = qe2Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        a55 a55Var = this.b;
        switch (b) {
            case 0:
                v35 v35Var = (v35) this.f;
                c35 c35Var = (c35) this.g;
                TL_wallet.tonConnectSession tonconnectsession = this.c;
                String str = this.d;
                byte[] bArr = this.e;
                v45 v45Var = (v45) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                a55Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.e.c(new nn0(a55Var, c35Var, tonconnectsession, str, bArr, v45Var, tonconnectchallenge, v35Var, (byte) 4));
                    return;
                } else {
                    v35Var.a(a55.z(tL_error, "registerKey"));
                    return;
                }
            default:
                qe2 qe2Var = (qe2) this.f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.c;
                String str2 = this.d;
                byte[] bArr2 = this.e;
                JSONArray jSONArray = (JSONArray) this.g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                c35 c35Var2 = (c35) obj;
                String str3 = (String) obj2;
                a55Var.getClass();
                if (str3 == null && c35Var2 != null) {
                    c35 b2 = c35Var2.b();
                    Utilities.e.c(new nn0(a55Var, b2, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new qe2(b2, qe2Var, (byte) 23), (byte) 5));
                    return;
                }
                if (str3 == null) {
                    str3 = "Recovery phrase is unavailable";
                }
                qe2Var.a(null, str3);
                return;
        }
    }

    public z35(a55 a55Var, v35 v35Var, c35 c35Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, v45 v45Var) {
        this.b = a55Var;
        this.f = v35Var;
        this.g = c35Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.h = v45Var;
    }
}
