package h4;

import android.os.Parcel;
import android.os.Parcelable;
import j3.g1;
import j3.t0;
import java.util.ArrayList;
public final class d implements b4.b {
    public static final Parcelable.Creator<d> CREATOR = new g8.b(6);
    public final ArrayList f7534a;

    public d(ArrayList arrayList) {
        this.f7534a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((c) arrayList.get(0)).f7532b;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((c) arrayList.get(i10)).f7531a < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = ((c) arrayList.get(i10)).f7532b;
                    i10++;
                }
            }
        }
        f5.a.f(!z10);
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
            return this.f7534a.equals(((d) obj).f7534a);
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
        return this.f7534a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f7534a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f7534a);
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
    }
}
