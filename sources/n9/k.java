package n9;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import m2.t;
import mi.h0;
import p6.m;
public final class k {
    public final String f20309a;
    public final String f20310b;
    public final String f20311c;
    public final String d;
    public final String f20312e;
    public final String f20313f;
    public final String f20314g;
    public final String h;

    public k(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        boolean z10;
        int i3 = w6.e.f57398a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        m.i("ApplicationId must be set.", true ^ z10);
        this.f20310b = str;
        this.f20309a = str2;
        this.f20311c = str3;
        this.d = str4;
        this.f20312e = str5;
        this.f20313f = str6;
        this.f20314g = str7;
        this.h = str8;
    }

    public static k a(Context context) {
        h0 h0Var = new h0(context, 18);
        String J = h0Var.J("google_app_id");
        if (TextUtils.isEmpty(J)) {
            return null;
        }
        return new k(J, h0Var.J("google_api_key"), h0Var.J("firebase_database_url"), h0Var.J("ga_trackingId"), h0Var.J("gcm_defaultSenderId"), h0Var.J("google_storage_bucket"), h0Var.J("recaptcha_site_key"), h0Var.J("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!Objects.equals(this.f20310b, kVar.f20310b) || !Objects.equals(this.f20309a, kVar.f20309a) || !Objects.equals(this.f20311c, kVar.f20311c) || !Objects.equals(this.d, kVar.d) || !Objects.equals(this.f20312e, kVar.f20312e) || !Objects.equals(this.f20313f, kVar.f20313f) || !Objects.equals(this.f20314g, kVar.f20314g) || !Objects.equals(this.h, kVar.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f20310b, this.f20309a, this.f20311c, this.d, this.f20312e, this.f20313f, this.f20314g, this.h);
    }

    public final String toString() {
        t tVar = new t(this);
        tVar.A(this.f20310b, "applicationId");
        tVar.A(this.f20309a, "apiKey");
        tVar.A(this.f20311c, "databaseUrl");
        tVar.A(this.f20312e, "gcmSenderId");
        tVar.A(this.f20313f, "storageBucket");
        tVar.A(this.f20314g, "recaptchaSiteKey");
        tVar.A(this.h, "projectId");
        return tVar.toString();
    }
}
