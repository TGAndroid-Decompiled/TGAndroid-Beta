package b4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import h3.g1;
import h3.s0;
import h3.t0;
import java.util.Arrays;
import z3.b;
public final class a implements b {
    public static final Parcelable.Creator<a> CREATOR;
    public static final t0 h;
    public static final t0 f1417n;
    public final String f1418a;
    public final String f1419b;
    public final long f1420c;
    public final long d;
    public final byte[] f1421e;
    public int f1422f;

    static {
        s0 s0Var = new s0();
        s0Var.f9705o = "application/id3";
        h = new t0(s0Var);
        s0 s0Var2 = new s0();
        s0Var2.f9705o = "application/x-scte35";
        f1417n = new t0(s0Var2);
        CREATOR = new w.a(13);
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f1418a = str;
        this.f1419b = str2;
        this.f1420c = j10;
        this.d = j11;
        this.f1421e = bArr;
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
            if (this.f1420c == aVar.f1420c && this.d == aVar.d && f0.a(this.f1418a, aVar.f1418a) && f0.a(this.f1419b, aVar.f1419b) && Arrays.equals(this.f1421e, aVar.f1421e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.f1421e;
        }
        return null;
    }

    @Override
    public final t0 getWrappedMetadataFormat() {
        String str = this.f1418a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f1417n;
            case 1:
            case 2:
                return h;
            default:
                return null;
        }
    }

    public final int hashCode() {
        int i9;
        if (this.f1422f == 0) {
            int i10 = 0;
            String str = this.f1418a;
            if (str != null) {
                i9 = str.hashCode();
            } else {
                i9 = 0;
            }
            int i11 = (527 + i9) * 31;
            String str2 = this.f1419b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            long j10 = this.f1420c;
            long j11 = this.d;
            this.f1422f = Arrays.hashCode(this.f1421e) + ((((((i11 + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f1422f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f1418a + ", id=" + this.d + ", durationMs=" + this.f1420c + ", value=" + this.f1419b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f1418a);
        parcel.writeString(this.f1419b);
        parcel.writeLong(this.f1420c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.f1421e);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i9 = f0.f4349a;
        this.f1418a = readString;
        this.f1419b = parcel.readString();
        this.f1420c = parcel.readLong();
        this.d = parcel.readLong();
        this.f1421e = parcel.createByteArray();
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
    }
}
