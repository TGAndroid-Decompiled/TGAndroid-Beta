package k4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import j3.d1;
import j3.n0;
import j8.t;
import java.util.Arrays;
import kf.k0;
public final class a implements e4.b {
    public static final Parcelable.Creator<a> CREATOR = new t(11);
    public final String f9717a;
    public final byte[] f9718b;
    public final int f9719c;
    public final int d;

    public a(String str, byte[] bArr, int i10, int i11) {
        this.f9717a = str;
        this.f9718b = bArr;
        this.f9719c = i10;
        this.d = i11;
    }

    @Override
    public final n0 b() {
        return null;
    }

    @Override
    public final byte[] d() {
        return null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f9717a.equals(aVar.f9717a) && Arrays.equals(this.f9718b, aVar.f9718b) && this.f9719c == aVar.f9719c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f9718b) + k0.e(527, 31, this.f9717a)) * 31) + this.f9719c) * 31) + this.d;
    }

    public final String toString() {
        String m9;
        boolean z4;
        boolean z10;
        byte[] bArr = this.f9718b;
        int i10 = this.d;
        if (i10 != 1) {
            if (i10 != 23) {
                if (i10 != 67) {
                    m9 = d0.R(bArr);
                } else {
                    int i11 = d0.f6924a;
                    if (bArr.length == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    h5.a.f(z10);
                    m9 = String.valueOf(bArr[3] | (bArr[0] << 24) | (bArr[1] << 16) | (bArr[2] << 8));
                }
            } else {
                int i12 = d0.f6924a;
                if (bArr.length == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h5.a.f(z4);
                m9 = String.valueOf(Float.intBitsToFloat((bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8)));
            }
        } else {
            m9 = d0.m(bArr);
        }
        return android.support.v4.media.a.p(this.f9717a, ", value=", m9, new StringBuilder("mdta: key="));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9717a);
        parcel.writeByteArray(this.f9718b);
        parcel.writeInt(this.f9719c);
        parcel.writeInt(this.d);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = d0.f6924a;
        this.f9717a = readString;
        this.f9718b = parcel.createByteArray();
        this.f9719c = parcel.readInt();
        this.d = parcel.readInt();
    }

    @Override
    public final void c(d1 d1Var) {
    }
}
