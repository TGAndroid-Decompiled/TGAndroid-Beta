package l4;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import j8.t;
import java.util.ArrayList;
import java.util.List;
public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new t(29);
    public final List f11706a;

    public i(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new h(parcel));
        }
        this.f11706a = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f11706a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = (h) list.get(i11);
            parcel.writeLong(hVar.f11697a);
            parcel.writeByte(hVar.f11698b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f11699c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.d ? (byte) 1 : (byte) 0);
            List list2 = hVar.f11701f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                g gVar = (g) list2.get(i12);
                parcel.writeInt(gVar.f11695a);
                parcel.writeLong(gVar.f11696b);
            }
            parcel.writeLong(hVar.f11700e);
            parcel.writeByte(hVar.f11702g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hVar.h);
            parcel.writeInt(hVar.f11703i);
            parcel.writeInt(hVar.f11704j);
            parcel.writeInt(hVar.f11705k);
        }
    }

    public i(ArrayList arrayList) {
        this.f11706a = DesugarCollections.unmodifiableList(arrayList);
    }
}
