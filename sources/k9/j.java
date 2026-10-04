package k9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n4.y;
import n6.l;
public final class j {
    public final String f14726a;
    public final String f14727b;
    public final String f14728c;
    public final String d;
    public final String f14729e;
    public final String f14730f;
    public final String f14731g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = u6.e.f47550a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        l.j("ApplicationId must be set.", true ^ z10);
        this.f14727b = str;
        this.f14726a = str2;
        this.f14728c = str3;
        this.d = str4;
        this.f14729e = str5;
        this.f14730f = str6;
        this.f14731g = str7;
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
        if (!l.l(this.f14727b, jVar.f14727b) || !l.l(this.f14726a, jVar.f14726a) || !l.l(this.f14728c, jVar.f14728c) || !l.l(this.d, jVar.d) || !l.l(this.f14729e, jVar.f14729e) || !l.l(this.f14730f, jVar.f14730f) || !l.l(this.f14731g, jVar.f14731g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14727b, this.f14726a, this.f14728c, this.d, this.f14729e, this.f14730f, this.f14731g});
    }

    public final String toString() {
        y yVar = new y(this);
        yVar.m(this.f14727b, "applicationId");
        yVar.m(this.f14726a, "apiKey");
        yVar.m(this.f14728c, "databaseUrl");
        yVar.m(this.f14729e, "gcmSenderId");
        yVar.m(this.f14730f, "storageBucket");
        yVar.m(this.f14731g, "projectId");
        return yVar.toString();
    }
}
