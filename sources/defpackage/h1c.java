package defpackage;

import android.net.Uri;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import org.json.JSONArray;
import org.json.JSONTokener;
public final class h1c extends Thread {
    public final String a;
    public final String b;
    public final String c;
    public final jac d;

    public h1c(String str, String str2, String str3, jac jacVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = jacVar;
    }

    @Override
    public final void run() {
        HttpURLConnection httpURLConnection;
        Integer num;
        String str;
        jac jacVar = this.d;
        String str2 = this.c;
        boolean z = false;
        String str3 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URI(("https://translate.googleapis.com/translate_a/single?client=gtx&sl=" + Uri.encode(this.a) + "&tl=" + Uri.encode(this.b) + "&dt=t&ie=UTF-8&oe=UTF-8&otf=1&ssel=0&tsel=0&kc=7&dt=at&dt=bd&dt=ex&dt=ld&dt=md&dt=qca&dt=rw&dt=rm&dt=ss&q=") + str2).toURL().openConnection();
        } catch (Exception e) {
            e = e;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("User-Agent", s1c.R1[(int) Math.round(Math.random() * 5.0d)]);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), kl1.a));
            while (true) {
                int read = bufferedReader.read();
                if (read == -1) {
                    break;
                }
                sb.append((char) read);
            }
            bufferedReader.close();
            JSONArray jSONArray = new JSONArray(new JSONTokener(sb.toString()));
            JSONArray jSONArray2 = jSONArray.getJSONArray(0);
            try {
                str = jSONArray.getString(2);
            } catch (Exception unused) {
                str = null;
            }
            if (str != null && str.contains("-")) {
                str.substring(0, str.indexOf("-"));
            }
            String str4 = "";
            for (int i = 0; i < jSONArray2.length(); i++) {
                String string = jSONArray2.getJSONArray(i).getString(0);
                if (string != null && !string.equals("null")) {
                    str4 = str4 + string;
                }
            }
            if (str2.length() > 0 && str2.charAt(0) == '\n') {
                str4 = "\n" + str4;
            }
            gm.c3(new g1c(jacVar, str4, (byte) 0));
        } catch (Exception e2) {
            e = e2;
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("failed to translate a text ");
                if (httpURLConnection != null) {
                    num = Integer.valueOf(httpURLConnection.getResponseCode());
                } else {
                    num = null;
                }
                sb2.append(num);
                sb2.append(" ");
                if (httpURLConnection != null) {
                    str3 = httpURLConnection.getResponseMessage();
                }
                sb2.append(str3);
                Log.e("translate", sb2.toString());
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            e.printStackTrace();
            if (httpURLConnection != null) {
                try {
                    if (httpURLConnection.getResponseCode() == 429) {
                        z = true;
                    }
                } catch (Exception unused2) {
                    gm.c3(new c25(jacVar, (byte) 7));
                    return;
                }
            }
            gm.c3(new n28((byte) 23, jacVar, z));
        }
    }
}
