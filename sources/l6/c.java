package l6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m4.w1;
public final class c extends p6.a {
    public static final Parcelable.Creator<c> CREATOR = new h8.j(18);
    public final String f16926a;
    public final int f16927b;
    public final long f16928c;

    public c(int i10, String str, long j10) {
        this.f16926a = str;
        this.f16927b = i10;
        this.f16928c = j10;
    }

    public final long b() {
        long j10 = this.f16928c;
        if (j10 == -1) {
            return this.f16927b;
        }
        return j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.f16926a;
            String str2 = this.f16926a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16926a, Long.valueOf(b())});
    }

    public final String toString() {
        w1 w1Var = new w1(this);
        w1Var.x(this.f16926a, "name");
        w1Var.x(Long.valueOf(b()), "version");
        return w1Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.f16926a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f16927b);
        long b10 = b();
        df.s(parcel, 3, 8);
        parcel.writeLong(b10);
        df.r(parcel, q5);
    }

    public c(String str, long j10) {
        this.f16926a = str;
        this.f16928c = j10;
        this.f16927b = -1;
    }
}
