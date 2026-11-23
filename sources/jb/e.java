package jb;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import zd.z;
public final class e extends kd.j implements rd.p {
    public int f17379a;
    public final f f17380b;
    public final Object f17381c;
    public final be.l d;
    public final c f17382e;

    public e(f fVar, Map map, be.l lVar, c cVar, id.c cVar2) {
        super(2, cVar2);
        this.f17380b = fVar;
        this.f17381c = map;
        this.d = lVar;
        this.f17382e = cVar;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        return new e(this.f17380b, this.f17381c, this.d, this.f17382e, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.f13517a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f17409a;
        int i7 = this.f17379a;
        gd.k kVar = gd.k.f13517a;
        c cVar = this.f17382e;
        try {
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = e10.toString();
            }
            this.f17379a = 3;
            cVar.invoke(message, this);
            if (kVar == aVar) {
            }
        }
        if (i7 != 0) {
            if (i7 != 1 && i7 != 2) {
                if (i7 == 3) {
                    b7.h.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                b7.h.b(obj);
            }
        } else {
            b7.h.b(obj);
            URLConnection openConnection = f.a(this.f17380b).openConnection();
            kotlin.jvm.internal.j.c(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setRequestProperty("Accept", "application/json");
            for (Map.Entry entry : this.f17381c.entrySet()) {
                httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = httpsURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                }
                bufferedReader.close();
                inputStream.close();
                JSONObject jSONObject = new JSONObject(sb2.toString());
                be.l lVar = this.d;
                this.f17379a = 1;
                if (lVar.invoke(jSONObject, this) == aVar) {
                    return aVar;
                }
            } else {
                this.f17379a = 2;
                cVar.invoke("Bad response code: " + responseCode, this);
                if (kVar == aVar) {
                    return aVar;
                }
            }
        }
        return kVar;
    }
}
