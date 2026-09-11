package k9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n4.y;
import n6.l;
public final class j {
    public final String f14868a;
    public final String f14869b;
    public final String f14870c;
    public final String d;
    public final String f14871e;
    public final String f14872f;
    public final String f14873g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = u6.e.f46959a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        l.j("ApplicationId must be set.", true ^ z10);
        this.f14869b = str;
        this.f14868a = str2;
        this.f14870c = str3;
        this.d = str4;
        this.f14871e = str5;
        this.f14872f = str6;
        this.f14873g = str7;
    }

    public static j a(Context context) {
        pf.b bVar = new pf.b(context, 29);
        String X = bVar.X("google_app_id");
        if (TextUtils.isEmpty(X)) {
            return null;
        }
        return new j(X, bVar.X("google_api_key"), bVar.X("firebase_database_url"), bVar.X("ga_trackingId"), bVar.X("gcm_defaultSenderId"), bVar.X("google_storage_bucket"), bVar.X("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!l.l(this.f14869b, jVar.f14869b) || !l.l(this.f14868a, jVar.f14868a) || !l.l(this.f14870c, jVar.f14870c) || !l.l(this.d, jVar.d) || !l.l(this.f14871e, jVar.f14871e) || !l.l(this.f14872f, jVar.f14872f) || !l.l(this.f14873g, jVar.f14873g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14869b, this.f14868a, this.f14870c, this.d, this.f14871e, this.f14872f, this.f14873g});
    }

    public final String toString() {
        y yVar = new y(this);
        yVar.y(this.f14869b, "applicationId");
        yVar.y(this.f14868a, "apiKey");
        yVar.y(this.f14870c, "databaseUrl");
        yVar.y(this.f14871e, "gcmSenderId");
        yVar.y(this.f14872f, "storageBucket");
        yVar.y(this.f14873g, "projectId");
        return yVar.toString();
    }
}
