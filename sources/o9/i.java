package o9;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import ji.j;
import q6.m;
public final class i {
    public final String f21772a;
    public final String f21773b;
    public final String f21774c;
    public final String d;
    public final String f21775e;
    public final String f21776f;
    public final String f21777g;
    public final String h;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        boolean z10;
        int i7 = x6.e.f60403a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        m.j("ApplicationId must be set.", true ^ z10);
        this.f21773b = str;
        this.f21772a = str2;
        this.f21774c = str3;
        this.d = str4;
        this.f21775e = str5;
        this.f21776f = str6;
        this.f21777g = str7;
        this.h = str8;
    }

    public static i a(Context context) {
        k8.a aVar = new k8.a(context, 26);
        String E0 = aVar.E0("google_app_id");
        if (TextUtils.isEmpty(E0)) {
            return null;
        }
        return new i(E0, aVar.E0("google_api_key"), aVar.E0("firebase_database_url"), aVar.E0("ga_trackingId"), aVar.E0("gcm_defaultSenderId"), aVar.E0("google_storage_bucket"), aVar.E0("recaptcha_site_key"), aVar.E0("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!Objects.equals(this.f21773b, iVar.f21773b) || !Objects.equals(this.f21772a, iVar.f21772a) || !Objects.equals(this.f21774c, iVar.f21774c) || !Objects.equals(this.d, iVar.d) || !Objects.equals(this.f21775e, iVar.f21775e) || !Objects.equals(this.f21776f, iVar.f21776f) || !Objects.equals(this.f21777g, iVar.f21777g) || !Objects.equals(this.h, iVar.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f21773b, this.f21772a, this.f21774c, this.d, this.f21775e, this.f21776f, this.f21777g, this.h);
    }

    public final String toString() {
        j jVar = new j(this);
        jVar.E(this.f21773b, "applicationId");
        jVar.E(this.f21772a, "apiKey");
        jVar.E(this.f21774c, "databaseUrl");
        jVar.E(this.f21775e, "gcmSenderId");
        jVar.E(this.f21776f, "storageBucket");
        jVar.E(this.f21777g, "recaptchaSiteKey");
        jVar.E(this.h, "projectId");
        return jVar.toString();
    }
}
