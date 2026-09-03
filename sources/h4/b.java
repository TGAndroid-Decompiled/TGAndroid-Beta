package h4;

import android.os.Parcel;
import android.os.Parcelable;
import f8.o;
import h5.d0;
import j3.d1;
import j3.n0;
import kf.k0;
public class b implements e4.b {
    public static final Parcelable.Creator<b> CREATOR = new o(5);
    public final String f6902a;
    public final String f6903b;

    public b(String str, String str2) {
        this.f6902a = str;
        this.f6903b = str2;
    }

    @Override
    public final n0 b() {
        return null;
    }

    @Override
    public final void c(d1 d1Var) {
        String str = this.f6902a;
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
        String str2 = this.f6903b;
        switch (c3) {
            case 0:
                d1Var.f8449c = str2;
                return;
            case 1:
                d1Var.f8447a = str2;
                return;
            case 2:
                d1Var.f8451g = str2;
                return;
            case 3:
                d1Var.d = str2;
                return;
            case 4:
                d1Var.f8448b = str2;
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
            if (this.f6902a.equals(bVar.f6902a) && this.f6903b.equals(bVar.f6903b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6903b.hashCode() + k0.e(527, 31, this.f6902a);
    }

    public final String toString() {
        return "VC: " + this.f6902a + "=" + this.f6903b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6902a);
        parcel.writeString(this.f6903b);
    }

    public b(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = d0.f6924a;
        this.f6902a = readString;
        this.f6903b = parcel.readString();
    }
}
