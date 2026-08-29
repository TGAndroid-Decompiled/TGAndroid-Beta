package o6;

import android.os.Parcel;
import android.os.Parcelable;
public enum e implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");
    
    public static final Parcelable.Creator<e> CREATOR = new n0(17);
    public final String f19366a;

    e(String str) {
        this.f19366a = str;
    }

    public static e a(String str) {
        e[] values;
        for (e eVar : values()) {
            if (str.equals(eVar.f19366a)) {
                return eVar;
            }
        }
        throw new Exception(a4.w.n("Attestation conveyance preference ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f19366a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19366a);
    }
}
