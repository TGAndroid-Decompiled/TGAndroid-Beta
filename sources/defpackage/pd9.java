package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public enum pd9 implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");
    
    public static final Parcelable.Creator<pd9> CREATOR = new ced((byte) 5);
    public final String a;

    pd9(String str) {
        this.a = str;
    }

    public static pd9 a(String str) {
        pd9[] values;
        for (pd9 pd9Var : values()) {
            if (str.equals(pd9Var.a)) {
                return pd9Var;
            }
        }
        throw new Exception(qd4.y("Resident key requirement ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
