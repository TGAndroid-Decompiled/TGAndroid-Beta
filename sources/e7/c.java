package e7;

import android.os.Parcel;
import android.os.Parcelable;
public enum c implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");
    
    public static final Parcelable.Creator<c> CREATOR = new w.a(20);
    public final String f9800a;

    c(String str) {
        this.f9800a = str;
    }

    public static c a(String str) {
        c[] values;
        for (c cVar : values()) {
            if (str.equals(cVar.f9800a)) {
                return cVar;
            }
        }
        throw new Exception(a1.g.q("Attachment ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f9800a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f9800a);
    }
}
