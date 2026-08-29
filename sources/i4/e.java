package i4;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new g8.b(28);
    public final long f8224a;
    public final boolean f8225b;
    public final boolean f8226c;
    public final boolean d;
    public final boolean f8227e;
    public final long f8228f;
    public final long h;
    public final List f8229n;
    public final boolean f8230r;
    public final long f8231s;
    public final int v;
    public final int f8232w;
    public final int f8233x;

    public e(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f8224a = j10;
        this.f8225b = z10;
        this.f8226c = z11;
        this.d = z12;
        this.f8227e = z13;
        this.f8228f = j11;
        this.h = j12;
        this.f8229n = DesugarCollections.unmodifiableList(list);
        this.f8230r = z14;
        this.f8231s = j13;
        this.v = i10;
        this.f8232w = i11;
        this.f8233x = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f8224a);
        parcel.writeByte(this.f8225b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8226c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8227e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f8228f);
        parcel.writeLong(this.h);
        List list = this.f8229n;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) list.get(i11);
            parcel.writeInt(dVar.f8221a);
            parcel.writeLong(dVar.f8222b);
            parcel.writeLong(dVar.f8223c);
        }
        parcel.writeByte(this.f8230r ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f8231s);
        parcel.writeInt(this.v);
        parcel.writeInt(this.f8232w);
        parcel.writeInt(this.f8233x);
    }

    public e(Parcel parcel) {
        this.f8224a = parcel.readLong();
        this.f8225b = parcel.readByte() == 1;
        this.f8226c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.f8227e = parcel.readByte() == 1;
        this.f8228f = parcel.readLong();
        this.h = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f8229n = DesugarCollections.unmodifiableList(arrayList);
        this.f8230r = parcel.readByte() == 1;
        this.f8231s = parcel.readLong();
        this.v = parcel.readInt();
        this.f8232w = parcel.readInt();
        this.f8233x = parcel.readInt();
    }
}
