package f4;

import android.os.Parcel;
import android.os.Parcelable;
import h3.g1;
import h3.t0;
import java.util.ArrayList;
public final class d implements z3.b {
    public static final Parcelable.Creator<d> CREATOR = new c.c(24);
    public final ArrayList f5584a;

    public d(ArrayList arrayList) {
        this.f5584a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((c) arrayList.get(0)).f5582b;
            int i9 = 1;
            while (true) {
                if (i9 >= arrayList.size()) {
                    break;
                } else if (((c) arrayList.get(i9)).f5581a < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = ((c) arrayList.get(i9)).f5582b;
                    i9++;
                }
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
        if (obj != null && d.class == obj.getClass()) {
            return this.f5584a.equals(((d) obj).f5584a);
        }
        return false;
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
        return this.f5584a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f5584a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeList(this.f5584a);
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
    }
}
