package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.Cells.c1;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new w.a(27);
    public final a0 f4552a;
    public final o f4553b;

    public x(String str, int i10) {
        n6.m.h(str);
        try {
            this.f4552a = a0.a(str);
            try {
                this.f4553b = o.a(i10);
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
        if (!this.f4552a.equals(xVar.f4552a) || !this.f4553b.equals(xVar.f4553b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4552a, this.f4553b});
    }

    public final String toString() {
        return c1.i("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f4552a), ", \n algorithm=", String.valueOf(this.f4553b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        this.f4552a.getClass();
        w7.c0.l(parcel, 2, "public-key");
        w7.c0.i(parcel, 3, Integer.valueOf(this.f4553b.f4502a.a()));
        w7.c0.r(parcel, q6);
    }
}
