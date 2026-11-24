package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
public final class m20 implements qef {
    public long a;
    public Object b;
    public Object c;

    public m20(File file, long j, byte[] bArr) {
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

    public static m20 c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new m20(jSONObject.getString("token"), jSONObject.getLong("timestamp"), jSONObject.getString("appVersion"));
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e);
                return null;
            }
        }
        return new m20(str, 0L, (Object) null);
    }

    public final n20 a() {
        Object obj;
        boolean z;
        if (!((aob) this.b).p() && (obj = this.c) != null) {
            if (((aob) this.b).b(obj) != -1) {
                z = true;
            } else {
                z = false;
            }
            gre.f(z);
        }
        return new n20(this);
    }

    @Override
    public final qx zza() {
        long j = this.a;
        ?? obj = new Object();
        obj.c = v4f.TYPE_THIN;
        rod rodVar = new rod((byte) 10);
        rodVar.d = ((vme) this.b).e.a();
        rodVar.b = (m5f) this.c;
        rodVar.c = Long.valueOf((SystemClock.elapsedRealtime() - j) & Long.MAX_VALUE);
        obj.e = new mbf(rodVar);
        return new qx((ntb) obj, 0);
    }

    public m20() {
        this.a = 0L;
        this.b = aob.a;
        this.c = null;
    }

    public m20(Object obj, long j, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }
}
