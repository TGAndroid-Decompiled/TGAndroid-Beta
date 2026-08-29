package e4;

import android.os.Parcel;
import android.os.Parcelable;
import b4.b;
import d6.d;
import f5.d0;
import j3.g1;
import j3.t0;
import j7.l1;
public class a implements b {
    public static final Parcelable.Creator<a> CREATOR = new d(15);
    public final String f5819a;
    public final String f5820b;

    public a(String str, String str2) {
        this.f5819a = str;
        this.f5820b = str2;
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
            if (this.f5819a.equals(aVar.f5819a) && this.f5820b.equals(aVar.f5820b)) {
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
        return this.f5820b.hashCode() + l1.f(527, 31, this.f5819a);
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
        String str = this.f5819a;
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
        String str2 = this.f5820b;
        switch (c3) {
            case 0:
                g1Var.f10450c = str2;
                return;
            case 1:
                g1Var.f10448a = str2;
                return;
            case 2:
                g1Var.f10453g = str2;
                return;
            case 3:
                g1Var.d = str2;
                return;
            case 4:
                g1Var.f10449b = str2;
                return;
            default:
                return;
        }
    }

    public final String toString() {
        return "VC: " + this.f5819a + "=" + this.f5820b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5819a);
        parcel.writeString(this.f5820b);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = d0.f6579a;
        this.f5819a = readString;
        this.f5820b = parcel.readString();
    }
}
