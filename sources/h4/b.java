package h4;

import android.os.Parcel;
import android.os.Parcelable;
import f8.o;
import h5.d0;
import j3.d1;
import j3.n0;
import l.d;
public class b implements e4.b {
    public static final Parcelable.Creator<b> CREATOR = new o(5);
    public final String f7214a;
    public final String f7215b;

    public b(String str, String str2) {
        this.f7214a = str;
        this.f7215b = str2;
    }

    @Override
    public final n0 b() {
        return null;
    }

    @Override
    public final void c(d1 d1Var) {
        String str = this.f7214a;
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c3 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c3 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c3 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c3 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c3 = 4;
                    break;
                }
                break;
        }
        String str2 = this.f7215b;
        switch (c3) {
            case 0:
                d1Var.f9029c = str2;
                return;
            case 1:
                d1Var.f9027a = str2;
                return;
            case 2:
                d1Var.f9032g = str2;
                return;
            case 3:
                d1Var.d = str2;
                return;
            case 4:
                d1Var.f9028b = str2;
                return;
            default:
                return;
        }
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
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f7214a.equals(bVar.f7214a) && this.f7215b.equals(bVar.f7215b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7215b.hashCode() + d.e(527, 31, this.f7214a);
    }

    public final String toString() {
        return "VC: " + this.f7214a + "=" + this.f7215b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7214a);
        parcel.writeString(this.f7215b);
    }

    public b(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = d0.f7237a;
        this.f7214a = readString;
        this.f7215b = parcel.readString();
    }
}
