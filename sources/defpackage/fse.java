package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class fse extends b4 {
    public static final Parcelable.Creator<fse> CREATOR = new rhe((byte) 26);
    public final String a;
    public final rcf b;
    public final int c;
    public final byte[] d;

    static {
        ArrayList arrayList = new ArrayList();
        wze[] wzeVarArr = (wze[]) arrayList.toArray(new wze[arrayList.size()]);
    }

    public fse(java.lang.String r8, defpackage.rcf r9, int r10, byte[] r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fse.<init>(java.lang.String, rcf, int, byte[]):void");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.k(parcel, 3, this.b, i);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        jte.c(parcel, 5, this.d);
        jte.s(parcel, r);
    }
}
