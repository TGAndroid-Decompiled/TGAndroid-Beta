package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public enum u7c implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");
    
    public static final Parcelable.Creator<u7c> CREATOR = new j9d((byte) 21);
    public final String a;

    u7c(String str) {
        this.a = str;
    }

    public static u7c a(String str) {
        u7c[] values;
        for (u7c u7cVar : values()) {
            if (str.equals(u7cVar.a)) {
                return u7cVar;
            }
        }
        throw new Exception(tb4.y("User verification requirement ", str, " not supported"));
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
