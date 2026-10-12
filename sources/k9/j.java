package k9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n4.y;
import n6.k;
import n6.m;
public final class j {
    public final String f14756a;
    public final String f14757b;
    public final String f14758c;
    public final String d;
    public final String f14759e;
    public final String f14760f;
    public final String f14761g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = u6.e.f49096a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        m.j("ApplicationId must be set.", true ^ z10);
        this.f14757b = str;
        this.f14756a = str2;
        this.f14758c = str3;
        this.d = str4;
        this.f14759e = str5;
        this.f14760f = str6;
        this.f14761g = str7;
    }

    public static j a(Context context) {
        y yVar = new y(context);
        String K = yVar.K("google_app_id");
        if (TextUtils.isEmpty(K)) {
            return null;
        }
        return new j(K, yVar.K("google_api_key"), yVar.K("firebase_database_url"), yVar.K("ga_trackingId"), yVar.K("gcm_defaultSenderId"), yVar.K("google_storage_bucket"), yVar.K("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!m.l(this.f14757b, jVar.f14757b) || !m.l(this.f14756a, jVar.f14756a) || !m.l(this.f14758c, jVar.f14758c) || !m.l(this.d, jVar.d) || !m.l(this.f14759e, jVar.f14759e) || !m.l(this.f14760f, jVar.f14760f) || !m.l(this.f14761g, jVar.f14761g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14757b, this.f14756a, this.f14758c, this.d, this.f14759e, this.f14760f, this.f14761g});
    }

    public final String toString() {
        k kVar = new k(this);
        kVar.d(this.f14757b, "applicationId");
        kVar.d(this.f14756a, "apiKey");
        kVar.d(this.f14758c, "databaseUrl");
        kVar.d(this.f14759e, "gcmSenderId");
        kVar.d(this.f14760f, "storageBucket");
        kVar.d(this.f14761g, "projectId");
        return kVar.toString();
    }
}
