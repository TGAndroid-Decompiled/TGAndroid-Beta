package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class c1 extends z5.a implements i8.n {
    public static final Parcelable.Creator<c1> CREATOR = new o0(9);

    public final int f12757a;

    public final String f12758b;

    public final String f12759c;
    public final String d;

    public final String f12760e;

    public final String f12761f;
    public final String h;

    public final byte f12762n;

    public final byte f12763r;

    public final byte f12764s;
    public final byte v;

    public final String f12765w;

    public c1(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f12757a = i10;
        this.f12758b = str;
        this.f12759c = str2;
        this.d = str3;
        this.f12760e = str4;
        this.f12761f = str5;
        this.h = str6;
        this.f12762n = b10;
        this.f12763r = b11;
        this.f12764s = b12;
        this.v = b13;
        this.f12765w = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c1.class != obj.getClass()) {
            return false;
        }
        c1 c1Var = (c1) obj;
        String str = c1Var.f12765w;
        String str2 = c1Var.h;
        String str3 = c1Var.f12759c;
        if (this.f12757a != c1Var.f12757a || this.f12762n != c1Var.f12762n || this.f12763r != c1Var.f12763r || this.f12764s != c1Var.f12764s || this.v != c1Var.v || !this.f12758b.equals(c1Var.f12758b)) {
            return false;
        }
        String str4 = this.f12759c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(c1Var.d) || !this.f12760e.equals(c1Var.f12760e) || !this.f12761f.equals(c1Var.f12761f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f12765w;
        if (str6 != null) {
            return str6.equals(str);
        }
        return str == null;
    }

    public final int hashCode() {
        int iG = i0.a.g((this.f12757a + 31) * 31, 31, this.f12758b);
        String str = this.f12759c;
        int iG2 = i0.a.g(i0.a.g(i0.a.g((iG + (str != null ? str.hashCode() : 0)) * 31, 31, this.d), 31, this.f12760e), 31, this.f12761f);
        String str2 = this.h;
        int iHashCode = (((((((((iG2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f12762n) * 31) + this.f12763r) * 31) + this.f12764s) * 31) + this.v) * 31;
        String str3 = this.f12765w;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f12757a);
        sb2.append(", appId='");
        sb2.append(this.f12758b);
        sb2.append("', dateTime='");
        sb2.append(this.f12759c);
        sb2.append("', eventId=");
        sb2.append((int) this.f12762n);
        sb2.append(", eventFlags=");
        i0.a.x(sb2, this.f12763r, ", categoryId=", this.f12764s, ", categoryCount=");
        sb2.append((int) this.v);
        sb2.append(", packageName='");
        sb2.append(this.f12765w);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12757a);
        String str = this.f12758b;
        r8.l(parcel, 3, str);
        r8.l(parcel, 4, this.f12759c);
        r8.l(parcel, 5, this.d);
        r8.l(parcel, 6, this.f12760e);
        r8.l(parcel, 7, this.f12761f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        r8.l(parcel, 8, str);
        r8.s(parcel, 9, 4);
        parcel.writeInt(this.f12762n);
        r8.s(parcel, 10, 4);
        parcel.writeInt(this.f12763r);
        r8.s(parcel, 11, 4);
        parcel.writeInt(this.f12764s);
        r8.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        r8.l(parcel, 13, this.f12765w);
        r8.r(parcel, iQ);
    }
}
