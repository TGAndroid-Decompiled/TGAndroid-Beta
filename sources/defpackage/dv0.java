package defpackage;

import org.json.JSONObject;
public final class dv0 {
    public final String a;
    public final String b;
    public final int c;

    public dv0(JSONObject jSONObject) {
        this.c = -1;
        this.a = jSONObject.getString("id");
        String string = jSONObject.getString("type");
        switch (string.hashCode()) {
            case -1829997182:
                if (string.equals("destructive")) {
                    this.c = bkb.p7;
                    break;
                }
                break;
            case -1367724422:
                if (string.equals("cancel")) {
                    this.b = k96.M0(2131752577, null);
                    return;
                }
                break;
            case 3548:
                if (string.equals("ok")) {
                    this.b = k96.M0(2131747638, null);
                    return;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    this.b = k96.M0(2131752029, null);
                    return;
                }
                break;
            case 1544803905:
                string.equals("default");
                break;
        }
        this.b = jSONObject.getString("text");
    }
}
