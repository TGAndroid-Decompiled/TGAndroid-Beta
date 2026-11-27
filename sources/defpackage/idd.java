package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class idd extends c4 {
    public static final Parcelable.Creator<idd> CREATOR = new m9d((byte) 26);
    public final String a;
    public final ArrayList b;

    public idd(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        xve.h(str);
        xve.h(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && idd.class == obj.getClass()) {
                idd iddVar = (idd) obj;
                String str = iddVar.a;
                String str2 = this.a;
                if (str2 != null) {
                    if (!str2.equals(str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
                ArrayList arrayList = iddVar.b;
                ArrayList arrayList2 = this.b;
                if (arrayList2 != null) {
                    if (arrayList2.equals(arrayList)) {
                        return true;
                    }
                    return false;
                } else if (arrayList == null) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (i + 31) * 31;
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            i2 = arrayList.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return c00.j("CapabilityInfo{", this.a, ", ", String.valueOf(this.b), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.p(parcel, 3, this.b);
        bye.s(parcel, r);
    }
}
