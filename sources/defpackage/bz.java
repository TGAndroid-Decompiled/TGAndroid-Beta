package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public enum bz implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");
    
    public static final Parcelable.Creator<bz> CREATOR = new d3d((byte) 26);
    public final String a;

    bz(String str) {
        this.a = str;
    }

    public static bz a(String str) {
        bz[] values;
        for (bz bzVar : values()) {
            if (str.equals(bzVar.a)) {
                return bzVar;
            }
        }
        throw new Exception(kt6.o("Attachment ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
