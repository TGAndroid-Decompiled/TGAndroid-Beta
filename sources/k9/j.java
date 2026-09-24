package k9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n4.y;
import n6.l;
public final class j {
    public final String f13544a;
    public final String f13545b;
    public final String f13546c;
    public final String d;
    public final String e;
    public final String f13547f;
    public final String f13548g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = u6.e.f43902a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        l.j("ApplicationId must be set.", true ^ z10);
        this.f13545b = str;
        this.f13544a = str2;
        this.f13546c = str3;
        this.d = str4;
        this.e = str5;
        this.f13547f = str6;
        this.f13548g = str7;
    }

    public static j a(Context context) {
        of.b bVar = new of.b(context, 29);
        String N = bVar.N("google_app_id");
        if (TextUtils.isEmpty(N)) {
            return null;
        }
        return new j(N, bVar.N("google_api_key"), bVar.N("firebase_database_url"), bVar.N("ga_trackingId"), bVar.N("gcm_defaultSenderId"), bVar.N("google_storage_bucket"), bVar.N("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!l.l(this.f13545b, jVar.f13545b) || !l.l(this.f13544a, jVar.f13544a) || !l.l(this.f13546c, jVar.f13546c) || !l.l(this.d, jVar.d) || !l.l(this.e, jVar.e) || !l.l(this.f13547f, jVar.f13547f) || !l.l(this.f13548g, jVar.f13548g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13545b, this.f13544a, this.f13546c, this.d, this.e, this.f13547f, this.f13548g});
    }

    public final String toString() {
        y yVar = new y(this);
        yVar.k(this.f13545b, "applicationId");
        yVar.k(this.f13544a, "apiKey");
        yVar.k(this.f13546c, "databaseUrl");
        yVar.k(this.e, "gcmSenderId");
        yVar.k(this.f13547f, "storageBucket");
        yVar.k(this.f13548g, "projectId");
        return yVar.toString();
    }
}
