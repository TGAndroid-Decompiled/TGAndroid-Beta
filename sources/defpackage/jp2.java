package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class jp2 extends b4 {
    public static final Parcelable.Creator<jp2> CREATOR = new igd((byte) 6);
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public jp2(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jp2)) {
            return false;
        }
        jp2 jp2Var = (jp2) obj;
        if (this.a != jp2Var.a || this.b != jp2Var.b || this.c != jp2Var.c || this.d != jp2Var.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        int i3 = this.c;
        int length3 = String.valueOf(i3).length();
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z).length() + 1);
        sb.append("ComplianceOptions{callerProductId=");
        sb.append(i);
        sb.append(", dataOwnerProductId=");
        sb.append(i2);
        sb.append(", processingReason=");
        sb.append(i3);
        sb.append(", isUserData=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        jte.s(parcel, r);
    }
}
