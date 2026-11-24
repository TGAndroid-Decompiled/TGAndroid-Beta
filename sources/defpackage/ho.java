package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class ho extends b4 {
    public static final Parcelable.Creator<ho> CREATOR = x21.b;
    public static final ho d;
    public final jp2 a;
    public final boolean b;
    public boolean c;

    static {
        ho hoVar = new ho(null, false);
        hoVar.c = false;
        d = hoVar;
    }

    public ho(jp2 jp2Var, boolean z) {
        this.a = jp2Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ho) {
            ho hoVar = (ho) obj;
            if (cqe.a(this.a, hoVar.a) && this.c == hoVar.c && this.b == hoVar.b) {
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
        return ls6.o("ApiMetadata(complianceOptions=", valueOf, ")", new StringBuilder(valueOf.length() + 31));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 1, this.a, i);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        jte.s(parcel, r);
    }
}
