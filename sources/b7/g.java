package b7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import java.util.ArrayList;
public final class g extends a6.a {
    public final String f1950a;
    public final k f1951b;
    public final int f1952c;
    public final byte[] d;
    public static final int f1949e = Integer.parseInt("-1");
    public static final Parcelable.Creator<g> CREATOR = new w.a(18);

    static {
        ArrayList arrayList = new ArrayList();
        h[] hVarArr = (h[]) arrayList.toArray(new h[arrayList.size()]);
    }

    public g(java.lang.String r8, b7.k r9, int r10, byte[] r11) {
        throw new UnsupportedOperationException("Method not decompiled: b7.g.<init>(java.lang.String, b7.k, int, byte[]):void");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 1, this.f1950a);
        o.k(parcel, 3, this.f1951b, i10);
        o.s(parcel, 4, 4);
        parcel.writeInt(this.f1952c);
        o.c(parcel, 5, this.d);
        o.r(parcel, q6);
    }
}
