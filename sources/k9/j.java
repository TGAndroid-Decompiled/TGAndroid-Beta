package k9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n4.y;
import n6.l;
public final class j {
    public final String f14894a;
    public final String f14895b;
    public final String f14896c;
    public final String d;
    public final String f14897e;
    public final String f14898f;
    public final String f14899g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = u6.e.f46987a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        l.j("ApplicationId must be set.", true ^ z10);
        this.f14895b = str;
        this.f14894a = str2;
        this.f14896c = str3;
        this.d = str4;
        this.f14897e = str5;
        this.f14898f = str6;
        this.f14899g = str7;
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
        if (!l.l(this.f14895b, jVar.f14895b) || !l.l(this.f14894a, jVar.f14894a) || !l.l(this.f14896c, jVar.f14896c) || !l.l(this.d, jVar.d) || !l.l(this.f14897e, jVar.f14897e) || !l.l(this.f14898f, jVar.f14898f) || !l.l(this.f14899g, jVar.f14899g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14895b, this.f14894a, this.f14896c, this.d, this.f14897e, this.f14898f, this.f14899g});
    }

    public final String toString() {
        y yVar = new y(this);
        yVar.y(this.f14895b, "applicationId");
        yVar.y(this.f14894a, "apiKey");
        yVar.y(this.f14896c, "databaseUrl");
        yVar.y(this.f14897e, "gcmSenderId");
        yVar.y(this.f14898f, "storageBucket");
        yVar.y(this.f14899g, "projectId");
        return yVar.toString();
    }
}
