package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class ou8 extends b4 {
    public static final Parcelable.Creator<ou8> CREATOR = new t4d((byte) 28);
    public final ru8 a;
    public final l51 b;

    public ou8(String str, int i) {
        fre.h(str);
        try {
            this.a = ru8.a(str);
            try {
                this.b = l51.a(i);
            } catch (k51 e) {
                throw new IllegalArgumentException(e);
            }
        } catch (qu8 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ou8) {
            ou8 ou8Var = (ou8) obj;
            if (this.a.equals(ou8Var.a) && this.b.equals(ou8Var.b)) {
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
        return b00.i("PublicKeyCredentialParameters{\n type=", String.valueOf(this.a), ", \n algorithm=", String.valueOf(this.b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        this.a.getClass();
        jte.l(parcel, 2, "public-key");
        jte.i(parcel, 3, Integer.valueOf(this.b.a.a()));
        jte.s(parcel, r);
    }
}
