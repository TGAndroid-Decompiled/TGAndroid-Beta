package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class m9d extends b4 {
    public static final Parcelable.Creator<m9d> CREATOR = new j9d((byte) 3);
    public final float a;
    public final float b;
    public final float c;

    public m9d(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9d)) {
            return false;
        }
        m9d m9dVar = (m9d) obj;
        if (this.a == m9dVar.a && this.b == m9dVar.b && this.c == m9dVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeFloat(this.a);
        jte.q(parcel, 3, 4);
        parcel.writeFloat(this.b);
        jte.q(parcel, 4, 4);
        parcel.writeFloat(this.c);
        jte.s(parcel, r);
    }
}
