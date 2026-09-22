package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.Cells.q3;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new w.a(27);
    public final a0 f4169a;
    public final o f4170b;

    public x(String str, int i10) {
        n6.l.h(str);
        try {
            this.f4169a = a0.a(str);
            try {
                this.f4170b = o.a(i10);
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
        if (!this.f4169a.equals(xVar.f4169a) || !this.f4170b.equals(xVar.f4170b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4169a, this.f4170b});
    }

    public final String toString() {
        return q3.j("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f4169a), ", \n algorithm=", String.valueOf(this.f4170b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        this.f4169a.getClass();
        w7.e0.l(parcel, 2, "public-key");
        w7.e0.i(parcel, 3, Integer.valueOf(this.f4170b.f4122a.a()));
        w7.e0.r(parcel, q6);
    }
}
