package defpackage;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
public final class q89 extends eeb implements fs4 {
    public byte a;
    public final r89 b;
    public final Map c;
    public final hj1 d;
    public final o83 e;

    public q89(r89 r89Var, Map map, hj1 hj1Var, o83 o83Var, px2 px2Var) {
        super(2, px2Var);
        this.b = r89Var;
        this.c = map;
        this.d = hj1Var;
        this.e = o83Var;
    }

    @Override
    public final px2 create(Object obj, px2 px2Var) {
        return new q89(this.b, this.c, this.d, this.e, px2Var);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((q89) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        o83 o83Var = this.e;
        ly2 ly2Var = ly2.a;
        try {
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            this.a = (byte) 3;
            o83Var.invoke(message, this);
            if (g7cVar == ly2Var) {
            }
        }
        if (b != 0) {
            if (b != 1 && b != 2) {
                if (b == 3) {
                    tue.b(obj);
                } else {
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                tue.b(obj);
            }
        } else {
            tue.b(obj);
            URLConnection openConnection = this.b.a().openConnection();
            openConnection.getClass();
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setRequestProperty("Accept", "application/json");
            for (Map.Entry entry : this.c.entrySet()) {
                httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = httpsURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                bufferedReader.close();
                inputStream.close();
                JSONObject jSONObject = new JSONObject(sb.toString());
                hj1 hj1Var = this.d;
                this.a = (byte) 1;
                if (hj1Var.invoke(jSONObject, this) == ly2Var) {
                    return ly2Var;
                }
            } else {
                this.a = (byte) 2;
                o83Var.invoke("Bad response code: " + responseCode, this);
                if (g7cVar == ly2Var) {
                    return ly2Var;
                }
            }
        }
        return g7cVar;
    }
}
