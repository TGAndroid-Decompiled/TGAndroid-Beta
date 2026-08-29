package i4;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new g(0);
    public final List f8246a;

    public j(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new i(parcel));
        }
        this.f8246a = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f8246a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) list.get(i11);
            parcel.writeLong(iVar.f8237a);
            parcel.writeByte(iVar.f8238b ? (byte) 1 : (byte) 0);
            parcel.writeByte(iVar.f8239c ? (byte) 1 : (byte) 0);
            parcel.writeByte(iVar.d ? (byte) 1 : (byte) 0);
            List list2 = iVar.f8241f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                h hVar = (h) list2.get(i12);
                parcel.writeInt(hVar.f8235a);
                parcel.writeLong(hVar.f8236b);
            }
            parcel.writeLong(iVar.f8240e);
            parcel.writeByte(iVar.f8242g ? (byte) 1 : (byte) 0);
            parcel.writeLong(iVar.h);
            parcel.writeInt(iVar.f8243i);
            parcel.writeInt(iVar.f8244j);
            parcel.writeInt(iVar.f8245k);
        }
    }

    public j(ArrayList arrayList) {
        this.f8246a = DesugarCollections.unmodifiableList(arrayList);
    }
}
