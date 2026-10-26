package m9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import m4.w1;
import o6.l;
public final class j {
    public final String f18390a;
    public final String f18391b;
    public final String f18392c;
    public final String d;
    public final String e;
    public final String f18393f;
    public final String f18394g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = v6.e.f50080a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        l.j("ApplicationId must be set.", true ^ z10);
        this.f18391b = str;
        this.f18390a = str2;
        this.f18392c = str3;
        this.d = str4;
        this.e = str5;
        this.f18393f = str6;
        this.f18394g = str7;
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
        if (!l.l(this.f18391b, jVar.f18391b) || !l.l(this.f18390a, jVar.f18390a) || !l.l(this.f18392c, jVar.f18392c) || !l.l(this.d, jVar.d) || !l.l(this.e, jVar.e) || !l.l(this.f18393f, jVar.f18393f) || !l.l(this.f18394g, jVar.f18394g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18391b, this.f18390a, this.f18392c, this.d, this.e, this.f18393f, this.f18394g});
    }

    public final String toString() {
        w1 w1Var = new w1(this);
        w1Var.x(this.f18391b, "applicationId");
        w1Var.x(this.f18390a, "apiKey");
        w1Var.x(this.f18392c, "databaseUrl");
        w1Var.x(this.e, "gcmSenderId");
        w1Var.x(this.f18393f, "storageBucket");
        w1Var.x(this.f18394g, "projectId");
        return w1Var.toString();
    }
}
