package defpackage;

import android.util.Base64;
import org.json.JSONObject;
import org.telegram.ui.Wallet.WalletEngine2;
public final class y45 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final boolean f;

    public y45(JSONObject jSONObject) {
        String str;
        String str2;
        String string = jSONObject.getString("address");
        this.a = string;
        if (!string.contains(":") && WalletEngine2.isValidAddress(string)) {
            this.f = (Base64.decode(string.replace('-', '+').replace('_', '/'), 2)[0] & Byte.MAX_VALUE) == 17;
            Object obj = jSONObject.get("amount");
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (str3.matches("[0-9]+")) {
                    long parseLong = Long.parseLong(str3);
                    this.e = parseLong;
                    if (jSONObject.has("extra_currency") && jSONObject.getJSONObject("extra_currency").length() != 0) {
                        lq5.j("Extra currencies are not supported");
                        throw null;
                    } else if (parseLong >= 0) {
                        if (jSONObject.has("payload")) {
                            str = jSONObject.getString("payload");
                        } else {
                            str = null;
                        }
                        this.b = str;
                        if (jSONObject.has("stateInit")) {
                            str2 = jSONObject.getString("stateInit");
                        } else {
                            str2 = null;
                        }
                        this.c = str2;
                        if ((str != null && !WalletEngine2.isValidCellBoc(str)) || (str2 != null && !WalletEngine2.isValidCellBoc(str2))) {
                            lq5.j("Invalid transaction cell");
                            throw null;
                        } else {
                            this.d = WalletEngine2.textCommentFromBody(str);
                            return;
                        }
                    } else {
                        lq5.j("Transfer amount must not be negative");
                        throw null;
                    }
                }
            }
            lq5.j("Invalid transfer amount");
            throw null;
        }
        lq5.j("Expected a friendly destination address");
        throw null;
    }
}
