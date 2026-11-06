package o9;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import j$.util.Objects;
import j2.n;
import q6.m;
public final class i {
    public final String f20884a;
    public final String f20885b;
    public final String f20886c;
    public final String d;
    public final String f20887e;
    public final String f20888f;
    public final String f20889g;
    public final String h;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        boolean z9;
        int i7 = x6.e.f58522a;
        if (str != null && !str.trim().isEmpty()) {
            z9 = false;
        } else {
            z9 = true;
        }
        m.i("ApplicationId must be set.", true ^ z9);
        this.f20885b = str;
        this.f20884a = str2;
        this.f20886c = str3;
        this.d = str4;
        this.f20887e = str5;
        this.f20888f = str6;
        this.f20889g = str7;
        this.h = str8;
    }

    public static i a(Context context) {
        ?? obj = new Object();
        m.g(context);
        Resources resources = context.getResources();
        obj.f19608a = resources;
        obj.f19609b = resources.getResourcePackageName(2131689567);
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
        if (!Objects.equals(this.f20885b, iVar.f20885b) || !Objects.equals(this.f20884a, iVar.f20884a) || !Objects.equals(this.f20886c, iVar.f20886c) || !Objects.equals(this.d, iVar.d) || !Objects.equals(this.f20887e, iVar.f20887e) || !Objects.equals(this.f20888f, iVar.f20888f) || !Objects.equals(this.f20889g, iVar.f20889g) || !Objects.equals(this.h, iVar.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f20885b, this.f20884a, this.f20886c, this.d, this.f20887e, this.f20888f, this.f20889g, this.h);
    }

    public final String toString() {
        n nVar = new n(this);
        nVar.X(this.f20885b, "applicationId");
        nVar.X(this.f20884a, "apiKey");
        nVar.X(this.f20886c, "databaseUrl");
        nVar.X(this.f20887e, "gcmSenderId");
        nVar.X(this.f20888f, "storageBucket");
        nVar.X(this.f20889g, "recaptchaSiteKey");
        nVar.X(this.h, "projectId");
        return nVar.toString();
    }
}
