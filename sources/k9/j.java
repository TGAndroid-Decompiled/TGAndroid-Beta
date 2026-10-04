package k9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n4.y;
import n6.l;
public final class j {
    public final String f14727a;
    public final String f14728b;
    public final String f14729c;
    public final String d;
    public final String f14730e;
    public final String f14731f;
    public final String f14732g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = u6.e.f47558a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        l.j("ApplicationId must be set.", true ^ z10);
        this.f14728b = str;
        this.f14727a = str2;
        this.f14729c = str3;
        this.d = str4;
        this.f14730e = str5;
        this.f14731f = str6;
        this.f14732g = str7;
    }

    public static j a(Context context) {
        of.b bVar = new of.b(context, 29);
        String G = bVar.G("google_app_id");
        if (TextUtils.isEmpty(G)) {
            return null;
        }
        return new j(G, bVar.G("google_api_key"), bVar.G("firebase_database_url"), bVar.G("ga_trackingId"), bVar.G("gcm_defaultSenderId"), bVar.G("google_storage_bucket"), bVar.G("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!l.l(this.f14728b, jVar.f14728b) || !l.l(this.f14727a, jVar.f14727a) || !l.l(this.f14729c, jVar.f14729c) || !l.l(this.d, jVar.d) || !l.l(this.f14730e, jVar.f14730e) || !l.l(this.f14731f, jVar.f14731f) || !l.l(this.f14732g, jVar.f14732g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14728b, this.f14727a, this.f14729c, this.d, this.f14730e, this.f14731f, this.f14732g});
    }

    public final String toString() {
        y yVar = new y(this);
        yVar.m(this.f14728b, "applicationId");
        yVar.m(this.f14727a, "apiKey");
        yVar.m(this.f14729c, "databaseUrl");
        yVar.m(this.f14730e, "gcmSenderId");
        yVar.m(this.f14731f, "storageBucket");
        yVar.m(this.f14732g, "projectId");
        return yVar.toString();
    }
}
