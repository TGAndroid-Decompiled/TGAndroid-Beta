package g4;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new f4.e(6);

    public final long f6363a;

    public final boolean f6364b;

    public final boolean f6365c;
    public final boolean d;

    public final boolean f6366e;

    public final long f6367f;
    public final long h;

    public final List f6368n;

    public final boolean f6369r;

    public final long f6370s;
    public final int v;

    public final int f6371w;

    public final int f6372x;

    public e(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f6363a = j10;
        this.f6364b = z10;
        this.f6365c = z11;
        this.d = z12;
        this.f6366e = z13;
        this.f6367f = j11;
        this.h = j12;
        this.f6368n = DesugarCollections.unmodifiableList(list);
        this.f6369r = z14;
        this.f6370s = j13;
        this.v = i10;
        this.f6371w = i11;
        this.f6372x = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f6363a);
        parcel.writeByte(this.f6364b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6365c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6366e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f6367f);
        parcel.writeLong(this.h);
        List list = this.f6368n;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) list.get(i11);
            parcel.writeInt(dVar.f6360a);
            parcel.writeLong(dVar.f6361b);
            parcel.writeLong(dVar.f6362c);
        }
        parcel.writeByte(this.f6369r ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f6370s);
        parcel.writeInt(this.v);
        parcel.writeInt(this.f6371w);
        parcel.writeInt(this.f6372x);
    }

    public e(Parcel parcel) {
        this.f6363a = parcel.readLong();
        this.f6364b = parcel.readByte() == 1;
        this.f6365c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.f6366e = parcel.readByte() == 1;
        this.f6367f = parcel.readLong();
        this.h = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f6368n = DesugarCollections.unmodifiableList(arrayList);
        this.f6369r = parcel.readByte() == 1;
        this.f6370s = parcel.readLong();
        this.v = parcel.readInt();
        this.f6371w = parcel.readInt();
        this.f6372x = parcel.readInt();
    }
}
