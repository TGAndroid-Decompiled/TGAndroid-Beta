package b5;

import a0.f;
import a0.l;
import a8.p0;
import android.os.Parcel;
import android.util.SparseIntArray;
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel f2938e;
    public final int f2939f;
    public final int f2940g;
    public final String h;
    public int f2941i;
    public int f2942j;
    public int f2943k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new l(0), new l(0), new l(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.f2938e;
        int dataPosition = parcel.dataPosition();
        int i7 = this.f2942j;
        if (i7 == this.f2939f) {
            i7 = this.f2940g;
        }
        return new c(parcel, dataPosition, i7, p0.s(new StringBuilder(), this.h, "  "), this.f2935a, this.f2936b, this.f2937c);
    }

    @Override
    public final boolean e(int i7) {
        while (this.f2942j < this.f2940g) {
            int i10 = this.f2943k;
            if (i10 != i7) {
                if (String.valueOf(i10).compareTo(String.valueOf(i7)) <= 0) {
                    int i11 = this.f2942j;
                    Parcel parcel = this.f2938e;
                    parcel.setDataPosition(i11);
                    int readInt = parcel.readInt();
                    this.f2943k = parcel.readInt();
                    this.f2942j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f2943k == i7) {
            return true;
        }
        return false;
    }

    @Override
    public final void i(int i7) {
        int i10 = this.f2941i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f2938e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(dataPosition - i11);
            parcel.setDataPosition(dataPosition);
        }
        this.f2941i = i7;
        sparseIntArray.put(i7, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i7);
    }

    public c(Parcel parcel, int i7, int i10, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f2941i = -1;
        this.f2943k = -1;
        this.f2938e = parcel;
        this.f2939f = i7;
        this.f2940g = i10;
        this.f2942j = i7;
        this.h = str;
    }
}
