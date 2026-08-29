package o6;

import android.os.Parcel;
import android.os.Parcelable;
public enum f0 implements Parcelable {
    PRESENT("present"),
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");
    
    public static final Parcelable.Creator<f0> CREATOR = new n0(15);
    public final String f19380a;

    f0(String str) {
        this.f19380a = str;
    }

    public static f0 a(String str) {
        f0[] values;
        for (f0 f0Var : values()) {
            if (str.equals(f0Var.f19380a)) {
                return f0Var;
            }
        }
        throw new Exception(a4.w.n("TokenBindingStatus ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f19380a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19380a);
    }
}
