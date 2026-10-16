package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.Cells.c1;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new w.a(27);
    public final a0 f4660a;
    public final o f4661b;

    public x(String str, int i10) {
        n6.l.h(str);
        try {
            this.f4660a = a0.a(str);
            try {
                this.f4661b = o.a(i10);
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
        if (!this.f4660a.equals(xVar.f4660a) || !this.f4661b.equals(xVar.f4661b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4660a, this.f4661b});
    }

    public final String toString() {
        return c1.i("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f4660a), ", \n algorithm=", String.valueOf(this.f4661b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        this.f4660a.getClass();
        w7.f0.l(parcel, 2, "public-key");
        w7.f0.i(parcel, 3, Integer.valueOf(this.f4661b.f4613a.a()));
        w7.f0.r(parcel, q6);
    }
}
