package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public enum dy implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");
    
    public static final Parcelable.Creator<dy> CREATOR = new j9d((byte) 10);
    public final String a;

    dy(String str) {
        this.a = str;
    }

    public static dy a(String str) {
        dy[] values;
        for (dy dyVar : values()) {
            if (str.equals(dyVar.a)) {
                return dyVar;
            }
        }
        throw new Exception(tb4.y("Attestation conveyance preference ", str, " not supported"));
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
