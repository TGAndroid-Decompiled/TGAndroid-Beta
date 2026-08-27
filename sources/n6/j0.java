package n6;

import android.os.Parcel;
import android.os.Parcelable;

public enum j0 implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<j0> CREATOR = new o0(18);

    public final String f18373a;

    j0(String str) {
        this.f18373a = str;
    }

    public static j0 a(String str) throws t0 {
        for (j0 j0Var : values()) {
            if (str.equals(j0Var.f18373a)) {
                return j0Var;
            }
        }
        throw new t0(a9.p.m("User verification requirement ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f18373a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18373a);
    }
}
