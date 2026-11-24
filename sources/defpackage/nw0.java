package defpackage;

import org.json.JSONObject;
public final class nw0 {
    public final String a;
    public final String b;
    public final int c;

    public nw0(JSONObject jSONObject) {
        this.c = -1;
        this.a = jSONObject.getString("id");
        String string = jSONObject.getString("type");
        switch (string.hashCode()) {
            case -1829997182:
                if (string.equals("destructive")) {
                    this.c = cmb.p7;
                    break;
                }
                break;
            case -1367724422:
                if (string.equals("cancel")) {
                    this.b = jb6.M0(2131752542, null);
                    return;
                }
                break;
            case 3548:
                if (string.equals("ok")) {
                    this.b = jb6.M0(2131747564, null);
                    return;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    this.b = jb6.M0(2131751978, null);
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
