package f7;

import android.os.Parcel;
import android.os.Parcelable;
public enum e implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");
    
    public static final Parcelable.Creator<e> CREATOR = new db.k(24);
    public final String f11368a;

    e(String str) {
        this.f11368a = str;
    }

    public static e a(String str) {
        e[] values;
        for (e eVar : values()) {
            if (str.equals(eVar.f11368a)) {
                return eVar;
            }
        }
        throw new Exception(a8.p0.p("Attestation conveyance preference ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f11368a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f11368a);
    }
}
