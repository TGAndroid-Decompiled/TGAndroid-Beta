package n6;

import android.os.Parcel;
import android.os.Parcelable;

public enum f0 implements Parcelable {
    PRESENT("present"),
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");

    public static final Parcelable.Creator<f0> CREATOR = new o0(14);

    public final String f18356a;

    f0(String str) {
        this.f18356a = str;
    }

    public static f0 a(String str) throws g0 {
        for (f0 f0Var : values()) {
            if (str.equals(f0Var.f18356a)) {
                return f0Var;
            }
        }
        throw new g0(a9.p.m("TokenBindingStatus ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f18356a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18356a);
    }
}
