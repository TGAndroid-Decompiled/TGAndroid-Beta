package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public abstract class b5d {
    public static final dc6 a = new dc6("MetadataUtils", null);
    public static final String[] b;
    public static final String c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        b = strArr;
        c = "yyyyMMdd'T'HHmmss".concat(String.valueOf(strArr[0]));
    }

    public static java.util.Calendar a(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b5d.a(java.lang.String):java.util.Calendar");
    }

    public static JSONArray b(ArrayList arrayList) {
        arrayList.getClass();
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            vsc vscVar = (vsc) obj;
            vscVar.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", vscVar.b.toString());
                jSONObject.put("width", vscVar.c);
                jSONObject.put("height", vscVar.d);
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static void c(ArrayList arrayList, JSONArray jSONArray) {
        try {
            arrayList.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    arrayList.add(new vsc(jSONArray.getJSONObject(i)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }
}
