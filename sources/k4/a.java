package k4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import j3.d1;
import j3.n0;
import j8.t;
import java.util.Arrays;
public final class a implements e4.b {
    public static final Parcelable.Creator<a> CREATOR = new t(11);
    public final String f10456a;
    public final byte[] f10457b;
    public final int f10458c;
    public final int d;

    public a(String str, byte[] bArr, int i10, int i11) {
        this.f10456a = str;
        this.f10457b = bArr;
        this.f10458c = i10;
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
            if (this.f10456a.equals(aVar.f10456a) && Arrays.equals(this.f10457b, aVar.f10457b) && this.f10458c == aVar.f10458c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f10457b) + l.d.e(527, 31, this.f10456a)) * 31) + this.f10458c) * 31) + this.d;
    }

    public final String toString() {
        String m9;
        boolean z4;
        boolean z10;
        byte[] bArr = this.f10457b;
        int i10 = this.d;
        if (i10 != 1) {
            if (i10 != 23) {
                if (i10 != 67) {
                    m9 = d0.R(bArr);
                } else {
                    int i11 = d0.f7237a;
                    if (bArr.length == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    h5.a.f(z10);
                    m9 = String.valueOf(bArr[3] | (bArr[0] << 24) | (bArr[1] << 16) | (bArr[2] << 8));
                }
            } else {
                int i12 = d0.f7237a;
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
        return android.support.v4.media.a.p(this.f10456a, ", value=", m9, new StringBuilder("mdta: key="));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10456a);
        parcel.writeByteArray(this.f10457b);
        parcel.writeInt(this.f10458c);
        parcel.writeInt(this.d);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = d0.f7237a;
        this.f10456a = readString;
        this.f10457b = parcel.createByteArray();
        this.f10458c = parcel.readInt();
        this.d = parcel.readInt();
    }

    @Override
    public final void c(d1 d1Var) {
    }
}
