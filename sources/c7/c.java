package c7;

import android.os.Parcel;
import android.os.Parcelable;
public enum c implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");
    
    public static final Parcelable.Creator<c> CREATOR = new w.a(16);
    public final String f4566a;

    c(String str) {
        this.f4566a = str;
    }

    public static c a(String str) {
        c[] values;
        for (c cVar : values()) {
            if (str.equals(cVar.f4566a)) {
                return cVar;
            }
        }
        throw new Exception(a1.g.p("Attachment ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f4566a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4566a);
    }
}
