package o6;

import android.os.Parcel;
import android.os.Parcelable;
public enum j0 implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");
    
    public static final Parcelable.Creator<j0> CREATOR = new n0(19);
    public final String f19397a;

    j0(String str) {
        this.f19397a = str;
    }

    public static j0 a(String str) {
        j0[] values;
        for (j0 j0Var : values()) {
            if (str.equals(j0Var.f19397a)) {
                return j0Var;
            }
        }
        throw new Exception(a4.w.n("User verification requirement ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f19397a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19397a);
    }
}
