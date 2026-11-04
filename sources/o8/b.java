package o8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
public final class b extends q6.a {
    public static final Parcelable.Creator<b> CREATOR = new n8.g(8);
    public String f20929a;
    public DataHolder f20930b;
    public ParcelFileDescriptor f20931c;
    public long d;
    public byte[] f20932e;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f20929a);
        j8.a.l(parcel, 3, this.f20930b, i3);
        j8.a.l(parcel, 4, this.f20931c, i3);
        long j10 = this.d;
        j8.a.r(parcel, 5, 8);
        parcel.writeLong(j10);
        j8.a.d(parcel, 6, this.f20932e);
        j8.a.t(parcel, s6);
        this.f20931c = null;
    }
}
