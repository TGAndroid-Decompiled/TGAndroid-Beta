package c4;

import android.os.Parcel;
import android.os.Parcelable;
import c.c;
import d5.f0;
import h3.g1;
import h3.t0;
import j3.r0;
import z3.b;
public class a implements b {
    public static final Parcelable.Creator<a> CREATOR = new c(2);
    public final String f2307a;
    public final String f2308b;

    public a(String str, String str2) {
        this.f2307a = str;
        this.f2308b = str2;
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
            a aVar = (a) obj;
            if (this.f2307a.equals(aVar.f2307a) && this.f2308b.equals(aVar.f2308b)) {
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
        return this.f2308b.hashCode() + r0.f(527, 31, this.f2307a);
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
        String str = this.f2307a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        String str2 = this.f2308b;
        switch (c10) {
            case 0:
                g1Var.f9413c = str2;
                return;
            case 1:
                g1Var.f9411a = str2;
                return;
            case 2:
                g1Var.f9416g = str2;
                return;
            case 3:
                g1Var.d = str2;
                return;
            case 4:
                g1Var.f9412b = str2;
                return;
            default:
                return;
        }
    }

    public final String toString() {
        return "VC: " + this.f2307a + "=" + this.f2308b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f2307a);
        parcel.writeString(this.f2308b);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i9 = f0.f4349a;
        this.f2307a = readString;
        this.f2308b = parcel.readString();
    }
}
