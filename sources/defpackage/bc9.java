package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public enum bc9 implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");
    
    public static final Parcelable.Creator<bc9> CREATOR = new lbd((byte) 5);
    public final String a;

    bc9(String str) {
        this.a = str;
    }

    public static bc9 a(String str) {
        bc9[] values;
        for (bc9 bc9Var : values()) {
            if (str.equals(bc9Var.a)) {
                return bc9Var;
            }
        }
        throw new Exception(kt6.o("Resident key requirement ", str, " not supported"));
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
