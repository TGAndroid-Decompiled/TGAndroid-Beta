package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u extends a6.a {
    public final int f19338a;
    public final int f19339b;
    public final int f19340c;
    public static final s5.b d = new s5.b("VideoInfo", null);
    public static final Parcelable.Creator<u> CREATOR = new v(21);

    public u(int i10, int i11, int i12) {
        this.f19338a = i10;
        this.f19339b = i11;
        this.f19340c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f19339b == uVar.f19339b && this.f19338a == uVar.f19338a && this.f19340c == uVar.f19340c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f19339b), Integer.valueOf(this.f19338a), Integer.valueOf(this.f19340c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f19338a);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f19339b);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.f19340c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
