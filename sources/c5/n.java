package c5;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class n {
    public final ArrayList f4402a;

    public n() {
        this.f4402a = new ArrayList();
        new ArrayList();
        new ArrayList();
    }

    public n(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new m(optJSONObject));
                }
            }
        }
        this.f4402a = arrayList;
    }
}
