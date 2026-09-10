package na;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
public final class b implements Callable {
    public final int f14020a;
    public final c f14021b;

    public b(c cVar, int i10) {
        this.f14020a = i10;
        this.f14021b = cVar;
    }

    private final Object a() {
        String byteArrayOutputStream;
        c cVar = this.f14021b;
        synchronized (cVar) {
            try {
                g gVar = (g) cVar.f14022a.get();
                ArrayList c10 = gVar.c();
                gVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < c10.size(); i10++) {
                    a aVar = (a) c10.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", aVar.f14018a);
                    jSONObject.put("dates", new JSONArray((Collection) aVar.f14019b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return byteArrayOutputStream;
    }

    @Override
    public final Object call() {
        switch (this.f14020a) {
            case 0:
                return a();
            default:
                c cVar = this.f14021b;
                synchronized (cVar) {
                    ((g) cVar.f14022a.get()).k(System.currentTimeMillis(), ((xa.b) cVar.f14024c.get()).a());
                }
                return null;
        }
    }
}
