package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
public final class wze extends b4 {
    public static final Parcelable.Creator<wze> CREATOR = new c0f((byte) 6);
    public final int a;
    public final Bundle b;

    public wze(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public final boolean equals(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wze.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.a));
        Bundle bundle = this.b;
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
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.b(parcel, 2, this.b);
        jte.s(parcel, r);
    }
}
