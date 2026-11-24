package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public enum v9c implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");
    
    public static final Parcelable.Creator<v9c> CREATOR = new lbd((byte) 21);
    public final String a;

    v9c(String str) {
        this.a = str;
    }

    public static v9c a(String str) {
        v9c[] values;
        for (v9c v9cVar : values()) {
            if (str.equals(v9cVar.a)) {
                return v9cVar;
            }
        }
        throw new Exception(kt6.o("User verification requirement ", str, " not supported"));
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
