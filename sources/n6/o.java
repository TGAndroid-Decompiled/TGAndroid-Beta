package n6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new w0(0);

    public final Enum f18386a;

    public o(a aVar) {
        this.f18386a = (Enum) aVar;
    }

    public static o a(int i10) throws n {
        a aVar;
        if (i10 != -262) {
            for (c0 c0Var : c0.values()) {
                if (c0Var.f18339a == i10) {
                    aVar = c0Var;
                }
            }
            for (p pVar : p.values()) {
                if (pVar.f18389a == i10) {
                    aVar = pVar;
                }
            }
            throw new n(i0.a.l(i10, "Algorithm with COSE value ", " not supported"));
        }
        aVar = c0.RS1;
        return new o(aVar);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o) && this.f18386a.a() == ((o) obj).f18386a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18386a});
    }

    public final String toString() {
        return a9.p.m("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.f18386a), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f18386a.a());
    }
}
