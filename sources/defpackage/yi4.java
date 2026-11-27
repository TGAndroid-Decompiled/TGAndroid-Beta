package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
public final class yi4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public yi4(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        boolean z;
        int i = cdb.a;
        if (str != null && !str.trim().isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        xve.j("ApplicationId must be set.", !z);
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public static yi4 a(Context context) {
        ym4 ym4Var = new ym4(context, (byte) 27);
        String C = ym4Var.C("google_app_id");
        if (TextUtils.isEmpty(C)) {
            return null;
        }
        return new yi4(C, ym4Var.C("google_api_key"), ym4Var.C("firebase_database_url"), ym4Var.C("ga_trackingId"), ym4Var.C("gcm_defaultSenderId"), ym4Var.C("google_storage_bucket"), ym4Var.C("recaptcha_site_key"), ym4Var.C("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yi4)) {
            return false;
        }
        yi4 yi4Var = (yi4) obj;
        if (!Objects.equals(this.b, yi4Var.b) || !Objects.equals(this.a, yi4Var.a) || !Objects.equals(this.c, yi4Var.c) || !Objects.equals(this.d, yi4Var.d) || !Objects.equals(this.e, yi4Var.e) || !Objects.equals(this.f, yi4Var.f) || !Objects.equals(this.g, yi4Var.g) || !Objects.equals(this.h, yi4Var.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final String toString() {
        um4 um4Var = new um4(this);
        um4Var.a(this.b, "applicationId");
        um4Var.a(this.a, "apiKey");
        um4Var.a(this.c, "databaseUrl");
        um4Var.a(this.e, "gcmSenderId");
        um4Var.a(this.f, "storageBucket");
        um4Var.a(this.g, "recaptchaSiteKey");
        um4Var.a(this.h, "projectId");
        return um4Var.toString();
    }
}
