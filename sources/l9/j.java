package l9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n6.l;
public final class j {
    public final String f11717a;
    public final String f11718b;
    public final String f11719c;
    public final String d;
    public final String e;
    public final String f11720f;
    public final String f11721g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = u6.e.f50173a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        l.i("ApplicationId must be set.", true ^ z10);
        this.f11718b = str;
        this.f11717a = str2;
        this.f11719c = str3;
        this.d = str4;
        this.e = str5;
        this.f11720f = str6;
        this.f11721g = str7;
    }

    public static j a(Context context) {
        m5.e eVar = new m5.e(context);
        String R = eVar.R("google_app_id");
        if (TextUtils.isEmpty(R)) {
            return null;
        }
        return new j(R, eVar.R("google_api_key"), eVar.R("firebase_database_url"), eVar.R("ga_trackingId"), eVar.R("gcm_defaultSenderId"), eVar.R("google_storage_bucket"), eVar.R("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!l.k(this.f11718b, jVar.f11718b) || !l.k(this.f11717a, jVar.f11717a) || !l.k(this.f11719c, jVar.f11719c) || !l.k(this.d, jVar.d) || !l.k(this.e, jVar.e) || !l.k(this.f11720f, jVar.f11720f) || !l.k(this.f11721g, jVar.f11721g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11718b, this.f11717a, this.f11719c, this.d, this.e, this.f11720f, this.f11721g});
    }

    public final String toString() {
        m4.c cVar = new m4.c(this);
        cVar.u(this.f11718b, "applicationId");
        cVar.u(this.f11717a, "apiKey");
        cVar.u(this.f11719c, "databaseUrl");
        cVar.u(this.e, "gcmSenderId");
        cVar.u(this.f11720f, "storageBucket");
        cVar.u(this.f11721g, "projectId");
        return cVar.toString();
    }
}
