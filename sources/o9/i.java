package o9;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import ji.l;
import q6.m;
public final class i {
    public final String f21800a;
    public final String f21801b;
    public final String f21802c;
    public final String d;
    public final String f21803e;
    public final String f21804f;
    public final String f21805g;
    public final String h;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        boolean z10;
        int i7 = x6.e.f60448a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        m.j("ApplicationId must be set.", true ^ z10);
        this.f21801b = str;
        this.f21800a = str2;
        this.f21802c = str3;
        this.d = str4;
        this.f21803e = str5;
        this.f21804f = str6;
        this.f21805g = str7;
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
        if (!Objects.equals(this.f21801b, iVar.f21801b) || !Objects.equals(this.f21800a, iVar.f21800a) || !Objects.equals(this.f21802c, iVar.f21802c) || !Objects.equals(this.d, iVar.d) || !Objects.equals(this.f21803e, iVar.f21803e) || !Objects.equals(this.f21804f, iVar.f21804f) || !Objects.equals(this.f21805g, iVar.f21805g) || !Objects.equals(this.h, iVar.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f21801b, this.f21800a, this.f21802c, this.d, this.f21803e, this.f21804f, this.f21805g, this.h);
    }

    public final String toString() {
        l lVar = new l(this);
        lVar.E(this.f21801b, "applicationId");
        lVar.E(this.f21800a, "apiKey");
        lVar.E(this.f21802c, "databaseUrl");
        lVar.E(this.f21803e, "gcmSenderId");
        lVar.E(this.f21804f, "storageBucket");
        lVar.E(this.f21805g, "recaptchaSiteKey");
        lVar.E(this.h, "projectId");
        return lVar.toString();
    }
}
