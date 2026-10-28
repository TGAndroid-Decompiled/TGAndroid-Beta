package k8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import h8.j;
import java.util.Arrays;
import o6.l;
public class h extends p6.a {
    public static final Parcelable.Creator<h> CREATOR = new j(16);
    public final int f16453a;
    public final Float f16454b;

    public h(int i10, Float f7) {
        boolean z10 = true;
        if (i10 != 1 && (f7 == null || f7.floatValue() < 0.0f)) {
            z10 = false;
        }
        l.a("Invalid PatternItem: type=" + i10 + " length=" + f7, z10);
        this.f16453a = i10;
        this.f16454b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f16453a == hVar.f16453a && l.l(this.f16454b, hVar.f16454b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16453a), this.f16454b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.f16453a + " length=" + this.f16454b + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f16453a);
        df.e(parcel, 3, this.f16454b);
        df.r(parcel, q5);
    }
}
