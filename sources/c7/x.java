package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.Cells.c1;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new w.a(27);
    public final a0 f4504a;
    public final o f4505b;

    public x(String str, int i10) {
        n6.l.h(str);
        try {
            this.f4504a = a0.a(str);
            try {
                this.f4505b = o.a(i10);
            } catch (n e7) {
                throw new IllegalArgumentException(e7);
            }
        } catch (z e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!this.f4504a.equals(xVar.f4504a) || !this.f4505b.equals(xVar.f4505b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4504a, this.f4505b});
    }

    public final String toString() {
        return c1.k("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f4504a), ", \n algorithm=", String.valueOf(this.f4505b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        this.f4504a.getClass();
        w7.g0.l(parcel, 2, "public-key");
        w7.g0.i(parcel, 3, Integer.valueOf(this.f4505b.f4454a.a()));
        w7.g0.r(parcel, q6);
    }
}
