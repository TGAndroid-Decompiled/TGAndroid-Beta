package g4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;
import f8.o;
import h5.d0;
import j3.d1;
import j3.m0;
import j3.n0;
import java.util.Arrays;
public final class a implements b {
    public static final Parcelable.Creator<a> CREATOR;
    public static final n0 h;
    public static final n0 f6352n;
    public final String f6353a;
    public final String f6354b;
    public final long f6355c;
    public final long d;
    public final byte[] e;
    public int f6356f;

    static {
        m0 m0Var = new m0();
        m0Var.f8684o = "application/id3";
        h = new n0(m0Var);
        m0 m0Var2 = new m0();
        m0Var2.f8684o = "application/x-scte35";
        f6352n = new n0(m0Var2);
        CREATOR = new o(3);
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f6353a = str;
        this.f6354b = str2;
        this.f6355c = j10;
        this.d = j11;
        this.e = bArr;
    }

    @Override
    public final n0 b() {
        String str = this.f6353a;
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c3 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c3 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c3 = 2;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                return f6352n;
            case 1:
            case 2:
                return h;
            default:
                return null;
        }
    }

    @Override
    public final byte[] d() {
        if (b() != null) {
            return this.e;
        }
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
            if (this.f6355c == aVar.f6355c && this.d == aVar.d && d0.a(this.f6353a, aVar.f6353a) && d0.a(this.f6354b, aVar.f6354b) && Arrays.equals(this.e, aVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f6356f == 0) {
            int i11 = 0;
            String str = this.f6353a;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (527 + i10) * 31;
            String str2 = this.f6354b;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            long j10 = this.f6355c;
            long j11 = this.d;
            this.f6356f = Arrays.hashCode(this.e) + ((((((i12 + i11) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f6356f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f6353a + ", id=" + this.d + ", durationMs=" + this.f6355c + ", value=" + this.f6354b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6353a);
        parcel.writeString(this.f6354b);
        parcel.writeLong(this.f6355c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.e);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = d0.f6937a;
        this.f6353a = readString;
        this.f6354b = parcel.readString();
        this.f6355c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = parcel.createByteArray();
    }

    @Override
    public final void c(d1 d1Var) {
    }
}
