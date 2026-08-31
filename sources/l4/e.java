package l4;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import j8.t;
import java.util.ArrayList;
import java.util.List;
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new t(27);
    public final long f11685a;
    public final boolean f11686b;
    public final boolean f11687c;
    public final boolean d;
    public final boolean f11688e;
    public final long f11689f;
    public final long h;
    public final List f11690n;
    public final boolean f11691r;
    public final long f11692s;
    public final int v;
    public final int f11693w;
    public final int f11694x;

    public e(long j10, boolean z4, boolean z10, boolean z11, boolean z12, long j11, long j12, List list, boolean z13, long j13, int i10, int i11, int i12) {
        this.f11685a = j10;
        this.f11686b = z4;
        this.f11687c = z10;
        this.d = z11;
        this.f11688e = z12;
        this.f11689f = j11;
        this.h = j12;
        this.f11690n = DesugarCollections.unmodifiableList(list);
        this.f11691r = z13;
        this.f11692s = j13;
        this.v = i10;
        this.f11693w = i11;
        this.f11694x = i12;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.f11689f);
        sb.append(", programSplicePlaybackPositionUs= ");
        return android.support.v4.media.a.q(sb, this.h, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f11685a);
        parcel.writeByte(this.f11686b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11687c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11688e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f11689f);
        parcel.writeLong(this.h);
        List list = this.f11690n;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) list.get(i11);
            parcel.writeInt(dVar.f11682a);
            parcel.writeLong(dVar.f11683b);
            parcel.writeLong(dVar.f11684c);
        }
        parcel.writeByte(this.f11691r ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f11692s);
        parcel.writeInt(this.v);
        parcel.writeInt(this.f11693w);
        parcel.writeInt(this.f11694x);
    }

    public e(Parcel parcel) {
        this.f11685a = parcel.readLong();
        this.f11686b = parcel.readByte() == 1;
        this.f11687c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.f11688e = parcel.readByte() == 1;
        this.f11689f = parcel.readLong();
        this.h = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f11690n = DesugarCollections.unmodifiableList(arrayList);
        this.f11691r = parcel.readByte() == 1;
        this.f11692s = parcel.readLong();
        this.v = parcel.readInt();
        this.f11693w = parcel.readInt();
        this.f11694x = parcel.readInt();
    }
}
