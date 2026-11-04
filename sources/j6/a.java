package j6;

import i6.b;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public abstract class a {
    public static final b f16204a = new b("MetadataUtils", null);
    public static final String[] f16205b;
    public static final String f16206c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        f16205b = strArr;
        f16206c = "yyyyMMdd'T'HHmmss".concat(String.valueOf(strArr[0]));
    }

    public static java.util.Calendar a(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: j6.a.a(java.lang.String):java.util.Calendar");
    }

    public static JSONArray b(List list) {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o6.a aVar = (o6.a) it.next();
            aVar.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", aVar.f20915b.toString());
                jSONObject.put("width", aVar.f20916c);
                jSONObject.put("height", aVar.d);
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static void c(List list, JSONArray jSONArray) {
        try {
            list.clear();
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                try {
                    list.add(new o6.a(jSONArray.getJSONObject(i3)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }
}
