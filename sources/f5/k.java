package f5;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class k {
    public final ArrayList f11291a;

    public k() {
        this.f11291a = new ArrayList();
        new ArrayList();
        new ArrayList();
    }

    public k(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i7);
                if (optJSONObject != null) {
                    arrayList.add(new j(optJSONObject));
                }
            }
        }
        this.f11291a = arrayList;
    }
}
