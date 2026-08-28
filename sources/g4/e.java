package g4;

import android.os.Parcel;
import android.os.Parcelable;
import f8.r;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new r(16);
    public final long f7085a;
    public final boolean f7086b;
    public final boolean f7087c;
    public final boolean d;
    public final boolean f7088e;
    public final long f7089f;
    public final long h;
    public final List f7090n;
    public final boolean f7091r;
    public final long f7092s;
    public final int v;
    public final int f7093w;
    public final int f7094x;

    public e(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i9, int i10, int i11) {
        this.f7085a = j10;
        this.f7086b = z10;
        this.f7087c = z11;
        this.d = z12;
        this.f7088e = z13;
        this.f7089f = j11;
        this.h = j12;
        this.f7090n = DesugarCollections.unmodifiableList(list);
        this.f7091r = z14;
        this.f7092s = j13;
        this.v = i9;
        this.f7093w = i10;
        this.f7094x = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f7085a);
        parcel.writeByte(this.f7086b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f7087c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f7088e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f7089f);
        parcel.writeLong(this.h);
        List list = this.f7090n;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) list.get(i10);
            parcel.writeInt(dVar.f7082a);
            parcel.writeLong(dVar.f7083b);
            parcel.writeLong(dVar.f7084c);
        }
        parcel.writeByte(this.f7091r ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f7092s);
        parcel.writeInt(this.v);
        parcel.writeInt(this.f7093w);
        parcel.writeInt(this.f7094x);
    }

    public e(Parcel parcel) {
        this.f7085a = parcel.readLong();
        this.f7086b = parcel.readByte() == 1;
        this.f7087c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.f7088e = parcel.readByte() == 1;
        this.f7089f = parcel.readLong();
        this.h = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i9 = 0; i9 < readInt; i9++) {
            arrayList.add(new d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f7090n = DesugarCollections.unmodifiableList(arrayList);
        this.f7091r = parcel.readByte() == 1;
        this.f7092s = parcel.readLong();
        this.v = parcel.readInt();
        this.f7093w = parcel.readInt();
        this.f7094x = parcel.readInt();
    }
}
