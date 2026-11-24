package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class l51 implements Parcelable {
    public static final Parcelable.Creator<l51> CREATOR = new c0f((byte) 15);
    public final jj a;

    public l51(jj jjVar) {
        this.a = jjVar;
    }

    public static l51 a(int i) {
        es3[] values;
        sy8 sy8Var;
        if (i == -262) {
            sy8Var = sy8.RS1;
        } else {
            sy8[] values2 = sy8.values();
            int length = values2.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    sy8 sy8Var2 = values2[i2];
                    if (sy8Var2.a == i) {
                        sy8Var = sy8Var2;
                        break;
                    }
                    i2++;
                } else {
                    for (es3 es3Var : es3.values()) {
                        if (es3Var.a == i) {
                            sy8Var = es3Var;
                        }
                    }
                    throw new Exception(tb4.n(i, "Algorithm with COSE value ", " not supported"));
                }
            }
        }
        return new l51(sy8Var);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof l51) && this.a.a() == ((l51) obj).a.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return tb4.y("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.a), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.a());
    }
}
