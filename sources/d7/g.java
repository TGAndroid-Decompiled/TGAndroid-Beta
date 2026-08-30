package d7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;
public final class g extends c6.a {
    public final String f4232a;
    public final k f4233b;
    public final int f4234c;
    public final byte[] d;
    public static final int e = Integer.parseInt("-1");
    public static final Parcelable.Creator<g> CREATOR = new b9.e(9);

    static {
        ArrayList arrayList = new ArrayList();
        h[] hVarArr = (h[]) arrayList.toArray(new h[arrayList.size()]);
    }

    public g(java.lang.String r8, d7.k r9, int r10, byte[] r11) {
        throw new UnsupportedOperationException("Method not decompiled: d7.g.<init>(java.lang.String, d7.k, int, byte[]):void");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.f4232a);
        f5.k(parcel, 3, this.f4233b, i10);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.f4234c);
        f5.c(parcel, 5, this.d);
        f5.r(parcel, q10);
    }
}
