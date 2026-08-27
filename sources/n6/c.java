package n6;

import android.os.Parcel;
import android.os.Parcelable;

public enum c implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<c> CREATOR = new h5.h(27);

    public final String f18336a;

    c(String str) {
        this.f18336a = str;
    }

    public static c a(String str) throws b {
        for (c cVar : values()) {
            if (str.equals(cVar.f18336a)) {
                return cVar;
            }
        }
        throw new b(a9.p.m("Attachment ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f18336a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18336a);
    }
}
