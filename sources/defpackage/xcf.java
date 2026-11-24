package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
public final class xcf extends b4 {
    public static final Parcelable.Creator<xcf> CREATOR = new c0f((byte) 24);
    public final boolean a;
    public final ArrayList b;

    public xcf(ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && xcf.class == obj.getClass()) {
                xcf xcfVar = (xcf) obj;
                if (this.a == xcfVar.a) {
                    ArrayList arrayList = xcfVar.b;
                    ArrayList arrayList2 = this.b;
                    if (arrayList2 != arrayList) {
                        if (arrayList2 != null && arrayList2.equals(arrayList)) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        return "AppWearDetailsParcelable{isWatchface=" + this.a + ", watchfaceCategories=" + valueOf + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        jte.n(parcel, 2, this.b);
        jte.s(parcel, r);
    }
}
