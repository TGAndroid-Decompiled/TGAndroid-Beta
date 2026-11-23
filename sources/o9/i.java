package o9;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import ji.k;
import q6.m;
public final class i {
    public final String f21766a;
    public final String f21767b;
    public final String f21768c;
    public final String d;
    public final String f21769e;
    public final String f21770f;
    public final String f21771g;
    public final String h;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        boolean z10;
        int i7 = x6.e.f60413a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        m.j("ApplicationId must be set.", true ^ z10);
        this.f21767b = str;
        this.f21766a = str2;
        this.f21768c = str3;
        this.d = str4;
        this.f21769e = str5;
        this.f21770f = str6;
        this.f21771g = str7;
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
        if (!Objects.equals(this.f21767b, iVar.f21767b) || !Objects.equals(this.f21766a, iVar.f21766a) || !Objects.equals(this.f21768c, iVar.f21768c) || !Objects.equals(this.d, iVar.d) || !Objects.equals(this.f21769e, iVar.f21769e) || !Objects.equals(this.f21770f, iVar.f21770f) || !Objects.equals(this.f21771g, iVar.f21771g) || !Objects.equals(this.h, iVar.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f21767b, this.f21766a, this.f21768c, this.d, this.f21769e, this.f21770f, this.f21771g, this.h);
    }

    public final String toString() {
        k kVar = new k(this);
        kVar.E(this.f21767b, "applicationId");
        kVar.E(this.f21766a, "apiKey");
        kVar.E(this.f21768c, "databaseUrl");
        kVar.E(this.f21769e, "gcmSenderId");
        kVar.E(this.f21770f, "storageBucket");
        kVar.E(this.f21771g, "recaptchaSiteKey");
        kVar.E(this.h, "projectId");
        return kVar.toString();
    }
}
