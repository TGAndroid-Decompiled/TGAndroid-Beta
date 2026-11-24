package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class s61 implements Parcelable {
    public static final Parcelable.Creator<s61> CREATOR = new e2f((byte) 15);
    public final jk a;

    public s61(jk jkVar) {
        this.a = jkVar;
    }

    public static s61 a(int i) {
        ot3[] values;
        t09 t09Var;
        if (i == -262) {
            t09Var = t09.RS1;
        } else {
            t09[] values2 = t09.values();
            int length = values2.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    t09 t09Var2 = values2[i2];
                    if (t09Var2.a == i) {
                        t09Var = t09Var2;
                        break;
                    }
                    i2++;
                } else {
                    for (ot3 ot3Var : ot3.values()) {
                        if (ot3Var.a == i) {
                            t09Var = ot3Var;
                        }
                    }
                    throw new Exception(td4.o(i, "Algorithm with COSE value ", " not supported"));
                }
            }
        }
        return new s61(t09Var);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof s61) && this.a.a() == ((s61) obj).a.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return kt6.o("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.a), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.a());
    }
}
