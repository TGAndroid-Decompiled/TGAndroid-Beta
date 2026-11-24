package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public enum ba9 implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");
    
    public static final Parcelable.Creator<ba9> CREATOR = new j9d((byte) 5);
    public final String a;

    ba9(String str) {
        this.a = str;
    }

    public static ba9 a(String str) {
        ba9[] values;
        for (ba9 ba9Var : values()) {
            if (str.equals(ba9Var.a)) {
                return ba9Var;
            }
        }
        throw new Exception(tb4.y("Resident key requirement ", str, " not supported"));
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
