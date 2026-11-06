package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new k(1);
    public final int f8574a;
    public final String f8575b;
    public final int f8576c;

    public c(int i7, int i10, String carrierId) {
        kotlin.jvm.internal.j.e(carrierId, "carrierId");
        this.f8574a = i7;
        this.f8575b = carrierId;
        this.f8576c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f8574a == cVar.f8574a && kotlin.jvm.internal.j.a(this.f8575b, cVar.f8575b) && this.f8576c == cVar.f8576c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.recaptcha.internal.a.h(this.f8574a * 31, 31, this.f8575b) + this.f8576c;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = wb.r(dest, 20293);
        wb.q(dest, 1, 4);
        dest.writeInt(this.f8574a);
        wb.l(dest, 2, this.f8575b);
        wb.q(dest, 3, 4);
        dest.writeInt(this.f8576c);
        wb.s(dest, r10);
    }
}
