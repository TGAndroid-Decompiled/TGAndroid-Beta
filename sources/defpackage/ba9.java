package defpackage;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
public final class ba9 extends yfb implements is4 {
    public byte a;
    public final ca9 b;
    public final Map c;
    public final ii1 d;
    public final v73 e;

    public ba9(ca9 ca9Var, Map map, ii1 ii1Var, v73 v73Var, zw2 zw2Var) {
        super(2, zw2Var);
        this.b = ca9Var;
        this.c = map;
        this.d = ii1Var;
        this.e = v73Var;
    }

    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new ba9(this.b, this.c, this.d, this.e, zw2Var);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((ba9) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        v73 v73Var = this.e;
        vx2 vx2Var = vx2.a;
        try {
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            this.a = (byte) 3;
            v73Var.invoke(message, this);
            if (f9cVar == vx2Var) {
            }
        }
        if (b != 0) {
            if (b != 1 && b != 2) {
                if (b == 3) {
                    ixe.b(obj);
                } else {
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                ixe.b(obj);
            }
        } else {
            ixe.b(obj);
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
                ii1 ii1Var = this.d;
                this.a = (byte) 1;
                if (ii1Var.invoke(jSONObject, this) == vx2Var) {
                    return vx2Var;
                }
            } else {
                this.a = (byte) 2;
                v73Var.invoke("Bad response code: " + responseCode, this);
                if (f9cVar == vx2Var) {
                    return vx2Var;
                }
            }
        }
        return f9cVar;
    }
}
