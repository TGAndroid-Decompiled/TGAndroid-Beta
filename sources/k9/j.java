package k9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n4.y;
import n6.l;
public final class j {
    public final String f13559a;
    public final String f13560b;
    public final String f13561c;
    public final String d;
    public final String e;
    public final String f13562f;
    public final String f13563g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = u6.e.f43659a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        l.j("ApplicationId must be set.", true ^ z10);
        this.f13560b = str;
        this.f13559a = str2;
        this.f13561c = str3;
        this.d = str4;
        this.e = str5;
        this.f13562f = str6;
        this.f13563g = str7;
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
        if (!l.l(this.f13560b, jVar.f13560b) || !l.l(this.f13559a, jVar.f13559a) || !l.l(this.f13561c, jVar.f13561c) || !l.l(this.d, jVar.d) || !l.l(this.e, jVar.e) || !l.l(this.f13562f, jVar.f13562f) || !l.l(this.f13563g, jVar.f13563g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13560b, this.f13559a, this.f13561c, this.d, this.e, this.f13562f, this.f13563g});
    }

    public final String toString() {
        y yVar = new y(this);
        yVar.e(this.f13560b, "applicationId");
        yVar.e(this.f13559a, "apiKey");
        yVar.e(this.f13561c, "databaseUrl");
        yVar.e(this.e, "gcmSenderId");
        yVar.e(this.f13562f, "storageBucket");
        yVar.e(this.f13563g, "projectId");
        return yVar.toString();
    }
}
