package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class il8 {
    public final ArrayList a;

    public il8(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new hl8(optJSONObject));
                }
            }
        }
        this.a = arrayList;
    }

    public il8(ArrayList arrayList) {
        this.a = arrayList;
    }
}
