package n6;

import android.os.Parcel;
import android.os.Parcelable;

public enum e implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");

    public static final Parcelable.Creator<e> CREATOR = new o0(16);

    public final String f18342a;

    e(String str) {
        this.f18342a = str;
    }

    public static e a(String str) throws d {
        for (e eVar : values()) {
            if (str.equals(eVar.f18342a)) {
                return eVar;
            }
        }
        throw new d(a9.p.m("Attestation conveyance preference ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f18342a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18342a);
    }
}
