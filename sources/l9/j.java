package l9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import mi.q;
import n6.l;
public final class j {
    public final String f16040a;
    public final String f16041b;
    public final String f16042c;
    public final String d;
    public final String e;
    public final String f16043f;
    public final String f16044g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = u6.e.f48053a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        l.j("ApplicationId must be set.", true ^ z10);
        this.f16041b = str;
        this.f16040a = str2;
        this.f16042c = str3;
        this.d = str4;
        this.e = str5;
        this.f16043f = str6;
        this.f16044g = str7;
    }

    public static j a(Context context) {
        n2.e eVar = new n2.e(context);
        String E = eVar.E("google_app_id");
        if (TextUtils.isEmpty(E)) {
            return null;
        }
        return new j(E, eVar.E("google_api_key"), eVar.E("firebase_database_url"), eVar.E("ga_trackingId"), eVar.E("gcm_defaultSenderId"), eVar.E("google_storage_bucket"), eVar.E("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!l.l(this.f16041b, jVar.f16041b) || !l.l(this.f16040a, jVar.f16040a) || !l.l(this.f16042c, jVar.f16042c) || !l.l(this.d, jVar.d) || !l.l(this.e, jVar.e) || !l.l(this.f16043f, jVar.f16043f) || !l.l(this.f16044g, jVar.f16044g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16041b, this.f16040a, this.f16042c, this.d, this.e, this.f16043f, this.f16044g});
    }

    public final String toString() {
        q qVar = new q(this);
        qVar.z(this.f16041b, "applicationId");
        qVar.z(this.f16040a, "apiKey");
        qVar.z(this.f16042c, "databaseUrl");
        qVar.z(this.e, "gcmSenderId");
        qVar.z(this.f16043f, "storageBucket");
        qVar.z(this.f16044g, "projectId");
        return qVar.toString();
    }
}
