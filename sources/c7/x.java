package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.Cells.r6;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new w.a(27);
    public final a0 f4586a;
    public final o f4587b;

    public x(String str, int i10) {
        n6.l.h(str);
        try {
            this.f4586a = a0.a(str);
            try {
                this.f4587b = o.a(i10);
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
        if (!this.f4586a.equals(xVar.f4586a) || !this.f4587b.equals(xVar.f4587b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4586a, this.f4587b});
    }

    public final String toString() {
        return r6.j("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f4586a), ", \n algorithm=", String.valueOf(this.f4587b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        this.f4586a.getClass();
        w7.e0.l(parcel, 2, "public-key");
        w7.e0.i(parcel, 3, Integer.valueOf(this.f4587b.f4539a.a()));
        w7.e0.r(parcel, q6);
    }
}
