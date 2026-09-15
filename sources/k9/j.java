package k9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n4.y;
import n6.l;
public final class j {
    public final String f13556a;
    public final String f13557b;
    public final String f13558c;
    public final String d;
    public final String e;
    public final String f13559f;
    public final String f13560g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = u6.e.f43631a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        l.j("ApplicationId must be set.", true ^ z10);
        this.f13557b = str;
        this.f13556a = str2;
        this.f13558c = str3;
        this.d = str4;
        this.e = str5;
        this.f13559f = str6;
        this.f13560g = str7;
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
        if (!l.l(this.f13557b, jVar.f13557b) || !l.l(this.f13556a, jVar.f13556a) || !l.l(this.f13558c, jVar.f13558c) || !l.l(this.d, jVar.d) || !l.l(this.e, jVar.e) || !l.l(this.f13559f, jVar.f13559f) || !l.l(this.f13560g, jVar.f13560g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13557b, this.f13556a, this.f13558c, this.d, this.e, this.f13559f, this.f13560g});
    }

    public final String toString() {
        y yVar = new y(this);
        yVar.e(this.f13557b, "applicationId");
        yVar.e(this.f13556a, "apiKey");
        yVar.e(this.f13558c, "databaseUrl");
        yVar.e(this.e, "gcmSenderId");
        yVar.e(this.f13559f, "storageBucket");
        yVar.e(this.f13560g, "projectId");
        return yVar.toString();
    }
}
