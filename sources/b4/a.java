package b4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.g0;
import h3.g1;
import h3.s0;
import h3.t0;
import java.util.Arrays;
import z3.b;

public final class a implements b {
    public static final Parcelable.Creator<a> CREATOR;
    public static final t0 h;

    public static final t0 f1909n;

    public final String f1910a;

    public final String f1911b;

    public final long f1912c;
    public final long d;

    public final byte[] f1913e;

    public int f1914f;

    static {
        s0 s0Var = new s0();
        s0Var.f8135o = "application/id3";
        h = new t0(s0Var);
        s0 s0Var2 = new s0();
        s0Var2.f8135o = "application/x-scte35";
        f1909n = new t0(s0Var2);
        CREATOR = new w.a(21);
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f1910a = str;
        this.f1911b = str2;
        this.f1912c = j10;
        this.d = j11;
        this.f1913e = bArr;
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
            if (this.f1912c == aVar.f1912c && this.d == aVar.d && g0.a(this.f1910a, aVar.f1910a) && g0.a(this.f1911b, aVar.f1911b) && Arrays.equals(this.f1913e, aVar.f1913e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.f1913e;
        }
        return null;
    }

    @Override
    public final t0 getWrappedMetadataFormat() {
        String str = this.f1910a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f1909n;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return h;
            default:
                return null;
        }
    }

    public final int hashCode() {
        if (this.f1914f == 0) {
            String str = this.f1910a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f1911b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j10 = this.f1912c;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.d;
            this.f1914f = Arrays.hashCode(this.f1913e) + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f1914f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f1910a + ", id=" + this.d + ", durationMs=" + this.f1912c + ", value=" + this.f1911b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1910a);
        parcel.writeString(this.f1911b);
        parcel.writeLong(this.f1912c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.f1913e);
    }

    public a(Parcel parcel) {
        String string = parcel.readString();
        int i10 = g0.f4795a;
        this.f1910a = string;
        this.f1911b = parcel.readString();
        this.f1912c = parcel.readLong();
        this.d = parcel.readLong();
        this.f1913e = parcel.createByteArray();
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
    }
}
