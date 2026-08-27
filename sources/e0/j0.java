package e0;

import android.app.Notification;
import android.os.Parcel;

public final class j0 {

    public final String f5074a;

    public final int f5075b;

    public final Notification f5076c;

    public j0(String str, int i10, Notification notification) {
        this.f5074a = str;
        this.f5075b = i10;
        this.f5076c = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f5074a;
        int i10 = this.f5075b;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(b.c.f1880g);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i10);
            parcelObtain.writeString(null);
            Notification notification = this.f5076c;
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            aVar.f1878a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f5074a);
        sb2.append(", id:");
        return a9.p.k(this.f5075b, ", tag:null]", sb2);
    }
}
