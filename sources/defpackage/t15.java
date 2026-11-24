package defpackage;

import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class t15 implements i8c {
    public final byte a = 1;
    public final w25 b;
    public final TL_wallet.tonConnectSession c;
    public final String d;
    public final byte[] e;
    public final Object f;
    public final Object g;
    public final Object h;

    public t15(w25 w25Var, ae2 ae2Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.b = w25Var;
        this.f = ae2Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.g = jSONArray;
        this.h = tL_urlAuthResultRequest;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        w25 w25Var = this.b;
        switch (b) {
            case 0:
                x15 x15Var = (x15) this.f;
                y05 y05Var = (y05) this.g;
                TL_wallet.tonConnectSession tonconnectsession = this.c;
                String str = this.d;
                byte[] bArr = this.e;
                r25 r25Var = (r25) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                w25Var.getClass();
                if (tL_error == null && tonconnectchallenge != null) {
                    Utilities.e.c(new ln0(w25Var, y05Var, tonconnectsession, str, bArr, r25Var, tonconnectchallenge, x15Var, (byte) 4));
                    return;
                } else {
                    x15Var.a(w25.z(tL_error, "registerKey"));
                    return;
                }
            default:
                ae2 ae2Var = (ae2) this.f;
                TL_wallet.tonConnectSession tonconnectsession2 = this.c;
                String str2 = this.d;
                byte[] bArr2 = this.e;
                JSONArray jSONArray = (JSONArray) this.g;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.h;
                y05 y05Var2 = (y05) obj;
                String str3 = (String) obj2;
                w25Var.getClass();
                if (str3 == null && y05Var2 != null) {
                    y05 b2 = y05Var2.b();
                    Utilities.e.c(new ln0(w25Var, b2, tonconnectsession2, str2, bArr2, jSONArray, tL_urlAuthResultRequest, new ae2(b2, ae2Var, (byte) 24), (byte) 5));
                    return;
                }
                if (str3 == null) {
                    str3 = "Recovery phrase is unavailable";
                }
                ae2Var.a(null, str3);
                return;
        }
    }

    public t15(w25 w25Var, x15 x15Var, y05 y05Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, r25 r25Var) {
        this.b = w25Var;
        this.f = x15Var;
        this.g = y05Var;
        this.c = tonconnectsession;
        this.d = str;
        this.e = bArr;
        this.h = r25Var;
    }
}
