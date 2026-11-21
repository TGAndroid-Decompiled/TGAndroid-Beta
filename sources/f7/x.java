package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new db.k(16);
    public final a0 f11619a;
    public final o f11620b;

    public x(String str, int i7) {
        q6.m.h(str);
        try {
            this.f11619a = a0.a(str);
            try {
                this.f11620b = o.a(i7);
            } catch (n e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (z e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!this.f11619a.equals(xVar.f11619a) || !this.f11620b.equals(xVar.f11620b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11619a, this.f11620b});
    }

    public final String toString() {
        return p5.c.l("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f11619a), ", \n algorithm=", String.valueOf(this.f11620b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        this.f11619a.getClass();
        bc.l(parcel, 2, "public-key");
        bc.i(parcel, 3, Integer.valueOf(this.f11620b.f11568a.a()));
        bc.s(parcel, r10);
    }
}
