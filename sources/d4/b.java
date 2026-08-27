package d4;

import android.os.Parcel;
import android.os.Parcelable;
import c8.o;
import d5.g0;
import h3.g1;
import h3.t0;
import java.util.List;
import java.util.Map;

public final class b implements z3.b {
    public static final Parcelable.Creator<b> CREATOR = new o(12);

    public final int f4755a;

    public final String f4756b;

    public final String f4757c;
    public final String d;

    public final boolean f4758e;

    public final int f4759f;

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        d5.a.f(i11 == -1 || i11 > 0);
        this.f4755a = i10;
        this.f4756b = str;
        this.f4757c = str2;
        this.d = str3;
        this.f4758e = z10;
        this.f4759f = i11;
    }

    public static b a(Map map) {
        boolean z10;
        int i10;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i11;
        int i12;
        List list = (List) map.get("icy-br");
        boolean z11 = true;
        int i13 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i12 = Integer.parseInt(str4) * 1000;
                if (i12 > 0) {
                    z10 = true;
                } else {
                    try {
                        d5.a.K("IcyHeaders", "Invalid bitrate: " + str4);
                        z10 = false;
                        i12 = -1;
                    } catch (NumberFormatException unused) {
                        s3.c.k("Invalid bitrate header: ", str4, "IcyHeaders");
                        i10 = i12;
                        z10 = false;
                    }
                }
                i10 = i12;
            } catch (NumberFormatException unused2) {
                i12 = -1;
            }
        } else {
            z10 = false;
            i10 = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z10 = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z10 = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z10 = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z10 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i14 = Integer.parseInt(str5);
                if (i14 > 0) {
                    i13 = i14;
                } else {
                    try {
                        d5.a.K("IcyHeaders", "Invalid metadata interval: " + str5);
                        z11 = z10;
                    } catch (NumberFormatException unused3) {
                        i13 = i14;
                        s3.c.k("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                }
                z10 = z11;
            } catch (NumberFormatException unused4) {
            }
            i11 = i13;
        } else {
            i11 = -1;
        }
        if (z10) {
            return new b(i10, str, str2, str3, zEquals, i11);
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
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f4755a == bVar.f4755a && g0.a(this.f4756b, bVar.f4756b) && g0.a(this.f4757c, bVar.f4757c) && g0.a(this.d, bVar.d) && this.f4758e == bVar.f4758e && this.f4759f == bVar.f4759f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override
    public final t0 getWrappedMetadataFormat() {
        return null;
    }

    public final int hashCode() {
        int i10 = (527 + this.f4755a) * 31;
        String str = this.f4756b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4757c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f4758e ? 1 : 0)) * 31) + this.f4759f;
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
        String str = this.f4757c;
        if (str != null) {
            g1Var.E = str;
        }
        String str2 = this.f4756b;
        if (str2 != null) {
            g1Var.C = str2;
        }
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f4757c + "\", genre=\"" + this.f4756b + "\", bitrate=" + this.f4755a + ", metadataInterval=" + this.f4759f;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4755a);
        parcel.writeString(this.f4756b);
        parcel.writeString(this.f4757c);
        parcel.writeString(this.d);
        int i11 = g0.f4795a;
        parcel.writeInt(this.f4758e ? 1 : 0);
        parcel.writeInt(this.f4759f);
    }

    public b(Parcel parcel) {
        this.f4755a = parcel.readInt();
        this.f4756b = parcel.readString();
        this.f4757c = parcel.readString();
        this.d = parcel.readString();
        int i10 = g0.f4795a;
        this.f4758e = parcel.readInt() != 0;
        this.f4759f = parcel.readInt();
    }
}
