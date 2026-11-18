package o9;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import ji.j;
import q6.m;
public final class i {
    public final String f21775a;
    public final String f21776b;
    public final String f21777c;
    public final String d;
    public final String f21778e;
    public final String f21779f;
    public final String f21780g;
    public final String h;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        boolean z10;
        int i7 = x6.e.f60402a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        m.j("ApplicationId must be set.", true ^ z10);
        this.f21776b = str;
        this.f21775a = str2;
        this.f21777c = str3;
        this.d = str4;
        this.f21778e = str5;
        this.f21779f = str6;
        this.f21780g = str7;
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
        if (!Objects.equals(this.f21776b, iVar.f21776b) || !Objects.equals(this.f21775a, iVar.f21775a) || !Objects.equals(this.f21777c, iVar.f21777c) || !Objects.equals(this.d, iVar.d) || !Objects.equals(this.f21778e, iVar.f21778e) || !Objects.equals(this.f21779f, iVar.f21779f) || !Objects.equals(this.f21780g, iVar.f21780g) || !Objects.equals(this.h, iVar.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f21776b, this.f21775a, this.f21777c, this.d, this.f21778e, this.f21779f, this.f21780g, this.h);
    }

    public final String toString() {
        j jVar = new j(this);
        jVar.E(this.f21776b, "applicationId");
        jVar.E(this.f21775a, "apiKey");
        jVar.E(this.f21777c, "databaseUrl");
        jVar.E(this.f21778e, "gcmSenderId");
        jVar.E(this.f21779f, "storageBucket");
        jVar.E(this.f21780g, "recaptchaSiteKey");
        jVar.E(this.h, "projectId");
        return jVar.toString();
    }
}
