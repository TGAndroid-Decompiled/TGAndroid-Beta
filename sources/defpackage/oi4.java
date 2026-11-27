package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
public final class oi4 {
    public static final Pattern d = Pattern.compile("[0-9]+s");
    public static final Charset e = Charset.forName("UTF-8");
    public final Context a;
    public final vw8 b;
    public final sd1 c;

    public oi4(Context context, vw8 vw8Var) {
        this.a = context;
        this.b = vw8Var;
        ?? obj = new Object();
        sae saeVar = sae.E;
        sae saeVar2 = saeVar;
        if (saeVar == null) {
            Pattern pattern = tcc.b;
            ?? obj2 = new Object();
            sae.E = obj2;
            saeVar2 = obj2;
        }
        tcc tccVar = tcc.c;
        if (tccVar == null) {
            tccVar = new tcc(saeVar2);
            tcc.c = tccVar;
        }
        obj.c = tccVar;
        this.c = obj;
    }

    public static URL a(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/".concat(str));
        } catch (MalformedURLException e2) {
            throw new w30(e2.getMessage());
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String i;
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            Log.w("Firebase-Installations", str4);
            if (TextUtils.isEmpty(str)) {
                i = "";
            } else {
                i = c00.i(", ", str);
            }
            Log.w("Firebase-Installations", c00.j("Firebase options used while communicating with Firebase server APIs: ", str2, ", ", str3, i));
        }
    }

    public static long d(String str) {
        xve.a("Invalid Expiration Timestamp.", d.matcher(str).matches());
        if (str != null && str.length() != 0) {
            return Long.parseLong(str.substring(0, str.length() - 1));
        }
        return 0L;
    }

    public static y90 e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        byte b = (byte) (0 | 1);
        jsonReader.beginObject();
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        sa0 sa0Var = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str4 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        str = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        j = d(jsonReader.nextString());
                        b = (byte) (b | 1);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                if (b == 1) {
                    sa0Var = new sa0(str, j, 0);
                    jsonReader.endObject();
                } else {
                    grb.i("Missing required properties: tokenExpirationTimestamp");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new y90(str2, str3, str4, sa0Var, 1);
    }

    public static sa0 f(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        byte b = (byte) (0 | 1);
        jsonReader.beginObject();
        long j = 0;
        String str = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                j = d(jsonReader.nextString());
                b = (byte) (b | 1);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        if (b == 1) {
            return new sa0(str, j, 1);
        }
        grb.i("Missing required properties: tokenExpirationTimestamp");
        return null;
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:19.1.2");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            vr9.l(e2);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:19.1.2");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            vr9.l(e2);
        }
    }

    public static void i(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        su3.e("Cannot send request to FIS servers. No OutputStream available.");
    }

    public final java.net.HttpURLConnection c(java.net.URL r9, java.lang.String r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi4.c(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }
}
