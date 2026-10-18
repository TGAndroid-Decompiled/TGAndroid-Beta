package l9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import mi.q;
import n6.l;
public final class j {
    public final String f15978a;
    public final String f15979b;
    public final String f15980c;
    public final String d;
    public final String e;
    public final String f15981f;
    public final String f15982g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = u6.e.f47645a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        l.j("ApplicationId must be set.", true ^ z10);
        this.f15979b = str;
        this.f15978a = str2;
        this.f15980c = str3;
        this.d = str4;
        this.e = str5;
        this.f15981f = str6;
        this.f15982g = str7;
    }

    public static j a(Context context) {
        n2.e eVar = new n2.e(context);
        String C = eVar.C("google_app_id");
        if (TextUtils.isEmpty(C)) {
            return null;
        }
        return new j(C, eVar.C("google_api_key"), eVar.C("firebase_database_url"), eVar.C("ga_trackingId"), eVar.C("gcm_defaultSenderId"), eVar.C("google_storage_bucket"), eVar.C("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!l.l(this.f15979b, jVar.f15979b) || !l.l(this.f15978a, jVar.f15978a) || !l.l(this.f15980c, jVar.f15980c) || !l.l(this.d, jVar.d) || !l.l(this.e, jVar.e) || !l.l(this.f15981f, jVar.f15981f) || !l.l(this.f15982g, jVar.f15982g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15979b, this.f15978a, this.f15980c, this.d, this.e, this.f15981f, this.f15982g});
    }

    public final String toString() {
        q qVar = new q(this);
        qVar.H(this.f15979b, "applicationId");
        qVar.H(this.f15978a, "apiKey");
        qVar.H(this.f15980c, "databaseUrl");
        qVar.H(this.e, "gcmSenderId");
        qVar.H(this.f15981f, "storageBucket");
        qVar.H(this.f15982g, "projectId");
        return qVar.toString();
    }
}
