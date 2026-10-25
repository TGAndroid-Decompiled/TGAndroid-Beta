package b6;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class a extends p6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(12);
    public final int f3648a;
    public final int f3649b;
    public final Bundle f3650c;

    public a(int i10, int i11, Bundle bundle) {
        this.f3648a = i10;
        this.f3649b = i11;
        this.f3650c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f3648a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f3649b);
        df.b(parcel, 3, this.f3650c);
        df.r(parcel, q5);
    }
}
