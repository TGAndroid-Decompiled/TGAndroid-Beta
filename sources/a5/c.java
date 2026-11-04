package a5;

import a0.f;
import a0.l;
import a1.g;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel f130e;
    public final int f131f;
    public final int f132g;
    public final String h;
    public int f133i;
    public int f134j;
    public int f135k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new l(0), new l(0), new l(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.f130e;
        int dataPosition = parcel.dataPosition();
        int i3 = this.f134j;
        if (i3 == this.f131f) {
            i3 = this.f132g;
        }
        return new c(parcel, dataPosition, i3, g.s(new StringBuilder(), this.h, "  "), this.f127a, this.f128b, this.f129c);
    }

    @Override
    public final boolean e(int i3) {
        while (this.f134j < this.f132g) {
            int i10 = this.f135k;
            if (i10 != i3) {
                if (String.valueOf(i10).compareTo(String.valueOf(i3)) <= 0) {
                    int i11 = this.f134j;
                    Parcel parcel = this.f130e;
                    parcel.setDataPosition(i11);
                    int readInt = parcel.readInt();
                    this.f135k = parcel.readInt();
                    this.f134j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f135k == i3) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i3) {
        int i10 = this.f133i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f130e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(dataPosition - i11);
            parcel.setDataPosition(dataPosition);
        }
        this.f133i = i3;
        sparseIntArray.put(i3, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i3);
    }

    public c(Parcel parcel, int i3, int i10, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f133i = -1;
        this.f135k = -1;
        this.f130e = parcel;
        this.f131f = i3;
        this.f132g = i10;
        this.f134j = i3;
        this.h = str;
    }
}
