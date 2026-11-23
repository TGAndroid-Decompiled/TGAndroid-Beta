package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.internal.vision.e2;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new k(1);
    public final int f8238a;
    public final String f8239b;
    public final int f8240c;

    public c(int i7, int i10, String carrierId) {
        kotlin.jvm.internal.j.e(carrierId, "carrierId");
        this.f8238a = i7;
        this.f8239b = carrierId;
        this.f8240c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f8238a == cVar.f8238a && kotlin.jvm.internal.j.a(this.f8239b, cVar.f8239b) && this.f8240c == cVar.f8240c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return e2.h(this.f8238a * 31, 31, this.f8239b) + this.f8240c;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = cc.r(dest, 20293);
        cc.q(dest, 1, 4);
        dest.writeInt(this.f8238a);
        cc.l(dest, 2, this.f8239b);
        cc.q(dest, 3, 4);
        dest.writeInt(this.f8240c);
        cc.s(dest, r10);
    }
}
