package l4;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import j8.t;
import java.util.ArrayList;
import java.util.List;
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new t(27);
    public final long f11422a;
    public final boolean f11423b;
    public final boolean f11424c;
    public final boolean d;
    public final boolean e;
    public final long f11425f;
    public final long h;
    public final List f11426n;
    public final boolean f11427r;
    public final long f11428s;
    public final int v;
    public final int f11429w;
    public final int f11430x;

    public e(long j10, boolean z4, boolean z10, boolean z11, boolean z12, long j11, long j12, List list, boolean z13, long j13, int i10, int i11, int i12) {
        this.f11422a = j10;
        this.f11423b = z4;
        this.f11424c = z10;
        this.d = z11;
        this.e = z12;
        this.f11425f = j11;
        this.h = j12;
        this.f11426n = DesugarCollections.unmodifiableList(list);
        this.f11427r = z13;
        this.f11428s = j13;
        this.v = i10;
        this.f11429w = i11;
        this.f11430x = i12;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.f11425f);
        sb.append(", programSplicePlaybackPositionUs= ");
        return android.support.v4.media.a.q(sb, this.h, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f11422a);
        parcel.writeByte(this.f11423b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11424c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f11425f);
        parcel.writeLong(this.h);
        List list = this.f11426n;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) list.get(i11);
            parcel.writeInt(dVar.f11419a);
            parcel.writeLong(dVar.f11420b);
            parcel.writeLong(dVar.f11421c);
        }
        parcel.writeByte(this.f11427r ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f11428s);
        parcel.writeInt(this.v);
        parcel.writeInt(this.f11429w);
        parcel.writeInt(this.f11430x);
    }

    public e(Parcel parcel) {
        this.f11422a = parcel.readLong();
        this.f11423b = parcel.readByte() == 1;
        this.f11424c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.e = parcel.readByte() == 1;
        this.f11425f = parcel.readLong();
        this.h = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f11426n = DesugarCollections.unmodifiableList(arrayList);
        this.f11427r = parcel.readByte() == 1;
        this.f11428s = parcel.readLong();
        this.v = parcel.readInt();
        this.f11429w = parcel.readInt();
        this.f11430x = parcel.readInt();
    }
}
