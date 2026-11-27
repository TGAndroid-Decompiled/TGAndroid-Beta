package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class yx8 extends c4 {
    public static final Parcelable.Creator<yx8> CREATOR = new m9d((byte) 29);
    public final String a;
    public final String b;
    public final String c;

    public yx8(String str, String str2, String str3) {
        xve.h(str);
        this.a = str;
        xve.h(str2);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yx8)) {
            return false;
        }
        yx8 yx8Var = (yx8) obj;
        if (!vue.a(this.a, yx8Var.a) || !vue.a(this.b, yx8Var.b) || !vue.a(this.c, yx8Var.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb.append(this.a);
        sb.append("', \n name='");
        sb.append(this.b);
        sb.append("', \n icon='");
        return c00.k(sb, this.c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        bye.l(parcel, 4, this.c);
        bye.s(parcel, r);
    }
}
