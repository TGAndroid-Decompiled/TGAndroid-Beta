package k9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n4.x;
import n6.l;
public final class j {
    public final String f14759a;
    public final String f14760b;
    public final String f14761c;
    public final String d;
    public final String f14762e;
    public final String f14763f;
    public final String f14764g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = u6.e.f48858a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        l.j("ApplicationId must be set.", true ^ z10);
        this.f14760b = str;
        this.f14759a = str2;
        this.f14761c = str3;
        this.d = str4;
        this.f14762e = str5;
        this.f14763f = str6;
        this.f14764g = str7;
    }

    public static j a(Context context) {
        pf.b bVar = new pf.b(context, 28);
        String K = bVar.K("google_app_id");
        if (TextUtils.isEmpty(K)) {
            return null;
        }
        return new j(K, bVar.K("google_api_key"), bVar.K("firebase_database_url"), bVar.K("ga_trackingId"), bVar.K("gcm_defaultSenderId"), bVar.K("google_storage_bucket"), bVar.K("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!l.l(this.f14760b, jVar.f14760b) || !l.l(this.f14759a, jVar.f14759a) || !l.l(this.f14761c, jVar.f14761c) || !l.l(this.d, jVar.d) || !l.l(this.f14762e, jVar.f14762e) || !l.l(this.f14763f, jVar.f14763f) || !l.l(this.f14764g, jVar.f14764g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14760b, this.f14759a, this.f14761c, this.d, this.f14762e, this.f14763f, this.f14764g});
    }

    public final String toString() {
        x xVar = new x(this);
        xVar.o(this.f14760b, "applicationId");
        xVar.o(this.f14759a, "apiKey");
        xVar.o(this.f14761c, "databaseUrl");
        xVar.o(this.f14762e, "gcmSenderId");
        xVar.o(this.f14763f, "storageBucket");
        xVar.o(this.f14764g, "projectId");
        return xVar.toString();
    }
}
