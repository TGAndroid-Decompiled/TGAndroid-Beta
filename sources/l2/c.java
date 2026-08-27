package l2;

import a0.f;
import a9.p;
import android.os.Parcel;
import android.util.SparseIntArray;

public final class c extends b {
    public final SparseIntArray d;

    public final Parcel f15379e;

    public final int f15380f;

    public final int f15381g;
    public final String h;

    public int f15382i;

    public int f15383j;

    public int f15384k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new f(0), new f(0), new f(0));
    }

    @Override
    public final c a() {
        Parcel parcel = this.f15379e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f15383j;
        if (i10 == this.f15380f) {
            i10 = this.f15381g;
        }
        return new c(parcel, iDataPosition, i10, p.p(new StringBuilder(), this.h, "  "), this.f15376a, this.f15377b, this.f15378c);
    }

    @Override
    public final boolean e(int i10) {
        while (this.f15383j < this.f15381g) {
            int i11 = this.f15384k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f15383j;
            Parcel parcel = this.f15379e;
            parcel.setDataPosition(i12);
            int i13 = parcel.readInt();
            this.f15384k = parcel.readInt();
            this.f15383j += i13;
        }
        return this.f15384k == i10;
    }

    @Override
    public final void i(int i10) {
        int i11 = this.f15382i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f15379e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(iDataPosition - i12);
            parcel.setDataPosition(iDataPosition);
        }
        this.f15382i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f15382i = -1;
        this.f15384k = -1;
        this.f15379e = parcel;
        this.f15380f = i10;
        this.f15381g = i11;
        this.f15383j = i10;
        this.h = str;
    }
}
