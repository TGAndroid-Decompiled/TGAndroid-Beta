package e7;

import android.os.Parcel;
import android.os.Parcelable;
public enum e implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");
    
    public static final Parcelable.Creator<e> CREATOR = new r0(9);
    public final String f9806a;

    e(String str) {
        this.f9806a = str;
    }

    public static e a(String str) {
        e[] values;
        for (e eVar : values()) {
            if (str.equals(eVar.f9806a)) {
                return eVar;
            }
        }
        throw new Exception(a1.g.q("Attestation conveyance preference ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f9806a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f9806a);
    }
}
