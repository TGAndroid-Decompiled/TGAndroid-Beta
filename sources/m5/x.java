package m5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class x extends z5.a {
    public static final Parcelable.Creator<x> CREATOR = new w(2);

    public final float f17862a;

    public final float f17863b;

    public final float f17864c;

    public x(float f10, float f11, float f12) {
        this.f17862a = f10;
        this.f17863b = f11;
        this.f17864c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f17862a == xVar.f17862a && this.f17863b == xVar.f17863b && this.f17864c == xVar.f17864c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f17862a), Float.valueOf(this.f17863b), Float.valueOf(this.f17864c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeFloat(this.f17862a);
        r8.s(parcel, 3, 4);
        parcel.writeFloat(this.f17863b);
        r8.s(parcel, 4, 4);
        parcel.writeFloat(this.f17864c);
        r8.r(parcel, iQ);
    }
}
