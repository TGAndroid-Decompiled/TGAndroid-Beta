package defpackage;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;
public abstract class pdb {
    public static final rdb a = new rdb();

    public static HttpURLConnection a(String str, pq8 pq8Var) {
        Throwable th;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://api.stripe.com/v1/tokens").openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(80000);
        httpURLConnection.setUseCaches(false);
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Charset", "UTF-8");
        hashMap.put("Accept", "application/json");
        hashMap.put("User-Agent", "Stripe/v1 JavaBindings/3.5.0");
        hashMap.put("Authorization", "Bearer " + ((String) pq8Var.b));
        String[] strArr = {"os.name", "os.version", "os.arch", "java.version", "java.vendor", "java.vm.version", "java.vm.vendor"};
        HashMap hashMap2 = new HashMap();
        for (int i = 0; i < 7; i++) {
            String str2 = strArr[i];
            hashMap2.put(str2, System.getProperty(str2));
        }
        hashMap2.put("bindings.version", "3.5.0");
        hashMap2.put("lang", "Java");
        hashMap2.put("publisher", "Stripe");
        hashMap.put("X-Stripe-Client-User-Agent", new JSONObject(hashMap2).toString());
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (httpURLConnection instanceof HttpsURLConnection) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(a);
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        try {
            outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(str.getBytes("UTF-8"));
                outputStream.close();
                return httpURLConnection;
            } catch (Throwable th2) {
                th = th2;
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
    }

    public static String b(HashMap hashMap) {
        String encode;
        String encode2;
        StringBuilder sb = new StringBuilder();
        for (odb odbVar : d(null, hashMap)) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            String str = odbVar.a;
            String str2 = odbVar.b;
            if (str == null) {
                encode = null;
            } else {
                encode = URLEncoder.encode(str, "UTF-8");
            }
            if (str2 == null) {
                encode2 = null;
            } else {
                encode2 = URLEncoder.encode(str2, "UTF-8");
            }
            sb.append(encode + "=" + encode2);
        }
        return sb.toString();
    }

    public static defpackage.ko9 c(java.util.HashMap r7, defpackage.pq8 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdb.c(java.util.HashMap, pq8):ko9");
    }

    public static LinkedList d(String str, Map map) {
        LinkedList linkedList = new LinkedList();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (str != null) {
                str2 = qd4.q(str, "[", str2, "]");
            }
            linkedList.addAll(e(value, str2));
        }
        return linkedList;
    }

    public static List e(Object obj, String str) {
        if (obj instanceof Map) {
            return d(str, (Map) obj);
        }
        if (obj instanceof List) {
            List<Object> list = (List) obj;
            LinkedList linkedList = new LinkedList();
            String o = qd4.o(str, "[]");
            if (list.isEmpty()) {
                linkedList.add(new odb(str, ""));
                return linkedList;
            }
            for (Object obj2 : list) {
                linkedList.addAll(e(obj2, o));
            }
            return linkedList;
        } else if (!"".equals(obj)) {
            if (obj == null) {
                LinkedList linkedList2 = new LinkedList();
                linkedList2.add(new odb(str, ""));
                return linkedList2;
            }
            LinkedList linkedList3 = new LinkedList();
            linkedList3.add(new odb(str, obj.toString()));
            return linkedList3;
        } else {
            throw new qdb(c00.j("You cannot set '", str, "' to an empty string. We interpret empty strings as null in requests. You may set '", str, "' to null to delete the property."), null, null);
        }
    }

    public static defpackage.lp f(java.util.HashMap r7, defpackage.pq8 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdb.f(java.util.HashMap, pq8):lp");
    }

    public static void g(int i, String str, String str2) {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("error");
            ize.a(jSONObject.optString("charge"));
            ize.a(jSONObject.optString("code"));
            ize.a(jSONObject.optString("decline_code"));
            str3 = ize.a(jSONObject.optString("message"));
            ize.a(jSONObject.optString("param"));
            ize.a(jSONObject.optString("type"));
        } catch (JSONException unused) {
            str3 = "An improperly formatted error response was found.";
        }
        if (i != 429) {
            switch (i) {
                case 400:
                    throw new qdb(str3, str2, null);
                case 401:
                    throw new qdb(str3, str2);
                case 402:
                    throw new qdb(str3, str2, null);
                case 403:
                    throw new qdb(str3, str2);
                case 404:
                    throw new qdb(str3, str2, null);
                default:
                    throw new qdb(str3, str2, null);
            }
        }
        throw new qdb(str3, str2, null);
    }
}
