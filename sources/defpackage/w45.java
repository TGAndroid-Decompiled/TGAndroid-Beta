package defpackage;

import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class w45 {
    public final TL_wallet.tonConnectSession a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final z45 f;
    public final byte[] g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public Runnable r;

    public w45(TL_wallet.tonConnectPending tonconnectpending, TL_wallet.tonConnectRequest tonconnectrequest, JSONObject jSONObject, String str, byte[] bArr) {
        z45 z45Var;
        this.a = tonconnectpending.session;
        this.b = tonconnectrequest.msg_id;
        this.c = tonconnectrequest.expires;
        tonconnectrequest.body.clone();
        this.i = tonconnectrequest.trace_id;
        this.d = jSONObject.getString("id");
        this.e = jSONObject.optString("method");
        int optInt = jSONObject.optInt("errorCode", -1);
        this.l = optInt;
        String str2 = null;
        this.j = jSONObject.optString("errorMessage", null);
        if (optInt < 0 && jSONObject.has("transaction")) {
            z45Var = new z45(jSONObject.getJSONObject("transaction"));
        } else {
            z45Var = null;
        }
        this.f = z45Var;
        if (optInt < 0 && jSONObject.has("data")) {
            str2 = jSONObject.getJSONObject("data").toString();
        }
        this.k = str2;
        this.h = str;
        this.g = (byte[]) bArr.clone();
    }
}
