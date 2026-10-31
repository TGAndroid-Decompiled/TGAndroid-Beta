package c5;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class k {
    public final ArrayList f3796a;

    public k() {
        this.f3796a = new ArrayList();
        new ArrayList();
        new ArrayList();
    }

    public k(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new j(optJSONObject));
                }
            }
        }
        this.f3796a = arrayList;
    }

    public k(ArrayList arrayList) {
        this.f3796a = arrayList;
    }
}
