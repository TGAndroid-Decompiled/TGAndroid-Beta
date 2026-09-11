package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.Cells.p6;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new w.a(27);
    public final a0 f4697a;
    public final o f4698b;

    public x(String str, int i10) {
        n6.l.h(str);
        try {
            this.f4697a = a0.a(str);
            try {
                this.f4698b = o.a(i10);
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
        if (!this.f4697a.equals(xVar.f4697a) || !this.f4698b.equals(xVar.f4698b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4697a, this.f4698b});
    }

    public final String toString() {
        return p6.j("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f4697a), ", \n algorithm=", String.valueOf(this.f4698b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        this.f4697a.getClass();
        w7.e0.l(parcel, 2, "public-key");
        w7.e0.i(parcel, 3, Integer.valueOf(this.f4698b.f4647a.a()));
        w7.e0.r(parcel, q6);
    }
}
