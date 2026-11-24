package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class o94 extends b4 {
    public static final Parcelable.Creator<o94> CREATOR = new lbd((byte) 18);
    public final String a;
    public final int b;
    public final long c;
    public final boolean d;

    public o94(String str, int i, long j, boolean z) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public final long b() {
        long j = this.c;
        if (j == -1) {
            return this.b;
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o94) {
            o94 o94Var = (o94) obj;
            if (fse.a(this.a, o94Var.a) && b() == o94Var.b() && this.d == o94Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(b()), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        wm4 wm4Var = new wm4(this);
        wm4Var.a(this.a, "name");
        wm4Var.a(Long.valueOf(b()), "version");
        wm4Var.a(Boolean.valueOf(this.d), "is_fully_rolled_out");
        return wm4Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 1, this.a);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        long b = b();
        mve.q(parcel, 3, 8);
        parcel.writeLong(b);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        mve.s(parcel, r);
    }

    public o94(String str, long j) {
        this(str, -1, j, false);
    }
}
