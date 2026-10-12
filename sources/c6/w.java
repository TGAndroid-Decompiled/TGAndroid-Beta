package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float f4435a;
    public final float f4436b;
    public final float f4437c;

    public w(float f7, float f10, float f11) {
        this.f4435a = f7;
        this.f4436b = f10;
        this.f4437c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f4435a == wVar.f4435a && this.f4436b == wVar.f4436b && this.f4437c == wVar.f4437c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4435a), Float.valueOf(this.f4436b), Float.valueOf(this.f4437c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 2, 4);
        parcel.writeFloat(this.f4435a);
        w7.c0.s(parcel, 3, 4);
        parcel.writeFloat(this.f4436b);
        w7.c0.s(parcel, 4, 4);
        parcel.writeFloat(this.f4437c);
        w7.c0.r(parcel, q6);
    }
}
