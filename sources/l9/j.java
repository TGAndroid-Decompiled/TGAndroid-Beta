package l9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import mi.q;
import n6.l;
public final class j {
    public final String f15977a;
    public final String f15978b;
    public final String f15979c;
    public final String d;
    public final String e;
    public final String f15980f;
    public final String f15981g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = u6.e.f47609a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        l.j("ApplicationId must be set.", true ^ z10);
        this.f15978b = str;
        this.f15977a = str2;
        this.f15979c = str3;
        this.d = str4;
        this.e = str5;
        this.f15980f = str6;
        this.f15981g = str7;
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
        if (!l.l(this.f15978b, jVar.f15978b) || !l.l(this.f15977a, jVar.f15977a) || !l.l(this.f15979c, jVar.f15979c) || !l.l(this.d, jVar.d) || !l.l(this.e, jVar.e) || !l.l(this.f15980f, jVar.f15980f) || !l.l(this.f15981g, jVar.f15981g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15978b, this.f15977a, this.f15979c, this.d, this.e, this.f15980f, this.f15981g});
    }

    public final String toString() {
        q qVar = new q(this);
        qVar.H(this.f15978b, "applicationId");
        qVar.H(this.f15977a, "apiKey");
        qVar.H(this.f15979c, "databaseUrl");
        qVar.H(this.e, "gcmSenderId");
        qVar.H(this.f15980f, "storageBucket");
        qVar.H(this.f15981g, "projectId");
        return qVar.toString();
    }
}
