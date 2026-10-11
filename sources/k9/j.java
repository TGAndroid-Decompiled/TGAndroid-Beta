package k9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n4.x;
import n6.k;
import n6.m;
public final class j {
    public final String f14758a;
    public final String f14759b;
    public final String f14760c;
    public final String d;
    public final String f14761e;
    public final String f14762f;
    public final String f14763g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = u6.e.f48947a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        m.j("ApplicationId must be set.", true ^ z10);
        this.f14759b = str;
        this.f14758a = str2;
        this.f14760c = str3;
        this.d = str4;
        this.f14761e = str5;
        this.f14762f = str6;
        this.f14763g = str7;
    }

    public static j a(Context context) {
        x xVar = new x(context);
        String M = xVar.M("google_app_id");
        if (TextUtils.isEmpty(M)) {
            return null;
        }
        return new j(M, xVar.M("google_api_key"), xVar.M("firebase_database_url"), xVar.M("ga_trackingId"), xVar.M("gcm_defaultSenderId"), xVar.M("google_storage_bucket"), xVar.M("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!m.l(this.f14759b, jVar.f14759b) || !m.l(this.f14758a, jVar.f14758a) || !m.l(this.f14760c, jVar.f14760c) || !m.l(this.d, jVar.d) || !m.l(this.f14761e, jVar.f14761e) || !m.l(this.f14762f, jVar.f14762f) || !m.l(this.f14763g, jVar.f14763g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14759b, this.f14758a, this.f14760c, this.d, this.f14761e, this.f14762f, this.f14763g});
    }

    public final String toString() {
        k kVar = new k(this);
        kVar.m(this.f14759b, "applicationId");
        kVar.m(this.f14758a, "apiKey");
        kVar.m(this.f14760c, "databaseUrl");
        kVar.m(this.f14761e, "gcmSenderId");
        kVar.m(this.f14762f, "storageBucket");
        kVar.m(this.f14763g, "projectId");
        return kVar.toString();
    }
}
