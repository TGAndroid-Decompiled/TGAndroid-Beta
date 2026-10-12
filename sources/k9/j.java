package k9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import n4.y;
import n6.k;
import n6.m;
public final class j {
    public final String f14755a;
    public final String f14756b;
    public final String f14757c;
    public final String d;
    public final String f14758e;
    public final String f14759f;
    public final String f14760g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = u6.e.f49088a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        m.j("ApplicationId must be set.", true ^ z10);
        this.f14756b = str;
        this.f14755a = str2;
        this.f14757c = str3;
        this.d = str4;
        this.f14758e = str5;
        this.f14759f = str6;
        this.f14760g = str7;
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
        if (!m.l(this.f14756b, jVar.f14756b) || !m.l(this.f14755a, jVar.f14755a) || !m.l(this.f14757c, jVar.f14757c) || !m.l(this.d, jVar.d) || !m.l(this.f14758e, jVar.f14758e) || !m.l(this.f14759f, jVar.f14759f) || !m.l(this.f14760g, jVar.f14760g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14756b, this.f14755a, this.f14757c, this.d, this.f14758e, this.f14759f, this.f14760g});
    }

    public final String toString() {
        k kVar = new k(this);
        kVar.d(this.f14756b, "applicationId");
        kVar.d(this.f14755a, "apiKey");
        kVar.d(this.f14757c, "databaseUrl");
        kVar.d(this.f14758e, "gcmSenderId");
        kVar.d(this.f14759f, "storageBucket");
        kVar.d(this.f14760g, "projectId");
        return kVar.toString();
    }
}
