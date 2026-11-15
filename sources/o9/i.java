package o9;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import ji.j;
import q6.m;
public final class i {
    public final String f21409a;
    public final String f21410b;
    public final String f21411c;
    public final String d;
    public final String f21412e;
    public final String f21413f;
    public final String f21414g;
    public final String h;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        boolean z10;
        int i7 = x6.e.f59832a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        m.i("ApplicationId must be set.", true ^ z10);
        this.f21410b = str;
        this.f21409a = str2;
        this.f21411c = str3;
        this.d = str4;
        this.f21412e = str5;
        this.f21413f = str6;
        this.f21414g = str7;
        this.h = str8;
    }

    public static i a(Context context) {
        k8.a aVar = new k8.a(context, 26);
        String K0 = aVar.K0("google_app_id");
        if (TextUtils.isEmpty(K0)) {
            return null;
        }
        return new i(K0, aVar.K0("google_api_key"), aVar.K0("firebase_database_url"), aVar.K0("ga_trackingId"), aVar.K0("gcm_defaultSenderId"), aVar.K0("google_storage_bucket"), aVar.K0("recaptcha_site_key"), aVar.K0("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!Objects.equals(this.f21410b, iVar.f21410b) || !Objects.equals(this.f21409a, iVar.f21409a) || !Objects.equals(this.f21411c, iVar.f21411c) || !Objects.equals(this.d, iVar.d) || !Objects.equals(this.f21412e, iVar.f21412e) || !Objects.equals(this.f21413f, iVar.f21413f) || !Objects.equals(this.f21414g, iVar.f21414g) || !Objects.equals(this.h, iVar.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f21410b, this.f21409a, this.f21411c, this.d, this.f21412e, this.f21413f, this.f21414g, this.h);
    }

    public final String toString() {
        j jVar = new j(this);
        jVar.U(this.f21410b, "applicationId");
        jVar.U(this.f21409a, "apiKey");
        jVar.U(this.f21411c, "databaseUrl");
        jVar.U(this.f21412e, "gcmSenderId");
        jVar.U(this.f21413f, "storageBucket");
        jVar.U(this.f21414g, "recaptchaSiteKey");
        jVar.U(this.h, "projectId");
        return jVar.toString();
    }
}
