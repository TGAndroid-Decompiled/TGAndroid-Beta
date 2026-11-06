package d6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(26);
    public final int f8186a;
    public final int f8187b;
    public final Bundle f8188c;

    public a(int i7, int i10, Bundle bundle) {
        this.f8186a = i7;
        this.f8187b = i10;
        this.f8188c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f8186a);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f8187b);
        wb.b(parcel, 3, this.f8188c);
        wb.s(parcel, r10);
    }
}
