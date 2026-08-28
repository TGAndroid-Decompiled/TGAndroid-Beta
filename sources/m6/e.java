package m6;

import android.os.Parcel;
import android.os.Parcelable;
public enum e implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");
    
    public static final Parcelable.Creator<e> CREATOR = new r0(5);
    public final String f17506a;

    e(String str) {
        this.f17506a = str;
    }

    public static e a(String str) {
        e[] values;
        for (e eVar : values()) {
            if (str.equals(eVar.f17506a)) {
                return eVar;
            }
        }
        throw new Exception(aa.d.o("Attestation conveyance preference ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f17506a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f17506a);
    }
}
