package k6;

import j6.b;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public abstract class a {
    public static final b f17219a = new b("MetadataUtils", null);
    public static final String[] f17220b;
    public static final String f17221c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        f17220b = strArr;
        f17221c = "yyyyMMdd'T'HHmmss".concat(String.valueOf(strArr[0]));
    }

    public static java.util.Calendar a(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: k6.a.a(java.lang.String):java.util.Calendar");
    }

    public static JSONArray b(List list) {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p6.a aVar = (p6.a) it.next();
            aVar.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", aVar.f53387b.toString());
                jSONObject.put("width", aVar.f53388c);
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
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                try {
                    list.add(new p6.a(jSONArray.getJSONObject(i7)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }
}
