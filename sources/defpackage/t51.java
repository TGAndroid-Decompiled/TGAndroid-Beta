package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class t51 implements Parcelable {
    public static final Parcelable.Creator<t51> CREATOR = new t4f((byte) 15);
    public final kj a;

    public t51(kj kjVar) {
        this.a = kjVar;
    }

    public static t51 a(int i) {
        ws3[] values;
        f29 f29Var;
        if (i == -262) {
            f29Var = f29.RS1;
        } else {
            f29[] values2 = f29.values();
            int length = values2.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    f29 f29Var2 = values2[i2];
                    if (f29Var2.a == i) {
                        f29Var = f29Var2;
                        break;
                    }
                    i2++;
                } else {
                    for (ws3 ws3Var : ws3.values()) {
                        if (ws3Var.a == i) {
                            f29Var = ws3Var;
                        }
                    }
                    throw new Exception(qd4.n(i, "Algorithm with COSE value ", " not supported"));
                }
            }
        }
        return new t51(f29Var);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof t51) && this.a.a() == ((t51) obj).a.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return qd4.y("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.a), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.a());
    }
}
