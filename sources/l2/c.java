package l2;

import a0.f;
import a0.k;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel f16623e;
    public final int f16624f;
    public final int f16625g;
    public final String h;
    public int f16626i;
    public int f16627j;
    public int f16628k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new k(0), new k(0), new k(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.f16623e;
        int dataPosition = parcel.dataPosition();
        int i9 = this.f16627j;
        if (i9 == this.f16624f) {
            i9 = this.f16625g;
        }
        return new c(parcel, dataPosition, i9, aa.d.r(new StringBuilder(), this.h, "  "), this.f16620a, this.f16621b, this.f16622c);
    }

    @Override
    public final boolean e(int i9) {
        while (this.f16627j < this.f16625g) {
            int i10 = this.f16628k;
            if (i10 != i9) {
                if (String.valueOf(i10).compareTo(String.valueOf(i9)) <= 0) {
                    int i11 = this.f16627j;
                    Parcel parcel = this.f16623e;
                    parcel.setDataPosition(i11);
                    int readInt = parcel.readInt();
                    this.f16628k = parcel.readInt();
                    this.f16627j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f16628k == i9) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i9) {
        int i10 = this.f16626i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f16623e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(dataPosition - i11);
            parcel.setDataPosition(dataPosition);
        }
        this.f16626i = i9;
        sparseIntArray.put(i9, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i9);
    }

    public c(Parcel parcel, int i9, int i10, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f16626i = -1;
        this.f16628k = -1;
        this.f16623e = parcel;
        this.f16624f = i9;
        this.f16625g = i10;
        this.f16627j = i9;
        this.h = str;
    }
}
