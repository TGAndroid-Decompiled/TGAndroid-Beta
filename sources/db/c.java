package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new k(1);
    public final int f8243a;
    public final String f8244b;
    public final int f8245c;

    public c(int i7, int i10, String carrierId) {
        kotlin.jvm.internal.j.e(carrierId, "carrierId");
        this.f8243a = i7;
        this.f8244b = carrierId;
        this.f8245c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f8243a == cVar.f8243a && kotlin.jvm.internal.j.a(this.f8244b, cVar.f8244b) && this.f8245c == cVar.f8245c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return e2.h(this.f8243a * 31, 31, this.f8244b) + this.f8245c;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = bc.r(dest, 20293);
        bc.q(dest, 1, 4);
        dest.writeInt(this.f8243a);
        bc.l(dest, 2, this.f8244b);
        bc.q(dest, 3, 4);
        dest.writeInt(this.f8245c);
        bc.s(dest, r10);
    }
}
