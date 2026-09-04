package h6;

import g6.b;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public abstract class a {
    public static final b f10891a = new b("MetadataUtils", null);
    public static final String[] f10892b;
    public static final String f10893c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        f10892b = strArr;
        f10893c = "yyyyMMdd'T'HHmmss".concat(String.valueOf(strArr[0]));
    }

    public static java.util.Calendar a(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: h6.a.a(java.lang.String):java.util.Calendar");
    }

    public static JSONArray b(List list) {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m6.a aVar = (m6.a) it.next();
            aVar.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", aVar.f16126b.toString());
                jSONObject.put("width", aVar.f16127c);
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
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    list.add(new m6.a(jSONArray.getJSONObject(i10)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }
}
