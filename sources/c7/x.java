package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.Cells.f1;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new w.a(27);
    public final a0 f4062a;
    public final o f4063b;

    public x(String str, int i10) {
        n6.l.g(str);
        try {
            this.f4062a = a0.a(str);
            try {
                this.f4063b = o.a(i10);
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
        if (!this.f4062a.equals(xVar.f4062a) || !this.f4063b.equals(xVar.f4063b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4062a, this.f4063b});
    }

    public final String toString() {
        return f1.o("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f4062a), ", \n algorithm=", String.valueOf(this.f4063b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        this.f4062a.getClass();
        w7.h0.l(parcel, 2, "public-key");
        w7.h0.i(parcel, 3, Integer.valueOf(this.f4063b.f4014a.a()));
        w7.h0.r(parcel, q6);
    }
}
