package f7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new t0(8);
    public final Enum f11539a;

    public o(a aVar) {
        this.f11539a = (Enum) aVar;
    }

    public static o a(int i7) {
        p[] values;
        c0 c0Var;
        if (i7 == -262) {
            c0Var = c0.RS1;
        } else {
            c0[] values2 = c0.values();
            int length = values2.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    c0 c0Var2 = values2[i10];
                    if (c0Var2.f11491a == i7) {
                        c0Var = c0Var2;
                        break;
                    }
                    i10++;
                } else {
                    for (p pVar : p.values()) {
                        if (pVar.f11542a == i7) {
                            c0Var = pVar;
                        }
                    }
                    throw new Exception(i5.c.j(i7, "Algorithm with COSE value ", " not supported"));
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
        if ((obj instanceof o) && this.f11539a.a() == ((o) obj).f11539a.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11539a});
    }

    public final String toString() {
        return a8.p0.p("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.f11539a), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f11539a.a());
    }
}
