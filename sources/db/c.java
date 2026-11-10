package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new k(1);
    public final int f8577a;
    public final String f8578b;
    public final int f8579c;

    public c(int i7, int i10, String carrierId) {
        kotlin.jvm.internal.j.e(carrierId, "carrierId");
        this.f8577a = i7;
        this.f8578b = carrierId;
        this.f8579c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f8577a == cVar.f8577a && kotlin.jvm.internal.j.a(this.f8578b, cVar.f8578b) && this.f8579c == cVar.f8579c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.recaptcha.internal.a.h(this.f8577a * 31, 31, this.f8578b) + this.f8579c;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = xb.r(dest, 20293);
        xb.q(dest, 1, 4);
        dest.writeInt(this.f8577a);
        xb.l(dest, 2, this.f8578b);
        xb.q(dest, 3, 4);
        dest.writeInt(this.f8579c);
        xb.s(dest, r10);
    }
}
