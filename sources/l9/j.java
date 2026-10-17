package l9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import mi.q;
import n6.l;
public final class j {
    public final String f15971a;
    public final String f15972b;
    public final String f15973c;
    public final String d;
    public final String e;
    public final String f15974f;
    public final String f15975g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = u6.e.f47623a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        l.j("ApplicationId must be set.", true ^ z10);
        this.f15972b = str;
        this.f15971a = str2;
        this.f15973c = str3;
        this.d = str4;
        this.e = str5;
        this.f15974f = str6;
        this.f15975g = str7;
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
        if (!l.l(this.f15972b, jVar.f15972b) || !l.l(this.f15971a, jVar.f15971a) || !l.l(this.f15973c, jVar.f15973c) || !l.l(this.d, jVar.d) || !l.l(this.e, jVar.e) || !l.l(this.f15974f, jVar.f15974f) || !l.l(this.f15975g, jVar.f15975g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15972b, this.f15971a, this.f15973c, this.d, this.e, this.f15974f, this.f15975g});
    }

    public final String toString() {
        q qVar = new q(this);
        qVar.H(this.f15972b, "applicationId");
        qVar.H(this.f15971a, "apiKey");
        qVar.H(this.f15973c, "databaseUrl");
        qVar.H(this.e, "gcmSenderId");
        qVar.H(this.f15974f, "storageBucket");
        qVar.H(this.f15975g, "projectId");
        return qVar.toString();
    }
}
