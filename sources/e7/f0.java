package e7;

import android.os.Parcel;
import android.os.Parcelable;
public enum f0 implements Parcelable {
    PRESENT("present"),
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");
    
    public static final Parcelable.Creator<f0> CREATOR = new r0(7);
    public final String f9821a;

    f0(String str) {
        this.f9821a = str;
    }

    public static f0 a(String str) {
        f0[] values;
        for (f0 f0Var : values()) {
            if (str.equals(f0Var.f9821a)) {
                return f0Var;
            }
        }
        throw new Exception(a1.g.q("TokenBindingStatus ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f9821a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f9821a);
    }
}
