package d4;

import android.os.Parcel;
import android.os.Parcelable;
import b4.b;
import f5.d0;
import j3.g1;
import j3.s0;
import j3.t0;
import java.util.Arrays;
public final class a implements b {
    public static final Parcelable.Creator<a> CREATOR;
    public static final t0 h;
    public static final t0 f5301n;
    public final String f5302a;
    public final String f5303b;
    public final long f5304c;
    public final long d;
    public final byte[] f5305e;
    public int f5306f;

    static {
        s0 s0Var = new s0();
        s0Var.f10742o = "application/id3";
        h = new t0(s0Var);
        s0 s0Var2 = new s0();
        s0Var2.f10742o = "application/x-scte35";
        f5301n = new t0(s0Var2);
        CREATOR = new w.a(27);
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f5302a = str;
        this.f5303b = str2;
        this.f5304c = j10;
        this.d = j11;
        this.f5305e = bArr;
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
            if (this.f5304c == aVar.f5304c && this.d == aVar.d && d0.a(this.f5302a, aVar.f5302a) && d0.a(this.f5303b, aVar.f5303b) && Arrays.equals(this.f5305e, aVar.f5305e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.f5305e;
        }
        return null;
    }

    @Override
    public final t0 getWrappedMetadataFormat() {
        String str = this.f5302a;
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
                return f5301n;
            case 1:
            case 2:
                return h;
            default:
                return null;
        }
    }

    public final int hashCode() {
        int i10;
        if (this.f5306f == 0) {
            int i11 = 0;
            String str = this.f5302a;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (527 + i10) * 31;
            String str2 = this.f5303b;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            long j10 = this.f5304c;
            long j11 = this.d;
            this.f5306f = Arrays.hashCode(this.f5305e) + ((((((i12 + i11) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f5306f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f5302a + ", id=" + this.d + ", durationMs=" + this.f5304c + ", value=" + this.f5303b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5302a);
        parcel.writeString(this.f5303b);
        parcel.writeLong(this.f5304c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.f5305e);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = d0.f6579a;
        this.f5302a = readString;
        this.f5303b = parcel.readString();
        this.f5304c = parcel.readLong();
        this.d = parcel.readLong();
        this.f5305e = parcel.createByteArray();
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
    }
}
