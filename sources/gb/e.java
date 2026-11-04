package gb;

import b8.ib;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import wd.z;
public final class e extends hd.j implements od.p {
    public int f12211a;
    public final f f12212b;
    public final Object f12213c;
    public final ae.d d;
    public final c f12214e;

    public e(f fVar, Map map, ae.d dVar, c cVar, fd.c cVar2) {
        super(2, cVar2);
        this.f12212b = fVar;
        this.f12213c = map;
        this.d = dVar;
        this.f12214e = cVar;
    }

    @Override
    public final fd.c create(Object obj, fd.c cVar) {
        return new e(this.f12212b, this.f12213c, this.d, this.f12214e, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((z) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        gd.a aVar = gd.a.f12241a;
        int i3 = this.f12211a;
        dd.k kVar = dd.k.f8801a;
        c cVar = this.f12214e;
        try {
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = e10.toString();
            }
            this.f12211a = 3;
            cVar.invoke(message, this);
            if (kVar == aVar) {
            }
        }
        if (i3 != 0) {
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3) {
                    ib.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ib.b(obj);
            }
        } else {
            ib.b(obj);
            URLConnection openConnection = f.a(this.f12212b).openConnection();
            kotlin.jvm.internal.j.c(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setRequestProperty("Accept", "application/json");
            for (Map.Entry entry : this.f12213c.entrySet()) {
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
                ae.d dVar = this.d;
                this.f12211a = 1;
                if (dVar.invoke(jSONObject, this) == aVar) {
                    return aVar;
                }
            } else {
                this.f12211a = 2;
                cVar.invoke("Bad response code: " + responseCode, this);
                if (kVar == aVar) {
                    return aVar;
                }
            }
        }
        return kVar;
    }
}
