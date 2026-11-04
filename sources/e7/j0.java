package e7;

import android.os.Parcel;
import android.os.Parcelable;
public enum j0 implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");
    
    public static final Parcelable.Creator<j0> CREATOR = new r0(11);
    public final String f9838a;

    j0(String str) {
        this.f9838a = str;
    }

    public static j0 a(String str) {
        j0[] values;
        for (j0 j0Var : values()) {
            if (str.equals(j0Var.f9838a)) {
                return j0Var;
            }
        }
        throw new Exception(a1.g.q("User verification requirement ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f9838a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f9838a);
    }
}
