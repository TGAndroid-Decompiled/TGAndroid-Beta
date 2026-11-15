package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.internal.vision.e2;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new k(1);
    public final int f7961a;
    public final String f7962b;
    public final int f7963c;

    public c(int i7, int i10, String carrierId) {
        kotlin.jvm.internal.j.e(carrierId, "carrierId");
        this.f7961a = i7;
        this.f7962b = carrierId;
        this.f7963c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f7961a == cVar.f7961a && kotlin.jvm.internal.j.a(this.f7962b, cVar.f7962b) && this.f7963c == cVar.f7963c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return e2.h(this.f7961a * 31, 31, this.f7962b) + this.f7963c;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = yb.r(dest, 20293);
        yb.q(dest, 1, 4);
        dest.writeInt(this.f7961a);
        yb.l(dest, 2, this.f7962b);
        yb.q(dest, 3, 4);
        dest.writeInt(this.f7963c);
        yb.s(dest, r10);
    }
}
