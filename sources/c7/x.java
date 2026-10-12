package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new w.a(27);
    public final a0 f4657a;
    public final o f4658b;

    public x(String str, int i10) {
        n6.l.h(str);
        try {
            this.f4657a = a0.a(str);
            try {
                this.f4658b = o.a(i10);
            } catch (n e) {
                throw new IllegalArgumentException(e);
            }
        } catch (z e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!this.f4657a.equals(xVar.f4657a) || !this.f4658b.equals(xVar.f4658b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4657a, this.f4658b});
    }

    public final String toString() {
        return org.telegram.ui.Cells.d0.j("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f4657a), ", \n algorithm=", String.valueOf(this.f4658b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        this.f4657a.getClass();
        w7.g0.l(parcel, 2, "public-key");
        w7.g0.i(parcel, 3, Integer.valueOf(this.f4658b.f4610a.a()));
        w7.g0.r(parcel, q6);
    }
}
