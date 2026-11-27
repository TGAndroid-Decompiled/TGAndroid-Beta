package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class fed extends c4 {
    public static final Parcelable.Creator<fed> CREATOR = new ced((byte) 3);
    public final float a;
    public final float b;
    public final float c;

    public fed(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fed)) {
            return false;
        }
        fed fedVar = (fed) obj;
        if (this.a == fedVar.a && this.b == fedVar.b && this.c == fedVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeFloat(this.a);
        bye.q(parcel, 3, 4);
        parcel.writeFloat(this.b);
        bye.q(parcel, 4, 4);
        parcel.writeFloat(this.c);
        bye.s(parcel, r);
    }
}
