package k4;

import android.os.Parcel;
import android.os.Parcelable;
import j3.d1;
import j3.n0;
import j8.t;
import java.util.ArrayList;
public final class d implements e4.b {
    public static final Parcelable.Creator<d> CREATOR = new t(13);
    public final ArrayList f9745a;

    public d(ArrayList arrayList) {
        this.f9745a = arrayList;
        boolean z4 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((c) arrayList.get(0)).f9743b;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((c) arrayList.get(i10)).f9742a < j10) {
                    z4 = true;
                    break;
                } else {
                    j10 = ((c) arrayList.get(i10)).f9743b;
                    i10++;
                }
            }
        }
        h5.a.f(!z4);
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return this.f9745a.equals(((d) obj).f9745a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9745a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f9745a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f9745a);
    }

    @Override
    public final void c(d1 d1Var) {
    }
}
