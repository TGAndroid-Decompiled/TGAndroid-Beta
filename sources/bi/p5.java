package bi;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
public final class p5 implements v10 {
    public final int f4511a;
    public final Object f4512b;
    public final Object f4513c;

    public p5(int i7, Object obj, Object obj2) {
        this.f4511a = i7;
        this.f4512b = obj;
        this.f4513c = obj2;
    }

    private final void b(Object obj, Object obj2) {
        v10 v10Var = (v10) this.f4513c;
        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
        String str = (String) obj2;
        if (!((org.telegram.ui.Wallet.b0) this.f4512b).f42089a) {
            v10Var.a(wallettransaction, str);
        }
    }

    private final void c(Object obj, Object obj2) {
        String str = (String) this.f4512b;
        fi.t3 t3Var = (fi.t3) this.f4513c;
        TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
        String str2 = null;
        if (((TLRPC.TL_error) obj2) == null && apiresponse != null && apiresponse.response != null) {
            try {
                JSONArray optJSONArray = new JSONObject(apiresponse.response.data).optJSONArray("records");
                if (optJSONArray != null && optJSONArray.length() == 1) {
                    JSONObject jSONObject = optJSONArray.getJSONObject(0);
                    if (str.equals(jSONObject.optString("domain"))) {
                        String optString = jSONObject.optString("dns_wallet", "");
                        if (WalletEngine2.isValidAddress(optString)) {
                            str2 = optString;
                        }
                    }
                }
            } catch (JSONException e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        t3Var.a(str2);
    }

    @Override
    public final void a(java.lang.Object r35, java.lang.Object r36) {
        throw new UnsupportedOperationException("Method not decompiled: bi.p5.a(java.lang.Object, java.lang.Object):void");
    }

    public p5(org.telegram.ui.Wallet.n0 n0Var, String str, c20 c20Var) {
        this.f4511a = 22;
        this.f4512b = str;
        this.f4513c = c20Var;
    }
}
