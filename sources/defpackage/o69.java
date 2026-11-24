package defpackage;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
public final class o69 extends ccb implements eq4 {
    public byte a;
    public final p69 b;
    public final Map c;
    public final ai1 d;
    public final c73 e;

    public o69(p69 p69Var, Map map, ai1 ai1Var, c73 c73Var, fw2 fw2Var) {
        super(2, fw2Var);
        this.b = p69Var;
        this.c = map;
        this.d = ai1Var;
        this.e = c73Var;
    }

    @Override
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new o69(this.b, this.c, this.d, this.e, fw2Var);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((o69) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        c73 c73Var = this.e;
        bx2 bx2Var = bx2.a;
        try {
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            this.a = (byte) 3;
            c73Var.invoke(message, this);
            if (g5cVar == bx2Var) {
            }
        }
        if (b != 0) {
            if (b != 1 && b != 2) {
                if (b == 3) {
                    qse.b(obj);
                } else {
                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                qse.b(obj);
            }
        } else {
            qse.b(obj);
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
                ai1 ai1Var = this.d;
                this.a = (byte) 1;
                if (ai1Var.invoke(jSONObject, this) == bx2Var) {
                    return bx2Var;
                }
            } else {
                this.a = (byte) 2;
                c73Var.invoke("Bad response code: " + responseCode, this);
                if (g5cVar == bx2Var) {
                    return bx2Var;
                }
            }
        }
        return g5cVar;
    }
}
