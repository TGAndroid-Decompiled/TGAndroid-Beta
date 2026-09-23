package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.Cells.q3;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new w.a(27);
    public final a0 f4164a;
    public final o f4165b;

    public x(String str, int i10) {
        n6.l.h(str);
        try {
            this.f4164a = a0.a(str);
            try {
                this.f4165b = o.a(i10);
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
        if (!this.f4164a.equals(xVar.f4164a) || !this.f4165b.equals(xVar.f4165b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4164a, this.f4165b});
    }

    public final String toString() {
        return q3.j("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f4164a), ", \n algorithm=", String.valueOf(this.f4165b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        this.f4164a.getClass();
        w7.e0.l(parcel, 2, "public-key");
        w7.e0.i(parcel, 3, Integer.valueOf(this.f4165b.f4117a.a()));
        w7.e0.r(parcel, q6);
    }
}
