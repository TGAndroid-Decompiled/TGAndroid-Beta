package c4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.g0;
import h3.g1;
import h3.t0;
import z3.b;

public class a implements b {
    public static final Parcelable.Creator<a> CREATOR = new w.a(24);

    public final String f2440a;

    public final String f2441b;

    public a(String str, String str2) {
        this.f2440a = str;
        this.f2441b = str2;
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
            if (this.f2440a.equals(aVar.f2440a) && this.f2441b.equals(aVar.f2441b)) {
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
        return this.f2441b.hashCode() + i0.a.g(527, 31, this.f2440a);
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
        String str = this.f2440a;
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    b10 = 0;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b10 = 1;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b10 = 2;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b10 = 3;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b10 = 4;
                }
                break;
        }
        String str2 = this.f2441b;
        switch (b10) {
            case 0:
                g1Var.f7843c = str2;
                break;
            case 1:
                g1Var.f7841a = str2;
                break;
            case 2:
                g1Var.f7846g = str2;
                break;
            case 3:
                g1Var.d = str2;
                break;
            case 4:
                g1Var.f7842b = str2;
                break;
        }
    }

    public final String toString() {
        return "VC: " + this.f2440a + "=" + this.f2441b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2440a);
        parcel.writeString(this.f2441b);
    }

    public a(Parcel parcel) {
        String string = parcel.readString();
        int i10 = g0.f4795a;
        this.f2440a = string;
        this.f2441b = parcel.readString();
    }
}
