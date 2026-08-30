package kc;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import org.json.JSONArray;
import org.json.JSONObject;
public final class d {
    public final ArrayList f10290a;

    public d(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new p2.l(optJSONObject));
                }
            }
        }
        this.f10290a = arrayList;
    }

    public void a() {
        ArrayList arrayList = this.f10290a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (obj == null) {
                try {
                    throw null;
                    break;
                } catch (Exception e) {
                    l.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
                }
            } else {
                throw new ClassCastException();
            }
        }
        arrayList.clear();
    }

    public d(int i10) {
        switch (i10) {
            case 2:
                this.f10290a = new ArrayList();
                new ArrayList();
                new ArrayList();
                return;
            default:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f10290a = new ArrayList();
                return;
        }
    }
}
