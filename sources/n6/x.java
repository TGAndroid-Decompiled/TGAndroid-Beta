package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import org.telegram.ui.Cells.pa;

public final class x extends z5.a {
    public static final Parcelable.Creator<x> CREATOR = new o0(8);

    public final a0 f18434a;

    public final o f18435b;

    public x(String str, int i10) {
        y5.l.h(str);
        try {
            this.f18434a = a0.a(str);
            try {
                this.f18435b = o.a(i10);
            } catch (n e9) {
                throw new IllegalArgumentException(e9);
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
        return this.f18434a.equals(xVar.f18434a) && this.f18435b.equals(xVar.f18435b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18434a, this.f18435b});
    }

    public final String toString() {
        return pa.j("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f18434a), ", \n algorithm=", String.valueOf(this.f18435b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        this.f18434a.getClass();
        r8.l(parcel, 2, "public-key");
        r8.i(parcel, 3, Integer.valueOf(this.f18435b.f18386a.a()));
        r8.r(parcel, iQ);
    }
}
