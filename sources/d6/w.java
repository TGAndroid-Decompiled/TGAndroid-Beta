package d6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w extends p6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f8146a;
    public final float f8147b;
    public final float f8148c;

    public w(float f7, float f10, float f11) {
        this.f8146a = f7;
        this.f8147b = f10;
        this.f8148c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f8146a == wVar.f8146a && this.f8147b == wVar.f8147b && this.f8148c == wVar.f8148c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8146a), Float.valueOf(this.f8147b), Float.valueOf(this.f8148c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeFloat(this.f8146a);
        df.s(parcel, 3, 4);
        parcel.writeFloat(this.f8147b);
        df.s(parcel, 4, 4);
        parcel.writeFloat(this.f8148c);
        df.r(parcel, q5);
    }
}
