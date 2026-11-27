package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class wwe extends c4 {
    public static final Parcelable.Creator<wwe> CREATOR = new ime((byte) 26);
    public final String a;
    public final hhf b;
    public final int c;
    public final byte[] d;

    static {
        ArrayList arrayList = new ArrayList();
        n4f[] n4fVarArr = (n4f[]) arrayList.toArray(new n4f[arrayList.size()]);
    }

    public wwe(java.lang.String r8, defpackage.hhf r9, int r10, byte[] r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wwe.<init>(java.lang.String, hhf, int, byte[]):void");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.k(parcel, 3, this.b, i);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        bye.c(parcel, 5, this.d);
        bye.s(parcel, r);
    }
}
