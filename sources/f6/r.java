package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f11320a;
    public String f11321b;
    public final JSONObject f11322c;

    public r(k kVar, JSONObject jSONObject) {
        this.f11320a = kVar;
        this.f11322c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!x6.c.a(this.f11322c, rVar.f11322c)) {
            return false;
        }
        return q6.m.k(this.f11320a, rVar.f11320a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11320a, String.valueOf(this.f11322c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11322c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f11321b = jSONObject;
        int r10 = wb.r(parcel, 20293);
        wb.k(parcel, 2, this.f11320a, i7);
        wb.l(parcel, 3, this.f11321b);
        wb.s(parcel, r10);
    }
}
