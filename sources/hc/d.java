package hc;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d {

    public final ArrayList f8872a;

    public d(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new n2.j(jSONObjectOptJSONObject));
                }
            }
        }
        this.f8872a = arrayList;
    }

    public void a() {
        ArrayList arrayList = this.f8872a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (obj != null) {
                throw new ClassCastException();
            }
            try {
                throw null;
            } catch (Exception e9) {
                l.d.log(Level.WARNING, "could not delete file ", (Throwable) e9);
            }
        }
        arrayList.clear();
    }

    public d() {
        File file = new File(System.getProperty("java.io.tmpdir"));
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f8872a = new ArrayList();
    }
}
