package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class hp extends b4 {
    public static final Parcelable.Creator<hp> CREATOR = f41.b;
    public static final hp d;
    public final uq2 a;
    public final boolean b;
    public boolean c;

    static {
        hp hpVar = new hp(null, false);
        hpVar.c = false;
        d = hpVar;
    }

    public hp(uq2 uq2Var, boolean z) {
        this.a = uq2Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hp) {
            hp hpVar = (hp) obj;
            if (fse.a(this.a, hpVar.a) && this.c == hpVar.c && this.b == hpVar.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.c), Boolean.valueOf(this.b)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return kt6.p("ApiMetadata(complianceOptions=", valueOf, ")", new StringBuilder(valueOf.length() + 31));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 1, this.a, i);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        mve.s(parcel, r);
    }
}
