package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class qw8 extends b4 {
    public static final Parcelable.Creator<qw8> CREATOR = new v6d((byte) 29);
    public final String a;
    public final String b;
    public final String c;

    public qw8(String str, String str2, String str3) {
        ite.h(str);
        this.a = str;
        ite.h(str2);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qw8)) {
            return false;
        }
        qw8 qw8Var = (qw8) obj;
        if (!fse.a(this.a, qw8Var.a) || !fse.a(this.b, qw8Var.b) || !fse.a(this.c, qw8Var.c)) {
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
        return b10.j(sb, this.c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.l(parcel, 4, this.c);
        mve.s(parcel, r);
    }
}
