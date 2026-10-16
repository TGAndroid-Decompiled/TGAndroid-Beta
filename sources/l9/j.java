package l9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import m2.t;
import n6.l;
public final class j {
    public final String f14636a;
    public final String f14637b;
    public final String f14638c;
    public final String d;
    public final String e;
    public final String f14639f;
    public final String f14640g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = u6.e.f46215a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        l.j("ApplicationId must be set.", true ^ z10);
        this.f14637b = str;
        this.f14636a = str2;
        this.f14638c = str3;
        this.d = str4;
        this.e = str5;
        this.f14639f = str6;
        this.f14640g = str7;
    }

    public static j a(Context context) {
        n3.b bVar = new n3.b(context);
        String D = bVar.D("google_app_id");
        if (TextUtils.isEmpty(D)) {
            return null;
        }
        return new j(D, bVar.D("google_api_key"), bVar.D("firebase_database_url"), bVar.D("ga_trackingId"), bVar.D("gcm_defaultSenderId"), bVar.D("google_storage_bucket"), bVar.D("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!l.l(this.f14637b, jVar.f14637b) || !l.l(this.f14636a, jVar.f14636a) || !l.l(this.f14638c, jVar.f14638c) || !l.l(this.d, jVar.d) || !l.l(this.e, jVar.e) || !l.l(this.f14639f, jVar.f14639f) || !l.l(this.f14640g, jVar.f14640g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14637b, this.f14636a, this.f14638c, this.d, this.e, this.f14639f, this.f14640g});
    }

    public final String toString() {
        t tVar = new t(this);
        tVar.q(this.f14637b, "applicationId");
        tVar.q(this.f14636a, "apiKey");
        tVar.q(this.f14638c, "databaseUrl");
        tVar.q(this.e, "gcmSenderId");
        tVar.q(this.f14639f, "storageBucket");
        tVar.q(this.f14640g, "projectId");
        return tVar.toString();
    }
}
