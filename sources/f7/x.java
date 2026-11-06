package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import org.telegram.ui.Cells.f1;
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new db.k(16);
    public final a0 f11459a;
    public final o f11460b;

    public x(String str, int i7) {
        q6.m.g(str);
        try {
            this.f11459a = a0.a(str);
            try {
                this.f11460b = o.a(i7);
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
        if (!this.f11459a.equals(xVar.f11459a) || !this.f11460b.equals(xVar.f11460b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11459a, this.f11460b});
    }

    public final String toString() {
        return f1.m("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f11459a), ", \n algorithm=", String.valueOf(this.f11460b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        this.f11459a.getClass();
        xb.l(parcel, 2, "public-key");
        xb.i(parcel, 3, Integer.valueOf(this.f11460b.f11408a.a()));
        xb.s(parcel, r10);
    }
}
