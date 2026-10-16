package c7;

import android.os.Parcel;
import android.os.Parcelable;
public enum f0 implements Parcelable {
    PRESENT("present"),
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");
    
    public static final Parcelable.Creator<f0> CREATOR = new r0(3);
    public final String f4585a;

    f0(String str) {
        this.f4585a = str;
    }

    public static f0 a(String str) {
        f0[] values;
        for (f0 f0Var : values()) {
            if (str.equals(f0Var.f4585a)) {
                return f0Var;
            }
        }
        throw new Exception(a1.g.p("TokenBindingStatus ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f4585a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4585a);
    }
}
