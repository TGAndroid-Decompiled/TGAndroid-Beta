package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.internal.vision.e2;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new k(1);
    public final int f7964a;
    public final String f7965b;
    public final int f7966c;

    public c(int i7, int i10, String carrierId) {
        kotlin.jvm.internal.j.e(carrierId, "carrierId");
        this.f7964a = i7;
        this.f7965b = carrierId;
        this.f7966c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f7964a == cVar.f7964a && kotlin.jvm.internal.j.a(this.f7965b, cVar.f7965b) && this.f7966c == cVar.f7966c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return e2.h(this.f7964a * 31, 31, this.f7965b) + this.f7966c;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = yb.r(dest, 20293);
        yb.q(dest, 1, 4);
        dest.writeInt(this.f7964a);
        yb.l(dest, 2, this.f7965b);
        yb.q(dest, 3, 4);
        dest.writeInt(this.f7966c);
        yb.s(dest, r10);
    }
}
