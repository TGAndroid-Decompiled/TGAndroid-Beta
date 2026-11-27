package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class d50 extends e50 {
    public static final Parcelable.Creator<d50> CREATOR = new ime((byte) 25);
    public final q44 a;
    public final String b;
    public final int c;

    public d50(int i, int i2, String str) {
        try {
            this.a = q44.a(i);
            this.b = str;
            this.c = i2;
        } catch (p44 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d50)) {
            return false;
        }
        d50 d50Var = (d50) obj;
        if (!vue.a(this.a, d50Var.a) || !vue.a(this.b, d50Var.b) || !vue.a(Integer.valueOf(this.c), Integer.valueOf(d50Var.c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        ko9 ko9Var = new ko9(getClass().getSimpleName(), (byte) 25);
        String valueOf = String.valueOf((int) this.a.a);
        ko9 ko9Var2 = new ko9((byte) 24, false);
        ((ko9) ko9Var.d).d = ko9Var2;
        ko9Var.d = ko9Var2;
        ko9Var2.c = valueOf;
        ko9Var2.b = "errorCode";
        String str = this.b;
        if (str != null) {
            ko9Var.B(str, "errorMessage");
        }
        return ko9Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        byte b = this.a.a;
        bye.q(parcel, 2, 4);
        parcel.writeInt(b);
        bye.l(parcel, 3, this.b);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        bye.s(parcel, r);
    }
}
