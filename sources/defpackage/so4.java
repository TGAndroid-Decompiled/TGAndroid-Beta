package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class so4 implements Parcelable {
    public static final Parcelable.Creator<so4> CREATOR = new x21((byte) 20);
    public final int E;
    public final boolean F;
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final String h;
    public final boolean n;
    public final boolean r;
    public final boolean s;
    public final boolean w;
    public final int x;
    public final String y;

    public so4(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        this.a = parcel.readString();
        this.b = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.d = z2;
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.h = parcel.readString();
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.n = z3;
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.r = z4;
        if (parcel.readInt() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.s = z5;
        if (parcel.readInt() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.w = z6;
        this.x = parcel.readInt();
        this.y = parcel.readString();
        this.E = parcel.readInt();
        this.F = parcel.readInt() != 0;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        if (this.d) {
            sb.append(" dynamicContainer");
        }
        int i = this.f;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.h;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.n) {
            sb.append(" retainInstance");
        }
        if (this.r) {
            sb.append(" removing");
        }
        if (this.s) {
            sb.append(" detached");
        }
        if (this.w) {
            sb.append(" hidden");
        }
        String str2 = this.y;
        if (str2 != null) {
            ug8.z(" targetWho=", str2, " targetRequestCode=", sb);
            sb.append(this.E);
        }
        if (this.F) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.h);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.x);
        parcel.writeString(this.y);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F ? 1 : 0);
    }

    public so4(bn4 bn4Var) {
        this.a = bn4Var.getClass().getName();
        this.b = bn4Var.e;
        this.c = bn4Var.E;
        this.d = bn4Var.G;
        this.e = bn4Var.O;
        this.f = bn4Var.P;
        this.h = bn4Var.Q;
        this.n = bn4Var.T;
        this.r = bn4Var.x;
        this.s = bn4Var.S;
        this.w = bn4Var.R;
        this.x = bn4Var.d0.ordinal();
        this.y = bn4Var.n;
        this.E = bn4Var.r;
        this.F = bn4Var.Y;
    }
}
