package c4;

import a4.w;
import android.os.Parcel;
import android.os.Parcelable;
import j3.g1;
import j3.t0;
public final class a implements b4.b {
    public static final Parcelable.Creator<a> CREATOR = new w.a(25);
    public final int f2947a;
    public final String f2948b;

    public a(int i10, String str) {
        this.f2947a = i10;
        this.f2948b = str;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override
    public final t0 getWrappedMetadataFormat() {
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f2947a);
        sb2.append(",url=");
        return w.q(sb2, this.f2948b, ")");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2948b);
        parcel.writeInt(this.f2947a);
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
    }
}
