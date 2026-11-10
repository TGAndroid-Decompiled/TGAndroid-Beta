package f7;

import android.os.Parcel;
import android.os.Parcelable;
public enum j0 implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");
    
    public static final Parcelable.Creator<j0> CREATOR = new db.k(26);
    public final String f11400a;

    j0(String str) {
        this.f11400a = str;
    }

    public static j0 a(String str) {
        j0[] values;
        for (j0 j0Var : values()) {
            if (str.equals(j0Var.f11400a)) {
                return j0Var;
            }
        }
        throw new Exception(a8.p0.p("User verification requirement ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f11400a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f11400a);
    }
}
