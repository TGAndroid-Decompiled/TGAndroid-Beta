package c7;

import android.os.Parcel;
import android.os.Parcelable;
public enum e0 implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");
    
    public static final Parcelable.Creator<e0> CREATOR = new r0(1);
    public final String f4633a;

    e0(String str) {
        this.f4633a = str;
    }

    public static e0 a(String str) {
        e0[] values;
        for (e0 e0Var : values()) {
            if (str.equals(e0Var.f4633a)) {
                return e0Var;
            }
        }
        throw new Exception(a4.a.p("Resident key requirement ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f4633a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4633a);
    }
}
