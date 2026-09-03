package l4;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import j8.t;
import java.util.ArrayList;
import java.util.List;
public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new t(29);
    public final List f11441a;

    public i(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new h(parcel));
        }
        this.f11441a = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f11441a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = (h) list.get(i11);
            parcel.writeLong(hVar.f11433a);
            parcel.writeByte(hVar.f11434b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f11435c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.d ? (byte) 1 : (byte) 0);
            List list2 = hVar.f11436f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                g gVar = (g) list2.get(i12);
                parcel.writeInt(gVar.f11431a);
                parcel.writeLong(gVar.f11432b);
            }
            parcel.writeLong(hVar.e);
            parcel.writeByte(hVar.f11437g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hVar.h);
            parcel.writeInt(hVar.f11438i);
            parcel.writeInt(hVar.f11439j);
            parcel.writeInt(hVar.f11440k);
        }
    }

    public i(ArrayList arrayList) {
        this.f11441a = DesugarCollections.unmodifiableList(arrayList);
    }
}
