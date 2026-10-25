package d7;

import android.os.Parcel;
import android.os.Parcelable;
public enum e0 implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");
    
    public static final Parcelable.Creator<e0> CREATOR = new r0(2);
    public final String f8171a;

    e0(String str) {
        this.f8171a = str;
    }

    public static e0 a(String str) {
        e0[] values;
        for (e0 e0Var : values()) {
            if (str.equals(e0Var.f8171a)) {
                return e0Var;
            }
        }
        throw new Exception(a1.g.p("Resident key requirement ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f8171a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8171a);
    }
}
