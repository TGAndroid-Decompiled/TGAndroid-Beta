package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
public final class na3 implements Callable {
    public final byte a;
    public final oa3 b;

    public na3(oa3 oa3Var, byte b) {
        this.a = b;
        this.b = oa3Var;
    }

    private final Object a() {
        String byteArrayOutputStream;
        oa3 oa3Var = this.b;
        synchronized (oa3Var) {
            td5 td5Var = (td5) oa3Var.a.get();
            ArrayList b = td5Var.b();
            td5Var.a();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < b.size(); i++) {
                u90 u90Var = (u90) b.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", u90Var.a);
                jSONObject.put("dates", new JSONArray((Collection) u90Var.b));
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
                oa3 oa3Var = this.b;
                synchronized (oa3Var) {
                    ((td5) oa3Var.a.get()).i(System.currentTimeMillis(), ((tc3) oa3Var.c.get()).a());
                }
                return null;
        }
    }
}
