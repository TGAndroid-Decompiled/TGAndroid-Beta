package a4;

import a9.p;
import android.os.Parcel;
import android.os.Parcelable;
import h3.g1;
import h3.t0;

public final class a implements z3.b {
    public static final Parcelable.Creator<a> CREATOR = new w.a(1);

    public final int f46a;

    public final String f47b;

    public a(int i10, String str) {
        this.f46a = i10;
        this.f47b = str;
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
        sb2.append(this.f46a);
        sb2.append(",url=");
        return p.p(sb2, this.f47b, ")");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f47b);
        parcel.writeInt(this.f46a);
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
    }
}
