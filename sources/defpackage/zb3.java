package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
public final class zb3 implements Callable {
    public final byte a;
    public final ac3 b;

    public zb3(ac3 ac3Var, byte b) {
        this.a = b;
        this.b = ac3Var;
    }

    private final Object a() {
        String byteArrayOutputStream;
        ac3 ac3Var = this.b;
        synchronized (ac3Var) {
            rf5 rf5Var = (rf5) ac3Var.a.get();
            ArrayList b = rf5Var.b();
            rf5Var.a();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < b.size(); i++) {
                ua0 ua0Var = (ua0) b.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", ua0Var.a);
                jSONObject.put("dates", new JSONArray((Collection) ua0Var.b));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
            try {
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    @Override
    public final Object call() {
        switch (this.a) {
            case 0:
                return a();
            default:
                ac3 ac3Var = this.b;
                synchronized (ac3Var) {
                    ((rf5) ac3Var.a.get()).i(System.currentTimeMillis(), ((ge3) ac3Var.c.get()).a());
                }
                return null;
        }
    }
}
