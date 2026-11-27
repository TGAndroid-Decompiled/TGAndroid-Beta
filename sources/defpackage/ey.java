package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public enum ey implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");
    
    public static final Parcelable.Creator<ey> CREATOR = new ced((byte) 10);
    public final String a;

    ey(String str) {
        this.a = str;
    }

    public static ey a(String str) {
        ey[] values;
        for (ey eyVar : values()) {
            if (str.equals(eyVar.a)) {
                return eyVar;
            }
        }
        throw new Exception(qd4.y("Attestation conveyance preference ", str, " not supported"));
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
