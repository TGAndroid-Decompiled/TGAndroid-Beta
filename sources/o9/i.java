package o9;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import j$.util.Objects;
import j2.n;
import q6.m;
public final class i {
    public final String f20892a;
    public final String f20893b;
    public final String f20894c;
    public final String d;
    public final String f20895e;
    public final String f20896f;
    public final String f20897g;
    public final String h;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        boolean z9;
        int i7 = x6.e.f58649a;
        if (str != null && !str.trim().isEmpty()) {
            z9 = false;
        } else {
            z9 = true;
        }
        m.i("ApplicationId must be set.", true ^ z9);
        this.f20893b = str;
        this.f20892a = str2;
        this.f20894c = str3;
        this.d = str4;
        this.f20895e = str5;
        this.f20896f = str6;
        this.f20897g = str7;
        this.h = str8;
    }

    public static i a(Context context) {
        ?? obj = new Object();
        m.g(context);
        Resources resources = context.getResources();
        obj.f19616a = resources;
        obj.f19617b = resources.getResourcePackageName(2131689567);
        String L = obj.L("google_app_id");
        if (TextUtils.isEmpty(L)) {
            return null;
        }
        return new i(L, obj.L("google_api_key"), obj.L("firebase_database_url"), obj.L("ga_trackingId"), obj.L("gcm_defaultSenderId"), obj.L("google_storage_bucket"), obj.L("recaptcha_site_key"), obj.L("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!Objects.equals(this.f20893b, iVar.f20893b) || !Objects.equals(this.f20892a, iVar.f20892a) || !Objects.equals(this.f20894c, iVar.f20894c) || !Objects.equals(this.d, iVar.d) || !Objects.equals(this.f20895e, iVar.f20895e) || !Objects.equals(this.f20896f, iVar.f20896f) || !Objects.equals(this.f20897g, iVar.f20897g) || !Objects.equals(this.h, iVar.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f20893b, this.f20892a, this.f20894c, this.d, this.f20895e, this.f20896f, this.f20897g, this.h);
    }

    public final String toString() {
        n nVar = new n(this);
        nVar.X(this.f20893b, "applicationId");
        nVar.X(this.f20892a, "apiKey");
        nVar.X(this.f20894c, "databaseUrl");
        nVar.X(this.f20895e, "gcmSenderId");
        nVar.X(this.f20896f, "storageBucket");
        nVar.X(this.f20897g, "recaptchaSiteKey");
        nVar.X(this.h, "projectId");
        return nVar.toString();
    }
}
