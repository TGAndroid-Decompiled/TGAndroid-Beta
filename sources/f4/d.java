package f4;

import android.os.Parcel;
import android.os.Parcelable;
import c8.o;
import h3.g1;
import h3.t0;
import java.util.ArrayList;

public final class d implements z3.b {
    public static final Parcelable.Creator<d> CREATOR = new o(28);

    public final ArrayList f5879a;

    public d(ArrayList arrayList) {
        this.f5879a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((c) arrayList.get(0)).f5877b;
            for (int i10 = 1; i10 < arrayList.size(); i10++) {
                if (((c) arrayList.get(i10)).f5876a < j10) {
                    z10 = true;
                    break;
                }
                j10 = ((c) arrayList.get(i10)).f5877b;
            }
        }
        d5.a.f(!z10);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f5879a.equals(((d) obj).f5879a);
    }

    @Override
    public final byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override
    public final t0 getWrappedMetadataFormat() {
        return null;
    }

    public final int hashCode() {
        return this.f5879a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f5879a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f5879a);
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
    }
}
