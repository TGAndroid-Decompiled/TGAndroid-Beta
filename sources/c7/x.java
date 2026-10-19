package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.Cells.c1;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new w.a(27);
    public final a0 f5028a;
    public final o f5029b;

    public x(String str, int i10) {
        n6.l.h(str);
        try {
            this.f5028a = a0.a(str);
            try {
                this.f5029b = o.a(i10);
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
        if (!this.f5028a.equals(xVar.f5028a) || !this.f5029b.equals(xVar.f5029b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5028a, this.f5029b});
    }

    public final String toString() {
        return c1.k("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f5028a), ", \n algorithm=", String.valueOf(this.f5029b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        this.f5028a.getClass();
        w7.f0.l(parcel, 2, "public-key");
        w7.f0.i(parcel, 3, Integer.valueOf(this.f5029b.f4981a.a()));
        w7.f0.r(parcel, q6);
    }
}
