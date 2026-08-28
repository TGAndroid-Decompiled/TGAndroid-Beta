package g4;

import android.os.Parcel;
import android.os.Parcelable;
import f8.r;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new r(18);
    public final List f7106a;

    public i(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i9 = 0; i9 < readInt; i9++) {
            arrayList.add(new h(parcel));
        }
        this.f7106a = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        List list = this.f7106a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = (h) list.get(i10);
            parcel.writeLong(hVar.f7097a);
            parcel.writeByte(hVar.f7098b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f7099c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.d ? (byte) 1 : (byte) 0);
            List list2 = hVar.f7101f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i11 = 0; i11 < size2; i11++) {
                g gVar = (g) list2.get(i11);
                parcel.writeInt(gVar.f7095a);
                parcel.writeLong(gVar.f7096b);
            }
            parcel.writeLong(hVar.f7100e);
            parcel.writeByte(hVar.f7102g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hVar.h);
            parcel.writeInt(hVar.f7103i);
            parcel.writeInt(hVar.f7104j);
            parcel.writeInt(hVar.f7105k);
        }
    }

    public i(ArrayList arrayList) {
        this.f7106a = DesugarCollections.unmodifiableList(arrayList);
    }
}
