package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new k(1);
    public final int f8572a;
    public final String f8573b;
    public final int f8574c;

    public c(int i7, int i10, String carrierId) {
        kotlin.jvm.internal.j.e(carrierId, "carrierId");
        this.f8572a = i7;
        this.f8573b = carrierId;
        this.f8574c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f8572a == cVar.f8572a && kotlin.jvm.internal.j.a(this.f8573b, cVar.f8573b) && this.f8574c == cVar.f8574c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.recaptcha.internal.a.h(this.f8572a * 31, 31, this.f8573b) + this.f8574c;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = xb.r(dest, 20293);
        xb.q(dest, 1, 4);
        dest.writeInt(this.f8572a);
        xb.l(dest, 2, this.f8573b);
        xb.q(dest, 3, 4);
        dest.writeInt(this.f8574c);
        xb.s(dest, r10);
    }
}
