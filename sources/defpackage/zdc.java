package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;
public final class zdc extends ydc {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public zdc(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new vla(0), new vla(0), new vla(0));
    }

    @Override
    public final zdc a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new zdc(parcel, dataPosition, i, c00.k(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    @Override
    public final boolean e(int i) {
        while (true) {
            int i2 = this.j;
            int i3 = this.k;
            if (i2 < this.g) {
                if (i3 != i) {
                    if (String.valueOf(i3).compareTo(String.valueOf(i)) <= 0) {
                        int i4 = this.j;
                        Parcel parcel = this.e;
                        parcel.setDataPosition(i4);
                        int readInt = parcel.readInt();
                        this.k = parcel.readInt();
                        this.j += readInt;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else if (i3 == i) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public final void i(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public zdc(Parcel parcel, int i, int i2, String str, qs qsVar, qs qsVar2, qs qsVar3) {
        super(qsVar, qsVar2, qsVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
