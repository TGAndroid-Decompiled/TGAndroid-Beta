package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new k(1);
    public final int f8275a;
    public final String f8276b;
    public final int f8277c;

    public c(int i7, int i10, String carrierId) {
        kotlin.jvm.internal.j.e(carrierId, "carrierId");
        this.f8275a = i7;
        this.f8276b = carrierId;
        this.f8277c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f8275a == cVar.f8275a && kotlin.jvm.internal.j.a(this.f8276b, cVar.f8276b) && this.f8277c == cVar.f8277c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return e2.h(this.f8275a * 31, 31, this.f8276b) + this.f8277c;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = bc.r(dest, 20293);
        bc.q(dest, 1, 4);
        dest.writeInt(this.f8275a);
        bc.l(dest, 2, this.f8276b);
        bc.q(dest, 3, 4);
        dest.writeInt(this.f8277c);
        bc.s(dest, r10);
    }
}
