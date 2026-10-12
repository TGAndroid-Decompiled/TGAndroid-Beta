package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.c0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new e6.i(9);
    public final int f10381a;
    public final boolean f10382b;
    public final boolean f10383c;

    public x(int i10, boolean z10, boolean z11) {
        this.f10381a = i10;
        this.f10382b = z10;
        this.f10383c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f10381a == xVar.f10381a && this.f10382b == xVar.f10382b && this.f10383c == xVar.f10383c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10381a), Boolean.valueOf(this.f10382b), Boolean.valueOf(this.f10383c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 2, 4);
        parcel.writeInt(this.f10381a);
        c0.s(parcel, 3, 4);
        parcel.writeInt(this.f10382b ? 1 : 0);
        c0.s(parcel, 4, 4);
        parcel.writeInt(this.f10383c ? 1 : 0);
        c0.r(parcel, q6);
    }
}
