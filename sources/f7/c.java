package f7;

import android.os.Parcel;
import android.os.Parcelable;
public enum c implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");
    
    public static final Parcelable.Creator<c> CREATOR = new db.k(5);
    public final String f11362a;

    c(String str) {
        this.f11362a = str;
    }

    public static c a(String str) {
        c[] values;
        for (c cVar : values()) {
            if (str.equals(cVar.f11362a)) {
                return cVar;
            }
        }
        throw new Exception(a8.p0.p("Attachment ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f11362a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f11362a);
    }
}
