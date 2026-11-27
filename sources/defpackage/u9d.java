package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public abstract class u9d {
    public static final he6 a = new he6("MetadataUtils", null);
    public static final String[] b;
    public static final String c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        b = strArr;
        c = "yyyyMMdd'T'HHmmss".concat(String.valueOf(strArr[0]));
    }

    public static java.util.Calendar a(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9d.a(java.lang.String):java.util.Calendar");
    }

    public static JSONArray b(ArrayList arrayList) {
        arrayList.getClass();
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            kxc kxcVar = (kxc) obj;
            kxcVar.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", kxcVar.b.toString());
                jSONObject.put("width", kxcVar.c);
                jSONObject.put("height", kxcVar.d);
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
                    arrayList.add(new kxc(jSONArray.getJSONObject(i)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }
}
