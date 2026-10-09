package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.Cells.c1;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new w.a(27);
    public final a0 f4554a;
    public final o f4555b;

    public x(String str, int i10) {
        n6.l.h(str);
        try {
            this.f4554a = a0.a(str);
            try {
                this.f4555b = o.a(i10);
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
        if (!this.f4554a.equals(xVar.f4554a) || !this.f4555b.equals(xVar.f4555b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4554a, this.f4555b});
    }

    public final String toString() {
        return c1.i("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f4554a), ", \n algorithm=", String.valueOf(this.f4555b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        this.f4554a.getClass();
        w7.d0.l(parcel, 2, "public-key");
        w7.d0.i(parcel, 3, Integer.valueOf(this.f4555b.f4504a.a()));
        w7.d0.r(parcel, q6);
    }
}
