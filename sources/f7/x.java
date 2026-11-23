package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new db.k(16);
    public final a0 f11584a;
    public final o f11585b;

    public x(String str, int i7) {
        q6.m.h(str);
        try {
            this.f11584a = a0.a(str);
            try {
                this.f11585b = o.a(i7);
            } catch (n e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (z e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!this.f11584a.equals(xVar.f11584a) || !this.f11585b.equals(xVar.f11585b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11584a, this.f11585b});
    }

    public final String toString() {
        return p5.c.l("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f11584a), ", \n algorithm=", String.valueOf(this.f11585b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        this.f11584a.getClass();
        cc.l(parcel, 2, "public-key");
        cc.i(parcel, 3, Integer.valueOf(this.f11585b.f11533a.a()));
        cc.s(parcel, r10);
    }
}
