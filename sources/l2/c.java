package l2;

import a0.f;
import a0.k;
import a4.w;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel f14051e;
    public final int f14052f;
    public final int f14053g;
    public final String h;
    public int f14054i;
    public int f14055j;
    public int f14056k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new k(0), new k(0), new k(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.f14051e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f14055j;
        if (i10 == this.f14052f) {
            i10 = this.f14053g;
        }
        return new c(parcel, dataPosition, i10, w.q(new StringBuilder(), this.h, "  "), this.f14048a, this.f14049b, this.f14050c);
    }

    @Override
    public final boolean e(int i10) {
        while (this.f14055j < this.f14053g) {
            int i11 = this.f14056k;
            if (i11 != i10) {
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) <= 0) {
                    int i12 = this.f14055j;
                    Parcel parcel = this.f14051e;
                    parcel.setDataPosition(i12);
                    int readInt = parcel.readInt();
                    this.f14056k = parcel.readInt();
                    this.f14055j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f14056k == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i10) {
        int i11 = this.f14054i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f14051e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f14054i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f14054i = -1;
        this.f14056k = -1;
        this.f14051e = parcel;
        this.f14052f = i10;
        this.f14053g = i11;
        this.f14055j = i10;
        this.h = str;
    }
}
