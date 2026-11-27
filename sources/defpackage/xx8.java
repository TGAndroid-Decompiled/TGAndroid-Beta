package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class xx8 extends c4 {
    public static final Parcelable.Creator<xx8> CREATOR = new m9d((byte) 28);
    public final ay8 a;
    public final t51 b;

    public xx8(String str, int i) {
        xve.h(str);
        try {
            this.a = ay8.a(str);
            try {
                this.b = t51.a(i);
            } catch (s51 e) {
                throw new IllegalArgumentException(e);
            }
        } catch (zx8 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xx8) {
            xx8 xx8Var = (xx8) obj;
            if (this.a.equals(xx8Var.a) && this.b.equals(xx8Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return c00.j("PublicKeyCredentialParameters{\n type=", String.valueOf(this.a), ", \n algorithm=", String.valueOf(this.b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        this.a.getClass();
        bye.l(parcel, 2, "public-key");
        bye.i(parcel, 3, Integer.valueOf(this.b.a.a()));
        bye.s(parcel, r);
    }
}
