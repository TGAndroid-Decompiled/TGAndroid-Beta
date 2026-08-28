package m6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new r0(19);
    public final Enum f17550a;

    public o(a aVar) {
        this.f17550a = (Enum) aVar;
    }

    public static o a(int i9) {
        p[] values;
        c0 c0Var;
        if (i9 == -262) {
            c0Var = c0.RS1;
        } else {
            c0[] values2 = c0.values();
            int length = values2.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    c0 c0Var2 = values2[i10];
                    if (c0Var2.f17503a == i9) {
                        c0Var = c0Var2;
                        break;
                    }
                    i10++;
                } else {
                    for (p pVar : p.values()) {
                        if (pVar.f17553a == i9) {
                            c0Var = pVar;
                        }
                    }
                    throw new Exception(j3.r0.m(i9, "Algorithm with COSE value ", " not supported"));
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
        if ((obj instanceof o) && this.f17550a.a() == ((o) obj).f17550a.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17550a});
    }

    public final String toString() {
        return aa.d.o("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.f17550a), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f17550a.a());
    }
}
