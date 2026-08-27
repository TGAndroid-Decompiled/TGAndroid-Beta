package ec;

import a5.n;
import cc.e;
import cc.f;
import g7.k7;
import g7.v6;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.Security;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Cells.pa;

public abstract class c {

    public static final d f5371a = new d();

    public static HttpURLConnection a(String str, a aVar) throws Throwable {
        Throwable th;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://api.stripe.com/v1/tokens").openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(80000);
        httpURLConnection.setUseCaches(false);
        HashMap map = new HashMap();
        map.put("Accept-Charset", "UTF-8");
        map.put("Accept", "application/json");
        map.put("User-Agent", "Stripe/v1 JavaBindings/3.5.0");
        map.put("Authorization", "Bearer " + aVar.f5368b);
        String[] strArr = {"os.name", "os.version", "os.arch", "java.version", "java.vendor", "java.vm.version", "java.vm.vendor"};
        HashMap map2 = new HashMap();
        for (int i10 = 0; i10 < 7; i10++) {
            String str2 = strArr[i10];
            map2.put(str2, System.getProperty(str2));
        }
        map2.put("bindings.version", "3.5.0");
        map2.put("lang", "Java");
        map2.put("publisher", "Stripe");
        map.put("X-Stripe-Client-User-Agent", new JSONObject(map2).toString());
        for (Map.Entry entry : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (httpURLConnection instanceof HttpsURLConnection) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(f5371a);
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
                if (outputStream == null) {
                    throw th;
                }
                outputStream.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
    }

    public static String b(HashMap map) {
        StringBuilder sb2 = new StringBuilder();
        for (b bVar : d(null, map)) {
            if (sb2.length() > 0) {
                sb2.append("&");
            }
            String str = bVar.f5369a;
            String str2 = bVar.f5370b;
            sb2.append((str == null ? null : URLEncoder.encode(str, "UTF-8")) + "=" + (str2 == null ? null : URLEncoder.encode(str2, "UTF-8")));
        }
        return sb2.toString();
    }

    public static n c(HashMap map, a aVar) {
        String property;
        Boolean bool = Boolean.TRUE;
        n nVarA = null;
        try {
            property = Security.getProperty("networkaddress.cache.ttl");
            try {
                Security.setProperty("networkaddress.cache.ttl", "0");
            } catch (SecurityException unused) {
                bool = Boolean.FALSE;
            }
        } catch (SecurityException unused2) {
            property = null;
        }
        if (aVar.f5368b.trim().isEmpty()) {
            throw new cc.c("No API key provided. (HINT: set your API key using 'Stripe.apiKey = <API-KEY>'. You can generate API keys from the Stripe web interface. See https://stripe.com/api for details or email support@stripe.com if you have questions.", null);
        }
        try {
            b6.a aVarF = f(map, aVar);
            int i10 = aVarF.f2034c;
            String str = (String) aVarF.f2033b;
            Map map2 = (Map) aVarF.d;
            List list = map2 == null ? null : (List) map2.get("Request-Id");
            String str2 = (list == null || list.size() <= 0) ? null : (String) list.get(0);
            if (i10 < 200 || i10 >= 300) {
                g(i10, str, str2);
                throw null;
            }
            nVarA = v6.a(str);
            if (bool.booleanValue()) {
                if (property == null) {
                    Security.setProperty("networkaddress.cache.ttl", "-1");
                } else {
                    Security.setProperty("networkaddress.cache.ttl", property);
                }
            }
            return nVarA;
        } catch (JSONException unused3) {
            if (bool.booleanValue()) {
                if (property != null) {
                    Security.setProperty("networkaddress.cache.ttl", property);
                }
            }
        } catch (Throwable th) {
            if (bool.booleanValue()) {
                if (property == null) {
                    Security.setProperty("networkaddress.cache.ttl", "-1");
                } else {
                    Security.setProperty("networkaddress.cache.ttl", property);
                }
            }
            throw th;
        }
    }

    public static LinkedList d(String str, Map map) {
        LinkedList linkedList = new LinkedList();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (str != null) {
                    str2 = str + "[" + str2 + "]";
                }
                linkedList.addAll(e(value, str2));
            }
        }
        return linkedList;
    }

    public static List e(Object obj, String str) throws cc.d {
        if (obj instanceof Map) {
            return d(str, (Map) obj);
        }
        if (!(obj instanceof List)) {
            if ("".equals(obj)) {
                throw new cc.d(pa.j("You cannot set '", str, "' to an empty string. We interpret empty strings as null in requests. You may set '", str, "' to null to delete the property."), null, null);
            }
            if (obj == null) {
                LinkedList linkedList = new LinkedList();
                linkedList.add(new b(str, ""));
                return linkedList;
            }
            LinkedList linkedList2 = new LinkedList();
            linkedList2.add(new b(str, obj.toString()));
            return linkedList2;
        }
        List list = (List) obj;
        LinkedList linkedList3 = new LinkedList();
        Iterator it = list.iterator();
        String strL = s3.c.l(str, "[]");
        if (list.isEmpty()) {
            linkedList3.add(new b(str, ""));
            return linkedList3;
        }
        while (it.hasNext()) {
            linkedList3.addAll(e(it.next(), strL));
        }
        return linkedList3;
    }

    public static b6.a f(HashMap map, a aVar) throws Throwable {
        String next;
        ?? r10 = 0;
        try {
            String strB = b(map);
            try {
                try {
                    HttpURLConnection httpURLConnectionA = a(strB, aVar);
                    try {
                        int responseCode = httpURLConnectionA.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            InputStream errorStream = httpURLConnectionA.getErrorStream();
                            next = new Scanner(errorStream, "UTF-8").useDelimiter("\\A").next();
                            errorStream.close();
                        } else {
                            InputStream inputStream = httpURLConnectionA.getInputStream();
                            next = new Scanner(inputStream, "UTF-8").useDelimiter("\\A").next();
                            inputStream.close();
                        }
                        Map<String, List<String>> headerFields = httpURLConnectionA.getHeaderFields();
                        b6.a aVar2 = new b6.a((char) 0, 6);
                        aVar2.f2034c = responseCode;
                        aVar2.f2033b = next;
                        aVar2.d = headerFields;
                        httpURLConnectionA.disconnect();
                        return aVar2;
                    } catch (IOException e9) {
                        e = e9;
                        throw new cc.a("IOException during API request to Stripe (https://api.stripe.com/v1/tokens): " + e.getMessage() + " Please check your internet connection and try again. If this problem persists, you should check Stripe's service status at https://twitter.com/stripestatus, or let us know at support@stripe.com.", null, e);
                    }
                } catch (Throwable th) {
                    th = th;
                    r10 = strB;
                    if (r10 != 0) {
                        r10.disconnect();
                    }
                    throw th;
                }
            } catch (IOException e10) {
                e = e10;
            } catch (Throwable th2) {
                th = th2;
                if (r10 != 0) {
                    r10.disconnect();
                }
                throw th;
            }
        } catch (UnsupportedEncodingException e11) {
            throw new cc.d("Unable to encode parameters to UTF-8. Please contact support@stripe.com for assistance.", null, e11);
        }
    }

    public static void g(int i10, String str, String str2) throws cc.d, cc.b, cc.c {
        String strA;
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("error");
            k7.a(jSONObject.optString("charge"));
            k7.a(jSONObject.optString("code"));
            k7.a(jSONObject.optString("decline_code"));
            strA = k7.a(jSONObject.optString("message"));
            k7.a(jSONObject.optString("param"));
            k7.a(jSONObject.optString("type"));
        } catch (JSONException unused) {
            strA = "An improperly formatted error response was found.";
        }
        if (i10 == 429) {
            throw new f(strA, str2, null);
        }
        switch (i10) {
            case 400:
                throw new cc.d(strA, str2, null);
            case 401:
                throw new cc.c(strA, str2);
            case 402:
                throw new cc.d(strA, str2, null);
            case 403:
                throw new e(strA, str2);
            case 404:
                throw new cc.d(strA, str2, null);
            default:
                throw new cc.b(strA, str2, null);
        }
    }
}
