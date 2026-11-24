package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class b60 extends c60 {
    public static final Parcelable.Creator<b60> CREATOR = new sje((byte) 25);
    public final f54 a;
    public final String b;
    public final int c;

    public b60(int i, int i2, String str) {
        try {
            this.a = f54.a(i);
            this.b = str;
            this.c = i2;
        } catch (e54 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b60)) {
            return false;
        }
        b60 b60Var = (b60) obj;
        if (!fse.a(this.a, b60Var.a) || !fse.a(this.b, b60Var.b) || !fse.a(Integer.valueOf(this.c), Integer.valueOf(b60Var.c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        wm9 wm9Var = new wm9(getClass().getSimpleName(), (byte) 25);
        String valueOf = String.valueOf((int) this.a.a);
        wm9 wm9Var2 = new wm9((byte) 24, false);
        ((wm9) wm9Var.d).d = wm9Var2;
        wm9Var.d = wm9Var2;
        wm9Var2.c = valueOf;
        wm9Var2.b = "errorCode";
        String str = this.b;
        if (str != null) {
            wm9Var.B(str, "errorMessage");
        }
        return wm9Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        byte b = this.a.a;
        mve.q(parcel, 2, 4);
        parcel.writeInt(b);
        mve.l(parcel, 3, this.b);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        mve.s(parcel, r);
    }
}
