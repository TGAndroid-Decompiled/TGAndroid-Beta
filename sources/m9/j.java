package m9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import m4.w1;
import o6.l;
public final class j {
    public final String f18389a;
    public final String f18390b;
    public final String f18391c;
    public final String d;
    public final String e;
    public final String f18392f;
    public final String f18393g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = v6.e.f50115a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        l.j("ApplicationId must be set.", true ^ z10);
        this.f18390b = str;
        this.f18389a = str2;
        this.f18391c = str3;
        this.d = str4;
        this.e = str5;
        this.f18392f = str6;
        this.f18393g = str7;
    }

    public static j a(Context context) {
        m4.c cVar = new m4.c(context);
        String T = cVar.T("google_app_id");
        if (TextUtils.isEmpty(T)) {
            return null;
        }
        return new j(T, cVar.T("google_api_key"), cVar.T("firebase_database_url"), cVar.T("ga_trackingId"), cVar.T("gcm_defaultSenderId"), cVar.T("google_storage_bucket"), cVar.T("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!l.l(this.f18390b, jVar.f18390b) || !l.l(this.f18389a, jVar.f18389a) || !l.l(this.f18391c, jVar.f18391c) || !l.l(this.d, jVar.d) || !l.l(this.e, jVar.e) || !l.l(this.f18392f, jVar.f18392f) || !l.l(this.f18393g, jVar.f18393g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18390b, this.f18389a, this.f18391c, this.d, this.e, this.f18392f, this.f18393g});
    }

    public final String toString() {
        w1 w1Var = new w1(this);
        w1Var.x(this.f18390b, "applicationId");
        w1Var.x(this.f18389a, "apiKey");
        w1Var.x(this.f18391c, "databaseUrl");
        w1Var.x(this.e, "gcmSenderId");
        w1Var.x(this.f18392f, "storageBucket");
        w1Var.x(this.f18393g, "projectId");
        return w1Var.toString();
    }
}
