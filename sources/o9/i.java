package o9;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import ji.l;
import q6.m;
public final class i {
    public final String f21797a;
    public final String f21798b;
    public final String f21799c;
    public final String d;
    public final String f21800e;
    public final String f21801f;
    public final String f21802g;
    public final String h;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        boolean z10;
        int i7 = x6.e.f60444a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        m.j("ApplicationId must be set.", true ^ z10);
        this.f21798b = str;
        this.f21797a = str2;
        this.f21799c = str3;
        this.d = str4;
        this.f21800e = str5;
        this.f21801f = str6;
        this.f21802g = str7;
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
        if (!Objects.equals(this.f21798b, iVar.f21798b) || !Objects.equals(this.f21797a, iVar.f21797a) || !Objects.equals(this.f21799c, iVar.f21799c) || !Objects.equals(this.d, iVar.d) || !Objects.equals(this.f21800e, iVar.f21800e) || !Objects.equals(this.f21801f, iVar.f21801f) || !Objects.equals(this.f21802g, iVar.f21802g) || !Objects.equals(this.h, iVar.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f21798b, this.f21797a, this.f21799c, this.d, this.f21800e, this.f21801f, this.f21802g, this.h);
    }

    public final String toString() {
        l lVar = new l(this);
        lVar.E(this.f21798b, "applicationId");
        lVar.E(this.f21797a, "apiKey");
        lVar.E(this.f21799c, "databaseUrl");
        lVar.E(this.f21800e, "gcmSenderId");
        lVar.E(this.f21801f, "storageBucket");
        lVar.E(this.f21802g, "recaptchaSiteKey");
        lVar.E(this.h, "projectId");
        return lVar.toString();
    }
}
