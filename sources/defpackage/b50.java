package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class b50 extends c50 {
    public static final Parcelable.Creator<b50> CREATOR = new rhe((byte) 25);
    public final v34 a;
    public final String b;
    public final int c;

    public b50(int i, int i2, String str) {
        try {
            this.a = v34.a(i);
            this.b = str;
            this.c = i2;
        } catch (u34 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b50)) {
            return false;
        }
        b50 b50Var = (b50) obj;
        if (!cqe.a(this.a, b50Var.a) || !cqe.a(this.b, b50Var.b) || !cqe.a(Integer.valueOf(this.c), Integer.valueOf(b50Var.c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        vk9 vk9Var = new vk9(getClass().getSimpleName(), (byte) 25);
        String valueOf = String.valueOf((int) this.a.a);
        vk9 vk9Var2 = new vk9((byte) 24, false);
        ((vk9) vk9Var.d).d = vk9Var2;
        vk9Var.d = vk9Var2;
        vk9Var2.c = valueOf;
        vk9Var2.b = "errorCode";
        String str = this.b;
        if (str != null) {
            vk9Var.B(str, "errorMessage");
        }
        return vk9Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        byte b = this.a.a;
        jte.q(parcel, 2, 4);
        parcel.writeInt(b);
        jte.l(parcel, 3, this.b);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        jte.s(parcel, r);
    }
}
