package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class iue extends b4 {
    public static final Parcelable.Creator<iue> CREATOR = new sje((byte) 26);
    public final String a;
    public final sef b;
    public final int c;
    public final byte[] d;

    static {
        ArrayList arrayList = new ArrayList();
        y1f[] y1fVarArr = (y1f[]) arrayList.toArray(new y1f[arrayList.size()]);
    }

    public iue(java.lang.String r8, defpackage.sef r9, int r10, byte[] r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iue.<init>(java.lang.String, sef, int, byte[]):void");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 1, this.a);
        mve.k(parcel, 3, this.b, i);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        mve.c(parcel, 5, this.d);
        mve.s(parcel, r);
    }
}
