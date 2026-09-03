package d7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;
import java.util.Arrays;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new b9.e(10);
    public final int f4216a;
    public final Bundle f4217b;

    public h(int i10, Bundle bundle) {
        this.f4216a = i10;
        this.f4217b = bundle;
    }

    public final boolean equals(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: d7.h.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.f4216a));
        Bundle bundle = this.f4217b;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                arrayList.add(str);
                String string = bundle.getString(str);
                if (string != null) {
                    arrayList.add(string);
                }
            }
        }
        return Arrays.hashCode(arrayList.toArray(new Object[0]));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f4216a);
        f5.b(parcel, 2, this.f4217b);
        f5.r(parcel, q10);
    }
}
