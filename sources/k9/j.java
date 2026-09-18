package k9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n4.y;
import n6.l;
public final class j {
    public final String f13557a;
    public final String f13558b;
    public final String f13559c;
    public final String d;
    public final String e;
    public final String f13560f;
    public final String f13561g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = u6.e.f43886a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        l.j("ApplicationId must be set.", true ^ z10);
        this.f13558b = str;
        this.f13557a = str2;
        this.f13559c = str3;
        this.d = str4;
        this.e = str5;
        this.f13560f = str6;
        this.f13561g = str7;
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
        if (!l.l(this.f13558b, jVar.f13558b) || !l.l(this.f13557a, jVar.f13557a) || !l.l(this.f13559c, jVar.f13559c) || !l.l(this.d, jVar.d) || !l.l(this.e, jVar.e) || !l.l(this.f13560f, jVar.f13560f) || !l.l(this.f13561g, jVar.f13561g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13558b, this.f13557a, this.f13559c, this.d, this.e, this.f13560f, this.f13561g});
    }

    public final String toString() {
        y yVar = new y(this);
        yVar.k(this.f13558b, "applicationId");
        yVar.k(this.f13557a, "apiKey");
        yVar.k(this.f13559c, "databaseUrl");
        yVar.k(this.e, "gcmSenderId");
        yVar.k(this.f13560f, "storageBucket");
        yVar.k(this.f13561g, "projectId");
        return yVar.toString();
    }
}
