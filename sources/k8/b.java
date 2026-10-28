package k8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import h8.j;
import java.util.ArrayList;
public final class b extends p6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(11);
    public LatLng f16431a;
    public double f16432b;
    public float f16433c;
    public int d;
    public int e;
    public float f16434f;
    public boolean h;
    public boolean f16435n;
    public ArrayList f16436r;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 2, this.f16431a, i10);
        double d = this.f16432b;
        df.s(parcel, 3, 8);
        parcel.writeDouble(d);
        float f7 = this.f16433c;
        df.s(parcel, 4, 4);
        parcel.writeFloat(f7);
        int i11 = this.d;
        df.s(parcel, 5, 4);
        parcel.writeInt(i11);
        int i12 = this.e;
        df.s(parcel, 6, 4);
        parcel.writeInt(i12);
        float f10 = this.f16434f;
        df.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        df.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f16435n;
        df.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        df.p(parcel, 10, this.f16436r);
        df.r(parcel, q5);
    }
}
