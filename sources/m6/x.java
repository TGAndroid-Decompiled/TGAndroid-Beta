package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import org.telegram.ui.Cells.j2;
public final class x extends y5.a {
    public static final Parcelable.Creator<x> CREATOR = new h5.h(27);
    public final a0 f17600a;
    public final o f17601b;

    public x(String str, int i9) {
        x5.l.h(str);
        try {
            this.f17600a = a0.a(str);
            try {
                this.f17601b = o.a(i9);
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
        if (!this.f17600a.equals(xVar.f17600a) || !this.f17601b.equals(xVar.f17601b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17600a, this.f17601b});
    }

    public final String toString() {
        return j2.h("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f17600a), ", \n algorithm=", String.valueOf(this.f17601b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        this.f17600a.getClass();
        p8.l(parcel, 2, "public-key");
        p8.i(parcel, 3, Integer.valueOf(this.f17601b.f17550a.a()));
        p8.r(parcel, q10);
    }
}
