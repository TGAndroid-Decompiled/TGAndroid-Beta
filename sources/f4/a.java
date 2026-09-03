package f4;

import android.os.Parcel;
import android.os.Parcelable;
import b9.e;
import j3.d1;
import j3.n0;
public final class a implements e4.b {
    public static final Parcelable.Creator<a> CREATOR = new e(16);
    public final int f5882a;
    public final String f5883b;

    public a(int i10, String str) {
        this.f5882a = i10;
        this.f5883b = str;
    }

    @Override
    public final n0 b() {
        return null;
    }

    @Override
    public final byte[] d() {
        return null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f5882a);
        sb.append(",url=");
        return android.support.v4.media.a.r(sb, this.f5883b, ")");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5883b);
        parcel.writeInt(this.f5882a);
    }

    @Override
    public final void c(d1 d1Var) {
    }
}
