package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
public final class n20 implements gjf {
    public long a;
    public Object b;
    public Object c;

    public n20(File file, long j, byte[] bArr) {
        byte[] bArr2;
        this.b = file;
        this.a = j;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.c = bArr2;
    }

    public static String b(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public static n20 c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new n20(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e);
                return null;
            }
        }
        return new n20(0L, str, (Object) null);
    }

    public final o20 a() {
        Object obj;
        boolean z;
        if (!((asb) this.b).p() && (obj = this.c) != null) {
            if (((asb) this.b).b(obj) != -1) {
                z = true;
            } else {
                z = false;
            }
            yve.f(z);
        }
        return new o20(this);
    }

    @Override
    public final rx zza() {
        long j = this.a;
        ?? obj = new Object();
        obj.c = m9f.TYPE_THIN;
        htd htdVar = new htd((byte) 10);
        htdVar.d = ((mre) this.b).e.a();
        htdVar.b = (daf) this.c;
        htdVar.c = Long.valueOf((SystemClock.elapsedRealtime() - j) & Long.MAX_VALUE);
        obj.e = new cgf(htdVar);
        return new rx((oxb) obj, 0);
    }

    public n20() {
        this.a = 0L;
        this.b = asb.a;
        this.c = null;
    }

    public n20(long j, Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }
}
