package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public enum yrb implements Parcelable {
    PRESENT("present"),
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");
    
    public static final Parcelable.Creator<yrb> CREATOR = new lbd((byte) 8);
    public final String a;

    yrb(String str) {
        this.a = str;
    }

    public static yrb a(String str) {
        yrb[] values;
        for (yrb yrbVar : values()) {
            if (str.equals(yrbVar.a)) {
                return yrbVar;
            }
        }
        throw new Exception(kt6.o("TokenBindingStatus ", str, " not supported"));
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
