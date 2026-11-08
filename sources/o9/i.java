package o9;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import j$.util.Objects;
import j2.n;
import q6.m;
public final class i {
    public final String f20887a;
    public final String f20888b;
    public final String f20889c;
    public final String d;
    public final String f20890e;
    public final String f20891f;
    public final String f20892g;
    public final String h;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        boolean z9;
        int i7 = x6.e.f58641a;
        if (str != null && !str.trim().isEmpty()) {
            z9 = false;
        } else {
            z9 = true;
        }
        m.i("ApplicationId must be set.", true ^ z9);
        this.f20888b = str;
        this.f20887a = str2;
        this.f20889c = str3;
        this.d = str4;
        this.f20890e = str5;
        this.f20891f = str6;
        this.f20892g = str7;
        this.h = str8;
    }

    public static i a(Context context) {
        ?? obj = new Object();
        m.g(context);
        Resources resources = context.getResources();
        obj.f19611a = resources;
        obj.f19612b = resources.getResourcePackageName(2131689567);
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
        if (!Objects.equals(this.f20888b, iVar.f20888b) || !Objects.equals(this.f20887a, iVar.f20887a) || !Objects.equals(this.f20889c, iVar.f20889c) || !Objects.equals(this.d, iVar.d) || !Objects.equals(this.f20890e, iVar.f20890e) || !Objects.equals(this.f20891f, iVar.f20891f) || !Objects.equals(this.f20892g, iVar.f20892g) || !Objects.equals(this.h, iVar.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f20888b, this.f20887a, this.f20889c, this.d, this.f20890e, this.f20891f, this.f20892g, this.h);
    }

    public final String toString() {
        n nVar = new n(this);
        nVar.X(this.f20888b, "applicationId");
        nVar.X(this.f20887a, "apiKey");
        nVar.X(this.f20889c, "databaseUrl");
        nVar.X(this.f20890e, "gcmSenderId");
        nVar.X(this.f20891f, "storageBucket");
        nVar.X(this.f20892g, "recaptchaSiteKey");
        nVar.X(this.h, "projectId");
        return nVar.toString();
    }
}
