package defpackage;

import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class t45 {
    public final String a;
    public final byte[] b;
    public final byte[] c;
    public TL_wallet.walletOwnershipProof d;

    public t45(JSONObject jSONObject) {
        byte[] bArr;
        this.a = jSONObject.getString("clientId");
        if (jSONObject.has("challengeAnswer")) {
            bArr = Base64.decode(jSONObject.getString("challengeAnswer"), 2);
        } else {
            bArr = null;
        }
        this.b = bArr;
        this.c = jSONObject.has("body") ? Base64.decode(jSONObject.getString("body"), 2) : null;
    }
}
