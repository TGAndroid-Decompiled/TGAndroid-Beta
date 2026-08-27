package g4;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new f4.e(8);

    public final List f6384a;

    public i(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new h(parcel));
        }
        this.f6384a = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f6384a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = (h) list.get(i11);
            parcel.writeLong(hVar.f6375a);
            parcel.writeByte(hVar.f6376b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f6377c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.d ? (byte) 1 : (byte) 0);
            List list2 = hVar.f6379f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                g gVar = (g) list2.get(i12);
                parcel.writeInt(gVar.f6373a);
                parcel.writeLong(gVar.f6374b);
            }
            parcel.writeLong(hVar.f6378e);
            parcel.writeByte(hVar.f6380g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hVar.h);
            parcel.writeInt(hVar.f6381i);
            parcel.writeInt(hVar.f6382j);
            parcel.writeInt(hVar.f6383k);
        }
    }

    public i(ArrayList arrayList) {
        this.f6384a = DesugarCollections.unmodifiableList(arrayList);
    }
}
