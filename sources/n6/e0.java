package n6;

import android.os.Parcel;
import android.os.Parcelable;

public enum e0 implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<e0> CREATOR = new o0(12);

    public final String f18345a;

    e0(String str) {
        this.f18345a = str;
    }

    public static e0 a(String str) throws d0 {
        for (e0 e0Var : values()) {
            if (str.equals(e0Var.f18345a)) {
                return e0Var;
            }
        }
        throw new d0(a9.p.m("Resident key requirement ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f18345a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18345a);
    }
}
