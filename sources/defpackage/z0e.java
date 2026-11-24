package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class z0e extends b4 {
    public static final Parcelable.Creator<z0e> CREATOR = new t0e((byte) 12);
    public final rce a;
    public final rce b;

    public z0e(rce rceVar, rce rceVar2) {
        this.a = rceVar;
        this.b = rceVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z0e) {
            z0e z0eVar = (z0e) obj;
            if (fse.a(this.a, z0eVar.a) && fse.a(this.b, z0eVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] p;
        int r = mve.r(parcel, 20293);
        byte[] bArr = null;
        rce rceVar = this.a;
        if (rceVar == null) {
            p = null;
        } else {
            p = rceVar.p();
        }
        mve.c(parcel, 1, p);
        rce rceVar2 = this.b;
        if (rceVar2 != null) {
            bArr = rceVar2.p();
        }
        mve.c(parcel, 2, bArr);
        mve.s(parcel, r);
    }
}
