package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new k(1);
    public final int f8272a;
    public final String f8273b;
    public final int f8274c;

    public c(int i7, int i10, String carrierId) {
        kotlin.jvm.internal.j.e(carrierId, "carrierId");
        this.f8272a = i7;
        this.f8273b = carrierId;
        this.f8274c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f8272a == cVar.f8272a && kotlin.jvm.internal.j.a(this.f8273b, cVar.f8273b) && this.f8274c == cVar.f8274c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return e2.h(this.f8272a * 31, 31, this.f8273b) + this.f8274c;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = bc.r(dest, 20293);
        bc.q(dest, 1, 4);
        dest.writeInt(this.f8272a);
        bc.l(dest, 2, this.f8273b);
        bc.q(dest, 3, 4);
        dest.writeInt(this.f8274c);
        bc.s(dest, r10);
    }
}
