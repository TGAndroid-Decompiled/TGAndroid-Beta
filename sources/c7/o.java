package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new r0(19);
    public final Enum f4125a;

    public o(a aVar) {
        this.f4125a = (Enum) aVar;
    }

    public static o a(int i10) {
        p[] values;
        c0 c0Var;
        if (i10 == -262) {
            c0Var = c0.RS1;
        } else {
            c0[] values2 = c0.values();
            int length = values2.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    c0 c0Var2 = values2[i11];
                    if (c0Var2.f4081a == i10) {
                        c0Var = c0Var2;
                        break;
                    }
                    i11++;
                } else {
                    for (p pVar : p.values()) {
                        if (pVar.f4128a == i10) {
                            c0Var = pVar;
                        }
                    }
                    throw new Exception(hg.k0.i(i10, "Algorithm with COSE value ", " not supported"));
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
        if ((obj instanceof o) && this.f4125a.a() == ((o) obj).f4125a.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4125a});
    }

    public final String toString() {
        return a4.a.p("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.f4125a), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4125a.a());
    }
}
