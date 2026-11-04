package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k2.p1;
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new r0(23);
    public final Enum f9851a;

    public o(a aVar) {
        this.f9851a = (Enum) aVar;
    }

    public static o a(int i3) {
        p[] values;
        c0 c0Var;
        if (i3 == -262) {
            c0Var = c0.RS1;
        } else {
            c0[] values2 = c0.values();
            int length = values2.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    c0 c0Var2 = values2[i10];
                    if (c0Var2.f9803a == i3) {
                        c0Var = c0Var2;
                        break;
                    }
                    i10++;
                } else {
                    for (p pVar : p.values()) {
                        if (pVar.f9854a == i3) {
                            c0Var = pVar;
                        }
                    }
                    throw new Exception(p1.j(i3, "Algorithm with COSE value ", " not supported"));
                }
            }
        }
        return new o(c0Var);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o) && this.f9851a.a() == ((o) obj).f9851a.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9851a});
    }

    public final String toString() {
        return a1.g.q("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.f9851a), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f9851a.a());
    }
}
