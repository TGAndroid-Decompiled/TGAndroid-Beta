package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
public final class zi4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public zi4(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        boolean z;
        int i = gbb.a;
        if (str != null && !str.trim().isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        ite.j("ApplicationId must be set.", !z);
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public static zi4 a(Context context) {
        mj4 mj4Var = new mj4(context, (byte) 29);
        String m = mj4Var.m("google_app_id");
        if (TextUtils.isEmpty(m)) {
            return null;
        }
        return new zi4(m, mj4Var.m("google_api_key"), mj4Var.m("firebase_database_url"), mj4Var.m("ga_trackingId"), mj4Var.m("gcm_defaultSenderId"), mj4Var.m("google_storage_bucket"), mj4Var.m("recaptcha_site_key"), mj4Var.m("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zi4)) {
            return false;
        }
        zi4 zi4Var = (zi4) obj;
        if (!Objects.equals(this.b, zi4Var.b) || !Objects.equals(this.a, zi4Var.a) || !Objects.equals(this.c, zi4Var.c) || !Objects.equals(this.d, zi4Var.d) || !Objects.equals(this.e, zi4Var.e) || !Objects.equals(this.f, zi4Var.f) || !Objects.equals(this.g, zi4Var.g) || !Objects.equals(this.h, zi4Var.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final String toString() {
        wm4 wm4Var = new wm4(this);
        wm4Var.a(this.b, "applicationId");
        wm4Var.a(this.a, "apiKey");
        wm4Var.a(this.c, "databaseUrl");
        wm4Var.a(this.e, "gcmSenderId");
        wm4Var.a(this.f, "storageBucket");
        wm4Var.a(this.g, "recaptchaSiteKey");
        wm4Var.a(this.h, "projectId");
        return wm4Var.toString();
    }
}
