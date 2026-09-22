package e0;

import android.app.Notification;
import android.os.Parcel;
public final class j0 {
    public final String f7794a;
    public final int f7795b;
    public final Notification f7796c;

    public j0(String str, int i10, Notification notification) {
        this.f7794a = str;
        this.f7795b = i10;
        this.f7796c = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f7794a;
        int i10 = this.f7795b;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f2880g);
            obtain.writeString(str);
            obtain.writeInt(i10);
            obtain.writeString(null);
            Notification notification = this.f7796c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.f2878a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f7794a);
        sb2.append(", id:");
        return a4.a.o(this.f7795b, ", tag:null]", sb2);
    }
}
