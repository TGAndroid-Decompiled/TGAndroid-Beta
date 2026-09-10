package k9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n6.l;
import za.y;
public final class j {
    public final String f12402a;
    public final String f12403b;
    public final String f12404c;
    public final String d;
    public final String e;
    public final String f12405f;
    public final String f12406g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = u6.e.f42602a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        l.j("ApplicationId must be set.", true ^ z10);
        this.f12403b = str;
        this.f12402a = str2;
        this.f12404c = str3;
        this.d = str4;
        this.e = str5;
        this.f12405f = str6;
        this.f12406g = str7;
    }

    public static j a(Context context) {
        y yVar = new y(context);
        String a2 = yVar.a("google_app_id");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return new j(a2, yVar.a("google_api_key"), yVar.a("firebase_database_url"), yVar.a("ga_trackingId"), yVar.a("gcm_defaultSenderId"), yVar.a("google_storage_bucket"), yVar.a("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!l.l(this.f12403b, jVar.f12403b) || !l.l(this.f12402a, jVar.f12402a) || !l.l(this.f12404c, jVar.f12404c) || !l.l(this.d, jVar.d) || !l.l(this.e, jVar.e) || !l.l(this.f12405f, jVar.f12405f) || !l.l(this.f12406g, jVar.f12406g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12403b, this.f12402a, this.f12404c, this.d, this.e, this.f12405f, this.f12406g});
    }

    public final String toString() {
        of.b bVar = new of.b(this);
        bVar.E(this.f12403b, "applicationId");
        bVar.E(this.f12402a, "apiKey");
        bVar.E(this.f12404c, "databaseUrl");
        bVar.E(this.e, "gcmSenderId");
        bVar.E(this.f12405f, "storageBucket");
        bVar.E(this.f12406g, "projectId");
        return bVar.toString();
    }
}
