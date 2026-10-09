package c5;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import org.json.JSONArray;
import org.json.JSONObject;
public final class m {
    public final ArrayList f4274a;

    public m(int i10) {
        switch (i10) {
            case 2:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f4274a = new ArrayList();
                return;
            default:
                this.f4274a = new ArrayList();
                new ArrayList();
                new ArrayList();
                return;
        }
    }

    public void a() {
        ArrayList arrayList = this.f4274a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (obj == null) {
                try {
                    throw null;
                    break;
                } catch (Exception e7) {
                    zc.i.d.log(Level.WARNING, "could not delete file ", (Throwable) e7);
                }
            } else {
                throw new ClassCastException();
            }
        }
        arrayList.clear();
    }

    public m(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new l(optJSONObject));
                }
            }
        }
        this.f4274a = arrayList;
    }
}
