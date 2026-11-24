package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public enum dz implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");
    
    public static final Parcelable.Creator<dz> CREATOR = new lbd((byte) 10);
    public final String a;

    dz(String str) {
        this.a = str;
    }

    public static dz a(String str) {
        dz[] values;
        for (dz dzVar : values()) {
            if (str.equals(dzVar.a)) {
                return dzVar;
            }
        }
        throw new Exception(kt6.o("Attestation conveyance preference ", str, " not supported"));
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
