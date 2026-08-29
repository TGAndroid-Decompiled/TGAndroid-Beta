package b7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import java.util.ArrayList;
import java.util.Arrays;
public final class h extends a6.a {
    public static final Parcelable.Creator<h> CREATOR = new w.a(19);
    public final int f1953a;
    public final Bundle f1954b;

    public h(int i10, Bundle bundle) {
        this.f1953a = i10;
        this.f1954b = bundle;
    }

    public final boolean equals(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: b7.h.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.f1953a));
        Bundle bundle = this.f1954b;
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
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 1, 4);
        parcel.writeInt(this.f1953a);
        o.b(parcel, 2, this.f1954b);
        o.r(parcel, q6);
    }
}
