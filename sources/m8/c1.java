package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class c1 extends c6.a implements l8.n {
    public static final Parcelable.Creator<c1> CREATOR = new o0(9);
    public final int f13768a;
    public final String f13769b;
    public final String f13770c;
    public final String d;
    public final String e;
    public final String f13771f;
    public final String h;
    public final byte f13772n;
    public final byte f13773r;
    public final byte f13774s;
    public final byte v;
    public final String f13775w;

    public c1(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f13768a = i10;
        this.f13769b = str;
        this.f13770c = str2;
        this.d = str3;
        this.e = str4;
        this.f13771f = str5;
        this.h = str6;
        this.f13772n = b10;
        this.f13773r = b11;
        this.f13774s = b12;
        this.v = b13;
        this.f13775w = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c1.class != obj.getClass()) {
            return false;
        }
        c1 c1Var = (c1) obj;
        String str = c1Var.f13775w;
        String str2 = c1Var.h;
        String str3 = c1Var.f13770c;
        if (this.f13768a != c1Var.f13768a || this.f13772n != c1Var.f13772n || this.f13773r != c1Var.f13773r || this.f13774s != c1Var.f13774s || this.v != c1Var.v || !this.f13769b.equals(c1Var.f13769b)) {
            return false;
        }
        String str4 = this.f13770c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(c1Var.d) || !this.e.equals(c1Var.e) || !this.f13771f.equals(c1Var.f13771f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f13775w;
        if (str6 != null) {
            return str6.equals(str);
        }
        if (str == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int e = kf.k0.e((this.f13768a + 31) * 31, 31, this.f13769b);
        int i12 = 0;
        String str = this.f13770c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int e6 = kf.k0.e(kf.k0.e(kf.k0.e((e + i10) * 31, 31, this.d), 31, this.e), 31, this.f13771f);
        String str2 = this.h;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (((((((((e6 + i11) * 31) + this.f13772n) * 31) + this.f13773r) * 31) + this.f13774s) * 31) + this.v) * 31;
        String str3 = this.f13775w;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AncsNotificationParcelable{, id=");
        sb.append(this.f13768a);
        sb.append(", appId='");
        sb.append(this.f13769b);
        sb.append("', dateTime='");
        sb.append(this.f13770c);
        sb.append("', eventId=");
        sb.append((int) this.f13772n);
        sb.append(", eventFlags=");
        kf.k0.w(sb, this.f13773r, ", categoryId=", this.f13774s, ", categoryCount=");
        sb.append((int) this.v);
        sb.append(", packageName='");
        sb.append(this.f13775w);
        sb.append("'}");
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13768a);
        String str = this.f13769b;
        f5.l(parcel, 3, str);
        f5.l(parcel, 4, this.f13770c);
        f5.l(parcel, 5, this.d);
        f5.l(parcel, 6, this.e);
        f5.l(parcel, 7, this.f13771f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        f5.l(parcel, 8, str);
        f5.s(parcel, 9, 4);
        parcel.writeInt(this.f13772n);
        f5.s(parcel, 10, 4);
        parcel.writeInt(this.f13773r);
        f5.s(parcel, 11, 4);
        parcel.writeInt(this.f13774s);
        f5.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        f5.l(parcel, 13, this.f13775w);
        f5.r(parcel, q10);
    }
}
