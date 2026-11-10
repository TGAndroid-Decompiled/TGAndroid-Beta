package f7;

import android.os.Parcel;
import android.os.Parcelable;
public enum f0 implements Parcelable {
    PRESENT("present"),
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");
    
    public static final Parcelable.Creator<f0> CREATOR = new db.k(22);
    public final String f11383a;

    f0(String str) {
        this.f11383a = str;
    }

    public static f0 a(String str) {
        f0[] values;
        for (f0 f0Var : values()) {
            if (str.equals(f0Var.f11383a)) {
                return f0Var;
            }
        }
        throw new Exception(a8.p0.p("TokenBindingStatus ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f11383a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f11383a);
    }
}
