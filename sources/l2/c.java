package l2;

import a0.f;
import a0.k;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel f11464e;
    public final int f11465f;
    public final int f11466g;
    public final String h;
    public int f11467i;
    public int f11468j;
    public int f11469k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new k(0), new k(0), new k(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.f11464e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f11468j;
        if (i10 == this.f11465f) {
            i10 = this.f11466g;
        }
        return new c(parcel, dataPosition, i10, android.support.v4.media.a.r(new StringBuilder(), this.h, "  "), this.f11461a, this.f11462b, this.f11463c);
    }

    @Override
    public final boolean e(int i10) {
        while (this.f11468j < this.f11466g) {
            int i11 = this.f11469k;
            if (i11 != i10) {
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) <= 0) {
                    int i12 = this.f11468j;
                    Parcel parcel = this.f11464e;
                    parcel.setDataPosition(i12);
                    int readInt = parcel.readInt();
                    this.f11469k = parcel.readInt();
                    this.f11468j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f11469k == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i10) {
        int i11 = this.f11467i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f11464e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f11467i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f11467i = -1;
        this.f11469k = -1;
        this.f11464e = parcel;
        this.f11465f = i10;
        this.f11466g = i11;
        this.f11468j = i10;
        this.h = str;
    }
}
