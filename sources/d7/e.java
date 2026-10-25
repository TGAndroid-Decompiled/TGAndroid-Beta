package d7;

import android.os.Parcel;
import android.os.Parcelable;
public enum e implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");
    
    public static final Parcelable.Creator<e> CREATOR = new r0(6);
    public final String f8168a;

    e(String str) {
        this.f8168a = str;
    }

    public static e a(String str) {
        e[] values;
        for (e eVar : values()) {
            if (str.equals(eVar.f8168a)) {
                return eVar;
            }
        }
        throw new Exception(a1.g.p("Attestation conveyance preference ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f8168a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8168a);
    }
}
