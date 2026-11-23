package o9;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import j6.k;
import q6.m;
public final class i {
    public final String f21866a;
    public final String f21867b;
    public final String f21868c;
    public final String d;
    public final String f21869e;
    public final String f21870f;
    public final String f21871g;
    public final String h;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        boolean z10;
        int i7 = x6.e.f60531a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        m.j("ApplicationId must be set.", true ^ z10);
        this.f21867b = str;
        this.f21866a = str2;
        this.f21868c = str3;
        this.d = str4;
        this.f21869e = str5;
        this.f21870f = str6;
        this.f21871g = str7;
        this.h = str8;
    }

    public static i a(Context context) {
        jb.m mVar = new jb.m(context, 27);
        String y02 = mVar.y0("google_app_id");
        if (TextUtils.isEmpty(y02)) {
            return null;
        }
        return new i(y02, mVar.y0("google_api_key"), mVar.y0("firebase_database_url"), mVar.y0("ga_trackingId"), mVar.y0("gcm_defaultSenderId"), mVar.y0("google_storage_bucket"), mVar.y0("recaptcha_site_key"), mVar.y0("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!Objects.equals(this.f21867b, iVar.f21867b) || !Objects.equals(this.f21866a, iVar.f21866a) || !Objects.equals(this.f21868c, iVar.f21868c) || !Objects.equals(this.d, iVar.d) || !Objects.equals(this.f21869e, iVar.f21869e) || !Objects.equals(this.f21870f, iVar.f21870f) || !Objects.equals(this.f21871g, iVar.f21871g) || !Objects.equals(this.h, iVar.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f21867b, this.f21866a, this.f21868c, this.d, this.f21869e, this.f21870f, this.f21871g, this.h);
    }

    public final String toString() {
        k kVar = new k(this);
        kVar.S(this.f21867b, "applicationId");
        kVar.S(this.f21866a, "apiKey");
        kVar.S(this.f21868c, "databaseUrl");
        kVar.S(this.f21869e, "gcmSenderId");
        kVar.S(this.f21870f, "storageBucket");
        kVar.S(this.f21871g, "recaptchaSiteKey");
        kVar.S(this.h, "projectId");
        return kVar.toString();
    }
}
