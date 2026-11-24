package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class rad extends b4 {
    public static final Parcelable.Creator<rad> CREATOR = new v6d((byte) 26);
    public final String a;
    public final ArrayList b;

    public rad(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        ite.h(str);
        ite.h(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && rad.class == obj.getClass()) {
                rad radVar = (rad) obj;
                String str = radVar.a;
                String str2 = this.a;
                if (str2 != null) {
                    if (!str2.equals(str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
                ArrayList arrayList = radVar.b;
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
        return b10.i("CapabilityInfo{", this.a, ", ", String.valueOf(this.b), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.p(parcel, 3, this.b);
        mve.s(parcel, r);
    }
}
