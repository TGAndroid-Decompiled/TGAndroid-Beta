package o5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import n6.w0;

public final class b extends z5.a {
    public static final Parcelable.Creator<b> CREATOR = new w0(8);

    public final int f19302a;

    public final int f19303b;

    public final int f19304c;

    public b(int i10, int i11, int i12) {
        this.f19302a = i10;
        this.f19303b = i11;
        this.f19304c = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f19302a);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f19303b);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.f19304c);
        r8.r(parcel, iQ);
    }
}
