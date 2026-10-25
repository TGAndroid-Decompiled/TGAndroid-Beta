package d7;

import android.os.Parcel;
import android.os.Parcelable;
public enum f0 implements Parcelable {
    PRESENT("present"),
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");
    
    public static final Parcelable.Creator<f0> CREATOR = new r0(4);
    public final String f8181a;

    f0(String str) {
        this.f8181a = str;
    }

    public static f0 a(String str) {
        f0[] values;
        for (f0 f0Var : values()) {
            if (str.equals(f0Var.f8181a)) {
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
        return this.f8181a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8181a);
    }
}
