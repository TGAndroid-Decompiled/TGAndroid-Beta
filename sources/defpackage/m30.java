package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
public final class m30 implements rgf {
    public long a;
    public Object b;
    public Object c;

    public m30(File file, long j, byte[] bArr) {
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

    public static m30 c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new m30(jSONObject.getString("token"), jSONObject.getLong("timestamp"), jSONObject.getString("appVersion"));
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e);
                return null;
            }
        }
        return new m30(str, 0L, (Object) null);
    }

    public final n30 a() {
        Object obj;
        boolean z;
        if (!((bqb) this.b).p() && (obj = this.c) != null) {
            if (((bqb) this.b).b(obj) != -1) {
                z = true;
            } else {
                z = false;
            }
            jte.f(z);
        }
        return new n30(this);
    }

    @Override
    public final ry zza() {
        long j = this.a;
        ?? obj = new Object();
        obj.c = x6f.TYPE_THIN;
        uqd uqdVar = new uqd((byte) 10);
        uqdVar.d = ((yoe) this.b).e.a();
        uqdVar.b = (o7f) this.c;
        uqdVar.c = Long.valueOf((SystemClock.elapsedRealtime() - j) & Long.MAX_VALUE);
        obj.e = new ndf(uqdVar);
        return new ry((ovb) obj, 0);
    }

    public m30() {
        this.a = 0L;
        this.b = bqb.a;
        this.c = null;
    }

    public m30(Object obj, long j, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }
}
